package com.mBoard.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.mBoard.entity.Board;
import com.mBoard.entity.Reply;
import com.mBoard.mapper.BoardMapper;
import org.apache.commons.io.*;


@Controller
public class BoardController {
	
	@Autowired//의존성주입으로 mapper 클래스변수로 생성
	BoardMapper mapper;
	//게시물 목록 보기
	@GetMapping("/board/boardList")
	void getBoardList(Model model) {
	model.addAttribute("list", mapper.selectList());
	}
	//
	@GetMapping("/board/boardView")
	void getBoardView(Model model, @RequestParam("seqno") int seqno) {
		model.addAttribute("view", mapper.viewList(seqno));
	}
	//게시물 등록 화면 보기
	@GetMapping("/board/boardRegister")
	void getBoardRegister() {}
	
	//게시물 등록
	@PostMapping("/board/boardRegister")
	String postBoardRegister(Board board, @RequestParam("uploadFile") MultipartFile multipartFile) {
		
		String filePath = "D:\\KJH\\Repa\\";
		File tagetFile = new File(filePath);
		if (!multipartFile.isEmpty()) {
			String originFileName = multipartFile.getOriginalFilename();
			Long filesize = multipartFile.getSize();
			board.setFilename(originFileName);
			board.setFilesize(filesize);
			tagetFile = new File(filePath + originFileName);
			try {
				multipartFile.transferTo(tagetFile);
				//파일 전송하는 메소드
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
	mapper.insertList(board.getUserid(), board.getMwriter(), board.getMtitle(), board.getMcontent(),board.getFilename(),board.getFilesize());
	return "redirect:/board/boardList";
	}
	//게시물 수정 화면 보기
	@GetMapping("/board/boardModify")
	void getBoardModify(Model model, @RequestParam("seqno") int seqno) {
		model.addAttribute("view",mapper.viewList(seqno));
	}
	//게시물 수정
	@PostMapping("/board/boardModify")
	String postBoardModify(Board board) {
			
		mapper.updateList(board.getMwriter(), board.getMtitle(), board.getMcontent(), board.getSeqno());
		return "redirect:/board/boardView?seqno=" + Integer.toString(board.getSeqno());
	}
	
	@GetMapping("/board/boardDelete")
	String getBoardDelete(@RequestParam("seqno") int seqno) {
		mapper.deleteList(seqno);
		return "redirect:/board/boardList";
	}
	//파일 다운로드
	@GetMapping("/board/fileDownload")
	void fileDownload(@RequestParam("seqno") int seqno, HttpServletResponse rs) 
			throws Exception{
		Board fileInfo = mapper.viewList(seqno);
		String filePath = "D:\\KJH\\Repa\\";
		String orgFileName = fileInfo.getFilename();
		
		byte fileByte[] = FileUtils.readFileToByteArray(new File(filePath + orgFileName));
		rs.setContentType("application/octet-stream");
		rs.setContentLengthLong(fileByte.length);
		rs.setHeader("Content-Disposition", "attachment;fileName=\"" 
		+ URLEncoder.encode(orgFileName, "UTF-8") + "\";");
		rs.getOutputStream().write(fileByte);
		rs.getOutputStream().flush();
		rs.getOutputStream().close();
	}
	@ResponseBody
	@PostMapping("/board/Reply")
	List<Reply> postReply(Reply reply, @RequestParam("option") String option, @RequestParam("seqno")int seqno ){ 
				if (option.equals("I")) 
					mapper.insertReplyList(seqno, reply.getReplywriter(), reply.getReplycontent());
					List<Reply> replyList = mapper.selectReplyList(seqno); 
				return replyList;
				

	}
	
}

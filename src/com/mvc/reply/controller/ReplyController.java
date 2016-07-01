package com.mvc.reply.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.reply.domain.Reply;
import com.mvc.reply.service.ReplyService;

@Controller
@RequestMapping("/reply")
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;
	
	//´ñ±Û µî·Ï 
	@RequestMapping("/regist.do")
	public @ResponseBody String regist(Reply reply){
		
		replyService.insert(reply);
		
		return "hi";
	}
	
}






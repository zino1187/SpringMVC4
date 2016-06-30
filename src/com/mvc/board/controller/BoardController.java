package com.mvc.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@RequestMapping("/write.do")
	public String insert(){
		System.out.println("insert() »£√‚µ !!");
		return null;
	}
}








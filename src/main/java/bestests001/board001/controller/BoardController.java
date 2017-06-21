package bestests001.board001.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bestests001.board001.service.BoardService;

@Controller
@RequestMapping("/board001/")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("list.htm")
	public String list(){
		
		System.out.println("in controller");
		
		System.out.println("result : " + service.selectList());
		
		return "board001/list";
	}
}

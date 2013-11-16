package com.smallbee.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Application {
	public void hello(@RequestParam() String user){
		
	}
}

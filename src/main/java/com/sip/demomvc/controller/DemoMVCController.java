package com.sip.demomvc.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DemoMVCController {
	
	@GetMapping("/message")
	public String displayMessage()
	{
		return "<h4>Hello Ynov</h4>";
	}
}

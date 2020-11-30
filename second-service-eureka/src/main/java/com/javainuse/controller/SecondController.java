package com.javainuse.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/sms")
public class SecondController {


	@GetMapping("/send")
	public boolean smsSend() {
		return true;
	}
	@GetMapping("/message")
	public String test() {
		return "Hello sms service";
	}
}

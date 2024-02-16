package com.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {
	@GetMapping(path="/getmsg")
	public String getMsg() {
		return "Dracarys";
	}

}

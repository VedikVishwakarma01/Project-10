package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.ORSResponse;

@RestController
@RequestMapping(value = "Test")
public class TestCtl {
	
	@GetMapping
	public ORSResponse add() {
		
		ORSResponse res = new ORSResponse();
		
		
		return res;
	}

}

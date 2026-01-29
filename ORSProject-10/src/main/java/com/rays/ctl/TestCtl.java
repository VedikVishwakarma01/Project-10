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
		res.addMessage("chal gayaaa!!!....");
		res.addData("42*10 = " + 42*10);
		res.addInputError("error kyaa hai??.....");
		res.addResult("huh??", "result pata nhi!!.....");
		
		return res;
	}

}

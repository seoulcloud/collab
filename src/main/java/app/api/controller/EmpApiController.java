package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpApiController {

	@GetMapping("/api/emp-test")
	public String empTest() {
		return "emp api controller" ;
	}
}

package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class CommonController {
	

	@GetMapping("/KJS1")
	public String infoCloud1() {
		return "KJS1";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


}

package com.softlynx.bs.controller.usm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogoutController {

	@PostMapping("/logout")
	public String logout() {
		System.out.println("in logout().........................");
		return "login";
	}
}

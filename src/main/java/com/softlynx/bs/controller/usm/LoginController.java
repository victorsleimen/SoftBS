package com.softlynx.bs.controller.usm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.softlynx.bs.service.usm.impl.LoginService;

@RestController
public class LoginController {

	private static final Logger log = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;

	@PostMapping("/openDesktop")
	public ModelAndView loginDesktopApps(@RequestParam final String username) throws Exception {

		log.debug("[UserController] - loginDesktopApps().....................");
		System.out.println("username =================== " + username);
		String view = (loginService.ifUserExists(username) > 0) ? "DesktopApps" : "login";
		ModelAndView mav = new ModelAndView();
		mav.addObject("loggedUser", username);
		mav.setViewName(view);
		return mav;
	}

	@PostMapping("/error")
	public String softError() {
		return "error";
	}

}

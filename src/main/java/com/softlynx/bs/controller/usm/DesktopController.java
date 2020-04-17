package com.softlynx.bs.controller.usm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DesktopController {

	@PostMapping({"/logout"})
	public ModelAndView logout() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
}

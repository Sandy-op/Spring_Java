package org.jsp.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = "/open-home")
	public String openHomePage(Model model) {
		model.addAttribute("username", "Virat Kohli");
		return "home";
	}

	@RequestMapping("/open-view")
	public String openView(@RequestParam(name = "view") String view) {
		return view;
	}

	@RequestMapping("/sum")
	public String findSum(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2, Model model) {
		model.addAttribute("result", num1 + "+" + num2 + "=" + (num1 + num2));
		return "print";
	}

	@RequestMapping("/diff")
	public String findDiff(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2, Model model) {
		model.addAttribute("result", num1 + "-" + num2 + "=" + (num1 - num2));
		return "print";
	}

	@RequestMapping(value = "/open-register")
	public ModelAndView openRegister() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");
		modelAndView.addObject("obj", new User());
		return modelAndView;
	}

	@RequestMapping(value = "/register")
	@ResponseBody
	public String register(@ModelAttribute(name = "obj") User user) {
		System.out.println(user);
		return "Details printed sucessfully";
	}
}

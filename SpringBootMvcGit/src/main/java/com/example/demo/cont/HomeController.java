package com.example.demo.cont;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.javabean.Product;

@Controller
@RequestMapping(path="/emp")
public class HomeController {
	
  @RequestMapping(path="/reg")
  public String showReg(Model model) {
	  model.addAttribute("product", new Product());
	  return "Register";
  }
}

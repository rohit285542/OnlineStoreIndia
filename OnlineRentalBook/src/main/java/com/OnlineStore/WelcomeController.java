package com.OnlineStore;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	// inject via application.properties
	//@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping(value= {"/","/index"},method=RequestMethod.GET)
	public String index(Map<String, Object> model) {
		//model.put("message", this.message);
		System.out.println("Index page call............");
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(Map<String, Object> model) {
		//model.put("message", this.message);
		System.out.println("login page call............");
		return "login";
	}
	

	@RequestMapping("/404")
	public String error(Map<String, Object> model) {
		//model.put("message", this.message);
		System.out.println("404 page call............");
		return "404";
	}
	

	@RequestMapping("/blog-single")
	public String blog_Signal(Map<String, Object> model) {
		//model.put("message", this.message);
		System.out.println("blog-single page call............");
		return "blog-single";
	}
	
	@RequestMapping("/blog")
	public String blog(Map<String, Object> model) {
		//model.put("message", this.message);
		System.out.println("blog page call............");
		return "blog";
	}
	
	@RequestMapping("/cart")
	public String cart(Map<String, Object> model) {
		//model.put("message", this.message);
		System.out.println("cart page call............");
		return "cart";
	}
	
	@RequestMapping("/checkout")
	public String checkout(Map<String, Object> model) {
		//model.put("message", this.message);
		System.out.println("checkout page call............");
		return "checkout";
	}
	
	@RequestMapping("/contact-us")
	public String contact_us(Map<String, Object> model) {
		//model.put("message", this.message);
		System.out.println("contact-us page call............");
		return "contact-us";
	}
	
	@RequestMapping("/product-details")
	public String product_details(Map<String, Object> model) {
		//model.put("message", this.message);
		System.out.println("product-details-us page call............");
		return "product-details";
	}
	
	@RequestMapping("/shop")
	public String shop(Map<String, Object> model) {
		//model.put("message", this.message);
		System.out.println("shop page call............");
		return "shop";
	}

}
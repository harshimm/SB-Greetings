package com.example.greetings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class GreetingController {
	
	@GetMapping("/")
	public String Greeting()
	{
		return "greetings";
	}
	

	@PostMapping("/greetings") // //new annotation since 4.3
    public String singleFileUpload(RedirectAttributes redirectAttributes) {
           
			redirectAttributes.addFlashAttribute("greeting", "Hi !!!");
            redirectAttributes.addFlashAttribute("name", "Harshini");
            return "redirect:/starting";
            
            
        }
	
	@GetMapping("/starting")
    public String uploadStatus() {
        return "starting";
    }
}

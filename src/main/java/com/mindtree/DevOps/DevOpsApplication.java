package com.mindtree.DevOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DevOpsApplication {
	
	 @GetMapping("/")
	    public String index(Model model) {
	        return "User";
	    }


	public static void main(String[] args) {
		SpringApplication.run(DevOpsApplication.class, args);
	}

}

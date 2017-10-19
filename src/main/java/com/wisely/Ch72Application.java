package com.wisely;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Ch72Application {

	
//	@RequestMapping(value = "/json",produces={MediaType.APPLICATION_JSON_VALUE})
//	public String json(Model model) {
//		Person single = new Person("aa",11);
//		model.addAttribute("single", single);
//		return "jsonView";
//	}
//	
//	 @Bean
//		public MappingJackson2JsonView jsonView(){
//			MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
//			return jsonView;
//		}

    public static void main(String[] args) {
        SpringApplication.run(Ch72Application.class, args);
    }
    
   
   
}

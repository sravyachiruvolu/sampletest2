package com.example1.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class sample1 {
	    @GetMapping("/")
	    public String index()
	    {
	      return "Hello world";
	    }
	    @GetMapping("/test")
	    public String test()
	    {
	      return "Testing boot Application";
	    }
	    
	    
}

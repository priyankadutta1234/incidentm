package com.incident.app;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller 
public class Registrationcontroller {
	@ResponseBody
    @RequestMapping("/hello")
 
    // Method
    public String helloWorld()
    {
 
        return "Homepage";
    }
}
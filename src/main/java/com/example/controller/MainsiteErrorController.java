package com.example.controller;
import org.springframework.boot.autoconfigure.web.ErrorController;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller  
public class MainsiteErrorController implements ErrorController {  
    private static final String ERROR_PATH = "/error";  
    @RequestMapping(value=ERROR_PATH)  
    public String handleError(){  
        return "errorpage/error";  
    }  
    public String getErrorPath() {  
        return ERROR_PATH;  
    }  
} 

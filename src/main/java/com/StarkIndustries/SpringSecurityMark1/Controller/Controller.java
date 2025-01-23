package com.StarkIndustries.SpringSecurityMark1.Controller;

import com.StarkIndustries.SpringSecurityMark1.Model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class   Controller {

    @GetMapping("/")
    public String homePage(HttpServletRequest request){
        return "Home Page"+request.getSession().getId();
    }

}

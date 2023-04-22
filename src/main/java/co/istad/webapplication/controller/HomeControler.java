package co.istad.webapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeControler {
    @GetMapping("/")
    String viewController(){
        return "/page/home/index";
    }
}

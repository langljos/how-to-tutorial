package com.example.howtotutorial.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/step-one")
    public String showStepOne() {
        return "pages/step-one.html";
    }
    @GetMapping("/step-two")
    public String showStepTwo() {
        return "pages/step-two.html";
    }
    @GetMapping("/step-three")
    public String showStepThree() {
        return "pages/step-three.html";
    }
    @RequestMapping("/wikiHow")
    public String showWikiHow(){
        return "redirect:https://www.wikihow.com/Open-a-Beer-Bottle";
    }

}

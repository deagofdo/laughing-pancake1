package workout.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fallback implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error  ";
    }
    @GetMapping("/error")
    public String returnNoMapping(){
        return "Sorry.No mapping Found.";
    }
}

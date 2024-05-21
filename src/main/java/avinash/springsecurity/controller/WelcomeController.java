package avinash.springsecurity.controller;
/*
 * User: Avinash Vijayvargiya
 * Date: 21/05/24
 * Time: 12:37 pm
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Security";
    }
}

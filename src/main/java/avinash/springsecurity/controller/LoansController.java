package avinash.springsecurity.controller;
/*
 * User: Avinash Vijayvargiya
 * Date: 21/05/24
 * Time: 4:39 pm
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/loan")
    public String loans() {
        return "You don't have any loan!";
    }
}

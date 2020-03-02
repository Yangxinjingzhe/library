package project.controller.login;

import project.service.login.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;


@Controller
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {

        return "login/login";
    }

}

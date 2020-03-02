package project.service.login;

import project.repository.login.LoginRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yangxinjingzhe on 2019/9/25.
 */
@Service
public class LoginService {

    @Resource
    private LoginRepository loginRepository;


}

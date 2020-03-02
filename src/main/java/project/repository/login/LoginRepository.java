package project.repository.login;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class LoginRepository {

    @Resource
    private JdbcTemplate jdbcTemplate;


}

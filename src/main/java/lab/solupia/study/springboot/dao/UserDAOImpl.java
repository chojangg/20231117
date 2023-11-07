package lab.solupia.study.springboot.dao;

import lab.solupia.study.springboot.dto.UserDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO{
//    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<UserDTO> userList(SqlSessionTemplate sessionTemplate) {
        return sessionTemplate.selectList("");
    }
}

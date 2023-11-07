package lab.solupia.study.springboot.service;

import lab.solupia.study.springboot.dao.UserDAO;
import lab.solupia.study.springboot.dto.UserDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO dao;

    @Autowired
    SqlSessionTemplate sessionTemplate;

    @Override
    public List<UserDTO> userList() {
        return dao.userList(sessionTemplate);
    }
}

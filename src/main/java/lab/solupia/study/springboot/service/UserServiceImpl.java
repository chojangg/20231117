package lab.solupia.study.springboot.service;

import lab.solupia.study.springboot.dao.UserDao;
import lab.solupia.study.springboot.dto.UserDto;
import lab.solupia.study.springboot.dto.UserVo;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Override
    public List<UserVo> userList(UserDto userDto) {
        return userDao.userList(userDto);
    }

    @Override
    public void insert(UserDto dto) {
        userDao.insert(dto);
    }

}

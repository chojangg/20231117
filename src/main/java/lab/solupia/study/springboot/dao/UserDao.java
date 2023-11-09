package lab.solupia.study.springboot.dao;


import lab.solupia.study.springboot.dto.UserDto;
import lab.solupia.study.springboot.dto.UserVo;

import java.util.List;

public interface UserDao {
    List<UserVo> userList(UserDto userDTO);
    public void insert(UserDto dto);
}

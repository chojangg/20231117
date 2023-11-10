package lab.solupia.study.springboot.service;

import lab.solupia.study.springboot.dto.UserDto;
import lab.solupia.study.springboot.dto.UserVo;

import java.util.List;

public interface UserService {
    List<UserVo> userList(UserDto userDto);
    public void insert(UserDto dto);
    public void delete(String loginID);
}

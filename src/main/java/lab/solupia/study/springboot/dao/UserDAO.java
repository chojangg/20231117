package lab.solupia.study.springboot.dao;


import lab.solupia.study.springboot.dto.UserDTO;
import lab.solupia.study.springboot.dto.UserVO;

import java.util.List;

public interface UserDAO {
    List<UserVO> userList(UserDTO userDTO);
}

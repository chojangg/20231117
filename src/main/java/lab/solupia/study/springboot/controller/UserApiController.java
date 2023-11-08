package lab.solupia.study.springboot.controller;

import lab.solupia.study.springboot.dto.UserDto;
import lab.solupia.study.springboot.dto.UserVo;
import lab.solupia.study.springboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserApiController {
    private final UserService userService;

    @GetMapping("/api/users")
    public ResponseEntity<List<UserVo>> userList(@ModelAttribute UserDto userDto) {
        return ResponseEntity.ok(this.userService.userList(userDto));
    }
}

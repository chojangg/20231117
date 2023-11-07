package lab.solupia.study.springboot.dao;

import lab.solupia.study.springboot.dto.UserDto;
import lab.solupia.study.springboot.dto.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDaoJDBC implements UserDao{
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<UserVo> userList(UserDto userDto) {
        String sql = "select login_Id, user_nm, email, address from test_user";

        return jdbcTemplate.query(sql, (rs, rowNumber) ->
                new UserVo(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                )
        );
    }
}

package lab.solupia.study.springboot.dto;

public class UserVo {
    private String loginID;
    private String userName;
    private String email;
    private String address;

    public UserVo(){
    }

    public UserVo(String loginID, String userName, String email, String address) {
        this.loginID = loginID;
        this.userName = userName;
        this.email = email;
        this.address = address;
    }
    public String getLoginID() {
        return loginID;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

}

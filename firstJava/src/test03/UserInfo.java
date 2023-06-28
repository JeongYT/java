package test03;

public class UserInfo {
    public String userId;
    public String userPassWord;
    public String userName;
    public String userAddress;
    public String phoneNumber;
    // 디폴트 생성자, 기본생성자
    public UserInfo(){}
    // 생성자 오버로딩
    // 매개변수가 있는 생성자
    public UserInfo(String userId, String userPassWord, String userName) {
        this.userId = userId;
        this.userPassWord = userPassWord;
        this.userName = userName;
    }

    public String showUserInfo() {
        return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다.";
    }

}

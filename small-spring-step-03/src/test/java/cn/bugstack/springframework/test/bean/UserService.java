package cn.bugstack.springframework.test.bean;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class UserService {

    private String name;
//    private Integer age;

    public UserService() {
    }
    
    public UserService(String name) {
        this.name = name;
    }
//    public UserService(Integer age) {
//        this.age = age;
//    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}

public class User {
    private String name;
    private String phone;
    private String sex;

    public User(String name, String phone, String sex) {
        this.name = name;
        this.phone = phone;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

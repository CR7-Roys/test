public class Teacher extends User{
    private String zhicheng;

    public Teacher(String name, String phone, String sex, String zhicheng) {
        super(name, phone, sex);
        this.zhicheng = zhicheng;
    }

    public String getZhicheng() {
        return zhicheng;
    }

    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "zhicheng='" + zhicheng + '\'' +
                '}';
    }
}

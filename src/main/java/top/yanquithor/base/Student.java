package top.yanquithor.base;

public class Student extends User {
    
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String department;
    private String major;
    
    public Student() {
        super();
    }
    public Student(String account,String username,String password) {
        super(account,username,password);
    }
    
    public Student(String account, String username, String password, Integer id,
                   String name, Integer age, String sex, String department, String major) {
        super(account, username, password);
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.department = department;
        this.major = major;
    }
    
    public Student setId(Integer id) {
        this.id = id;
        return this;
    }
    public Student setName(String name) {
        this.name = name;
        return this;
    }
    public Student setAge(Integer age) {
        this.age = age;
        return this;
    }
    public Student setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public Student setDepartment(String department) {
        this.department = department;
        return this;
    }
    public Student setMajor(String major) {
        this.major = major;
        return this;
    }
    
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public String getDepartment() {
        return department;
    }
    public String getMajor() {
        return major;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "account='" + getAccount() + '\'' +
                ", username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", department='" + department + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
    
    @Override
    public String toJsonString(){
        String json = "{" +
                "\"account\":\"" + getAccount() +
                "\",\"age\":" + age +
                ",\"id\":" + id +
                ",\"major\":" + major +
                ",\"name\":" +
                ",\"sex\":" +
                ",\"username\":" +
                "}";
        return json;
    }
}

package by.itstep.oop.inh.task;

public class Client {
    private int id;
    private String name;
    private String email;
    private String password1;
    private String password2;
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password1='*******'" + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public Client() {
        System.out.println("Hello, new friend!");
        this.role = "General user";
    }

    public Client(int id, String name, String email, String password1, String password2, String role){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password1 = password1;
        this.password2 = password2;
        this.role = role;
    }

    public Client(int id, String name, String email) {

        this(id, name, email, null, null, null);
    }
}

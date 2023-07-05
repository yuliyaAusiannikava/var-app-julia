package by.itstep.oop.inh.task;

public class SuperClient extends Client{
    private String function;

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public SuperClient(){
        //this.role = "Admin";
        super(0, null, null, null, null, "Admin");
    }


    public SuperClient(int id, String name, String email, String password1, String password2, String role, String function) {
        super(id, name, email, password1, password2, role);
        this.function = function;
    }
}

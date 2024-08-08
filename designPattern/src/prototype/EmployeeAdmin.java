package prototype;

public class EmployeeAdmin extends Employee {
    
    private String userName;
    private String password;
    
    public EmployeeAdmin(){ }
    
    public EmployeeAdmin(EmployeeAdmin employeeAdmin)
    {
        super(employeeAdmin);
        this.userName = employeeAdmin.userName;
        this.password = employeeAdmin.password;
    }

    public EmployeeAdmin clone(EmployeeAdmin employeeAdmin)
    {
        return new EmployeeAdmin(this);
    }

    // Getter & Setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

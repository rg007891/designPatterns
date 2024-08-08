package prototype;

public class Employee implements Prototype<Employee>{

    private int empCode;
    private String empName;
    private int age;
    private String department;
    private String designation;

    public Employee(){ }

    public Employee(Employee emp)
    {
        this.empCode = emp.empCode;
        this.empName = emp.empName;
        this.age = emp.age;
        this.department = emp.department;
        this.designation = emp.designation;
    }

    public Employee clone()
    {
        return new Employee(this);
    }

    // Getter & Setter
    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

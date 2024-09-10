package builder;

public class Employee {
    private long empCode;
    private String empName;
    private String phone;
    private int age;

    private Employee(Builder builder)
    {
        if(builder.getAge() < 18)
        {
            throw new RuntimeException("Age must be greater than 18");
        }

        this.empCode = builder.getEmpCode();
        this.empName = builder.getEmpName();
        this.phone = builder.getPhone();
        this.age = builder.getAge();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public long getEmpCode() { return empCode; }

    public String getEmpName() { return empName; }

    public String getPhone() { return phone; }

    public int getAge() { return age; }

    static class Builder{
        private long empCode;
        private String empName;
        private String phone;
        private int age;

        public long getEmpCode() {
            return empCode;
        }

        public Builder setEmpCode(long empCode) {
            this.empCode = empCode;
            return this;
        }

        public String getEmpName() {
            return empName;
        }

        public Builder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }
    }
}

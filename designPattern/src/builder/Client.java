package builder;

public class Client {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .setEmpCode(201)
                .setEmpName("Raj Aryan")
                .setPhone("9876543210")
                .setAge(21)
                .build();

        // Print employee class values
        printEmployeeDetails(employee);
    }

    public static void printEmployeeDetails(Employee employee)
    {
        System.out.println("=====================================");
        System.out.println("EMPLOYEE DETAIL");
        System.out.println("=====================================");
        System.out.println("EMP_Code:: " + employee.getEmpCode());
        System.out.println("Name    :: " + employee.getEmpName());
        System.out.println("Phone   :: " + employee.getPhone());
        System.out.println("Age     :: " + employee.getAge());
        System.out.println("-------------------------------------");
    }
}

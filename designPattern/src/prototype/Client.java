package prototype;

public class Client {

    public static void main(String[] args)
    {
        EmployeeRegistry employeeRegistry = new EmployeeRegistry();
        populateEmployeePrototypes(employeeRegistry);

        Employee emp1 = employeeRegistry.get("it").clone();
        emp1.setEmpCode(22);
        emp1.setEmpName("Neeraj Chopra");
        emp1.setAge(26);

        Employee emp2 = employeeRegistry.get("hr").clone();
        emp2.setEmpCode(36);
        emp2.setEmpName("P.V. Sindhu");
        emp2.setAge(29);


        Employee admin =  employeeRegistry.get("admin").clone();
        admin.setEmpName("Administration Ak Dhaiya");
//        admin.setUserName("admin@gmail.com");
//        admin.setPassword("adminPassword@123");

        // Display employee detail
        displayEmployeeDetail(emp1);
        displayEmployeeDetail(emp2);
        displayEmployeeDetail(admin);
    }

    public static void populateEmployeePrototypes(EmployeeRegistry employeeRegistry)
    {
        // Prototype 1: IT department
        Employee deptIt = new Employee();
        deptIt.setDepartment("IT");
        deptIt.setDesignation("Developer");
        employeeRegistry.register("it", deptIt);

        // Prototype 2: HR department
        Employee deptHr = new Employee();
        deptHr.setDepartment("HR");
        deptHr.setDesignation("HR Head");
        employeeRegistry.register("hr", deptHr);

        // Prototype 3: Admin Employee
        EmployeeAdmin admin = new EmployeeAdmin();
        admin.setDepartment("Admin");
        admin.setDesignation("Admin Manager");
        employeeRegistry.register("admin", admin);
    }

    public static void displayEmployeeDetail(Employee employee)
    {
        System.out.println("=========================================");
        System.out.println("EMPLOYEE DETAIL");
        System.out.println("=========================================");
        System.out.println("EMP_Code   :: " + employee.getEmpCode());
        System.out.println("Name       :: " + employee.getEmpName());
        System.out.println("Age        :: " + employee.getAge());
        System.out.println("Designation:: " + employee.getDesignation());
        System.out.println("Department :: " + employee.getDepartment());
        System.out.println("-----------------------------------------");
    }
}

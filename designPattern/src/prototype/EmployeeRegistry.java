package prototype;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRegistry {

    private Map<String, Employee> employeeMap = new HashMap<>();

    public void register(String key, Employee employee)
    {
        employeeMap.put(key, employee);
    }

    public Employee get(String key)
    {
        return employeeMap.get(key);
    }
}

package root.dao;

import root.entity.Employee;

import java.util.List;

public interface EmployeeDaoInterface {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
}

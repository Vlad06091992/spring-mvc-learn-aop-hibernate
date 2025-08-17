package root.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import root.dao.EmployeeDaoInterface;
import root.entity.Employee;

import java.util.List;

@Component
@Service
public class EmployeeService implements EmployeeServiceInterface {

    @Autowired
    private EmployeeDaoInterface employeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        System.out.println("SERVICE");
        return this.employeeDao.getAllEmployees();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeDao.saveEmployee(employee);
    }


}

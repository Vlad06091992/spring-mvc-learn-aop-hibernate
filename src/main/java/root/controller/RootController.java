package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import root.dao.EmployeeDao;
import root.dao.EmployeeDaoInterface;
import root.entity.Employee;

import java.util.List;

//import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RootController {

    @Autowired
    private EmployeeDaoInterface employeeDao;


    @RequestMapping("/")
    public String getAllEmployees(Model model) {

        List<Employee> employeeList = this.employeeDao.getAllEmployees();

        model.addAttribute("employees", employeeList);

        return "all-employees";
    }
}

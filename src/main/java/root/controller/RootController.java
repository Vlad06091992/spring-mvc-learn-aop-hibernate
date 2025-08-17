package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import root.entity.Employee;
import root.service.EmployeeServiceInterface;
import java.util.List;

@Controller
public class RootController {

    @Autowired
    private EmployeeServiceInterface service;


    @RequestMapping("/")
    public String getAllEmployees(Model model) {

        List<Employee> employeeList = this.service.getAllEmployees();

        model.addAttribute("employees", employeeList);

        return "all-employees";
    }
}

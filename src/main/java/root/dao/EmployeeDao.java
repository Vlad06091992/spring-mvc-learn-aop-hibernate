package root.dao;

import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import root.entity.Employee;

import java.util.List;

@Repository
@Component
public class EmployeeDao implements EmployeeDaoInterface {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        System.out.println("REPOSITORY");
        List<Employee> employees = session.createQuery("from Employee", Employee.class).getResultList();
        return employees;

    }
}

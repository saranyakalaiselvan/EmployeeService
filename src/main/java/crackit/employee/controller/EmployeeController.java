package crackit.employee.controller;

import crackit.employee.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crackit/v1/")
public class EmployeeController {

    @GetMapping("/employees")
    public Employee getEmployees() {
        return new Employee(1, "Saranya",
                "Software Development", "Senior Developer");
    }
}

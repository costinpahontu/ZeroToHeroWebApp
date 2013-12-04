package ro.zerotohero.controller.employee;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ro.zerotohero.model.EmployeeEntity;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {

		EmployeeEntity employee1 = new EmployeeEntity();
		employee1.setFirstName("Emp1_F");
		employee1.setLastName("Emp1_L");
		employee1.setEmail("emp1@mail.ro");
		employee1.setPassword("password");

		EmployeeEntity employee2 = new EmployeeEntity();
		employee2.setFirstName("Emp2_F");
		employee2.setLastName("Emp2_L");
		employee2.setEmail("emp3@mail.ro");
		employee2.setPassword("password");

		EmployeeEntity employee3 = new EmployeeEntity();
		employee3.setFirstName("Emp3_F");
		employee3.setLastName("Emp3_L");
		employee3.setEmail("emp3@mail.ro");
		employee3.setPassword("password");

		ArrayList<EmployeeEntity> listaEmployee = new ArrayList<EmployeeEntity>();
		listaEmployee.add(employee1);
		listaEmployee.add(employee2);
		listaEmployee.add(employee3);

		model.addAttribute("message", "Application Index");
		return "employee/index";
	}

}

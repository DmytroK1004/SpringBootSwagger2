package blog.panditmandar.code.sbsw2demo.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import blog.panditmandar.code.sbsw2demo.model.Employee;

/**
 * Service Interface for EMployee Model.
 * 
 * @author Mandar Pandit
 */
public interface IEmployeeService {

	public List<Employee> getAllEmployees();

	public Optional<Employee> getEmployeeByID(Long employeeID);

	public Employee saveEmployee(@Valid Employee employee);

	public Employee updateEmployee(Employee empDetails);

	public void deleteEmployee(Employee employee);
}

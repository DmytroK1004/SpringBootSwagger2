package blog.panditmandar.code.sbsw2demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import blog.panditmandar.code.sbsw2demo.model.Employee;

/**
 * Employee Repository: Provides Methods to Store Employee Data IN Database
 * 
 * @author Mandar Pandit
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

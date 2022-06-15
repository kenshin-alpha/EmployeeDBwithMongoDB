package empapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import empapp.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

	
}

package springboottut.school;

import org.springframework.data.repository.CrudRepository;

public interface SchoolRepository extends CrudRepository<School, Long> {
}
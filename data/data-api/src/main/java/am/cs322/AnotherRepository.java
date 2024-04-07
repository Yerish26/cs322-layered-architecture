package am.cs322;

import am.cs322.model.Another;
import am.cs322.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnotherRepository extends CrudRepository<Another, Long> {
}

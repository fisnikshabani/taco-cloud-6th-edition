package sia.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.domain.User;


public interface UserRepository extends CrudRepository<User, Long> {

    //User findByUsername(String username);
}

package pl.edu.amu.wmi.oauthtut;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Stworzone przez Eryk Mariankowski dnia 23.12.17.
 */
@Repository
public interface BaseUserRepository extends CrudRepository<User, Integer> {

    User findFirstByLogin(String username);

}

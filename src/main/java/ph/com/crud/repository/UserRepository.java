package ph.com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ph.com.crud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

package br.mack.repository;

import br.mack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cmaia on 09/10/16
 */
public interface UserRepository extends JpaRepository<User, Long> {
}

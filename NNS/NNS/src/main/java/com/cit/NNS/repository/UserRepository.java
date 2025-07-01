package com.cit.NNS.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cit.NNS.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsernameAndPassword(String username, String password);
    boolean existsByUsername(String username); // 🔧 Add this line
}

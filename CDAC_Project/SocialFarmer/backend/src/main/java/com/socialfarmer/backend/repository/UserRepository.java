package com.socialfarmer.backend.repository;

import com.socialfarmer.backend.model.Role;
import com.socialfarmer.backend.model.User;
import com.socialfarmer.backend.model.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByPhoneNumber(String phoneNumber);
    List<User> findByRoleAndStatus(Role role, UserStatus status);
}

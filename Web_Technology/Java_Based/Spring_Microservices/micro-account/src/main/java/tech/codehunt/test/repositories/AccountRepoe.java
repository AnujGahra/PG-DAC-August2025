package tech.codehunt.test.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.codehunt.test.entities.Account;

@Repository
public interface AccountRepoe extends JpaRepository<Account, String> {

    Optional<Account> findByAccNo(String accNo);
}

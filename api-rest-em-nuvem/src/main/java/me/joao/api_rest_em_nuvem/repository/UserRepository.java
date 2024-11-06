package me.joao.api_rest_em_nuvem.repository;

import me.joao.api_rest_em_nuvem.model.User; // Corrigida a importação
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}


package com.backendMarchPro.LibrariManagmentSystem.Repository;

import com.backendMarchPro.LibrariManagmentSystem.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}

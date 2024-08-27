package org.sid.projet_hps.repositories;

import org.sid.projet_hps.entities.Transaction;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query("SELECT t FROM Transaction t ORDER BY t.id DESC")
    List<Transaction> findLastTransaction(Pageable pageable);
}
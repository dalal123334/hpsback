package org.sid.projet_hps.repositories;

import org.sid.projet_hps.entities.TransactionInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionInfoRepository extends JpaRepository<TransactionInfo, Long> {
}

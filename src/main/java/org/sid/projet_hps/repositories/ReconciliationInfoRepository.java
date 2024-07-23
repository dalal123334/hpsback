package org.sid.projet_hps.repositories;

import org.sid.projet_hps.entities.ReconciliationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReconciliationInfoRepository extends JpaRepository<ReconciliationInfo, Long> {
}


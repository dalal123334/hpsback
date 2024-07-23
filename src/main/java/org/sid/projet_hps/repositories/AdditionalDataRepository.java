package org.sid.projet_hps.repositories;

import org.sid.projet_hps.entities.AdditionalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalDataRepository extends JpaRepository<AdditionalData, Long> {
}

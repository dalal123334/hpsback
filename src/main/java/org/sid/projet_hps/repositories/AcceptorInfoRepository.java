package org.sid.projet_hps.repositories;

import org.sid.projet_hps.entities.AcceptorInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcceptorInfoRepository extends JpaRepository<AcceptorInfo, Long> {
}


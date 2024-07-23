package org.sid.projet_hps.repositories;

import org.sid.projet_hps.entities.CurrencyConversionInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyConversionInfoRepository extends JpaRepository<CurrencyConversionInfo, Long> {
}


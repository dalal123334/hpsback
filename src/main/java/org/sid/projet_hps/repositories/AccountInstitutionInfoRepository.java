package org.sid.projet_hps.repositories;

import org.sid.projet_hps.entities.AccountInstitutionInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountInstitutionInfoRepository extends JpaRepository<AccountInstitutionInfo, Long> {
}

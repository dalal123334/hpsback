package org.sid.projet_hps.services;

import org.sid.projet_hps.entities.AcceptorInfo;
import org.sid.projet_hps.entities.AccountInstitutionInfo;
import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.repositories.AccountInstitutionInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountInstitutionInfoServiceImpl implements AccountInstitutionInfoService {

    @Autowired
    private AccountInstitutionInfoRepository accountInstitutionInfoRepository;

    @Override
    public List<AccountInstitutionInfo> getAll() {
        return accountInstitutionInfoRepository.findAll();
    }

    @Override
    public Optional<AccountInstitutionInfo> getById(Long id) {
        return accountInstitutionInfoRepository.findById(id);
    }

    @Override
    public AccountInstitutionInfo save(AccountInstitutionInfo accountInstitutionInfo) {
        return accountInstitutionInfoRepository.save(accountInstitutionInfo);
    }

    @Override
    public void deleteById(Long id) {
        accountInstitutionInfoRepository.deleteById(id);
    }

    @Override
    public void saveTransactionBaseInfo(TransactionInfo baseInfo) {

    }

    @Override
    public TransactionInfo getTransactionBaseInfo(Long id) {
        return null;
    }

    @Override
    public void saveTransactionMerchantInfo(AcceptorInfo merchantInfo) {

    }

    @Override
    public AcceptorInfo getTransactionMerchantInfo(Long id) {
        return null;
    }
}

package org.sid.projet_hps.services;

import org.sid.projet_hps.entities.AcceptorInfo;
import org.sid.projet_hps.entities.ReconciliationInfo;
import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.repositories.ReconciliationInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReconciliationInfoServiceImpl implements ReconciliationInfoService {

    @Autowired
    private ReconciliationInfoRepository reconciliationInfoRepository;

    @Override
    public List<ReconciliationInfo> getAll() {
        return reconciliationInfoRepository.findAll();
    }

    @Override
    public Optional<ReconciliationInfo> getById(Long id) {
        return reconciliationInfoRepository.findById(id);
    }

    @Override
    public ReconciliationInfo save(ReconciliationInfo reconciliationInfo) {
        return reconciliationInfoRepository.save(reconciliationInfo);
    }

    @Override
    public void deleteById(Long id) {
        reconciliationInfoRepository.deleteById(id);
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

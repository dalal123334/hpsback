package org.sid.projet_hps.services;

import org.sid.projet_hps.entities.AcceptorInfo;
import org.sid.projet_hps.entities.AdditionalData;
import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.repositories.AdditionalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdditionalDataServiceImpl implements AdditionalDataService {

    @Autowired
    private AdditionalDataRepository additionalDataRepository;

    @Override
    public List<AdditionalData> getAll() {
        return additionalDataRepository.findAll();
    }

    @Override
    public Optional<AdditionalData> getById(Long id) {
        return additionalDataRepository.findById(id);
    }

    @Override
    public AdditionalData save(AdditionalData additionalData) {
        return additionalDataRepository.save(additionalData);
    }

    @Override
    public void deleteById(Long id) {
        additionalDataRepository.deleteById(id);
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

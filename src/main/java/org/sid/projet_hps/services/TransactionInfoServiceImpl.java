package org.sid.projet_hps.services;

import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.repositories.TransactionInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TransactionInfoServiceImpl implements TransactionInfoService  {
private TransactionInfoRepository transactionInfoRepository;

    @Override
    public List<TransactionInfo> getAll() {
        return transactionInfoRepository.findAll();
    }

    @Override
    public Optional<TransactionInfo> getById(Long id) {
        return transactionInfoRepository.findById(id);
    }

    @Override
    public TransactionInfo save(TransactionInfo transactionInfo) {
        return transactionInfoRepository.save(transactionInfo);
    }

    @Override
    public void deleteById(Long id) {
        transactionInfoRepository.deleteById(id);
    }
}

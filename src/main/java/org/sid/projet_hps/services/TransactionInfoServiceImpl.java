package org.sid.projet_hps.services;

import org.sid.projet_hps.entities.AcceptorInfo;
import org.sid.projet_hps.entities.Transaction;
import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.repositories.TransactionInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionInfoServiceImpl implements TransactionInfoService {

    @Autowired
    private TransactionInfoRepository transactionInfoRepository;

    @Autowired
    private TransactionService transactionService;

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
        Transaction transaction = transactionService.getLastTransaction().orElseThrow();
        transactionInfo = transactionInfoRepository.save(transactionInfo);
        transaction.setTransactionInfo(transactionInfo);
        transactionService.save(transaction);
        return transactionInfo;
    }

    @Override
    public void deleteById(Long id) {
        transactionInfoRepository.deleteById(id);
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

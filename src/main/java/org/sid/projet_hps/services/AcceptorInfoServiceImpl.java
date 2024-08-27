package org.sid.projet_hps.services;

import org.sid.projet_hps.entities.AcceptorInfo;
import org.sid.projet_hps.entities.Transaction;
import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.repositories.AcceptorInfoRepository;
import org.sid.projet_hps.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AcceptorInfoServiceImpl implements AcceptorInfoService {

    @Autowired
    private AcceptorInfoRepository acceptorInfoRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<AcceptorInfo> getAll() {
        return acceptorInfoRepository.findAll();
    }

    @Override
    public Optional<AcceptorInfo> getById(Long id) {
        return acceptorInfoRepository.findById(id);
    }

    @Override
    public AcceptorInfo save(AcceptorInfo acceptorInfo) {
        Transaction transaction = new Transaction();
        acceptorInfo = acceptorInfoRepository.save(acceptorInfo);
        transaction.setAcceptorInfo(acceptorInfo);
        transactionRepository.save(transaction);
        return acceptorInfo;
    }

    @Override
    public void deleteById(Long id) {
        acceptorInfoRepository.deleteById(id);
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

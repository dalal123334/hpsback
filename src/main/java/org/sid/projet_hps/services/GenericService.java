package org.sid.projet_hps.services;

import org.sid.projet_hps.entities.AcceptorInfo;
import org.sid.projet_hps.entities.TransactionInfo;

import java.util.List;
import java.util.Optional;

public interface GenericService<T, ID> {
    List<T> getAll();

    Optional<T> getById(ID id);

    T save(T entity);

    void deleteById(ID id);

    void saveTransactionBaseInfo(TransactionInfo baseInfo);

    TransactionInfo getTransactionBaseInfo(Long id);

    void saveTransactionMerchantInfo(AcceptorInfo merchantInfo);

    AcceptorInfo getTransactionMerchantInfo(Long id);
}

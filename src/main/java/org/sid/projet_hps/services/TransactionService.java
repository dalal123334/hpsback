package org.sid.projet_hps.services;

import org.sid.projet_hps.entities.Transaction;

import java.util.Optional;

public interface TransactionService extends GenericService<Transaction, Long> {
    Optional<Transaction> getLastTransaction();
}

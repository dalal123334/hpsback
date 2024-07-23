package org.sid.projet_hps.services;
import org.hibernate.validator.constraints.time.DurationMin;
import org.sid.projet_hps.entities.*;
import org.sid.projet_hps.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class GenericService <T, ID> {
    List<T> getAll() {
        return null;
    }

    Optional<T> getById(ID id) {
        return null;
    }

    T save(T entity) {
        return null;
    }

    void deleteById(ID id) {

    }


    public void saveTransactionBaseInfo(@Valid TransactionInfo baseInfo) {
    }
}

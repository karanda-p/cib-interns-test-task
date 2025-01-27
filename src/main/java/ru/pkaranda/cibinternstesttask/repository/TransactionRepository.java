package ru.pkaranda.cibinternstesttask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pkaranda.cibinternstesttask.model.domain.Transaction;
import ru.pkaranda.cibinternstesttask.model.domain.TransactionType;

import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Optional<Transaction> getTransactionById(Long id);

    Optional<Transaction> getTransactionByType(TransactionType type);
}

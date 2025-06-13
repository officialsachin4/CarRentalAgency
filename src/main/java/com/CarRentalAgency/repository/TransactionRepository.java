package com.CarRentalAgency.repository;

import com.CarRentalAgency.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
/*
    @Query("select T from Transaction T where " +
            "T.customer = ?1 " +
            "T.")
    Transaction makeTransaction(long customerID , long dealerID,  int registrationNumber);
*/

}

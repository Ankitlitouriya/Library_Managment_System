package com.backendMarchPro.LibrariManagmentSystem.Entity;

import com.backendMarchPro.LibrariManagmentSystem.Enum.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Transaction {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//    int id;
//
//    private String transactionNumber;
//    @Enumerated(EnumType.STRING)
//    TransactionStatus transactionStatus;
//
//   @CreationTimestamp
//   private Date transactionData;
//
//   boolean isissueOperation;
//
//   private String message;
//
//   @ManyToOne
//    @JoinColumn
//   Book book;
//
//   @ManyToOne
//   @JoinColumn
//    LibraryCard card;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String transactionNumber;

    @Enumerated(EnumType.STRING)
    TransactionStatus transactionStatus;

    @CreationTimestamp
    private Date transactionDate;

    private boolean isIssueOperation;

    private String message;

    @ManyToOne
    @JoinColumn
    Book book;

    @ManyToOne
    @JoinColumn
    LibraryCard card;
}

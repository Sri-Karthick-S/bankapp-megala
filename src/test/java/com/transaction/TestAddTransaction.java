package com.transaction;

import java.time.LocalDateTime;
import java.util.Scanner;

import factory.DAOFactory;
import logger.Logger;
import transaction.Transaction;
import transaction.TransactionDAO;

public class TestAddTransaction {
	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) throws Exception {
		Transaction c1 = new Transaction(); 
		Scanner s1=new Scanner(System.in);
		LOGGER.getInput("Enter transactionId:"); 
		c1.setTransactionId(s1.nextInt());
		LOGGER.getInput("Enter beneficiaryNo:");
		c1.setBeneficiaryAccNo(s1.nextInt());
		LOGGER.getInput("Enter transactionDate:");
		c1.setTransactionDate(LocalDateTime.parse(s1.next()));
		LOGGER.getInput("Enter transactionAmount:");
		c1.setTransactionAmount(s1.nextInt());
		

		Transaction c2 = new Transaction();
		LOGGER.getInput("Enter transactionId:");
		c2.setTransactionId(s1.nextInt());
		LOGGER.getInput("Enter beneficiaryNo:");
		c2.setBeneficiaryAccNo(s1.nextInt());
		LOGGER.getInput("Enter transactionDate:");
		c2.setTransactionDate(LocalDateTime.parse(s1.next()));
		LOGGER.getInput("Enter transactionAmount:");
		c2.setTransactionAmount(s1.nextInt());
		

		/*Transaction c3 = new Transaction();
		LocalDate expiryDate2 = LocalDate.parse("2022-12-12");
		c3.transactionId = 131187;
		c3.beneficiaryAccNo = 11177;
		c3.transactionAmount = 2000;
		c3.transactionDate = expiryDate2;
		
*/
		TransactionDAO dao =DAOFactory.getTransactionDAO();
		dao.addTransaction(c1);
		dao.addTransaction(c2);

	/*	TransactionDAOImpl dao2 = new TransactionDAOImpl();
		dao2.addTransaction(c3);
*/
		
		s1.close();
	}

	}


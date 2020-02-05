package com.transaction;

import java.util.Scanner;

import daoFactory.DAOFactory;
import transaction.TransactionDAO;

public class TestDeleteTransaction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter transactionId:");
		int c1 = s1.nextInt();
		TransactionDAO dao1 =DAOFactory.getTransactionDAO();
		dao1.deleteTransaction(c1);
		s1.close();
	}

}

package com.account;

import account.AccountDAOImpl;

public class TestDisplayBalance {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AccountDAOImpl daoImpl=new AccountDAOImpl();
		daoImpl.displayBalance(11188);
	}

}

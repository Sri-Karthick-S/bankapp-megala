package com.customer;

import customer.CustomerDAO;
import factory.DAOFactory;

public class TestDisplayCustomer {

	public static void main(String[] args) throws Exception {
		CustomerDAO dao = DAOFactory.getCustomerDAO();
		dao.display();
	}

}

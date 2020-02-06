package com.branch;

import branch.BranchDAO;
import daofactory.DAOFactory;

public class TestDisplayBranch {

	public static void main(String[] args)  {
		
		BranchDAO dao = DAOFactory.getBranchDAO();
		try {
			dao.list();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}

package creditcard;

import daoFactory.DAOFactory;

public class CreditCardService {

	public static boolean validateCreditCard(CreditCard creditCard) throws Exception {
		try {
			CreditCardValidator.validateCreditCard(creditCard.getCreditCardNo(),creditCard.getExpiryDate());
			return true;
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
		

	}
	
	public static boolean registerCreditCard(CreditCard creditCard) throws Exception {
		
		boolean result ;
		try {
			CreditCardDAO dao=DAOFactory.getCreditCardDAO();
			CreditCardValidator.validateCreditCard(creditCard.getCreditCardNo(),creditCard.getExpiryDate());
			dao.addCreditCard(creditCard);
			result = true;
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			throw new Exception("Unable to register credit card: " + e.getMessage());
		}
		return result;
		

	}

}

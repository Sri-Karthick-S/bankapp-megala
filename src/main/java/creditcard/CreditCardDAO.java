package creditcard;

import java.util.List;

public interface CreditCardDAO {
	public void addCreditCard(CreditCard creditCard) throws Exception;
	public List<CreditCard> displayCreditCard() throws Exception;
	public void updateCreditCard1(String comments,int creditCardNo,boolean blocked) throws Exception;
	
}
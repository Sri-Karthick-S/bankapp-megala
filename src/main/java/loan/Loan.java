package loan;

import com.loan.LoanStatusEnum;

public class Loan {
	public int customerId;
	public String branchName;
	public String loanNo;
	public int amount;
	public LoanStatusEnum status=LoanStatusEnum.APPROVED;

}
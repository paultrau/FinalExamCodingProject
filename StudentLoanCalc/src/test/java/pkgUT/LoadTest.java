
package pkgUT;

import java.util.Date;
import org.junit.Test;

import app.helper.Loan;

public class LoanTest {
	
	@Test
	public void LoanTest() {
		
		double loanAmount = 100000;
		double interestRate = 0.07;
		int nbrOfYears = 20;
		double additionalPayment = 100;
		Date firstPaymentDate = Loan.parseDate("2019-06-01");
		
		boolean bInterestCalc = false;
		double futureValue = 0;
		
		Loan1 = new Loan(loanAmount, interestRate, nbrOfYears, additionalPayment, firstPaymentDate, bInterestCalc, FutureValue);
	}

}

package practice;

import java.util.Comparator;

public class PaymentAmountComparator implements Comparator <Payment>{

	public PaymentAmountComparator() {
		
	}

	@Override
	public int compare(Payment o1, Payment o2) {
		if(o1.getPaymentAmount()>o2.getPaymentAmount())
			return 1;
		else
			return -1;
	}

}

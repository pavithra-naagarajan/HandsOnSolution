package practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PaymentWorkingProcess {


	public static void main(String[] args) {
		List<Payment> payments=new ArrayList<Payment>();
		
		
		
		
		payments.add(new Payment(11,"online",11000,"paid"));
		payments.add(new Payment(7,"direct",2000,"unpaid"));
		payments.add(new Payment(3,"online",3000,"paid"));
		for(Payment obj:payments) {
			System.out.println(obj);}
		
		System.out.println("After sorting by paymentID:");
		Collections.sort(payments);
		Iterator <Payment> iterator1=payments.iterator();
		
		
		while(iterator1.hasNext()) {
			Payment obj=iterator1.next();
			System.out.println(obj);
		}
		

		System.out.println("After sorting by paymentAmount:");
		
		
		Collections.sort(payments , new PaymentAmountComparator());
		
		Iterator<Payment> iterator2 = payments.iterator();
		while(iterator2.hasNext())
		{
			
			Payment t = iterator2.next();
			System.out.println(t);
		}
		
		Collections.sort(payments , new Comparator<Payment>() {

			@Override
			public int compare(Payment o1, Payment o2) {
			
				if( o1.getPaymentType().compareTo(o2.getPaymentType()) > 0)
						return 1;
				else
					return -1;
		}
	});
	System.out.println("After sorting Anonymous inner classes");
	Iterator<Payment> iterator3 = payments.iterator();
	while(iterator3.hasNext())
	{
		
		Payment temp = iterator3.next();
		System.out.println(temp);
	}

		
		}
	}



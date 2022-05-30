package com.brainworks.service;

import org.springframework.stereotype.Service;

@Service
public class BillingServiceImpl implements IBillingService {
	

	@Override
	public Double billOfCustomer(String customerType, Long purchaseAmt) {
		
		Double billGgenerated = null;

		if (("premium").equalsIgnoreCase(customerType) && purchaseAmt <= 4000)

		{
			Double discountPercentage = (0.10);
			billGgenerated = purchaseAmt - (purchaseAmt * discountPercentage);

		}
		if (("premium").equalsIgnoreCase(customerType) && 4000 < purchaseAmt && purchaseAmt <=8000)

		{
			Double discountPercentage = (0.15);
			billGgenerated = purchaseAmt - (((purchaseAmt-4000)*(discountPercentage))+(4000*0.1));

		}

		if (("premium").equalsIgnoreCase(customerType) && 8000 < purchaseAmt && purchaseAmt <=12000)

		{
			Double discountPercentage = (0.20);
			billGgenerated = purchaseAmt - (((purchaseAmt-8000)*(discountPercentage))+(4000*0.1)+(4000*.15));

		}

		if (("premium").equalsIgnoreCase(customerType) && 12000<purchaseAmt )

		{
			Double discountPercentage = (0.30);
			billGgenerated = purchaseAmt - (((purchaseAmt-12000)*(discountPercentage))+(4000*0.1)+(4000*.15)+(4000*0.20));

		
			

		}
		if (("REGULAR").equalsIgnoreCase(customerType) && purchaseAmt <= 5000)

		{
			Double discountPercentage = (0.00);
			billGgenerated = purchaseAmt - (purchaseAmt * discountPercentage);

		}

		if (("REGULAR").equalsIgnoreCase(customerType) && 5000 <purchaseAmt && purchaseAmt <=10000)

		{
			Double discountPercentage = (0.10);
			 billGgenerated = purchaseAmt - (((purchaseAmt-5000)*(discountPercentage)));

			

		}

		if (("REGULAR").equalsIgnoreCase(customerType) &&  purchaseAmt > 10000)

		{
			Double discountPercentage = (0.20);
			billGgenerated = purchaseAmt - (purchaseAmt * discountPercentage);
			billGgenerated = purchaseAmt - (((purchaseAmt-10000)*(discountPercentage)+(5000*0.0)+(5000*.10)));

		

		}

		

		return  billGgenerated;

	}
}

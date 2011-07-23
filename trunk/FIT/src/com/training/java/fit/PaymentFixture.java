package com.training.java.fit;

import fit.ColumnFixture;

public class PaymentFixture extends ColumnFixture {
	
	public double hourlyRate;
	public int hoursWorked;
	
	public double caculatePay()
	{
		return hourlyRate * hoursWorked;
	}

}

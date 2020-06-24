package com.wipro.inheritance;

public class Employee extends Person{
	
	double annualsalary;
	int workstartyear;
	String natinsurancenumber;
	
	Employee()
	{
		
	}
	
	void setName(String name)
	{
		super.name=name;
	}
	void setAnnualsalary(double annualsalary)
	{
		this.annualsalary=annualsalary;
	}
	void setWorkstartyear(int workstartyear)
	{
		this.workstartyear=workstartyear;
	}
	void setNatinsurancenumber(String natinsurancenumber)
	{
		this.natinsurancenumber=natinsurancenumber;
	}
	
	String getName()
	{
		return super.name;
	}
	double getAnnualSalary()
	{
		return annualsalary;
	}
	int getWorkStartYear()
	{
		return workstartyear;
	}
	String getNatInsuranceNumber()
	{
		return natinsurancenumber;
	}

}

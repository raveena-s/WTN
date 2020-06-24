package com.wipro.inheritance;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		String name="Jimin";
		double annualsalary=2500000;
		int workstartyear=2021;
		String natinsurancenumber="5372882902";
		
		Employee e=new Employee();
		e.setName(name);
		e.setAnnualsalary(annualsalary);
		e.setWorkstartyear(workstartyear);
		e.setNatinsurancenumber(natinsurancenumber);
		
		System.out.println("Employee's name: "+e.getName());
		System.out.println("Employee's annual salary: "+e.getAnnualSalary());
		System.out.println("Employee's first year at work: "+e.getWorkStartYear());
		System.out.println("Employee's national insurance number: "+e.getNatInsuranceNumber());
		
	}

}

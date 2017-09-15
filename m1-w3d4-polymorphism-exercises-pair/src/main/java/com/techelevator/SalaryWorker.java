package com.techelevator;

public class SalaryWorker implements Worker {
	
	//instance variables
	private String firstName;
	private String lastName;
	private double calculateWeeklyPay;
	private double annualSalary;
	private double hourlyRate;
	private double hoursWorked;
	
	//Constructor
	public SalaryWorker(double annualSalary){
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getCalculateWeeklyPay (int hoursWorked) {
		return annualSalary/52;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}



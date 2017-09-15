package com.techelevator;

public class HourlyWorker implements Worker {

	//instance variables
		private String firstName;
		private String lastName;
		private double calculateWeeklyPay;
		private double hoursWorked;
		private double hourlyRate = 15.95;
		private double hourlyPay;
		private double overTime;
		
		//Constructor
		public HourlyWorker(double hourlyRate){
			this.hourlyRate = hourlyRate;
		}
		
		public double hourlyPay() {
			return hourlyRate*hoursWorked;
		}
		
		public double overTime(double hoursWorked) {
			return overTime = hoursWorked - 40;
		}
		
		public double getHourlyPay() {
			return hourlyPay;
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
			if (hoursWorked <= 40) {
				return calculateWeeklyPay = hourlyRate * hoursWorked; 
			} 
			return calculateWeeklyPay = hourlyRate * 40 + (hoursWorked - 40) * (hourlyRate) * 1.5;
		}

		public double getHourlyRate() {
			return hourlyRate;
		}

		public double getOverTime() {
			return overTime;
		}

		public double getHoursWorked() {
			return hoursWorked;
		}

		public void setHoursWorked(double hoursWorked) {
			this.hoursWorked = hoursWorked;
		}

		public void setOverTime(double overTime) {
			this.overTime = overTime;
		}

}

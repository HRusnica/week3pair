package com.techelevator;

public class VolunteerWorker implements Worker {

	//instance variables
		private String firstName;
		private String lastName;
		private double calculateWeeklyPay;
		private double hourlyRate;
		private double hoursWorked;
		
		//Constructor
		public VolunteerWorker() {};
		
		
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
			return hoursWorked*0;
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

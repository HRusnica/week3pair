package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PayRoll {

	public static void main(String[] args) {
		
		SalaryWorker bobDob = new SalaryWorker(50000); 
		bobDob.setFirstName("Beebob");
		bobDob.setLastName("Dobdoo");
		bobDob.setHoursWorked(35);
		HourlyWorker susan = new HourlyWorker(15.95);
		susan.setFirstName("Susan");
		susan.setLastName("Sommers");
		susan.getOverTime();
		VolunteerWorker barneyStinson = new VolunteerWorker();
		barneyStinson.setFirstName("Barney");
		barneyStinson.setLastName("Stinso");
		
		List<Worker> workaholics = new ArrayList<>();
		
			workaholics.add(bobDob);
			workaholics.add(susan);
			workaholics.add(barneyStinson);
		Random rnd = new Random();
		rnd.setSeed(System.currentTimeMillis());
		for(Worker workYes : workaholics) {
			int hoursWorked = rnd.nextInt(60);
			System.out.println(String.format("Employee: %s, %s %8d\t%.2f", workYes.getLastName(), workYes.getFirstName(), hoursWorked, workYes.getCalculateWeeklyPay(hoursWorked)));
		}
	}
}

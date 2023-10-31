package com.code;

import java.time.LocalDate;
import java.util.List;

import com.code.*;

public class CustValidation {
	public static ServicePlan validatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	public static void validateCharges(ServicePlan plan, double charges) throws InvalidInputExc {
		if (plan.getCharges() != charges) {
			throw new InvalidInputExc("Charges doesn't match with Plan ..!");
		}
	}
	
	public static void validateEmail(String email,List<Customer> lst) throws InvalidInputExc{
		if(!email.matches("[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)") )
			throw new InvalidInputExc("Email invalid..!");
		Customer cnew=new Customer(email);
		if(lst.contains(cnew)) {
			throw new InvalidInputExc("Duplicate Email..!");
		}
	}

	public static LocalDate validateDate(String dt) {
		return LocalDate.parse(dt);
	}

	public static Customer validateCustomer(String name, String lname, String email, String password,
			double registrationAmount, String date, String plan,List<Customer>lst) throws InvalidInputExc {
		ServicePlan sp = validatePlan(plan);
		validateCharges(sp, registrationAmount);
		LocalDate dt = validateDate(date);
		validateEmail(email, lst);
		return new Customer(name, lname, email, password, registrationAmount, dt, sp);

	}
}

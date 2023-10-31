package com.Tester;

import static com.code.CustValidation.validateCustomer;
import java.util.List;
import java.util.Scanner;
import com.code.*;

public class Tester1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			Customer cu;
			List<Customer> CustList = populateCustomer();// new ArrayList<>();////
			boolean exit = false;

			System.out.println("Please Enter Choice: "
					+ "\n1. Sign up (customer registration)\n2. Sign in (login)\n3. Change password\n4. Un subscribe customer\n5. Display all customers.\n0. Exit  ");
			do {
				System.out.println("Please Enter Choice: ");
				choice = sc.nextInt();
				switch (choice) {
				case 1:// Sign up (customer registration)
					System.out.println(
							"Enter Customers Details :\n name,  lname,  email,  password,  registrationAmount,  date , plan");
					cu = validateCustomer(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
							sc.next(), CustList);
					CustList.add(cu);
					System.out.println("Customer added succesfully : " + cu);
					break;
				case 2: // Sign in (login)
					// i/p : email n password
					System.out.print("Enter email : ");
					Customer cs =  findByEmail(sc.next(), CustList);
					System.out.print("Enter Password : ");
					// System.out.println(cs.getPassword());
					if (cs.passEq(sc.next())) {
						System.out.println("Customer Logged in successfully..!");
					} else {
						System.out.println("Sorry,Wrong password..!");
					}
					break;
				case 3:// Change password
						// i/p : email n old password n new password
					System.out.print("Enter Email to change password : ");
					System.out.print("Enter new password : ");
					findByEmail(sc.next(), CustList).setPassword(sc.next());
					System.out.print("Password Changed Succesfully..!");
					break;
				case 4:// Un subscribe customer
						// i/p : customer email
					System.out.println("Enter email to unsubscribe Customer : ");
					CustList.remove(findByEmail(sc.next(), CustList));
					System.out.println("Customer removed Successfully..!");
					break;
				case 5:// Display all customers.
					for (Customer c : CustList) {
						System.out.println(c);
					}

					break;
				case 0:
					exit = true;

					break;
				default:
					System.out.println("Please enter valid Choice..!");
					break;
				}
			} while (!exit);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static Customer findByEmail(String next, List<Customer> custList) {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<Customer> populateCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}

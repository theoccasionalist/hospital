package hospital;

import java.util.Scanner;

public class HospitalApp {
	public static void main(String[] args) {

		Doctor doctor = new Doctor("3452", "Phil", "Shoe Repair");
		Surgeon surgeon = new Surgeon("6342", "Bill", "Shoe Surgery");
		Nurse nurse = new Nurse("24532", "Gil");
		Receptionist receptionist = new Receptionist("7654", "Mil");
		Janitor janitor = new Janitor("5987", "Hill");

		Hospital employeeMap = new Hospital();
		employeeMap.addEmployee(doctor);
		employeeMap.addEmployee(surgeon);
		employeeMap.addEmployee(nurse);
		employeeMap.addEmployee(receptionist);
		employeeMap.addEmployee(janitor);

		System.out.println(
				"Welcome to this hospital.\nHere is the list of people working here and their employee numbers:\n");
		String out = String.format("%-15s%-15s", "Name", "Number");
		System.out.println(out);
		System.out.println("_____________________\n");
		System.out.println(
				employeeMap.returnEmployeeValues().toString().replace("[", "").replace("]", "").replace(",", ""));

		while (true) {
			System.out.println("\nCheck the below statuses of our employees by entering the number of your choice:\n");
			System.out.println("1. Display List of People Certified in Blood Letting");
			System.out.println("2. Display Salary by Employee Job Position");
			System.out.println("3. Display Specializations of Medical Personal");
			Scanner input = new Scanner(System.in);
			String choice = input.nextLine();
			if (choice.equalsIgnoreCase("1")) {
				employeeMap.showMedicalEmployees();
			} else if (choice.equalsIgnoreCase("2")) {
				employeeMap.showPayRates();
			} else if (choice.equalsIgnoreCase("3")) {
				employeeMap.showMedicalSpecialty();
			} else {
				System.out.println("Not an option.");
			}
		}

	}
}

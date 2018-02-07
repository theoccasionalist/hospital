package hospital;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Hospital {
	Map<String, Employee> numberToPerson = new TreeMap<>();

	public Collection<Employee> returnEmployeeValues() {
		return numberToPerson.values();
	}

	public void addEmployee(Employee employee) {
		numberToPerson.put(employee.getName(), employee);
	}

	public void showPayRates() {
		for (Employee employee : numberToPerson.values()) {
			System.out.println(employee.getName() + " is a " + employee.getJobDescription() + " and makes "
					+ employee.getSalary() + " per year");
		}
	}

	public void showMedicalEmployees() {
		for (Employee employee : numberToPerson.values()) {
			if (employee instanceof MedicalDuties) {
				System.out.println(employee.getName() + " is a " + employee.getJobDescription());
			}
		}
	}

	public void showMedicalSpecialty() {
		for (Employee employee : numberToPerson.values()) {
			if (employee instanceof Doctor) {
				System.out.println(employee.getName() + " is a " + employee.getJobDescription()
						+ " that specializes in " + ((Doctor) employee).getSpecialty());
			}
		}
	}

}

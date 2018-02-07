package hospital;

public class Receptionist extends Employee {
	private boolean onPhone;

	public Receptionist(String number, String name) {
		this.name = name;
		this.number = number;
	}

	public int getSalary() {
		return 45000;
	}

	public boolean onPhoneOrNot() {
		return onPhone;
	}

	@Override
	public String getJobDescription() {
		return "Receptionist";
	}

}

package hospital;

public class Surgeon extends Doctor {
	private boolean isOperating;

	public Surgeon(String number, String name, String specialty) {
		super(number, name, specialty);
	}

	@Override
	public int getSalary() {
		return 120000;
	}

	public boolean getIsOperating() {
		return isOperating;
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public String getJobDescription() {
		return "Surgeon";
	}
}

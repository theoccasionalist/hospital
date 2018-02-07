package hospital;

public class Doctor extends Employee implements MedicalDuties {
	String specialty;

	public Doctor(String number, String name, String specialty) {
		this.number = number;
		this.name = name;
		this.specialty = specialty;

	}

	@Override
	public void drawBlood(Bleedable patient, int amount) {
		patient.removeBlood(amount);
	}

	public int getSalary() {
		return 90000;
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public String getJobDescription() {
		return "Doctor";
	}

}

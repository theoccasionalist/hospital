package hospital;

public class Nurse extends Employee implements MedicalDuties {

	public Nurse(String number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getSalary() {
		return 50000;
	}

	@Override
	public void drawBlood(Bleedable patient, int amount) {
		patient.removeBlood(amount);
	}

	@Override
	public String getJobDescription() {
		return "Nurse";
	}

}

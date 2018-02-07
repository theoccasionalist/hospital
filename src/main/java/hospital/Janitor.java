package hospital;

public class Janitor extends Employee {
	boolean sweeping;

	public Janitor(String number, String name) {
		this.name = name;
		this.number = number;
	}

	@Override
	public int getSalary() {
		return 40000;
	}

	public boolean sweepingOrnot() {
		return sweeping;
	}

	@Override
	public String getJobDescription() {
		return "Janitor";
	}
}

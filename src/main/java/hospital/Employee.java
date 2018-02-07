package hospital;

abstract public class Employee {

	protected String name;
	protected String number;

	abstract public int getSalary();

	abstract public String getJobDescription();

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15s\n", name, number);
	}

}

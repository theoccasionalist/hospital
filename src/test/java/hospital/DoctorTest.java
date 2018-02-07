package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	Doctor underTest = new Doctor("1", "Phil", "Shoe Repair");
	Patient patient = new Patient();

	@Test
	public void shouldBeEmployeeWithSalary() {
		int check = underTest.getSalary();
		assertThat(check, is(90000));
	}

	@Test
	public void shouldDrawBlood() {
		int beforeBlood = patient.getBlood();
		underTest.drawBlood(patient, 10);
		int afterBlood = patient.getBlood();
		assertThat(beforeBlood - afterBlood, is(10));
	}

	@Test
	public void shouldGetName() {
		String check = underTest.getName();
		assertThat(check, is("Phil"));
	}
}
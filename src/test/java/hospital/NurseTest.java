package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	Nurse underTest = new Nurse("", "");
	Patient patient = new Patient();

	@Test
	public void shouldBeEmployeeWithSalary() {
		int check = underTest.getSalary();
		assertThat(check, is(50000));
	}

	@Test
	public void shouldDrawBlood() {
		int beforeBlood = patient.getBlood();
		underTest.drawBlood(patient, 10);
		int afterBlood = patient.getBlood();
		assertThat(beforeBlood - afterBlood, is(10));
	}
}

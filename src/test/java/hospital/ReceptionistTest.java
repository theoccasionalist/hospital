package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ReceptionistTest {

	public void shouldReturnReceptionistName() {
		Receptionist underTest = new Receptionist("1", "Phil");
		String check = underTest.getName();
		assertThat(check, is("Phil"));
	}
}

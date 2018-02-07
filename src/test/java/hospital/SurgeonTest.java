package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {

	@Test
	public void toCheckIsOperating() {
		Surgeon surgeon = new Surgeon("", "", "");
		boolean check = surgeon.getIsOperating();
		assertThat(check, is(true));
	}
}

package hospital;

public class Patient implements Bleedable {

	static final int DEFAULT_BLOOD_AMOUNT = 42;

	int blood = DEFAULT_BLOOD_AMOUNT;

	public Patient() {

	}

	@Override
	public void removeBlood(int amount) {
		blood -= amount;
	}

	@Override
	public int getBlood() {
		return blood;
	}

}

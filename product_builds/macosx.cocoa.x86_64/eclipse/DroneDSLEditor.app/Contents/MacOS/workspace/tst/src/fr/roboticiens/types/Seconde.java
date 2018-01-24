package fr.roboticiens.types;

public class Seconde {
	
	private final int value;

	public Seconde(final int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Seconde [value=" + value + "]";
	}
	
}

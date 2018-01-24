package fr.roboticiens.types;

public class Pourcent {
	
	private final int value;

	public Pourcent(final int value) {
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
		return "Pourcent [value=" + value + "]";
	}

}

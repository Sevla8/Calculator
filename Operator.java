public enum Operator {
	ADDITION,
	SUBSTRACTION,
	MULTIPLICATION,
	DIVISION;

	public String toString() {
		switch (this) {
			case Operator.ADDITION :
				return "ADDITION";
			case Operator.SUBSTRACTION :
				return "SUBSTRACTION";
			case Operator.MULTIPLICATION :
				return "MULTIPLICATION";
			case Operator.DIVISION :
				return "DIVISION";
		}
	}
}

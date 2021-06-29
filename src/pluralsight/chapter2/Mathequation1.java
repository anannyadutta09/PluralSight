package pluralsight.chapter2;

public class Mathequation1 {
	private double leftVal;
	private double rightVal;
	private char opCode;
	private double result;
	
	public double getResult() {
		return result;
	}

//	public Mathequation() {}
	
	public Mathequation1(char opCode) {
		this.opCode = opCode;
	}
	public Mathequation1(char opCode, double leftVal, double rightVal) {
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	void execute() {
		switch(opCode) {
		case 'a':
			result = leftVal + rightVal;
			break;
		case 's':
			result = leftVal - rightVal;
			break;
		case 'm':
			result = leftVal * rightVal;
			break;
		case 'd':
			result = rightVal != 0 ? leftVal / rightVal: 0.0d;
			break;
		default:
			System.out.println("Invalid opCode: " + opCode);
			result = 0.0d;
			break;
		}
		
		
	}
	
	
}


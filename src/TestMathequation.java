
public class TestMathequation {

	public static void main(String[] args) {
		Mathequation[] equations = new Mathequation[4];
//		equations[0]= new Mathequation();
//		equations[0].leftVal = 100.0d;
//		equations[0].rightVal = 50.0d;
//		equations[0].opCode = 'd' ;
		equations[0]= create (100.0d, 50.0d, 'd');
		equations[1]= create (25.0d, 92.0d, 'a');
		equations[2]= create (225.0d, 17.0d, 's');
		equations[3]= create (11.0d, 3.0d, 'm');
		
		for (Mathequation equation: equations) {
			equation.execute();
			System.out.println("Result= " + equation.result);
		}
	}

	private static Mathequation create(double leftVal, double rightVal, char opCode) {
		Mathequation equation = new Mathequation();
		equation.leftVal = leftVal;
		equation.rightVal = rightVal;
		equation.opCode = opCode ;
		return equation;
	}

}
		

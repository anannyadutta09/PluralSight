package pluralsight.chapter2;
public class TestMathequation2 {

	public static void main(String[] args) {
		Mathequation1[] equations = new Mathequation1[4];
//		equations[0]= new Mathequation();
//		equations[0].leftVal = 100.0d;
//		equations[0].rightVal = 50.0d;
//		equations[0].opCode = 'd' ;
		equations[0]= new Mathequation1 ('d', 100.0d, 50.0d );
		equations[1]= new Mathequation1 ('a', 25.0d, 92.0d ); 
		equations[2]= new Mathequation1 ('s', 225.0d, 17.0d); 
		equations[3]= new Mathequation1 ('m', 11.0d, 3.0d ); 
		
		for (Mathequation1 equation: equations) {
			equation.execute();
			System.out.println("Result= " + equation.getResult());
		}
	}

//	private static Mathequation create(double leftVal, double rightVal, char opCode) {
//		Mathequation equation = new Mathequation();
//		equation.leftVal = leftVal;
//		equation.rightVal = rightVal;
//		equation.opCode = opCode ;
//		return equation;
//	}

}
		

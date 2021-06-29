package pluralsight.chapter1;
public class TestFlight {

	public static void main(String[] args) {
		Flight flight1 = new Flight();
		Flight flight2 = new Flight();
		flight1.setSeats( 7);
		flight1.setPassengers(2);
		flight2.add1Passengers();
		System.out.println(flight2.getPassengers());
		flight2 = flight1;
		System.out.println(flight2.getPassengers());
		flight1.add1Passengers();
		flight1.add1Passengers();
		System.out.println(flight2.getPassengers());
		
		
	}

}

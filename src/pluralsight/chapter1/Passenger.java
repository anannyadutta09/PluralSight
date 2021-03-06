package pluralsight.chapter1;

public class Passenger {
	private int checkedBags;
	private int freeBags;
	private double perBagFee;
	
	public int getCheckedBags() {
		return checkedBags;
	}
	public void setCheckedBags(int checkedBags) {
		this.checkedBags = checkedBags;
	}
	public int getFreeBags() {
		return freeBags;
	}
	public void setFreeBags(int freebags) {
		this.freeBags = freebags;
	}
	public double getPerBagFee() {
		return perBagFee;
	}
	public void setPerBagFee(double perBagFee) {
		this.perBagFee = perBagFee;
	}
	public Passenger(int freeBags) {
		this(freeBags > 1? 25.0d : 50.0d );
		this.freeBags = freeBags;
	}
	public Passenger(int freeBags, int checkedBags) {
//		this.freeBags = freeBags;
		this(freeBags);
		this.checkedBags = checkedBags;
	}
	public Passenger(double perBagFree) {
		 this.perBagFee = perBagFee;
	}

}

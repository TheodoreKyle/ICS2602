public class PartialScholar extends Student {
	private float discountRate; 
	private float payableAmount; 

	public PartialScholar(String name, String course, float tuitionFee, float discountRate) {
		super(name, course, tuitionFee);
		this.discountRate = discountRate; 
		this.payableAmount = tuitionFee - (tuitionFee * discountRate); 
	}
	
	public float getDiscountRate() {
		return discountRate; 
	}
	
	public float getPayableAmount() {
		return payableAmount; 
	}
	
	public String toString() {
		return super.toString() + "\nDiscount rate of: " + (discountRate * 100) 
				+ "\nNet Payable Tuition Fee is: " + payableAmount; 
	}
}
class upi implements PayementType{

	public void paid(double amount){
		System.out.println("Method of Payement is UPI");
		System.out.println("paid: "+ amount);
		
	}
	public void refund(double amount) {
		System.out.println("Method of Payement is UPI");
		System.out.println("refund: "+ amount);
	}
}
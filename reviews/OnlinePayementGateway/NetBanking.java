class netBanking implements PayementType{

	public void paid(double amount){
		System.out.println("Method of Payement is Net Banking");
		System.out.println("paid: "+ amount);
		
	}
	public void refund(double amount) {
		System.out.println("Method of Payement is Net Banking");
		System.out.println("refund: "+ amount);
	}
}
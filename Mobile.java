package Week1.day1;

public class Mobile {
	
	String mobileMOdel="Samsung M21";
	int mobileWeight = 100;
	Boolean isFullyCharged = true;
	Double mobileCost =15000.1232;
	
	public void makeCall() {
		System.out.println("Please make the call");

	}
	public void sendMsg() {
		System.out.println("Please send message");

	}
	public static void main(String[] args) {
		Mobile mobFunction =new Mobile();
		mobFunction.makeCall();
		mobFunction.sendMsg();
		System.out.println(mobFunction.mobileMOdel);
		System.out.println(mobFunction.mobileWeight);
		System.out.println(mobFunction.isFullyCharged);
		System.out.println(mobFunction.mobileCost);
	}

}


public class _bankDetails {

	public static void main(String[] args) {
		_bankDetails account = new _bankDetails();
		account.display();
	}
	
	public void display() {
		String bankName = "State bank of india";
		int accountNumber = 123456789;
		String accountHolderName = "Nadeem Shaikh";
		int age = 23;
		System.out.println("bankName:-"+bankName);
		System.out.println("accountNumber:-"+accountNumber);
		System.out.println("accountHolderName:-"+accountHolderName);
		System.out.println("age:-"+age);
	}

}

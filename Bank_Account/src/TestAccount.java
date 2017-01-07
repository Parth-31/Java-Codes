
public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account(1234,100);
		Account a2 = new Account(1423);
		
		System.out.println(a1);
		System.out.println(a2);
		
		a2.setBalance(500);
		System.out.println(a2);
		
		System.out.println(a1.getBalance());
		
		a1.credit(5000);
		
		System.out.println(a1.getBalance());
		
		a1.debit(4000);
		
		System.out.println(a1.getBalance());
		
		a1.debit(2000);
		
		System.out.println(a1.getBalance());
		}

}

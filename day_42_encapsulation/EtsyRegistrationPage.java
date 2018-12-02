package day_42_encapsulation;

public class EtsyRegistrationPage {

	public static void main(String[] args) {
		EtsyAccount account1 = new EtsyAccount();
		account1.setEmail("account1@gmail.com");
		account1.setFirstName("Adam");
		account1.setPassword("joshi435");
		 System.out.println("Account1 email"+account1.getEmail());
		
		EtsyAccount account2 = new EtsyAccount();
		account2.setEmail("account2@gmail.com");
		account2.setFirstName("Joshua");
		account2.setPassword("adem123");
		
		EtsyAccount account3 = new EtsyAccount();
		account3.setEmail("account3@gmail.com");
		account3.setFirstName("_");
		account3.setPassword("123");
		//use getters to read data
		System.out.println("First name of account:" +account3.getFirstName());
		
		EtsyAccount myAccount = new EtsyAccount();
		myAccount.setAccountInfo("kutman@gmail.com", "kutmanai", " 123355");
		System.out.println(myAccount.getEmail()+ "|" +myAccount.getFirstName()+"|"+myAccount.getPassword());
		
		myAccount.setEmail(myAccount.getEmail().replace("gmail", "yahoo"));
		System.out.println(myAccount.getEmail()+ "|" +myAccount.getFirstName()+"|"+myAccount.getPassword());
		
		
		/*
		 * 
		 * create a method getAccointInfo () that return email, first name,password 
		 * System.out.println(myAccountInfo());
		 * 
		 */
		System.out.println(myAccount.getAccountInfo());
		
		
		 EtsyAccount yourAccount= new EtsyAccount();
		 yourAccount.setAccountInfo("yourEmail23@gmail.com", "Apple", "macBook34");
		 String accountInfo=yourAccount.getAccountInfo();
		 System.out.println(accountInfo);
		 
		 
	}

}

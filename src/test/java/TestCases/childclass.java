package TestCases;

public class childclass extends ParenntClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		base("http://beta.docnu.com/");
		Thread.sleep(2000);
		login("9985444702", "Testing123");
		Thread.sleep(2000);
		search("9897878978");

	}

}

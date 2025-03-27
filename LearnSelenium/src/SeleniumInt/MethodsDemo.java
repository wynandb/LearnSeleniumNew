package SeleniumInt;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create object in main block**** After creation you can access the class methods

		MethodsDemo d = new MethodsDemo();  // Object created ********
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
	}
		
		//Method - Block of code to be re-used in many instances. Void is used as method will not give anything back. Just get
		
		public String getData() // Because of the return method , this method had to be changed to String.
		
		{
			System.out.println("hello world");
			return "Wynand Bouwer";
		}
		

}

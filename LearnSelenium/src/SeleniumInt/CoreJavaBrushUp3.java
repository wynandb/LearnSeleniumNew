package SeleniumInt;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String is an object 
		// s1 value will be linked to s . No new var will be created because value is the same . s5 will be created because value is unique
		//String s = "Wynand Bouwer";
		//String s1 = "Wynand Bouwer";
		String s5 = "Hi";
		
		// String var with "new" keyword . Here new var will be created even if the var value is the same
		
		String s3  = new String ("Wynand Bouwer");
		String s4 = new String ("Wynand Bouwer");
		
		
		//Spilt method : Wynand Bouwer Automation is split of white space & stored in the splitterstring array
		// Split on white space and after that split on "Bouwer" to see what happens
		String s = "Wynand Bouwer Automation";
		String[] splitterstring = s.split("Bouwer");
		System.out.println(splitterstring[0]);
		System.out.println(splitterstring[1]);
		//System.out.println(splitterstring[2]);
		System.out.println(splitterstring[1].trim());
		
		// Print char by char value in array "s"
		//Also to print forward and backward for loops
		
		for (int i = 0; i< s.length(); i++) // Forward ***********
		//for (int i = s.length() -1; i> 0; i--) // Backward********
		{
			System.out.println(s.charAt(i));
		}
		
		
		
		
		
		
		
		
		
	}

}

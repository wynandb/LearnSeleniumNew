import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,122};
		
		System.out.println(arr2[0]);
		
			for (int i = 0; i< arr2.length; i++)
		
			// Print value from array that have multiple of 2 e.g values that can device by 2 equally
			// If statement will check for this . Print statement will print these values , and also state what values does not device by 2 equally
			// If the For loop should stop when it find the first value in array that can divide by 2 equally, insert a break function
		{
			if (arr2[i] % 2 == 0)
			{
				
				System.out.println(arr2[i]);
				//break;
			}
		
			else
			{
			System.out.println(arr2[i]  +  "is not multiple of 2");
			
			}
		
			
			//Create ArrayList with String values and Get array value from the ArrayList , Add, Remove from array
		}
		ArrayList<String> a = new ArrayList<String>();
		a.add("Wynand");
		a.add("Bouwer");
		a.add("Selenium");
		a.add("Automation Tester");
		System.out.println(a.get(3));
			
		for (int i = 0; i< a.size() ; i ++)
			{
				System.out.println(a.get(i));
			}
		// Enhance for loop to print arraylist values
		for ( String val : a)
			{
				System.out.println(val);
		
			}
		// Is item present in arraylist
		System.out.println(a.contains("Selenium"));
	}
	}


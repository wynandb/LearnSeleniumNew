
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Data Types in Java//
		
		int myNum = 5;
		String website = "Evetech";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum +" is the number stored in the myNum variable");
		System.out.println(website);
		
		//Arrays
		// Bewlow is variable to store 5 values
		int[] arr = new int [5];
		
		// 2 ways of storing value in the zero index of the array & declare & initialize the array with values
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5};
		
		System.out.println(arr2[2]);
		
		// For Loop to loop through  the array to get the values - Note the parenthesis , note the curl brackets , note the semicolon , note the dot length METHOD
		//note the 1++ TO ITTERATE and increment the values , note the int 1 (integer variable i) , note the (arr[i]) in the print statement) 
		
		for (int i = 0; i< arr.length; i++)
		{
			
		System.out.println(arr[i]);
		
		}
		
		String[] name = {"Wynand","Lorraine"};
		
		for (int i = 0; i< name.length; i++)
		
		{
		
			System.out.println(name[i]);
		}
		
		// Streamline way to save array in variable and print
		// Variuable = string and variable name = s , so print s
		
		for(String s:name)
		{
			System.out.println(s);
		}
	}

}

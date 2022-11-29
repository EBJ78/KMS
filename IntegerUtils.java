
public class IntegerUtils {
	
	public int highestCommonFactor(int [] numbers) {
		int gcd = 0;//var to hold gcd
		for(int i = 1;i <= numbers[0] && i <= numbers[1]; i++) // loop 1 till smallest of both numbers
		{ 
			System.out.println("i = "+i);
			System.out.println("numbers[0] = "+numbers[0]);
			System.out.println("numbers[1] = "+numbers[1]);
			if(numbers[0]%i == 0 && numbers[1]%i == 0) { 			// return true when both return no remainder 
																	//when divided by the lowest of the two 
				System.out.println("numbers[0]%i = "+numbers[0]%i);
				System.out.println("numbers[1]%i = "+numbers[1]%i);
				gcd = i;
			}
		}
		return gcd;
	 }	

}

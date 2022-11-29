
public class CodingAssignment1 {
	
	
	public static void main(String[] args) {
		
		int [] numbers = {4 , 2};
		int theGCD = 0;
		IntegerUtils iu = new IntegerUtils();
		theGCD = iu.highestCommonFactor(numbers);
		System.out.println("The GCD of "+numbers[0]+" and "+numbers[1]+" is "+theGCD);
	}
}

package NarcisisticNumberPackage;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        
    	int sum = 0;
    	
    	int[] digits = splitNumber(number);
    	
    	int nDigits = digits.length;
    	
    	for (int digit : digits) {
    		sum += Math.pow(digit,nDigits);
    	}
    	
    	return sum == number;

    }
    
    public static int[] splitNumber(int number) {
    	
    	// Divide number into digits
    	String numberStr = String.valueOf(number);
    	
    	// Initialise digit vector
    	int[] digits = new int[numberStr.length()];
    	
    	// Extract numbers
    	for (int i = 0; i < numberStr.length(); i++) {
    		digits[i] = Character.getNumericValue(numberStr.charAt(i));
		}
    	
    	return digits;
    }
    
    
    public static void main(String[] args) {
    	isNarcissistic(123);
    }

}

package baseball;

public class User {
	
	public int[] user_Guess_Num(int guess) {
		input_Error(guess);
		int[] guess_arr = new int[3];		
		
    	for (int i = 2; i >=0; i--) {
			guess_arr[i]=guess%10;
			guess/=10;
		}		
		return guess_arr;
	}
	
	public void input_Error(int num) {
		if (num < 111 || num > 999) {
			throw new IllegalArgumentException();
		}else if(Integer.toString(num).contains("0")) {
			throw new IllegalArgumentException();
		}		
	}	
}

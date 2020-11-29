package baseball;

import java.util.Iterator;

public class User {
	
	public int[] get_User_Guess(int guess) {
		int[] guess_arr = make_3Num_Array(guess);
		
		if (guess < 111 || guess > 999) {
			throw new IllegalArgumentException();
		}
		else if(Integer.toString(guess).contains("0")) {
			throw new IllegalArgumentException();
		}
		else if (overlap_check(guess_arr)) {
			throw new IllegalArgumentException();
		}
		else{
			return guess_arr;
		}
	}
	
	private int[] make_3Num_Array(int guess) {		
		int[] guess_arr = new int[3];		
		
    	for (int i = 2; i >=0; i--) {
			guess_arr[i]=guess%10;
			guess/=10;
		}		
		return guess_arr;
	}
	
	private boolean overlap_check(int[] guess_arr) {		
		for (int i = 0; i < 3; i++) {					
			if (guess_arr[0]==guess_arr[i] && i!=0) {
				return true;
			}
			else if (guess_arr[1]==guess_arr[i] && i!=1) {
				return true;
			}
			else if (guess_arr[2]==guess_arr[i] && i!=2) {
				return true;
			}
		}
		return false;		
	}	
	
}

package baseball;

import utils.RandomUtils;

public class Computer {
	int[] random_3Num = new int[3];
			
	public int[] make_Random_3Num() {		
    	int[] has_random_3Num = {1,1,1,1,1,1,1,1,1,1,1};
    	
    	for (int i = 0; i < 3; i++) {
			int random = RandomUtils.nextInt(1, 9);
			if (has_random_3Num[random]==0) { 
				i--;
			}else {
				random_3Num[i]=random;
				has_random_3Num[random] = 0;
			}
		}
    	return random_3Num;
	}
}

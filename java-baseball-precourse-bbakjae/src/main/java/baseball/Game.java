package baseball;

import java.util.Scanner;

import baseball.*;

public class Game {
	public Game(Scanner scanner) {
		
	}
	
	public int[] check_SnB(int[] rand_num,int[] guess) {
		int[] Strike_n_Ball = {0,0};
		
		Strike_n_Ball[0]=check_Ball(rand_num, guess);
		Strike_n_Ball[1]=check_Strike(rand_num, guess);
				
		return Strike_n_Ball;
	}
	
	private int check_Strike(int[] rand_num, int[] guess) {
		int strike = 0;
		
		for (int i = 0; i < 3; i++) {
			if (rand_num[i]==guess[i]) {
				strike++;
			}
		}		
		return strike;
	}
	
	private int check_Ball(int[] rand_num, int[] guess) {
		int ball=0;
		
		for (int i = 0; i < 3; i++) {
			if (i!=0 && rand_num[0]==rand_num[i]) {
				ball++;
			}
			else if (i!=1 && rand_num[1]==rand_num[i]) {
				ball++;
			}
			else if (i!=2 && rand_num[2]==rand_num[i]) {
				ball++;
			}
		}		
		return ball;
	}
}


package baseball;

import java.util.Scanner;

import baseball.*;

public class Game {
	
	public boolean print_result(int[] SnB) {
		if (SnB[0]!=0 && SnB[1]!=0) {
			System.out.printf("%d볼  %d스트라이크\n",SnB[1],SnB[0]);
			return false;
		}
		else if (SnB[0]==3) {
			System.out.println(""+SnB[0]+"스트라이크");
			return true;			
		}
		else if (SnB[0]!=0 && SnB[1]==0) {
			System.out.println(""+SnB[0]+"스트라이크");
			return false;
		}
		else if (SnB[1]!=0 && SnB[0]==0) {
			System.out.println(""+SnB[1]+"볼");
			return false;
		}
		else if (SnB[0]==0&&SnB[1]==0) {
			System.out.println("낫싱");
			return false;
		}
		return false;
	}
	
	public int[] check_SnB(int[] rand_num,int[] guess) {
		int[] Strike_n_Ball = {0,0};
		
		Strike_n_Ball[0]=check_Strike(rand_num, guess);
		Strike_n_Ball[1]=check_Ball(rand_num, guess);
				
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
			if (i!=0 && rand_num[0]==guess[i]) {
				ball++;
			}
			else if (i!=1 && rand_num[1]==guess[i]) {
				ball++;
			}
			else if (i!=2 && rand_num[2]==guess[i]) {
				ball++;
			}
		}		
		return ball;
	}
}


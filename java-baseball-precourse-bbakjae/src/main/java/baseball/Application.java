package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        
        // TODO 구현 진행
        Computer com = new Computer();
        User user = new User();
        Game game = new Game();

        int[] rand_num = com.make_Random_3Num();
        
        while(true) {        	
        	System.out.print("숫자를 입력해주세요 : ");
        	int[] guess = user.get_User_Guess(scanner.nextInt());        	
        	int[] SnB = game.check_SnB(rand_num, guess);
        	if (game.print_result(SnB)) {
        		System.out.println("3개의 숫ㅈ자를 모두 맞히셨습니다! 게임 종료");
        		break;
        	}
        }
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        if (scanner.nextInt() == 1) {
        	main(args);
        }
    }
}
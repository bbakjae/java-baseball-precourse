package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        
        // TODO 구현 진행
        User user = new User();
        user.user_Guess_Num(scanner.nextInt());
    }
}
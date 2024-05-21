package JAVA_Files;

import JAVA_Files.auth.Login;
import JAVA_Files.auth.SignUp;
import JAVA_Files.auth.UserProfile;

import java.util.Scanner;

public class MainPage {
    public static int loggedInUserId = -1;
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("————————메뉴———————");
            System.out.println("1. 마이페이지");
            System.out.println("———————————————————");
            System.out.print("원하시는 메뉴 번호를 입력해주세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    UserProfile.showUserProfile();
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}

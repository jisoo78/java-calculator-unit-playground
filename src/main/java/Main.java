import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 사용자에게 숫자를 입력받아 사칙연산 돌려보기


        System.out.println("문자열을 입력해주세요");
        String expression = scanner.nextLine();

        String total5 = String.valueOf(Calculator.strAdd(expression));

        System.out.println("문자열의 합: " + total5);

    }
}

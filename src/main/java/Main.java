import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        해당 메소드 불러오기
//        System.out.println("두 수의 합: " + Calculator.add(5,4));
//        System.out.println("두 수의 차: " + Calculator.subtract(10,3));
//        System.out.println("두 수의 곱: " + Calculator.multiply(5,9));
//        System.out.println("두 수의 몫: " + Calculator.divide(100,7));
        //System.out.println("메소드 출력: " + Calculator.qwe(43));
//        Calculator.qwe(43);


        Scanner scanner = new Scanner(System.in);
        // 사용자에게 숫자를 입력받아 사칙연산 돌려보기

        System.out.println("첫 번째 숫자 입력");
        int num1 = scanner.nextInt();
        System.out.println("두 번쨰 숫자 입력");
        int num2 = scanner.nextInt();

        int total1 = Calculator.add(num1, num2);
        int total2 = Calculator.subtract(num1, num2);
        int total3 = Calculator.multiply(num1, num2);
        int total4 = Calculator.divide(num1, num2);

        System.out.println("두 수의 합: " + total1);
        System.out.println("두 수의 차: " + total2);
        System.out.println("두 수의 곱: " + total3);
        System.out.println("두 수의 몫: " + total4);

    }
}

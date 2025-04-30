public class Calculator {

    /**
     * 일단 1,2 -> 3 ,:은 합으로 나온다
     */


    // 입력값이 2,3,4  => 9가 나와야한다
    // 반복문을 돌려서 입력값에서 ,: 가 있다면 +로 대체 기본값은 +
    // 차라리 switch case 를 통해 사칙연산?
    public static int strAdd(String expression) {
        String[] tokens = expression.split("[,|:]");

        // 일단 각 ", :"을 정규표현식을 활용해 구분
        // 숫자의 합을 구현
        int total = 0;

        for (String token : tokens) {
            total += addPlus(token);
            // expression2 로 값 전달??
        }
        // 향상된 for 문 사용

        return total;
    }

    private static int addPlus(String expression2) {
        int num = 0;
        int total = 0;
        char sign = '+';
        // 초기값 +로 설정


        for (int i = 0; i <= expression2.length(); i++) {
            char ch;
            // 반복문 내 사용하는 변수 선언
            // 기호를 저장하여 isDigit 함수로 참 거짓 판별
            if (i < expression2.length()) {
                ch = expression2.charAt(i);
            } else {
                ch = '+';
            }

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                // 여러 자리 숫자 처리를 위한 공식
            } else {
                switch (sign) {
                    case '+':
                        total += num;
                        break;
                    case '-':
                        total -= num;
                        break;
                    case '*':
                        total *= num;
                        break;
                    case '/':
                        total /= num;
                        break;
                }
                num = 0;
                sign = ch;
            }

        }
        return total;
    }
}







package string;


import java.util.Scanner;

//대소문자 변환
//설명
//
//        대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
//
//
//        입력
//        첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
//
//        문자열은 영어 알파벳으로만 구성되어 있습니다.
//
//
//        출력
//        첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
public class String2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String s = scanner.nextLine();
        char c;
         StringBuilder answer = new StringBuilder();
        if (s.length() < 100) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLowerCase(s.charAt(i))) {
                    c = Character.toUpperCase(s.charAt(i));
                    answer.append(c);
                } else {
                    c = Character.toLowerCase(s.charAt(i));
                    answer.append(c);
                }
            }
        }
        System.out.println(answer);
    }
}

package test_202205;

//이상한 문자 만들기
/**
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 **/
//2022-05-29 22:19 start 2022-05-29 23:28 end
//로직작성은 해냈는데. 단어 1개이면서 끝에 공백이있는 경우  테스트 실패하는 경우가 발생해서 오래 걸림. ex) "fdfd  "

/**
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 **/
public class test_20220529_1 {
    public String solution(String s) {
        String[] dividedString = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dividedString.length; i++) {
            for (int j = 0; j < dividedString[i].length(); j++) {
                sb.append(makeCapitalLetter(dividedString, i, j));
            }
            if (i != dividedString.length - 1) {
                sb.append(" ");
            }

        }
        for(;;) {
            if (sb.length() != s.length()) {
                sb.append(" ");
                continue;
            }
            break;
        }
        String answer = sb.toString();
        return answer;
    }

    private StringBuilder makeCapitalLetter(String[] dividedString, int i, int j) {
        StringBuilder sb = new StringBuilder();
        /**
         * 짝수는 무조건 대문자로.
         * **/
        if (j == 0 || j % 2 == 0) {
            char temp = dividedString[i].charAt(j);
            if (temp < 97 && temp >= 65) { //대문자라는 뜻.
                sb.append(temp);
            } else {
                char temp2 = (char) (dividedString[i].charAt(j) - 32);
                sb.append(temp2);
            }
        }
        /**
         * 홀수 무조건 소문자로 .
         * **/
        else {
            char temp = dividedString[i].charAt(j);
            if (temp < 97 && temp >= 65) { //대문자라는 뜻.
                char temp2 = (char) (dividedString[i].charAt(j) + 32);
                sb.append(temp2);
            } else {
                sb.append(temp);
            }


        }
        return sb;
    }

//권장답안 (성능에서나 가독성에서나 훨 좋음 )
    public String recommendedSolution(String s){
        char[] chars = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                idx = 0;
            else
                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
        }

        return String.valueOf(chars);
    }
}
	  

	


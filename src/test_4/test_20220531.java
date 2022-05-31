package test_4;

//시저 암호
//2022-05-31 14:44 start 2022-05-31 15:30 end
/**
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
 * "z"는 1만큼 밀면 "a"가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 **/

/**
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25이하인 자연수입니다.
 **/
public class test_20220531 {
    public String solution(String s, int n) {
        char[] temp = new char[s.length()];
        int flag = 0; //0소문자, 1대문자, 2공백
        for (int i = 0; i < s.length(); i++) {
            char goalChar = s.charAt(i);
            flag = getFlag(goalChar);
            char convertedChar = (char) (s.charAt(i) + n);

            if (flag == 0 && convertedChar > 122) {
                temp[i] = (char) (convertedChar - 26);
            } else if (flag == 1 && convertedChar > 90) {
                temp[i] = (char) (convertedChar - 26);
            } else if (goalChar == 32) {
                temp[i] = (char) goalChar;
            } else {
                temp[i] = (char) convertedChar;
            }
        }
        String result = new String(temp);
        return result;
    }

    private static int getFlag(char goalChar) {
        int flag = 0; //0소문자, 1대문자, 2공백
        if (97 <= goalChar && goalChar <= 122) {
            flag = 0;
        } else if (65 <= goalChar && goalChar <= 90) {
            flag = 1;
        } else if (32 == goalChar) {
            flag = 2;
        }
        return flag;
    }

}




	


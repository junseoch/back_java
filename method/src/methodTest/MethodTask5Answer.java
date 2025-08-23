package methodTest;

public class MethodTask5Answer {
    // 1. 1~n까지의 합을 구해서 결과를 반환해주는 메서드
    int getTotalToCount(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += i + 1;
        }
        return total;
    }

    // 2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
//    String getOddOrEvenOrString(String value) {
//        String result = "";
//        boolean isNumber = false;
//        for (int i = 0; i < value.length(); i++) {
//            char c = value.charAt(i);
//            if (c >= '0' && c <= '9') {
//                // 정수
//                isNumber = true;
//            } else {
//                // 문자열
//                isNumber = false;
//                break;
//            }
//        }
//
//        if (isNumber) {
//            result = Integer.parseInt(value) % 2 == 1 ? "홀수" : "짝수";
//        } else {
//            result = "문자열";
//        }
//
//        return result;
//    }
    
//    2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
    String getOddOrEvenOrString(String value) {
        // 문자열이 숫자인지 판별하는 flag
        boolean isNumber = true;

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);

            // 숫자가 아닌 문자가 하나라도 나오면 문자열 처리
            if (c < '0' || c > '9') {
                isNumber = false;
                break;
            }
        }
        // 숫자라면 → 홀짝 판별
        if (isNumber) {
            int num = Integer.parseInt(value);
            return num % 2 == 0 ? "짝수" : "홀수";
        } 
        // 숫자가 아니면 → 문자열
        else {
            return "문자열";
        }
    }

    // 3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
    // .toUpperCase();
    // 알파벳을 대문자로 바꿔주는 문자열 메서드
    String getUpperCase(String value) {
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c >= 97 && c <= 122) {
                result += (char) (c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    // 4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
    // 입력 예시) abcdef
    // 출력 예시) fedcba
    String getReverseString(String value) {
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(value.length() - 1 - i);
            result += c;
           
        }
        return result;
    }

    // 5. 1~4번까지 메서드 사용
    public static void main(String[] args) {
        MethodTask5Answer mt = new MethodTask5Answer();
        System.out.println(mt.getOddOrEvenOrString("10"));
        mt.getUpperCase("abc");
        mt.getReverseString("abcdef");
    }
}

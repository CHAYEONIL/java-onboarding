package onboarding;

import java.util.*;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = new ArrayList<>();
        HashSet<String> nickname = new HashSet<>();
        HashMap<String, String> email_nick = new HashMap<>();

        // 닉네임 길이가 2보다 짧으면 break
        for (int i = 0; i < forms.size(); i++) {
            String name = forms.get(i).get(1);
            if (name.length() < 2) {
                break;
            }
            // 2단어씩 나누기
            for (int j = 0; j < name.length() - 1; j++) {
                String key = name.substring(j, j + 2);
                // 키를 가지고 있으면

                }
            }
        return answer;
    }
}
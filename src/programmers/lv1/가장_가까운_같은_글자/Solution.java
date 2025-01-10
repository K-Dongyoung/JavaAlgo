package programmers.lv1.가장_가까운_같은_글자;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
/*
첫 방법 성능이 더 좋은 이유
1. 자료구조의 차이
첫 번째 방법 (int[] ch)

고정된 크기의 배열(int[26])을 사용하며, 문자에 대응하는 배열의 인덱스를 직접 접근합니다.
배열은 인덱스를 통해 O(1)로 접근, 읽기, 쓰기가 가능합니다.
따라서 각 문자에 대해 상수 시간의 연산만 필요합니다.
두 번째 방법 (HashMap<Character, Integer>)

HashMap은 내부적으로 해시 테이블을 사용합니다.
평균적으로 O(1) 시간 복잡도를 가지지만, 해시 충돌이 발생하면 O(n)까지 성능이 저하될 수 있습니다.
또한, 각 문자에 대해 해시 계산 및 메모리 할당 등이 추가적으로 수행됩니다.
2. 메모리 관리
첫 번째 방법

int[] ch 배열은 26개의 정수만 저장하므로 메모리 사용량이 매우 적습니다.
배열의 크기가 고정되어 있으므로 동적 메모리 할당이 발생하지 않습니다.
두 번째 방법

HashMap은 키와 값을 저장하기 위해 추가적인 메모리 할당이 필요합니다.
각 키(Character)는 객체로 저장되므로 박싱/언박싱 비용이 발생하며, 메모리 사용량이 더 많아집니다.
3. 알고리즘의 단순성
첫 번째 방법
배열을 통해 문자의 상대적 위치를 계산하며, 알고리즘이 단순하고 반복문 내에서 최소한의 연산만 수행합니다.
두 번째 방법
HashMap을 사용하면서 해시 계산, 값의 삽입 및 삭제 등 추가 작업이 포함됩니다.
4. 캐싱 효과
첫 번째 방법
배열은 메모리 상에 연속적으로 저장되므로 CPU 캐시에 효율적으로 로드되어 빠르게 접근할 수 있습니다.
두 번째 방법
HashMap은 메모리 상에 분산된 데이터를 처리하므로 캐시 적중률이 낮아질 수 있습니다.

*/
    public int[] solution(String s) {
        int[] ch = new int[26];
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            if (ch[s.charAt(i) - 'a'] == 0) {
                answer[i] = -1;
            } else {
                answer[i] = i - ch[s.charAt(i) - 'a'] + 1;
            }
            ch[s.charAt(i) - 'a'] = i + 1;
        }
        return answer;
    }

    public int[] solution2(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> ch = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            answer[i] = i - ch.getOrDefault(c, i + 1);
            ch.put(c, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution2("banana")));
        System.out.println(Arrays.toString(s.solution2("foobar")));
    }
}

package Target_Number;

public class Solution {
    static int cnt = 0;
    static int T;

    // 프로그래머스 >> Lv. 2 >> 타겟 넘버
    // DFS 풀이
    public int solution(int[] numbers, int target) {
        T = target;
        DFS(numbers, 0, 0);

        return cnt;
    }

    public void DFS(int[] numbers, int idx, int sum) {
        if ( idx < numbers.length ) {
            DFS(numbers, idx + 1, sum + numbers[idx]);
            DFS(numbers, idx + 1, sum - numbers[idx]);
        }
        else {
            if ( T == sum ) cnt++;
            return;
        }

    }
}

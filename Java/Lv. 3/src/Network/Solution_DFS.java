package Network;

public class Solution_DFS {
    static boolean[] visit;
    static int[][] network;
    static int N;

    // 프로그래머스 >> Lv. 3 >> 네트워크
    // DFS 풀이
    public int solution(int n, int[][] computers) {

        visit = new boolean[n];
        network = computers;
        N = n;

        int cnt = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            if ( !visit[i] ) {
                DFS(i);
                cnt++;
            }
        }

        return cnt;
    }

    public void DFS(int idx) {
        visit[idx] = true;

        for ( int c = 0 ; c < N ; c++ ) {
            if ( idx != c && network[idx][c] == 1 && !visit[c] ) {
                DFS(c);
            }
        }

    }
}

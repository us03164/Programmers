package Network;

import java.util.*;

public class Solution_BFS {

    // 프로그래머스 >> Lv. 3 >> 네트워크
    // BFS 풀이
    public int solution (int n, int[][] computers) {
        boolean[] visit = new boolean[n];
        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();

        // BFS
        for ( int i = 0 ; i < n ; i++ ) {
            if ( !visit[i] ) {
                visit[i] = true;
                q.add(i);
                cnt++;

                while ( q.size() > 0 ) {
                    int now = q.poll();
                    for ( int j = 0 ; j < n ; j++ ) {
                        if ( now != j && computers[now][j] == 1 && !visit[j] ) {
                            visit[j] = true;
                            q.add(j);
                        }
                    }
                }
            }
        }

        return cnt;
    }
}

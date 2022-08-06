package laboratory14;

public class Q2 {
		static int tsp(int[][] graph, boolean[] v,	int currPos, int n,		int count, int cost, int ans) {
		if (count == n && graph[currPos][0] > 0){
			ans = Math.min(ans, cost + graph[currPos][0]);
			return ans;
			}
			for (int i = 0; i < n; i++) {
			if (v[i] == false && graph[currPos][i] > 0) {
			v[i] = true;
			ans = tsp(graph, v, i, n, count + 1,
			cost + graph[currPos][i], ans);
			v[i] = false;
			}
		}
			return ans;
			}
			public static void main(String[] args) {
			int n = 4;
			int[][] graph = {
			{0, 2, 5, 7, 1},
			{6, 0, 3, 8, 2},
			{8, 7, 0, 4, 7},
			{12, 4, 6, 0, 5},
			{1, 3, 2, 8, 0}};
			boolean[] v = new boolean[n];

			v[0] = true;
			int ans = Integer.MAX_VALUE;
	
			ans = tsp(graph, v, 0, n, 1, 0, ans);
			System.out.println("Minimum weight of Hamiltonian cycle is: " + ans);
			}
			}

package laboratory14;

public class Q3 {
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
			{0, 12, 10, 0, 0, 0, 12},
			{12, 0, 8, 12, 0, 0, 0},
			{10, 8, 0, 11, 3, 0, 9},
			{0, 12, 11, 0, 11, 10, 0},
			{0, 0, 3, 11, 0, 6, 7},
			{0, 0, 0, 10, 6, 0, 9},
			{12, 0, 9, 0, 7, 9, 0}};

			boolean[] v = new boolean[n];

			v[0] = true;
			int ans = Integer.MAX_VALUE;
	
			ans = tsp(graph, v, 0, n, 1, 0, ans);
			System.out.println("Minimum weight of Hamiltonian cycle is: " + ans);
			}
			}
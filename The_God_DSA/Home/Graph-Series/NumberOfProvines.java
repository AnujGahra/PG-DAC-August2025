public class NumberOfProvines {

    public static int findCircleNum(int[][] isConnected) {
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[i][i] == 1) {
                count++;
                dfs(isConnected, i);
            }
        }
        return count;
    }

    private static void dfs(int[][] isConnected, int i) {
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1) {
                isConnected[i][j] = 0;
                isConnected[j][i] = 0;
                dfs(isConnected, j);
            }
        }
    }
    


    public static void main(String[] args) {
        
    }
}

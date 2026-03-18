public class AdditionMatrices {


    
    

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{7, 8}, {9, 10}};

        int n = a.length;
        int m = b.length; 

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                a[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                System.out.print(a[i][j] + " ");
            }
        }

    }
}

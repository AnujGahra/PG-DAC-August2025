public class ContainerWithMostWater {

    public int maxArea(int[] heights) {
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                res = Math.max(res, Math.min(heights[i], heights[j]) * (j - i));
            }
        }
        return res;
    }

    // main method for testing
    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = solution.maxArea(heights);
        System.out.println("The maximum area is: " + result); // Expected output: 49
    }
}

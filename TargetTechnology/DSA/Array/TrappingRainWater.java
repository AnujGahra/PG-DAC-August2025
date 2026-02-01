public class TrappingRainWater {
    
    public int trap(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }

        int n = height.length;
        int res = 0;
        for(int i = 0; i< n; i++) {
            int leftMax = height[i];
            int rightMax = height[i];

            for(int j = 0; j<i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            for(int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            res += Math.min(leftMax, rightMax) - height[i];
        }
        return res;
    }


    // main method for testing
    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = solution.trap(height);
        System.out.println("Trapped Rain Water: " + result); // Expected output: 6
    }
     
}

public class leet11 {
    public int maxArea(int[] height) {
        int max = 0, i = 0, j = height.length - 1;
        while (i <= j) {
            int width = j - i;
            int area = width * (Math.min(height[i], height[j]));
            if (max < area)
                max = area;
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return max;
    }
}

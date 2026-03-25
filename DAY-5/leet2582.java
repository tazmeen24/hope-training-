//2582. Pass the Pillow

public class leet2582 {
    public int passThePillow(int n, int time) {
        int completed = time / (n-1);
        int remaining = time % (n-1);
        int ans = 0;
        if (completed % 2 != 0) {
            ans = n - remaining;
        } else {
            ans = remaining + 1;
        }
        return ans;
    }
}

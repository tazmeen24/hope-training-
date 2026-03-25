// 441. Arranging Coins

public class leet441 {
    public int arrangeCoins(int n) {
        return (int)(Math.sqrt(2L * n + 0.25) - 0.5);
    }
}

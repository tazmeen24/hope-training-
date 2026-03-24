//1822. Sign of the Product of an Array
public class leet1822 {
    public int arraySign(int[] nums) {
        int negativeCount=0;
        for(int n:nums){
            if (n==0) return 0;
            if (n<0) negativeCount++;
        }
        return (negativeCount%2)==0? 1:-1;
    }
}

import java.util.*;
public class closestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i:arr) set.add(i);

        Integer floor = set.lower(target);
        Integer ceil = set.higher(target);
        int closest;
        if(floor==null) closest = ceil;
        else if(ceil==null) closest = floor;
        else closest = (target - floor) <= (ceil - target)? floor : ceil;
        System.out.println("Closest element to " + target + ": " + closest);
        sc.close();
    }
}

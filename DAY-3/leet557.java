//557. Reverse Words in a String III

public class leet557 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            char[] str = arr[i].toCharArray();
            int left=0, right=str.length-1;
            while(left<right){
                char temp=str[left];
                str[left]=str[right];
                str[right]=temp;
                left++;
                right--;
            }
            arr[i] = new String(str);
        }
        return String.join(" ", arr);
    }
}

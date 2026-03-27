// 3163. Compress String III
public class leet3163 {
   public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<word.length()){
            char ch = word.charAt(i);
            int count=0;
            while(i<word.length() && ch==word.charAt(i) && count<9){
                count++; i++;
            }
            sb.append(count);
            sb.append(ch);
        }
        return sb.toString();
    }
}

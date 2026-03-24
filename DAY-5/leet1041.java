// 1041 Robot Bounded In Circle

public class leet1041 {
    public boolean isRobotBounded(String instructions) {
        int x=0,y=0;
        int dir=0;
        for(char ch:instructions.toCharArray()){
            if(ch=='L') dir=(dir+3)%4;
            else if(ch=='R') dir=(dir+1)%4;
            else{
                if(dir==0) y++;
                else if(dir==1) x++;
                else if(dir==2) y--;
                else x--;
            }
        }
        return (x == 0 && y == 0) || dir != 0;
    }
}

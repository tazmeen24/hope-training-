class Locker{

    private int locker_id;
    private int pin;
    private String storedItem;
    private boolean isLocked;
    Locker(int lockerId,int pin){
        this.locker_id=lockerId;
        this.pin=pin;
    }

    public void storeItem(String i,int p){
        if(p==pin){
            if(!isLocked){
                storedItem=i;
                System.out.println("Stored Successfully");
            }   else    {
                System.out.println("Locker locked");
            }
        }   else    {
            System.out.println("Incorrect Pin");
        }
    }

    public void retrieveItem(int p){
        if(p==pin){
            if(!isLocked&&storedItem!=null){
                System.out.println("Retrieved Successfully");
            }   else if(storedItem==null){
                System.out.println("Locker is Empty");
            }   
            else    {
                System.out.println("Locker locked");
            }
        }   else    {
            System.out.println("Incorrect Pin");
        }
    }

    public void lock(){
        isLocked=true;
    }

    public void unlock(int p){
        if(p==pin){
            isLocked=false;
            System.out.println("Locker is unlocked");
        }
    }
}

public class LockerSystem {
    public static void main(String[] args) {
        Locker obj=new Locker(1250, 4523);
        obj.unlock(4523);
        obj.storeItem("Bag", 4523);
        obj.retrieveItem(4523);
        obj.lock();
    }

}
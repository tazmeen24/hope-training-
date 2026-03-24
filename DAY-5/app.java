class User{
    String name;
    String phone;
    String address;
    User(){
        System.out.println("User Registered");
    }
}

class Fooduser extends User{
    String foodPreference;
    Fooduser(){
        System.out.println("Food User Registered");
    }
}

class Traveluser extends User{
    String preferredVehicle;
}

class Driver extends User{
    String role="Driver";
    String vehicle;
    
}

public class app {
    
}

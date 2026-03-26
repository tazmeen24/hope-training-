class Character {
    String name;
    Character(String name){
        this.name = name;
    }

    void attack(){
        System.out.println(name + " is attacking!");
    }
}

class Warrior extends Character {
    Warrior(){
        super("Warrior");
    }

    @Override
    void attack(){
        System.out.println(name + " swings a sword");
    }
}

class Archer extends Character {
    Archer(){
        super("Archer");
    }

    @Override
    void attack(){
        System.out.println(name + " shoots an arrow");
    }
}

class Mage extends Character {
    Mage(){
        super("Mage");
    }

    @Override
    void attack(){
        System.out.println(name + " uses a magic spell");
    }
}


public class Game {
    public static void main(String[] args){
        Character c;
        c = new Warrior();
        c.attack();
        c = new Archer();
        c.attack();
        c = new Mage();
        c.attack();
    }
}

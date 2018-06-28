package fish;

public class Fish {
        private String name = "Fish";
        public String food = "Smaller, inferior fish";
        public String animalNoise = "Blub";
    public static void main(String[] args) {
        AnimalFish fish1 = new FemaleFish();
        fish1.name = "Fishy";
        
        System.out.println(fish1.name);
        fish1.talk();
        
        AnimalFish fish2 = new MaleFish();
        fish2.name = "MANLY Fishy";
        System.out.println(fish2.name);
        fish2.talk();
        
        AnimalFish fish3 = new TrannyFish();
        fish3.name = "Henry";
        System.out.println(fish3.name);
        fish3.talk2();
        
        
    }
    
}
class AnimalFish{
    public String name = "Animal";
    public String food = "Food";
    public String animalNoise = "Blub";
    public String trannyNoise = "i'm ladyboi";
    
    public void talk(){
        System.out.println(animalNoise);
    }
    
    public void talk2(){
        System.out.println(trannyNoise);
    }
}

class FemaleFish extends AnimalFish{
    
}

class MaleFish extends FemaleFish{
    public String name = "MANLY Fishy";
}

class TrannyFish extends MaleFish{
    public String name = "Henry";
}
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
    }
    
}
class AnimalFish{
    public String name = "Animal";
    public String food = "Food";
    public String animalNoise = "Blub";
    
    public void talk(){
        System.out.println(animalNoise);
    }
}

class FemaleFish extends AnimalFish{
    
}

class MaleFish extends FemaleFish{
    public String name = "MANLY Fishy";
}
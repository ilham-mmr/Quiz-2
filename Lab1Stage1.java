public class Lab1Stage1{
  public static void main(String[] args) {
        Animal[] allAnimals;
        int i;

        allAnimals = new Animal[3];

        allAnimals[0] = new Cat("Kurre");
        allAnimals[1] = new Dog("Vilma");
        allAnimals[2] = new Cat("Bamse");

        i = 0;
        while (i < allAnimals.length){
            allAnimals[i].introduceYourself();
            i = i + 1;
        }
    }
}

class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void introduceYourself(){
        System.out.println("Morr. I am an animal.");
    }
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void introduceYourself() {
        System.out.println("Meow. I am a cat. My name is "+super.getName());
    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void introduceYourself() {
        System.out.println("Woof. I am a dog. My name is "+super.getName());
    }
}

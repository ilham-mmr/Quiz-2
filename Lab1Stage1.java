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
    public void introduceYourself(){
        System.out.println("Morr. I am an animal.");
    }
}

class Cat extends Animal{
    private String name;
    public Cat(String name){
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Meow. I am a cat. My name is "+name);
    }
}

class Dog extends Animal{
    private String name;
    public Dog(String name){
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Woof. I am a dog. My name is "+name);
    }
}

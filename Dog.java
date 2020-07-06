public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void introduceYourself() {
        System.out.println("Woof. I am a dog. My name is "+super.getName());
    }
}

# Quiz-2

- what will be the output when running the above code?

    Meow. I am a cat. My name is Kurre
    
    Woof. I am a dog. My name is Vilma
    
    Meow. I am a cat. My name is Bamse

- What is meant by polymorphism ?

    Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
    
- How does polymorphism work in the above program?

    Polymorphism uses the same method to perform different tasks in this case introduceYourself. Apart from that, storing the subclasses to the super class reference like cat object is stored in Animal reference.
    
- The method introduceYourself of Animal appears to be never called? Why not?

    Because the method is overridden, hence the subclasses' introduceYourself gets called instead.
    
-  Comment out the method introduceYourself in Dog. What happens now when you run the program?

    the output is Morr. I am an animal. The reason it happens because dog extends animal and in the animal class has introduceYourself method.
    
-  Where is the name stored for the instances of Cat and Dog? (In what / which classes did you put the instance variable that refers to the name of the animal? Both Cat and Dog, or just in Animal?)

    It is stored in Animal only.
    
- How does the code in the test program work?

    The test program works by creating an array of Animal that has size of 3. 
    
    at element 0, an object of cat is stored
    at element 1, an object of dog is stored
    at element 2, an object of act is stored
    
    it is possible because the cat and dog inherit from animal. so in this case Animal act as a reference.
    
    for the while loop, it iterates over the array and calls the introduceYourself for each object stored in array.
    
 - How does an array work?
 
    an array acts as a container object that holds a fixed number of values of a single type
    
 - In the above programs we have used a while loop to step through the array and to get information about the animals. But there is a more appropriate loop statement here. What is it?
 
   for loop
   
   for(int i = 0 ; i < allAnimals.length ; i++){
            allAnimals[i].introduceYourself();
        }
   
   

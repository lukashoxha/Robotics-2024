public class Person {
   
    int age = 16;

   
    public void printAge() {
        System.out.println("Age: " + age);
    }

   
    public void makeOlder() {
        age += 1;
    }

   
    public void makeYounger() {
        age -= 1;
    }
}


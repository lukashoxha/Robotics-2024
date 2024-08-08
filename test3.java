public class test3 {
    public static void main(String[] args) {
        
        double x = 75; 
        
        if (x < 100) {
            x += 50; 
        }

       
        if (x > 100) {
            x /= 20;
        }

       
        System.out.println("The final value of x is: " + x);
    }
}

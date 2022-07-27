import java.util.Scanner; 

public class GreaterThanX {
    private Integer comparator;    

    public GreaterThanX(Integer x) {
        this.comparator = x;

        System.out.println("Comparator is " + this.comparator);
    }

    public void decide(Integer comparable) {
        if (comparable > this.comparator) {
            System.out.println(comparable + " ist größer als " + this.comparator);
        } else if (comparable < this.comparator) {
            System.out.println(comparable + " ist kleiner als " + this.comparator);
        } else {
            System.out.println(comparable + " ist gleich " + this.comparator);
        }
    }

    public static void main(String[] args) {
        // Using Scanner for Getting Input from User 
        Scanner input = new Scanner(System.in); 

        while(true) {
            System.out.println("------------"); 
            System.out.println("Please enter a comparator integer"); 
            Integer comparator = input.nextInt();
            GreaterThanX greaterThanX = new GreaterThanX(comparator);
            
            System.out.println("Please enter a comparable integer"); 
            Integer comparable = input.nextInt();
            
            greaterThanX.decide(comparable);
        }
    }
}

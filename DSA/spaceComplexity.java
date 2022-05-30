package DSA;

public class spaceComplexity {

    public static void main(String[] args) {
        
    }

    public void greet(String[] names){
        //o(n) space
        String[] copy = new String[names.length];

        //o(1) space, for the loop variable i
        for(int i = 0; i<names.length;i++){
            System.out.println("Hi "+ names[i]);
        }
    }
    
}

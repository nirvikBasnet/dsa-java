class palindrome_number{
    public static void main(String[] args) {
        int x = 121;

        isPalindrome(x);
    }

    public static boolean isPalindrome(int x){

        int reversedNum = 0;

        if(x<0 || x%10 == 0){
            return false;
        }

        if(x==0) return true;

        while(x>reversedNum){
        int pop = x%10;
        x /= 10; //absolute value
        reversedNum = (reversedNum * 10) + pop;
        }

        if(reversedNum == x || x == reversedNum/10){
            System.out.println("true");
            return true;
            
        }



        System.out.println(reversedNum);

        return false;
    }
}
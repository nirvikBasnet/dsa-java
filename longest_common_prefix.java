public class longest_common_prefix {

    public static void main(String[] args) {
        String[] str = {"flower","fleat","fly"};

        longestPrefix(str);

    }

    public static String longestPrefix(String[] str){

        if(str.length == 0) return "";
        String prefix = str[0];

       for (int i = 0; i < str.length; i++) {
           while(str[i].indexOf(prefix) != 0){

            prefix = prefix.substring(0,prefix.length()-1);

           }
           
       }

       System.out.println(prefix);

        return prefix;
    }
    
}

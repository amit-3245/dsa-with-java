public class string_comparison {
    
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";


        //using equals()
        // if(s1.equals(s2)){
        //     System.out.println("String are equal");
        // }else {
        //     System.out.println("Strings are not equal");
        // }


        // Using ==

        if(s1 == s2) {
            System.out.println("Same Refernce");

        }else {

            System.out.println("Differnt Refernce");
        }

        
    }
}

public class string_immutable {
    public static void main(String[] args){

        String s1 = "Hello";
        String s2 = s1;

        System.out.println("Before Modification:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);


        // modify s1
        s1 = s1 + "World";

        System.out.println("\nAfter Modification:");
        System.out.println("s1 = " + s1);

        System.out.println("s2 = " + s2);

        System.out.println("\n Reference Comparision:");
        System.out.println("s1 == s2 :" + (s1 == s2));



    }
}

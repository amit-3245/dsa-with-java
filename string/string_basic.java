public class string_basic {
    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        // Method 1: Character Array
        // char arr[] = {'a', 'b', 'c', 'd'};

        // // Method 2: String Literal
        // String str = "abcd";

        // // Method 3: Using new Keyword
        // String str2 = new String("xyz");

        // // Creating Scanner object for input
        // Scanner sc = new Scanner(System.in);

        // // Declaring String variable
        // String name;

        // // Taking a single word input
        // name = sc.next();
        // name = sc.nextLine();

        // Printing the input
        // System.out.println(name);

        // sc.close();

        // String fullName = "Amit Sharma";
        // System.out.println(fullName.length());


        //concatenation
        String firstName = "Amit";
        String lastName = "Sharma";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // charAt() function used for get element baesd on position
        //  String firstName = "Amit";
        // String lastName = "Sharma";
        // String fullName = firstName + " " + lastName;

        // System.out.println(fullName.charAt(0));
    }
}
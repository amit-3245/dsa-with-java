public class stiring_uppercase {



    public static String toUpperCase(String str) {

        // StringBuilder to store result
        StringBuilder sb = new StringBuilder("");

        // Convert first character to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Traverse remaining characters
        for (int i = 1; i < str.length(); i++) {

            // If space is found
            if (str.charAt(i) == ' ' && i < str.length() - 1) {

                // Add space
                sb.append(str.charAt(i));

                // Move to next character
                i++;

                // Convert next character to uppercase
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {

                // Add character as it is
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "hi, i am amit sharma";

        System.out.println(toUpperCase(str));
    }
}
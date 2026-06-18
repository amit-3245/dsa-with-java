public class stringbuilder {

    public static void main(String[] args) {

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append string at the end
        sb.append(" World");
        System.out.println("Append : " + sb);

        // Access character at index 1
        System.out.println("charAt : " + sb.charAt(1));

        // Change character at index 0
        sb.setCharAt(0, 'Y');
        System.out.println("setCharAt : " + sb);

        // Insert character at index 1
        sb.insert(1, 'A');
        System.out.println("insert : " + sb);

        // Delete characters from index 1 to 2
        sb.delete(1, 3);
        System.out.println("delete : " + sb);

        // Reverse string
        sb.reverse();
        System.out.println("reverse : " + sb);

        // Length of StringBuilder
        System.out.println("length : " + sb.length());
    }
}
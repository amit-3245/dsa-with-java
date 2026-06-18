public class shortest_path {

    // Function to calculate shortest path
    public static float getShortestPath(String path) {

        // Starting coordinates
        int x = 0, y = 0;

        // Traverse the path string
        for (int i = 0; i < path.length(); i++) {

            // Current direction
            char dir = path.charAt(i);

            // Move South
            if (dir == 'S') {
                y--;
            }

            // Move North
            else if (dir == 'N') {
                y++;
            }

            // Move West
            else if (dir == 'W') {
                x--;
            }

            // Move East
            else {
                x++;
            }
        }

        // Calculate x² and y²
        int X2 = x * x;
        int Y2 = y * y;

        // Distance = √(x² + y²)
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {

        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path));
    }
}
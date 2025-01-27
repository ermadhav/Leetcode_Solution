import java.util.List;
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        // Initial position (row, col)
        int row = 0, col = 0;
        // Process each command
        for (String command : commands) {
            switch (command) {
                case "UP":
                    row -= 1;
                    break;
                case "DOWN":
                    row += 1;
                    break;
                case "LEFT":
                    col -= 1;
                    break;
                case "RIGHT":
                    col += 1;
                    break;
            }
        }
        // Convert the final position (row, col) to a single integer
        return row * n + col;
    }
}

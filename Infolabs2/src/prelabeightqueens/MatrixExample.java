package prelabeightqueens;

public class MatrixExample {
    public static void main(String[] args) {
        int rows = 3; // Number of rows in the matrix
        int cols = 4; // Number of columns in the matrix

        int[][] matrix = new int[rows][cols]; // Define the matrix

        // Fill every cell of the matrix with -1
        fillMatrixWithMinusOne(matrix);

        // Print the matrix to verify the values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        int numberOfDisks = 3; // Number of disks

        // Towers: 1 - source, 2 - auxiliary, 3 - destination
        solveTowersOfHanoi(numberOfDisks, 1, 3, 2); 
    }

    public static void fillMatrixWithMinusOne(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = -1;
            }
        }
    }
    
    public static void solveTowersOfHanoi(int disks, int source, int destination, int auxiliary) {
        if (disks == 1) {
            // Base case: If there's only one disk, move it directly from the source tower to the destination tower
            System.out.println("Move disk 1 from Tower " + source + " to Tower " + destination);
            return;
        }

        // Move (n-1) disks from source tower to auxiliary tower, using the destination tower as the temporary tower
        solveTowersOfHanoi(disks - 1, source, auxiliary, destination);

        // Move the nth disk from source tower to destination tower
        System.out.println("Move disk " + disks + " from Tower " + source + " to Tower " + destination);

        // Move (n-1) disks from auxiliary tower to destination tower, using the source tower as the temporary tower
        solveTowersOfHanoi(disks - 1, auxiliary, destination, source);
    }
}
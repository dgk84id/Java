package test;

public class Matrix_transpose {
public static void main(String[] args) {
	
}
public static String[][] transposeArray(String[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    String[][] trasposedMatrix = new String[n][m];
    for (int x = 0; x < n; x++) {
        for (int y = 0; y < m; y++) {
            trasposedMatrix[x][y] = matrix[y][x];
        }
    }
    return trasposedMatrix;
}
}

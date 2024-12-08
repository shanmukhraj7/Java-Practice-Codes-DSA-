import java.util.*;

public class MaximumRectangleAreaWithConstraints {
    public static int maxRectangleArea(int[][] points) {
        int n = points.length;

        // Store points in a set for O(1) lookup
        Set<String> pointSet = new HashSet<>();
        for (int[] point : points) {
            pointSet.add(point[0] + "," + point[1]);
        }

        int maxArea = -1;

        // Iterate over all pairs of points to find diagonally opposite corners
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];

                // Check if the points are diagonally opposite
                if (x1 != x2 && y1 != y2) {
                    // The other two corners of the rectangle
                    String corner1 = x1 + "," + y2;
                    String corner2 = x2 + "," + y1;

                    // Check if these two points exist
                    if (pointSet.contains(corner1) && pointSet.contains(corner2)) {
                        // Check if no points lie inside or on the rectangle's border
                        if (!hasPointsInsideOrOnBorder(x1, x2, y1, y2, pointSet)) {
                            // Calculate the area
                            int area = Math.abs(x1 - x2) * Math.abs(y1 - y2);
                            maxArea = Math.max(maxArea, area);
                        }
                    }
                }
            }
        }

        return maxArea;
    }

    // Helper function to check if any points lie inside or on the rectangle's border
    private static boolean hasPointsInsideOrOnBorder(int x1, int x2, int y1, int y2, Set<String> pointSet) {
        int left = Math.min(x1, x2);
        int right = Math.max(x1, x2);
        int bottom = Math.min(y1, y2);
        int top = Math.max(y1, y2);

        // Iterate over all points within the rectangle
        for (int x = left; x <= right; x++) {
            for (int y = bottom; y <= top; y++) {
                if (pointSet.contains(x + "," + y)) {
                    // Ignore the corners of the rectangle
                    if ((x == x1 && y == y1) || (x == x1 && y == y2) || 
                        (x == x2 && y == y1) || (x == x2 && y == y2)) {
                        continue;
                    }
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] points1 = {{1, 1}, {1, 3}, {3, 1}, {3, 3}};
        int[][] points2 = {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {2, 2}};
        int[][] points3 = {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {1, 2}, {3, 2}};

        System.out.println("Test Case 1: " + maxRectangleArea(points1)); // Output: 4
        System.out.println("Test Case 2: " + maxRectangleArea(points2)); // Output: -1
        System.out.println("Test Case 3: " + maxRectangleArea(points3)); // Output: 2
    }
}

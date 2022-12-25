// Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.

// Input: points = [[1,1],[2,2],[3,3]]
// Output: 3


import java.util.HashMap;
import java.util.Map;

public class Main {
  public static int maxPoints(int[][] points) {
    int n = points.length;
    if (n < 3) {
      return n;
    }

    int result = 0;
    for (int i = 0; i < n; i++) {
      // Pick every point as the reference point
      int[] ref = points[i];
      // Map to store the number of points with the same slope
      Map<Double, Integer> slopeCount = new HashMap<>();
      int samePoints = 1;  // Number of points with the same coordinates as the reference point
      for (int j = i + 1; j < n; j++) {
        // Calculate the slope of the line formed by the reference point and the current point
        int[] curr = points[j];
        if (ref[0] == curr[0] && ref[1] == curr[1]) {
          // The points have the same coordinates
          samePoints += 1;
        } else {
          // Calculate the slope of the line
          double slope = ref[0] == curr[0] ? Double.POSITIVE_INFINITY : (curr[1] - ref[1]) * 1.0 / (curr[0] - ref[0]);
          slopeCount.put(slope, slopeCount.getOrDefault(slope, 0) + 1);
        }
      }

      // Find the maximum count in the map
      int count = samePoints;
      for (int cnt : slopeCount.values()) {
        count = Math.max(count, cnt + samePoints);
      }
      result = Math.max(result, count);
    }

    return result;
  }

  public static void main(String[] args) {
    int[][] points = {{1, 1}, {2, 2}, {3, 3}};
    System.out.println(maxPoints(points));  // Outputs 3

    points = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
    System.out.println(maxPoints(points));  // Outputs 4
  }
}

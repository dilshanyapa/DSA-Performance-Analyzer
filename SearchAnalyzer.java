import java.util.Arrays;

// Class to perform searching and count the steps taken[cite: 3, 4]
public class SearchAnalyzer {

    // Simple container to hold search results
    public static class SearchResult {
        public int index;
        public int steps;

        public SearchResult(int index, int steps) {
            this.index = index;
            this.steps = steps;
        }
    }

    // 1. Linear Search (checks one by one)
    public static SearchResult linearSearch(int[] data, int target) {
        int steps = 0;
        int foundIndex = -1;

        for (int i = 0; i < data.length; i++) {
            steps++; 
            if (data[i] == target) {
                foundIndex = i;
                break; 
            }
        }
        return new SearchResult(foundIndex, steps);
    }

    // 2. Binary Search (divide and conquer on sorted data)
    public static SearchResult binarySearch(int[] data, int target) {
        // Binary search requires sorted array
        int[] sortedData = Arrays.copyOf(data, data.length);
        Arrays.sort(sortedData);

        int steps = 0;
        int low = 0;
        int high = sortedData.length - 1;
        int foundIndex = -1;

        while (low <= high) {
            steps++; 
            int mid = (low + high) / 2;

            if (sortedData[mid] == target) {
                foundIndex = mid;
                break;
            } else if (sortedData[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return new SearchResult(foundIndex, steps);
    }
}
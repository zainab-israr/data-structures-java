public class Searching {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}

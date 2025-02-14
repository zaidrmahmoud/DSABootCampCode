// LeetCodeFlipImage.java

public class LeetCodeFlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] image1 : image) {
            reverseArray(image1);
            for (int k = 0; k < image1.length; k++) {
                if (image1[k] == 1) {
                    image1[k] = 0;
                } else if (image1[k] == 0) {
                    image1[k] = 1;
                }
            }
        }
        return image;
    }
    public void swap(int[] arr, int index1, int index2) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
    }
    public void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}


package pt2v1;

public class MergeSort {

    // Phương thức Merge Sort: chia mảng
    public static void mergeSort(int[] a, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            // Sắp xếp nửa bên trái
            mergeSort(a, left, mid, temp);
            // Sắp xếp nửa bên phải
            mergeSort(a, mid + 1, right, temp);
            // Trộn hai nửa đã sắp xếp
            merge(a, left, mid, right, temp);
        }
    }

    // Phương thức Merge: trộn hai mảng đã sắp xếp
    public static void merge(int[] a, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int k = left;
        // So sánh và trộn hai nửa
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }
        // Sao chép các phần tử còn lại bên trái
        while (i <= mid) {
            temp[k] = a[i];
            i++;
            k++;
        }
        // Sao chép các phần tử còn lại bên phải
        while (j <= right) {
            temp[k] = a[j];
            j++;
            k++;
        }
        // Đưa kết quả từ temp trở lại mảng a
        for (int p = left; p <= right; p++) {
            a[p] = temp[p];
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 4, 5, 2};
        int[] temp = new int[a.length];
        mergeSort(a, 0, a.length - 1, temp);
        for (int x : a) {
            System.out.print(x + " ");
        }
        
        System.out.println();
    }
}

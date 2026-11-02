package pt2v1;

public class SelectionSort {

    public static void selectionSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            // Giả sử phần tử đầu tiên là nhỏ nhất
            int minIndex = i;

            // Tìm phần tử nhỏ nhất trong đoạn chưa sắp xếp
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // Đổi chỗ hai phần tử
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 4, 5, 2};
        selectionSort(a);
        for (int item : a) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

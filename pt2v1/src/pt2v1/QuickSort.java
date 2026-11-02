package pt2v1;

public class QuickSort {

    // Hàm phân hoạch mảng
    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                // Đổi chỗ a[i] và a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // Đưa Pivot về đúng vị trí
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    // Hàm Quick Sort
    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            // Sắp xếp phần bên trái Pivot
            quickSort(a, low, pi - 1);
            // Sắp xếp phần bên phải Pivot
            quickSort(a, pi + 1, high);
        }
    }

    public static int investPartition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] >= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    public static void investQuickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = investPartition(a, low, high);
            investQuickSort(a, low, pi - 1);
            investQuickSort(a, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 4, 5, 2};
        quickSort(a, 0, a.length - 1);
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();

        investQuickSort(a, 0, a.length - 1);
        for (int y : a) {
            System.out.print(y + " ");
        }
        System.out.println();
    }
}

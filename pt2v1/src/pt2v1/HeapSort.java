package pt2v1;

public class HeapSort {

    // Điều chỉnh Max Heap
    public static void heapify(int[] a, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Kiểm tra nút con trái
        if (left < n && a[left] > a[largest]) {
            largest = left;
        }
        // Kiểm tra nút con phải
        if (right < n && a[right] > a[largest]) {
            largest = right;
        }

        // Nếu nút cha không phải lớn nhất
        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            // Tiếp tục điều chỉnh cây con
            heapify(a, n, largest);
        }
    }

    // Phương thức Heap Sort
    public static void heapSort(int[] a) {
        int n = a.length;

        // Bước 1: Xây dựng Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }

        // Bước 2: Đưa phần tử lớn nhất về cuối
        for (int i = n - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            // Điều chỉnh lại Max Heap
            heapify(a, i, 0);
        }
    }

    public static void investHeapify(int[] a, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && a[left] < a[smallest]) {
            smallest = left;
        }
        if (right < n && a[right] < a[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;

            investHeapify(a, n, smallest);
        }
    }

    public static void investHeapSort(int[] a) {
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            investHeapify(a, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            investHeapify(a, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 4, 5, 2};
        heapSort(a);
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        investHeapSort(a);
        for (int y : a) {
            System.out.print(y + " ");
        }
        System.out.println();
    }
}

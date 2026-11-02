package pt2v1;

public class RadixSort {

    // Tìm số lớn nhất trong mảng
    static int getMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // Sắp xếp theo từng chữ số
    static void countingSort(int[] a, int exp) {
        int n = a.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Đếm số lần xuất hiện của từng chữ số
        for (int i = 0; i < n; i++) {
            int digit = (a[i] / exp) % 10;
            count[digit]++;
        }

        // Tính vị trí cộng dồn
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Đưa các phần tử vào mảng output
        // Duyệt từ phải sang trái để đảm bảo ổn định
        for (int i = n - 1; i >= 0; i--) {
            int digit = (a[i] / exp) % 10;
            output[count[digit] - 1] = a[i];
            count[digit]--;
        }

        // Sao chép kết quả trở lại mảng ban đầu
        for (int i = 0; i < n; i++) {
            a[i] = output[i];
        }
    }

    // Thuật toán Radix Sort
    static void radixSort(int[] a) {
        int max = getMax(a);

        // exp lần lượt là 1, 10, 100, 1000...
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(a, exp);
        }
    }

    static void investCountingSort(int[] a, int exp) {
        int n = a.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            int digit = (a[i] / exp) % 10;
            count[digit]++;
        }

        for (int i = 8; i >= 0; i--) {
            count[i] += count[i + 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (a[i] / exp) % 10;
            output[count[digit] - 1] = a[i];
            count[digit]--;
        }

        for (int i = 0; i < n; i++) {
            a[i] = output[i];
        }
    }

    static void investRadixSort(int[] a) {
        int max = getMax(a);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            investCountingSort(a, exp);
        }
    }

    public static void main(String[] args) {
        // Mảng mẫu theo Ảnh 20 (hoặc {170, 45, 75, 90, 802, 24, 2, 66} theo Ảnh 19)
        int[] a = {189, 43, 78, 91, 934, 37, 8, 58};
        radixSort(a);

        System.out.println("Mang sau khi sap xep:");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();

        investRadixSort(a);
        System.out.println("Mang sau khi sap xep:");
        for (int y : a) {
            System.out.print(y + " ");
        }
        System.out.println();
    }
}

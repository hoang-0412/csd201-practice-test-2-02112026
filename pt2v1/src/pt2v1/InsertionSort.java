package pt2v1;

public class InsertionSort {

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            // Dịch các phần tử lớn hơn key sang phải
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            // Chèn key vào vị trí thích hợp
            a[j + 1] = key;
        }
    }
    
    public static void investInsertionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] < key) {                
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 4, 5, 2};
        insertionSort(a);
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        investInsertionSort(a);
        for (int y : a) {
            System.out.print(y + " ");
        }
        System.out.println();
    }
}

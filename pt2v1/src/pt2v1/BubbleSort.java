package pt2v1;

public class BubbleSort {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Đổi chỗ hai phần tử
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    
    public static void investBubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 4, 5, 2};
        bubbleSort(a);
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        investBubbleSort(a);
        for (int y : a) {
            System.out.print(y + " ");
        }
        System.out.println();
    }
}
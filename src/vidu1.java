import java.util.Scanner;

public class vidu1 {
    public static Scanner input;

    public static void nhapMang(int[] a, int n) {
        input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri thu " + i + " la: ");
            a[i] = input.nextInt();

        }

    }

    public static int timMax(int[] a, int n) {
        int max = a[0];
        for (int k : a) {
            if (k > max) {
                max = k;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang: ");
        int n = input.nextInt();
        int[] a = new int[n];
        nhapMang(a, n);
        System.out.println("Gia tri lon nhat cua mang: " + timMax(a, n));
    }

}

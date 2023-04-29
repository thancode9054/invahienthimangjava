import java.util.Scanner;

public class vidu2 {
    private static Scanner input;

    public static void nhapMang(int a[][], int sd, int sc) {
        for (int i = 0; i < sd; i++) {
            for (int j = 0; j < sc; j++) {
                System.out.printf("nhap vao gia tri tai vi tri a[%d][%d]:)", i, j);
                a[i][j] = input.nextInt();
            }
        }
    }

    public static void hienThi(int a[][], int sd, int sc) {
        for (int i = 0; i < sd; i++) {
            for (int j = 0; j < sc; j++)
                System.out.printf(a[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Nhap vao so dong: ");
        int sd = input.nextInt();
        System.out.print("Nhap vao so cot: ");
        int sc = input.nextInt();
        int a[][] = new int[sd][sc];
        nhapMang(a, sd, sc);
        hienThi(a, sd, sc);
    }

}
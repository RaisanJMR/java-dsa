import java.util.Scanner;
import java.util.*;

public class Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        // @ Array declaration Method: 1
        // int[] marks = new int[3];
        // @ Array declaration Method: 2
        // int marks[] = new int[3];
        // @ Array declaration Method: 3
        // int marks[] = { 89, 54, 78 };
        // marks[0] = 99; // * phy*/
        // marks[1] = 89;// * eng*/
        // marks[2] = 97;// * mal*/

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // @ Input array
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        // @ Print array
        for (int i = 0; i < size; i++) {
            if (num[i] == x) {
                System.out.println(num[i] + " found at index : " + i);
            }
        }
        sc.close();
    }
}
// ! JAVA by default initialization
// ? object=>null
// ? int=>0
// ? float=>0.0
// ? boolean=>false
// ? string=>""
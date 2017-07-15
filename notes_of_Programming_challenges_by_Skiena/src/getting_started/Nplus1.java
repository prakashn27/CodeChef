//package getting_started;
//
//import java.util.ArrayList;
//import java.util.Scanner;
///**
// * PC/UVa IDs: 110101/100, Popularity: A, Success rate: low Level: 1
// *
// inp:
// 1 10
// 100 200
// 201 210
// 900 1000
//
// Output:
// 1 10 20
// 100 200 125
// 201 210 89
// 900 1000 174
//
// * Created by prakashn on 18/12/2015.
// */
//public class Nplus1 {
//    public static int getCountOf3n(int n) {
//        int count = 1;
//        while(true) {
//            if(n == 1) {
//                break;
//            }
//            if(n % 2 == 0) {
//                // even
//                n = n / 2;
//            } else {
//                n = 3 * n + 1;
//            }
//            count++;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while(sc.hasNextInt()) {
//            Integer a = sc.nextInt();
//            Integer b = sc.nextInt();
//            ArrayList<Integer> result = new ArrayList<Integer>();
//            for (int i = a; i <= b; i++) {
//                Integer max = getCountOf3n(i);
//                result.add(max);
//            }
//            int max_ele = 0;
//            for (Integer ele : result) {
//                if (ele > max_ele) {
//                    max_ele = ele;
//                }
//            }
//            System.out.println(a + "\t" + b + "\t" + max_ele);
//        }
//    }
//
//
//
//}

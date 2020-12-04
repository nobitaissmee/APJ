//import java.math.BigInteger;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//public class BD18 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Queue<Integer> queue = new LinkedList<>();
//        for(int i = 2; i < n && i <= 7; i++){
//            if(BigInteger.valueOf(i).isProbablePrime(100)){
//                queue.add(i);
//            }
//        }
//        while(!queue.isEmpty()){
//            for(int i = 1; i <= 9; i++){
//                int num = queue.peek() * 10 + i;
//                if(BigInteger.valueOf(num).isProbablePrime(100) && num < n){
//                    queue.add(num);
//                }
//            }
//            System.out.print(queue.remove() + " ");
//        }
//    }
//}
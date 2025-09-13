// code of loops in java

// 1 => 1 print all natural numbers from 1 to n using while loop 

// import java.util.Scanner;

// public class loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int n = sc.nextInt();
//         int i = 1;
//         while(i <= n){
//             System.out.println(i +" ");
//             i++;
//         }

//     }
// }



//2 => print al the natural number in reverse

// import java.util.Scanner;

// public class loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a numbera");
//         int n = sc.nextInt();
//         int i = n;
//         while(i >= 1){
//             System.out.println(i + " ");
//             i--;
//         }
//     }
// }


//3 => print all alphabet from a to z using while loop

// public class loop{
//     public static void main(String[] args) {
//         char ch = 'a';
//         while(ch <= 'z'){
//             System.out.println(ch +" ");
//             ch++;
//         }
//     }
// }



// 4 => print all even number between 1 to 100 using while loop

// public class loop{
//     public static void main(String[] args) {
//         int i = 2;
//         while (i <= 100) { 
//             System.out.println(i + " ");
//             i += 2;
            
//         }
//     }
// }


//5 => all odd number 1 to 100

// public class loop{
//     public static void main(String[] args) {
//         int i = 1;
//         while (i <= 100) { 
//             System.out.println(i + " ");
//             i += 2;
//         }
//     }
// }




// 6 =>find sum of all even numbers betweeen 1 to n

// import java.util.Scanner;

// public class loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int n = sc.nextInt();
//         int sum  = 0;
//         int i = 2;
//         while(i <= n){
//             sum += i;
//             i += 2;
//         }
//     }
// }




//7 => find sum of all even numbers between 1 to n

// import java.util.Scanner;

// public class loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 2;
//         while(i <= n){
//         sum += i;
//         i += 2;
//     }

//     System.out.println("sum" + sum);
    
// }
// }




// 8 => find sum of all odd numbers between 1 to n

//import java.util.Scanner;

// public class loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 1;
//         while(i <= n){
//         sum += i;
//         i += 2;
//     }

//     System.out.println("sum" + sum);
    
// }
// }


// 9 => print multiplication table of any number


//import java.util.Scanner;
// public class loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int n = sc.nextInt();
//         int i = 1;
         
//         while(i <= 10){
//System.out.println(n + " * " + i + " = " + (n * i));
//}
//}
//}



// 10 => count number of digit in n number
//import java.util.Scanner;
//public class loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int n = sc.nextInt();
//         int count = 0;

//         while(n != 0){
//         n /= 10;
  //       count++;
//}
//System.out.println("number of digit:" + count);
//} 
//}




// 11=> enter a number and print its reverse

// import java.util.Scanner;
// public class loop{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();
//         int reverse = 0;
//         while (n != 0) {
//             reverse = reverse * 10 + n % 10;
//             n /= 10;
            
//         }
//         System.out.println("reverse:" + reverse);
//     }
// }


// 12 => palindrome or not

// import java.util.Scanner;
// public class loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int reverse= 0;
//         int temp = n;
//         while (temp != 0) { 
//             reverse = reverse * 10 + temp % 10;
//             temp /= 10;
//         }
//         if(n==reverse){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }
//     }
// }





// 13 => find frequency of each digit in a given integer

// import java.util.Scanner;
// public class loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] frequency = new int[10];
//         while (n != 0) { 
//             int digit = n% 10;
//             frequency[digit]++;
//             n /= 10;
//         }
//         for (int i = 0; i < 10; i++) {
//             if(frequency[i] > 0){
//                 System.out.println("digit" + i + "appears" + frequency[i]+"times");
//             }
//     }
// }
// }



// 14 =>print all ASCII character with their value

public class loop{
    public static void main(String[] args) {
        for (int i = 0; i < 127; i++) {
            System.out.println("ASCII value of" + (char)i + "is" + i);
        }   
    }
}
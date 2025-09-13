// no.1 =>  calculate area of rectangle


// import java.util.Scanner;

// public class basiccodes{
//     public static void main(String[] args) { // System.out.println("HELLO WORLD!");
//        int length,width;
//        double area;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the value of length");
//        length=sc.nextInt();
//        System.out.println("enter the value of width");
//        width = sc.nextInt();
//        area = length*width;
//        System.out.println(area);
//     }
// }

//no.2 =>  area of circle

// import java.util.Scanner;

// public class basiccodes{
//     public static void main(String[] args) {
//         int radius;
//         double area;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the value of radius");
//         radius = sc.nextInt();
//         area = 3.14* radius* radius;
//         System.out.println(area);

//     }
// }



//no.3 => simple interest


import java.util.Scanner;

public class basiccodes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        System.out.println("enter the value of p");
        System.out.println("enter the value of r");
        System.out.println("enter the value of t");
        int SI = p *t * r / 100;
        System.out.println(SI);

    }
}

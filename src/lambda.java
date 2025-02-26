//import java.util.*;
// interface method {
//     abstract int add(int a,int b);
    
// }
// public class lambda {
//     public static void main(String[] args) {
//         method m=(a,b)->{return a+b;};
//         System.out.println(m.add(5, 7));
//     }
// }
// class lambda{
//     public static void main(String[] args) {
//         Integer[]arr={1,2,3,4,5,6};
//         List<Integer>list=new ArrayList<>(Arrays.asList(arr));
//         long s=list.stream()
//         .filter(n->n%2==0)
//         .mapToLong(n->n)
//         .count();
//         System.out.println(s);
//     }
// }
// class demo{
//     int n;
//     String name;
// }
// class lambda{
//     void method(demo n){
//         n.n=20;
//         n.name="Sur";
//     }
//     public static void main(String[] args) {
//         demo d=new demo();
//         d.n=10;
//         System.out.println(d.n);
//         System.out.println(d.name);
//         lambda l=new lambda();
//         l.method(d);
//         System.out.println(d.n);
//         System.out.println(d.name);
//     }
// }
class lambda{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        for(int a:arr){
            System.out.println(a);
        }
    }
}    

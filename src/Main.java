// import java.util.*;
// class bst{
//     public void binarySearch(int[]arr,int target){
//         Arrays.sort(arr);
//         int mid=arr.length/2;
//         if(target>arr[mid]){
//             arr=Arrays.copyOfRange(arr,mid+1,arr.length);
//             binarySearch(arr, target);
//         }else if(target<arr[mid]){
//             arr=Arrays.copyOfRange(arr,0,mid);
//             binarySearch(arr, target);
//         }
//         else{
//             System.out.println("Target is there");
//         }
//     }
// }
// class App{
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int[]arr={5,6,3,1,7,8};
//         System.out.println("Enter your target");
//         int target=s.nextInt();
//         bst b=new bst();
//         b.binarySearch(arr, target);
//     }
// }
// class Animal{
    
// }
// class Main{
//     public static void main(String[] args) {
//         Animal s=new Animal();   
//     }
// }
// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int size=scan.nextInt();
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=scan.nextInt();
//         }
//         System.out.print("[");
//         for(int i=0;i<size;i++){
//             if(i<4){
//                 System.out.print(arr[i]+","); 
//             }else{
//                 System.out.print(arr[i]);
//             }
            
//         }
//         System.out.print("]");
//     } 
// }

// class Main{
//     public static void main(String[] args) {
//       int n=5;
//       for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             if(i==1){
//                 if(j==4 || j==0){
//                     System.out.print(" * ");
//                 }else{
//                     System.out.print("   ");
//                 }
//             }else if(i==0 || i==2 || j==0){
//                 System.out.print(" * ");
//             }
//         }
//         System.out.println();
//       }
//     }
//}
// import java.time.*;
// import java.time.format.DateTimeFormatter;
// class main{
//     public static void main(String[] args) {
//         LocalDateTime date=LocalDateTime.now();
//         System.out.println(date);
//         DateTimeFormatter d=DateTimeFormatter.ofPattern("E,MMM-DD-YYYY");
//         String s=d.format(date);
//         System.out.println(s);
//     }
// }
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Vector<String>v=new Vector<>();
//         v.add("1");
//         v.add("2");
//         v.add("3");
//         v.add("4");
//         v.add("5");
//         Object[]arr=v.toArray();
//         for(Object s:arr){
//             System.out.print(s+" ");
//         }
//     }
// }  


// import java.util.Scanner;

// class Main{
//     public static void main(String[] args) {
//         int num=123;
//         String s=Integer.toString(num);
//         String s1="";
//         for(int i=0;i<s.length();i++){
//             s1=s.charAt(i)+s1;
//         }
//         System.out.println("Before : "+s);
//         System.out.println("After : "+s1);

//     }
// }

// import java.math.BigInteger;

// class Main{
//     public static void main(String[] args) {
//         BigInteger base=BigInteger.valueOf(2);
//         int pow=100;
//         BigInteger result=base.pow(pow);
//         System.out.println(result);
//     }
// }

// import java.util.Arrays;
// import java.util.List;
// import java.util.StringTokenizer;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// import javax.sound.sampled.SourceDataLine;

// class Main{
//     public static void main(String[] args) {
//         String S="Tamil Tami2345@@@@";
//         StringTokenizer s=new StringTokenizer(S);
//         while (s.hasMoreTokens()) {
//             System.out.println(s.nextToken());
//         }
        
//     }
// }

// import java.nio.channels.Pipe.SourceChannel;
// import java.util.ArrayList;

// class Main{
//     public static void main(String[] args) {
//         int n=15;
//         ArrayList<Integer>k1=new ArrayList<>();
//         ArrayList<Integer>k2=new ArrayList<>();
//         ArrayList<Integer>meet_points=new ArrayList<>();
//         for(int i=1;i<n;i+=2){
//             k1.add(i);
//         }
//         for(int i=2;i<=n;i++){
//             k2.add(i);
//         }
        
//         for(int i=0;i<k1.size();i++){
//             for(int j=0;j<k2.size();j++){
//                 if(k1.get(i)==k2.get(j)){
//                     meet_points.add(k1.get(i));
//                 }
//             }
//         }
//         System.out.println(meet_points);
        
//     }
// }
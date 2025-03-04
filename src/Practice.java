// public class Practice {
//     public static void main(String[] args) {
//         int i=4;
//         switch(i){
//             case 1:
//               System.out.println("Hello");
//               break;
//             case 2:
//               System.out.println("Helloo");
//               break;  
//             case 3:
//               System.out.println("Hellooo");
//               break; 
//             case 4:
//               System.out.println("Helloooo");
//               break; 

//         }
//     }
// }
// class Practice{
//     public static void main(String[] args) {
//         int size =10;
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=i+1;
//         }
//         int target=11;
//         int count=0;
//         for(int i=0;i<size;i++){
//             if(arr[i]==target){
//                 count+=1;
//                 break;
//             }else{
//                 count=0;
//             }
//         }
//         if(count==1){
//             System.out.println("Matched");
//         }else{
//             System.out.println("Not Matched");
//         }
//     }
// }
// interface animal{
//     abstract void method();
// }

// class Practice{
//     public static void main(String[] args) {
//         animal a=()->{System.out.println("Hello");};
//         a.method();
//     }
// }
// class Animal{
//     Animal(int a,int b){
//         System.out.println(Math.pow(a,b));
//     }
// }
// class Practice{
//     public static void main(String[] args) {
//         Animal a=new Animal(2,3);
//     }
// }

// class Practice{
//     public static void main(String[] args) {
//         int i=69;
//         switch (i) {
//             case 65:
//                 System.out.println("A");
//                 break;
        
//             case 66:
//                 System.out.println("B");
//                 break;
//             case 67:
//                 System.out.println("C");
//                 break;
//             case 68:
//                 System.out.println("D");
//                 break;    
//             default:
//                 System.out.println("No match");
//                 break;        
//         }
//     }
// }

// class Practice{
//     int sum;
//     Practice(){
//         sum=10;
//     }
//     public void method(int num){
//         if(num==0){
//             System.out.println(sum);
//         }else{
//             sum+=num;
//             method(num-1);
//         }
//     }
//     public static void main(String[] args) {
//         Practice p=new Practice();
//         p.method(10);
//     }
// }
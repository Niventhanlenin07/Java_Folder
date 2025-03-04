// class counter extends Thread{
//     int count=0;
//     public void run(){
//         for(int i=0;i<1000;i++){
//             count++;
//         }
//     }
// }
// public class Threads {
//     public static void main(String[] args) {
//         counter c=new counter();
//         c.start();
//         try{
//             c.join();
//         }catch(InterruptedException e){
//             System.out.println(e.getMessage());
//         }
//         System.out.println(c.count);
//     }
// }
// class counter1 extends Thread{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("A is working ");
//             try{
//                 Thread.sleep(100);
//             }catch(InterruptedException e){
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }
// class counter2 extends Thread{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("B is working ");
//             try{
//                 Thread.sleep(100);
//             }catch(InterruptedException e){
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }
// class Threads{
//     public static void main(String[] args) {
//         counter1 c1=new counter1();
//         counter2 c2=new counter2();
//         c1.start();
//         c2.start();
//         c2.interrupt();
//     }
// }
// class counter implements Runnable{
//     int count=0;
//     public void run(){
//         count=5;
//     }
// }
// class Threads{
//     public static void main(String[] args) {
//         counter c=new counter();
//         Thread t=new Thread(c);
//         t.start();
//         try{
//             t.join();
//         }catch(InterruptedException e){
//             System.out.println(e.getMessage());
//         }
//         System.out.println(c.count);
//     }
// }
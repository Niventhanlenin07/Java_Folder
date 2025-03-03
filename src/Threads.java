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
class counter1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("A is working ");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class counter2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("B is working ");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(Thread.currentThread().getPriority());
    }
}
class Threads{
    public static void main(String[] args) {
        counter1 c1=new counter1();
        counter2 c2=new counter2();
        c1.setPriority(Thread.MIN_PRIORITY);
        c2.setPriority(Thread.MIN_PRIORITY);
        c1.start();
        c2.start();
        try{
            c1.join();
            c2.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
    }
}
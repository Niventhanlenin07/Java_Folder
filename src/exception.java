// import javax.xml.transform.Source;
// public class exception {
//     public static void main(String[] args) {
//         int flag=0;
//         try{
//             int a=10;
//             int b=0;
//             int c=a/b;
//         }catch(ArithmeticException e){
//             flag=1;
//             System.out.println("Zero by division error");
//         }finally{
//             if(flag==1){
//                 System.out.println("Code run with error!!!");
//             }else{
//                 System.out.println("Code done...");
//             }
//         }
//     }
// }
// class valid{
//     public void check(int age){
//         if(age<18){
//             throw new ArithmeticException("Age is not enough");
//         }else{
//             System.out.println("Age is valid!!!");
//         }
//     }
// }
// class exception{
//     public static void main(String[] args) {
//         valid v=new valid();
//         try{
//             v.check(16);
//         }catch(ArithmeticException e){
//             System.out.println(e.getMessage());
//         }
//         finally{
//             System.out.println("Code run successfully...");
//         }
//     }
// }
// class myexception extends Exception{
//     myexception(String message){
//         super(message);
//     }
// }
// class valid{
//     public void check(int age) throws myexception{
//         if(age<18){
//             throw new myexception("Age is not enough");
//         }else{
//             System.out.println("Age is valid!!!");
//         }
//     }
// }
// class exception{
//     public static void main(String[] args) {
//         valid v=new valid();
//         try{
//             v.check(16);
//         }catch(myexception e){
//             System.out.println(e.getMessage());
//         }
//         finally{
//             System.out.println("Code run successfully...");
//         }
//     }
// }
// class dad{
//     String name;
//     void names(String name){
//         this.name=name;
//     }
// }
// class son extends dad{
    
// }
// class exception{
//     public static void main(String[] args) {
//         son s=new son();
//         s.names("Lenin");
//         System.out.println(s.name);
//     }
// }
// class outer{
//     int x=10;
//     class inner{
//         int y=20;
//     }
// }
// public class Innerclass {
//     public static void main(String[] args) {
//         outer o=new outer();
//         outer.inner i=o.new inner();
//         System.out.println("X : "+o.x);
//         System.out.println("Y : "+i.y);
//     }
// }

//Static inner class
// class outer{
//     int x=10;
//     static class inner{
//         int y=20;
//     }
// }
// public class Innerclass {
//     public static void main(String[] args) {
//         outer o=new outer();
//         outer.inner i=new outer.inner();
//         System.out.println("X : "+o.x);
//         System.out.println("Y : "+i.y);
//     }
// }
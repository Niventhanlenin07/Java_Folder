// import java.util.*;

// class longcode{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         System.out.println("Enter your name here...");
//         String name=scan.nextLine();
//         System.out.println("Welcome "+name+"!!!");
//         System.out.println();
//         System.out.println("Press 1 for view Menu");
//         System.out.println("Press 2 for order products");
//         System.out.println("Press 3 for adding products");
//         System.out.println("Press 4 for exit to home page");
//         ArrayList<String>arr=new ArrayList<>();
//         arr.add("Apple");
//         arr.add("Orange");
//         arr.add("Banana");
//         arr.add("Mango");
//         arr.add("Pineapple");
//         final int pass=1111; 
//         boolean loop=true;
//         while(loop){
//             int choice=scan.nextInt();
//             switch (choice) {
//                 case 1:
//                     System.out.println("Menu:-");
//                     for(int i=0;i<arr.size();i++){
//                         System.out.println(i+1+"."+arr.get(i));
//                     }
//                     break;
            
//                 case 2:
//                     System.out.println("Enter your product for order");
//                     scan.nextLine();
//                     String product=scan.nextLine();
//                     int count=0;
//                     for(int i=0;i<arr.size();i++){
//                         if(arr.get(i).equals(product)){
//                             count=1;
//                             break;
//                         }
//                     }
//                     if(count==1){
//                         arr.remove(product);
//                         System.out.println(product+" was order successfully!!!");

//                     }else{
//                         System.out.println("Out of stock...");
//                     }
//                     break;
//                 case 3:
//                     System.out.println("Enter the password");
//                     int password=scan.nextInt();
//                     if(pass==password){
//                         System.out.println("Enter the product");
//                         scan.nextLine();
//                         String Product=scan.nextLine();
//                         arr.add(Product);  
//                         System.out.println("Adding successfully!!!");
//                     }else{
//                         System.out.println("Access denied...");
//                     }
//                     break;
//                 case 4:
//                     loop=false;
//                     break;    
//             }
//         }KO
//     }
// }
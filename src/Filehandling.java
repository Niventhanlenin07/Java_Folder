import java.io.*;
// Create new file:-
// class Filehandling{
//     public static void main(String[] args) {
//         File file=new File("new_file.txt");
//         try{
//             if(file.createNewFile()){
//                 System.out.println("File_name : "+file.getName());
//             }
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

//Write the file:-
// class Filehandling{
//     public static void main(String[] args) {
//         try{
//             FileWriter writes=new FileWriter("new_file.txt");
//             writes.write("Hello world!");
//             writes.close();
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//         try{
//             BufferedWriter writes=new BufferedWriter(new FileWriter("new_file.txt"));
//             writes.newLine();
//             writes.write("Hello all");
//             writes.close();
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

//Read the file:-
// class Filehandling{
//     public static void main(String[] args) {
//         try{
//             FileReader read=new FileReader("new_file.txt");
//             int data;
//             while((data=read.read())!=-1){
//                 System.out.print((char)data);
//             }
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//         System.out.println();
//         try{
//             BufferedReader reads=new BufferedReader(new FileReader("new_file.txt"));
//             String str;
//             while((str=reads.readLine())!=null){
//                 System.out.print(str);
//             }
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

//Append 
// class Filehandling{
//     public static void main(String[] args) {
//         try{
//             FileWriter write=new FileWriter("new_file.txt",true);
//             write.append("\nHello everyone!!!");
//             write.close();
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
//     }
// }

//Directory
// class Filehandling{
//     public static void main(String[] args) {
//         File direct=new File("C:\\Users\\n" + //
//                         "lenin\\OneDrive - Mr. Cooper\\JavaProject");
//         if(direct.isDirectory()){
//             String[]list=direct.list();
//             if(list!=null){
//                 for(String data:list){
//                     System.out.println(data);
//                 }
//             } else {
//                 System.out.println("The provided path is not a directory.");
//             }
//         }
                            
//     }
// }
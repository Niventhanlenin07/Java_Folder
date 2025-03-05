// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class Regex {
//     public static void main(String[] args) {
//         String Str="Hello there.Hello all 123-657-876";
//         Pattern p=Pattern.compile("\\d{3}-\\d{3}-\\d{3}");
//         Matcher m=p.matcher(Str);
//         while (m.find()) {
//             System.out.println(m.group());
//         }
//     }
// }
// import java.util.regex.*;

// class Regex{
//     public static void main(String[] args) {
//         String Str="Hello,Hi,How";
//         Pattern p=Pattern.compile("\\,");
//         String[]str=p.split(Str);
//         for(String s:str){
//             System.out.println(s);
//         }
//     }
// }
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class Regex {
//     public static void main(String[] args) {
//         String Str="HiHellothereHellohi 12 1 2 3 4 all 123657876";
//         Pattern p=Pattern.compile("\\b[a-zA-Z0-9]\\b");
//         Matcher m=p.matcher(Str);
//         while (m.find()) {
//             System.out.println(m.group());
//         }
//     }
// }
// import java.util.StringTokenizer;

// class Regex{
//     public static void main(String[] args) {
//         String Str="Hello world hi there..";
//         StringTokenizer str=new StringTokenizer(Str," ",true);
//         while(str.hasMoreTokens()){
//             System.out.println(str.nextToken());
//         }

//     }
// }
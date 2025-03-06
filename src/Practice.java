                                                                    /* JAVA */

/*
Syntax
class Practice(Note : File name and the class is equal if it is different it shows error){
    public static void main(String[] args) {
        
    }
} 
*/

/*
public static void main(String[] args
public - Access modifiers
static - keyword
void - return type
main - method 
String[]args - String array and arr is name of the array.
*/

/*
Outputs :-
1)Println()=>Print the var or given strings next next lines.
2)Print()=>Print the var or given strings same line.
3)Printf()=>Print the var or given strings same lines but use some specific modifiers like(%s,%c,%d).
*/

// - single line command
/* - multi line command */

/* 
Variable 
It is a storage container.It is defined by DataType VarName = value;
Example int i=10;
*/

/* 
DataType 
1)Primitive
2)Reference
Primitive contain 8 types like byte,short,int,float,long,double.Reference is like initialized by obj like String ,Array,Class,Interface.
Primitive store value in directly to Stack memory and Reference store address in heap memory and stores value in stack memory.
*/

/*
Type casting 
1)Narrowing
2)Widening
Narrowing--Decending order likes Double->Float->Long->int->char->short->byte.
Widening--Ascending order likes byte->short->char->int->long->float->double.
 */

/*
Operators
It's perform some operations based on the operator.
1)Arithmetic(+,-,*,/,%)
2)Assignment(+=,-=,*=,/=)
3)Comparision(==,<,>,<=,>=)
4)Logical(And,Or,Not)
5)Bitwise(Xor,<<,>>)
6)Unary(i++,++i,--i,i--)
*/

/*
String 
String is text or sequence of characters and It surrounded by double quotes. 
Example "Hello Wolrd!"
*/

/*
Math
Math is like a mathematical operations.It have more functions in the math package.
Example pow,sqrt,cbrt,sin,cos,min,max,ceil,floor.
*/

/*
Bollean 
It is one type of data type and it is 1 bit and it contains 
True
False 
*/

/*
If Else 
It is a conditional statements that means check if the condition is true or meet the criteria if it is fail shows the esle conditons. 
*/

/*
Switch 
Switch and If Else is same but If Else is slower than compare to switch statements. 
*/

/*
loop
A block of code runs when it meets the eligible criteria.
1)For
2)While
3)Do while 
*/

/*
Break and Continue(Working on inside the loop and Switch statements)
Break means it stop the executions of the program
Continue means its skip the step and go to the next step 
*/

/*
Array
Array is stores multiple values in single variable.And it only stores same data type values.
Array is fixed size so mentioned the size in Array initialization.
Initialization of Array:-
dataType array_name=new dataType[size]; 
Example int[]arr=new int[10]; 
*/

/* 
Method
A block of code when it is call it runs.
1)Void 
i)Parameterized
ii)Non Parameterrized

2)Return 
i)Parameterized
ii)Non Parameterrized

*/ 

/* 
Recursion
A method called it self. 
*/

/* 
Object Oriented Progamming
The main two parts of OOP is class and  object 

class 
clss is a blueprint for creating objects.

object 
Instance of class.

*/

/* 
Constructor
A constructor in Java is a special method that is used to initialize objects.
*/

/* 
5 concepts of OOPs
1)Inheritance
2)Encapsulation
3)Polymorphism
4)Abstract
5)Interface
*/

/* 
User input
We are use Scanner package to give a user input.
Example,
Scanner scan=new Scanner(Syatem.in);
String name = scan.nextLine(); 

*/

/*
I mentioned some topics 
1)Date
2)Exception
3)Lambda
4)Regex
5)Threads
6)File handling 
7)Inner class and Enums
*/

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
// interface Work {
//     abstract void method();
// }
// class Practice{
//     public static void main(String[] args) {
//         Work w=()->{System.out.println("Welcome all!!!");};
//         w.method();
//     }
// }
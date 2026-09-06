 1) Why does Java have both primitives (int, double, boolean...) AND wrapper objects (Integer, Double, Boolean...) for what seems like the same thing?


 2)What actually happens in memory when you do int x = 5; vs Integer x = 5;?


Problems:


Write code that demonstrates the difference between == and .equals() for Integer objects — specifically, 
create two Integer values that are equal with == and two that aren’t, without changing the actual numeric value logic. 
(Hint: research “Integer caching” only after you try to predict the output yourself and get it wrong.)

//explanation

== compares the addresses whereas .equals checks the actual values . 
when a == b are compiled they are two different object references having two different addresses so it fails.

integer cache lives in heap memory as an inner class inside java.lang.Integer class

//code
class Main{
    public static void main(String[] args){
    Integer x=100;
    Integer  y=100;
    Integer a=150;
    Integer b=150;

    if(x==y){
    System.out.println("x and y addresses are equal");
    }
if(x.equals(y)){
    System.out.println("x and y values are equal");
}

    if(a==b){
    System.out.println("a and b addresses are equal");
    }
if(a.equals(b)){
    System.out.println("a and b values are equal");
}
}}




Write a method void modify(int x) and a method void modify(int[] arr).
Call both from main(), try to change the value inside each method, and print before/after in main(). 
Explain why one change is visible outside the method and the other isn’t 
— this is the real primitive vs object distinction, not just a syntax fact.

changes are not assigned to the actual variable because 
we are assigning new address to the local variable which makes it 
to point to the new array object created not to the actual object we created in main

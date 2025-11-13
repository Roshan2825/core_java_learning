package basics;

class Hello{
    public static void main(String[] args) {
        System.out.println("hello world");/*display the 
        text hello world */
        System.out.print("hello world");
        System.out.println(255+2);//adds the numbers
        int a=5,b=1;
        int temp=a;
        a=(a^b)^a;
        b=(temp^b)^b;
        System.out.println(a);
        System.out.println(b);
    }
}
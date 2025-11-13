package basics;

public class Conditionals {
    public static void main(String[] args) {
        int a=5,b=9,c=19;
        if(a>b && a>c){
            System.out.println(("a is greatest:"+a));
        } else if(b>a && b>c){
            System.out.println(("b is greatest:"+b));
        } else{
            System.out.println(("c is greatest:"+c));
        }
        // Ternary operator
        String max=(a>b && a>c)?"a is big"+a:(b>a && b>c)?"b is big"+b:(c>a && c>b)?"c is big:"+c:"none is big";
        System.out.println(max);
        switch (a) {
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
            default:
                System.out.println("a is not 1,2,3");
        }
    }
}

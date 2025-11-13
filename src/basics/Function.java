package basics;


public class Function {
    public static void main(String[] args){
        String[] name={"karthick roshan"};
        sum(name);
        System.out.println(name[0]);

    }

    static void sum(String[] naam){
        naam[0]="roshan";
    }
}

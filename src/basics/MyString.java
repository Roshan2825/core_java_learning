package basics;

import java.util.ArrayList;
import java.util.Arrays;

public class MyString {
    public static void main(String[] args) {
        String abc="arthc\'Sa Very good \\boy";
        String cde="oo\"o\"o";
        System.out.println(abc.length());
        System.out.println(abc.toUpperCase());
        System.out.println(abc.toLowerCase());
        System.out.println(abc.indexOf("Very"));
        System.out.println(abc.concat(cde));
        System.out.println((Math.max(abc.length(), cde.length())));
        System.out.println(Math.min(6, 5));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.abs(-81.4));
        System.out.println(Math.random());

        //formatter,specify how many decimal places
        float num=8.1234567f;
        System.out.printf("the value after 2decimal places is %.2f",num);
        System.out.printf("the value of pi 3decimal places is %.3f",Math.PI);
        System.out.printf("i am %s and my roll no is %d","karthick",06);

        //operators
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println("a"+1);
        System.out.println('a'+1);
        System.out.println('a'+'b'+"karthick");
        System.out.println("karthick"+Arrays.toString(new int[]{1,2,3}));
        System.out.println("karthick"+Integer.valueOf(3));
        System.out.println("karthick"+ new ArrayList<>(Arrays.asList(1,2,3)));
        
        // + can be used when one of the operands is string
        // and for primitive data types it performs addition
        // if both operands are string it performs concatenation 
        System.out.println(Integer.valueOf(5) + "" +new ArrayList<>(Arrays.asList(1,2,3)));

        //alphabets
        String alphabets="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            alphabets=alphabets+ch;
        }
        System.out.println(alphabets);

        StringBuilder alphabet=new StringBuilder();
        for(int j=0;j<26;j++){
            char ch=(char)('a'+j);
            alphabet.append(ch);
        }
        System.out.println(alphabet);
        alphabet.reverse();
        System.out.println(alphabet);

        String palindrome="abcdedcba";
        StringBuilder palin=new StringBuilder(palindrome);
        palin.reverse();
        if(palindrome.equals(palin.toString())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}

package oops.oops2;

public class Singleton {
    private Singleton (){//make Constructor private so no others can access it 
    }
    private static Singleton instance;

    public static Singleton getInstance(){//func to return instance
        if(instance==null)
            instance=new Singleton();
        return instance;    
    }
}
//for a class only one instance can be created
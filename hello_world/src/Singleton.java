public class Singleton {
    // ClassicSingletons are classes which can only be instantiated once,
    // Useful for cases like DB connections etc
    public static void main(String[] args) {
        ClassicSingleton singleton = ClassicSingleton.getInstance();
        ClassicSingleton singleton1 = ClassicSingleton.getInstance();

    }
    
}

class ClassicSingleton{
    private static ClassicSingleton instance = null;
    private ClassicSingleton() {
    // Exists only to defeat instantiation.
    }
    public static ClassicSingleton getInstance() {
    if(instance == null) {
        System.out.print("Creating first object\n");
        instance = new ClassicSingleton();
    }
    else{
        System.out.print("One instance already exists\n"); 
    }
    return instance;
    } 
}
   
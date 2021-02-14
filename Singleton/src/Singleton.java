public class Singleton {
    private static Singleton instance;

    private Singleton(){

    }

    public synchronized static Singleton getSingletonInstance(){
        if(instance == null){
            System.out.println("Creating singleton instance");
            instance = new Singleton();
            return instance;
        }
        return instance;
    }
}

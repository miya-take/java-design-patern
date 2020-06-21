public class Main {
    public static void main(String[] args){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2){
           System.out.println("instance1 and instance2 are the same instance ");
        } else {
           System.out.println("instance1 and instance2 are not the same instance ");
        }
    }
}

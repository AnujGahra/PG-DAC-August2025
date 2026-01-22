public class StaticMethods {

    static String name = "Anuj Gahra";
    

    public void me(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        
        StaticMethods sm = new StaticMethods();
        sm.me();
    }
}

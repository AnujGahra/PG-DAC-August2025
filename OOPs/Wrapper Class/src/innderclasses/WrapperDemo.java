package innderclasses;
public class WrapperDemo {
    public static void main(String[] args) {
        int a = 5;
        Integer obj = Integer.valueOf(a);   // manual boxing
        int b = obj.intValue();             // manual unboxing

        // autoboxing and unboxing
        Integer autoObj = a;    // autoboxing
        int c = autoObj;        // unboxing

        System.out.println("Original int: " + a);
        System.out.println("Wrapper Integer: " + obj);
        System.out.println("Unboxed int: " + b);
        System.out.println("Auto-boxed Integer: " + autoObj);
        System.out.println("Auto-unboxed int: " + c);
    }
}

public class StringIntConversion {
    

    public static void main(String[] args) {
        String str = "12345";
        int number = Integer.parseInt(str);
        int number2 = Integer.valueOf(str);
        System.out.println(number2);


        int num = 12345;
        String str1 = Integer.toString(num);
        System.out.println(str1);

    }
}


class MyClass {
static int count = 5;
static void show() {
// Accessing without class name
System.out.println(count);
showMessage();
}
static void showMessage() {
System.out.println("Static method called!");
}
public static void main(String[] args) {
show(); // Also valid: MyClass.show();
}
}
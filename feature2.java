/*Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created
*/
package exe4;

public class feature2 {

    static void display() {
        int a = 5;
        int b = 10;
        int mul = a * b;
        System.out.println("Static method returns multiplication:" + mul);
    }

    void display2() {
        int a = 30;
        int b = 20;
        int sum = a + b;
        int sub = a - b;
        System.out.println("Instance add method returns sum:" + sum + "and returns substraction:" + sub);

    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        MethodReferenceInterface methodreferenceinterface = feature2::display;
        methodreferenceinterface.print();

        feature2 methodreference = new feature2();
        MethodReferenceInterface methodreferenceinterface1 = methodreference::display2;
        methodreferenceinterface1.print();
    }
}

interface MethodReferenceInterface {
    void print();
}

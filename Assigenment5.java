/* Implement multiple inheritance with default method inside interface. 
*/

package exe4; 
interface Clickable {
    default void click() {
        System.out.println("click");
    }
}

interface Accessible {
    default void access() {
        System.out.println("access");
    }
}

public class Assigenment5 implements Clickable, Accessible {

    public static void main(String[] args) {
        Assigenment5 button = new Assigenment5();
        button.click();
        button.access();
    }
}
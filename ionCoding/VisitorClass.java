package ionCoding;

public class VisitorClass {
    private static VisitorClass singleton = new VisitorClass(); //early initilisation
    private static volatile VisitorClass singleton1; //lazy initilisation


    private VisitorClass() {
        // getSingleton();
    }

    public static VisitorClass getSingleton1() {

        if (singleton1 == null) {
            synchronized (VisitorClass.class) {

                if (singleton1 == null) {
                    return new VisitorClass();
                }

            }
        }
        return singleton1;
    }


    public static VisitorClass getSingleton() {
        return singleton;


    }
}

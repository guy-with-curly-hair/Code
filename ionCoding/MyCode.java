package ionCoding;// package whatever; // don't place package name!
// Installed Libraries: JSON-Simple, JUNit 4, Apache Commons Lang3

import java.util.Objects;

class MyCode {

    public static void main(String[] args) {
        printSomething();

        Animal1 a1 = new Animal1();
    }

    static void printSomething() {

        String s = "";
        for (int i = 1; i < 10; i++) {
            //for (int j = 0; j < i; j++) {
                s=s+"*";
                System.out.println(s);
                //System.out.print("*");
            //}
            //System.out.println("");
        }
    }

    public final static class Animal {

        private final int numberOfLegs;

        private final String color;

        public Animal(int numberOfLegs, String color) {
            this.numberOfLegs = numberOfLegs;
            this.color = color;
        }

        //
        public int getNumberOfLegs() {
            return numberOfLegs;
        }

        /* //public void setNumberOfLegs(int numberOfLegs) {
             this.numberOfLegs = numberOfLegs;
         }
 */
        public String getColor() {
            return color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return numberOfLegs == animal.numberOfLegs &&
                    Objects.equals(color, animal.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(numberOfLegs, color);
        }
/*
        public void setColor(String color) {
            this.color = color;
        }
*/

    }

    public static class Animal1 {

        int numberOfLegs;

        String color;

        Object ob = new Object();
        //

        public int getNumberOfLegs() {
            return numberOfLegs;
        }

        //break 1
        public void setNumberOfLegs(int numberOfLegs) {
            synchronized (Animal1.class) {
                this.numberOfLegs = numberOfLegs;
            }
        }

        public String getColor() {
            return color;
        }

        //breakpoint2
        public void setColor(String color) {
            synchronized (ob) {
                this.color = color;
            }
        }

        //breakpoint
        @Override
        public String toString() {
            synchronized (ob) {
                return "Animal1{" +
                        "numberOfLegs=" + numberOfLegs +
                        ", color='" + color + '\'' +
                        '}';
            }
        }

    }
}


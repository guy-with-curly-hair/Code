package ionCoding;

class Animal1 {

        int numberOfLegs;

        String color;
        //

        public int getNumberOfLegs() {
            return numberOfLegs;
        }

        //break 1
        public void setNumberOfLegs(int numberOfLegs) {
            synchronized (this) {
                this.numberOfLegs = numberOfLegs;
            }
        }

        public String getColor() {
            return color;
        }

        //breakpoint2
        public void setColor(String color) {
            synchronized (Animal1.class) {
                this.color = color;
            }
        }

        //breakpoint
        @Override
        public String toString() {
            synchronized (this) {
                return "Animal1{" +
                        "numberOfLegs=" + numberOfLegs +
                        ", color='" + color + '\'' +
                        '}';
            }
        }

    }
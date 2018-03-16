
class Scratch {

        public static void main(String[] args) {
            double a = 3;
            double b = 2.5;
            double c = -0.5;

            double d = b * b - 4 * a * c;
            if (d >= 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);

                if (a != 0) {
                    System.out.println("x1=" + x1);
                    System.out.println("x2=" + x2);
                }
                if (a == 0 & c == 0 & b != 0) {
                    System.out.println("x1=" + a);
                    System.out.println("x2=" + a);
                }
                if (a == 0 & c != 0 & b != 0) {
                    System.out.println("x1=");
                    System.out.println("x2=");
                }
                if (a == 0 & b == 0 & c == 0) {
                    System.out.println("x1=");
                    System.out.println("x2=");
                }
                if (a == 0 & b == 0 & c != 0) {
                    System.out.println("x1=");
                    System.out.println("x2=");
                }
            } else {
                System.out.println("x1=");
                System.out.println("x2=");
            }


        }
    }


public class Fibonacci {

    public long getNumber(int position){
        if (position<1) return -1;
        if (position<=2) return 1;
        return getNumber(position-1)+getNumber(position-2);
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println("f(9)="+fib.getNumber(9));
    }
}
      
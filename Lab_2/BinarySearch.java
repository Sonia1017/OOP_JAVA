public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;
        int len = data.length;
        boolean flag = false;
        int i;

        for (i = 0; i < len; i++) {
            if (data[i] == numberToFind) {
                flag = true;
                break;
            }
        }

        if (flag == true)
            System.out.println(i);
        else
            System.out.println("-1");

        // PUT YOUR CODE HERE

        // PUT YOUR CODE HERE
    }
}
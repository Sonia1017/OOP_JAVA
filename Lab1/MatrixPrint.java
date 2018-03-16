public class MatrixPrint { public static void main(String args[]){ int ki = 5; int kj = 5; String[][] array = new String [][]{

        {" * "," 2 "," 3 "," 4 "," * "},
        {" 6 "," * "," 8 "," * ","10 "},
        {"11 ","12 "," * ","14 ","15 "},
        {"16 "," * ","18 "," * ","20 "},
        {" * ","22 ","23 ","24 "," * "}};

    for (int i = 0; i < ki; i++) {
        for (int j = 0; j <kj; j++) {
            System.out.print(array[i][j]);

        }
        System.out.println();
    }
}
}

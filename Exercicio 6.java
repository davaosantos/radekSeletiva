package main;

public class radek {
    public static void main(String[] args) {

        int index;

        for (index = 0; index < 100; index++) {

            if (index % 3 == 0) {
                if (index % 3 == 0 && index % 5 == 0) {
                    System.out.println("FooBaa\n");
                } else {
                    System.out.println("Foo\n");
                }
            } else if (index % 5 == 0) {
                System.out.println("Baa\n");
            } else {
                System.out.println(index + "\n");
            }
        }
    }
}

class Kerstboom {

    public static void printStars(int number) {
        int stars = 0;
        while (number > stars) {
            System.out.print("*");
            stars++;

        }
        //System.out.println("");// part 1 of the exercise

    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int spaces = 0;
        while (number < spaces) {
            System.out.print(" ");
            spaces--;

        }
        //System.out.println("");
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int stars = 0;
        while (size > stars) {
            printStars(stars);

            System.out.println("");
            printSpaces(stars - size);

            stars++;
        }
    }

    public static void christmasTree(int height) {
        int stars = 0;
        while (height > stars) {
            printStars(stars);

            printStars(stars - 1);
            System.out.println("");
            printSpaces(stars - height);
            stars++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.



        printSpaces(9);
        System.out.println(" ");
        printStars(5);
        printTriangle(10);

        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

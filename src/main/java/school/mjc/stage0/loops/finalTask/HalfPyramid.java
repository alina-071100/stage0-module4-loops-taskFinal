package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = i; j < cathetusLength-1; j++) {
                System.out.print(" ");
                }
            for (int k = 0; k <=i  ; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
        }


    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}

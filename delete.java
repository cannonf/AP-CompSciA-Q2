public class delete {
    public static void main(String[] args) {
        // define the range
        int max = 100;
        int min = 50;
        int range = max - min + 1;

        // generate random numbers within 1 to 10
        // for (int i = 0; i < 10; i++) {
        int rand = (int) (Math.random() * range);
        double randy = Math.random();
        double g = randy * range;
        double f = g + min;

        int randyy = (int) Math.random();

        // Output is different everytime this code is executed
        System.out.println(randy);
        System.out.println(g);
        System.out.println(f);

        // }

    }
}
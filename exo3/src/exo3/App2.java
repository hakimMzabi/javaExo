package exo3;

public class App2 {
    public static void main(String[] args) {
        String[] array = {"123","drt","534"};
        System.out.println("the average is " + countAverage(array) + ".");
    }

    public static double countAverage(String[] array) {
        double sum = 0;
        int length = 0;
        double average;

        for (int i = 0; i < array.length; i++) {
            try {
                double value = Integer.parseInt(array[i]);
                sum += value;
                length++;

            } catch (NumberFormatException e) {
                System.out.println("there are somme format value inccorect");
            }
        }
        average = sum / length;

        return average;
    }
}




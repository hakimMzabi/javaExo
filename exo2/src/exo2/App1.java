package exo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;


public class App1 {

    public static void main(String[] args) {
        Instant start = Instant.now();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("exo2/test.txt"));
            String line = reader.readLine();

            while (line != null) {
                String[] values = line.split(":");
                String name = values[0];
                String grade = values[1];
                names.add(name);
                grades.add(Integer.parseInt(grade));
                line = reader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / names.size();

        System.out.println("The average is " + average + ".");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String userName = scanner.next();
        scanner.close();

        boolean found = false;

        for (int i = 0; i < names.size(); i += 1) {
            if (userName.equals(names.get(i))) {
                found = true;
                System.out.println("The grade of " + userName + " is " + grades.get(i) + ".");
                break;
            }
        }

        if (!found) {
            System.out.println("No person named \"" + userName + "\" founded.");
        }

        Duration duration = Duration.between(start, Instant.now());
        System.out.println("Execution time is : " + duration.toMillis() + " " + "ms.");
    }
}

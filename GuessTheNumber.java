import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int answer;
        int count = 1;
        int value = random.nextInt(100) + 1;

        do {
            System.out.println("Угадайте число, которое загадал компьютер. Попытка №" + count);
            answer = input.nextInt();
            if (answer < value) {
                System.out.println("Не угадали, ваше число меньше загаданного");
            } else if (answer > value) {
                System.out.println("Не угадали, ваше число больше загаданного");
            }
            count++;
        } while (answer != value);

        input.close();
        System.out.println("Победа! Вы угадали число!");
    }
}
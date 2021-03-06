import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    guessMyNumber(1,100);
  }

  public static void guessMyNumber(int low, int high) {
    int solution = (int) (Math.random() * (high - low + 1)) + low;
    play(low, high, solution);
  }

  public static void play(int low, int high, int solution) {
    Scanner scan = new Scanner(System.in);
    int guess = -1;

    while (guess != solution) {
      while (guess > high || guess < low) {
        System.out.print("Please guess a number between " + low + " and " + high + ": ");
        guess = getGuess(scan);
      }
      if (guess > solution) {
        System.out.println("LOWER!");
        play(low, guess - 1, solution);
      } else if (guess < solution) {
        System.out.println("HIGHER!");
        play(guess + 1, high, solution);
      } else {
        System.out.println("YAY MAJAY!  You got it!");
      }
    }

    scan.close();
  }

  public static int getGuess(Scanner scan) {
    return scan.nextInt();
  }
}

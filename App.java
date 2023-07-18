import Packeges.Game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine().trim();

        Game game = new Game(playerName);
        game.play();
        scanner.close();
    }
}

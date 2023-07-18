package Packeges;

import Packeges.Move;

import java.util.Scanner;

public class Player {
    private String name;
    private Move move;
    private Scanner scanner = new Scanner(System.in);
    public Player(String name) {
        this.name = name;
    }
    public Player(){
        this.name = "Computer";
    }
    public String getName() {
        return name;
    }
    public void makeMove(){
        if (name.equals("Computer")){
            Move[] moves = Move.values();
            int randomIndex = (int) (Math.random() * moves.length);
            move = moves[randomIndex];
        } else {
            System.out.println("Enter your move (rock, paper, scissors): ");
            String input = scanner.nextLine().trim().toUpperCase();
            move = Move.valueOf(input);
        }
    }
    public Move getMove(){
        return move;
    }
}

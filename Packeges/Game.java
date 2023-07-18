package Packeges;

public class Game {
    private Player player;
    private Player computer;
    public Game(String playerName){
        player = new Player(playerName);
        computer = new Player();
    }
    public void play(){
        do{
            player.makeMove();
            computer.makeMove();
            System.out.println(player.getName() + " chose " + player.getMove());
            System.out.println("Computer chose " + computer.getMove());
            int result = player.getMove().compareTo(computer.getMove());
            if (result == 0) {
                System.out.println("It`s a draw! Let`s replay.\n");
            } else if (result < 0) {
                System.out.println(computer.getName() + " wins!\n");
            } else {
                System.out.println(player.getName() + " wins!\n");
            }
        } while (player.getMove().equals(computer.getMove()));
    }
}

package example2;

public class MarblePlayMain {

	public static void main(String[] args) {
		
		Player player1 = new Player("Olivia", 15);  // Olivia has 15 marbles now
		Player player2 = new Player("Jason", 9);    // Jason has 9 marbles now
		
		player1.showPlayer();
		player2.showPlayer();
		
		
		System.out.println("Let's play game!");
		System.out.println("================");
		

		player1.marblePlay(player2, 2);       // Oliva got 2 marbles from Jason who lost 2 marbles
		player2.marblePlay(player1, 9);       // Jason got 9 marbles from Oliva who lost 9 marbles 
		
		player1.showPlayer();                 // To show how many marbles they have now
		player2.showPlayer();
		
	}

}

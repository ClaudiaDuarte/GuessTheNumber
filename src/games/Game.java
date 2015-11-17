package games;

public class Game {
	
	private int number;
	Player player1 = new Player();
	Player player2 = new Player();
	Player player3 = new Player();
	
	
	public Game() {
		this.number = generateNumber();
	}

	private int generateNumber(){

		return (int)(Math.random() *10);
	}
	
	public void compareNumbers(){
		while(player1.getHint()!=number && player2.getHint()!=number && player3.getHint()!=number ){
			System.out.println("What's your hint?");
			player1.generateHint(); player2.generateHint();player3.generateHint();
			System.out.println("Player 1: "+ player1.getHint() + 
					" Player 2: "+player2.getHint() + " Player 3: "+ player3.getHint());
		}
		
		if (player1.getHint() == number) {
			System.out.println("The choosen number is "+number+" and the hint of Player 1 is right!");
		} else if (player2.getHint() == number ){
			System.out.println("The choosen number is "+number+" and the hint of Player 2 is right!");
		}else {
			System.out.println("The choosen number is "+number+" and the hint of Player 3 is right!");
		}
	}

}

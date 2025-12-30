import java.util.*;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Snake and Ladder game");
		System.out.println("Start position is 0");
		int player1position = 0,player2position=0,dicecount=0;
		boolean chance=true;
		while (player1position < 100 && player2position<100) {
			if(chance) {
				int pos[]=play("Player 1",player1position,dicecount);
				player1position=pos[0];
				dicecount=pos[1];
				chance=false;
			}
			else {
				int pos[]=play("Player 2",player2position,dicecount);
				player2position=pos[0];
				dicecount=pos[1];
				chance=true;
			}
		}
		if(player1position==100) {
			System.out.println("Player 1 won");
		}
		else {
			System.out.println("Player 2 won");
		}
		System.out.println("Dice Count: "+ dicecount);
	}
	
	
	
	static int[]play(String player,int position,int dicecount){
		int []pos=new int[2];
		while (true) {
			int diceNumber = (int) (Math.random() * 6) + 1;
			dicecount++;
			System.out.println(player+" Dice Number " + diceNumber);

			int option = (int) (Math.random() * 3) + 1;
			if (option == 1 || (position + diceNumber)>100) {
				System.out.println("No Play Stay at "+ position);
				break;
			} 
			else if (option == 2) {
				position += diceNumber;
				System.out.println("Ladder Move to " + position);
				if(position==100) {
					break;
				}
				else {
					continue;
				}
			} 
			else {
				position -= diceNumber;
				if (position < 0) {
					position = 0;
				}
				System.out.println("Snake Return to " + position);
				break;
			}					
	   }
		pos[0]=position;
		pos[1]=dicecount;
		return pos;
   }
}

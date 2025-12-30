import java.util.*;
public class SnakeAndLadder {
	public static void main(String []args) {
		System.out.println("Snake and Ladder game");
		System.out.println("Start position is 0");
		int position=0;
		
		int diceNumber = (int)(Math.random()*6)+1;
		System.out.println("Dice Number "+  diceNumber);
		
		int option = (int)(Math.random()*3)+1;
		if(option==1) {
			System.out.println("No Play ");
		}
		else if(option==2) {
			position+=diceNumber;
			System.out.println("Ladder Move to "+ position);
		}
		else {
			position-=diceNumber;
			System.out.println("Snake Move to "+ position);
		}
	}
}

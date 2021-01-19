import java.lang.Thread;
import java.util.Scanner;

public class singlePlayer{

	public static Scanner sc = new Scanner(System.in);
	public static boolean gameOver = false;
	public static String[] currBoard;

	public void play(String[] board) throws InterruptedException{
		int random = (int)(Math.random() * 50 + 1);
		currBoard = board;

		printBoard();

		print("Picking who goes first");
		Thread.sleep(400);
		print(".");
		Thread.sleep(400);
		print(".");
		Thread.sleep(400);
		print(".");
		Thread.sleep(400);
		print(".");
		Thread.sleep(600);
		println("\n");

		if(random > 25){
			println("You will be going first");
			println();
			println("+++++++++");
			println("*********");
			println("+++++++++");
			println();
			playerMove();
		}else{
			println("The computer has the first move");
			compMove();
		}
	}

	public static void playerMove() throws InterruptedException{
		if(gameOver == false){
			print("Where would you like to move (1-9)? ");
			int move = sc.nextInt();
			while(true){
				if(currBoard[move-1].equals(" ")){
					currBoard[move-1] = "X";
					break;
				} else{
					print("Already Taken, try again: ");
					move = sc.nextInt();
				}
			}
			printBoard();
			checkForWinner();
			if(gameOver == false)
				compMove();
		}
	}

	public static void compMove()  throws InterruptedException{
		if(gameOver == false){


			print("Thinking");
			Thread.sleep(400);
			print(".");
			Thread.sleep(400);
			print(".");
			Thread.sleep(400);
			print(".");
			Thread.sleep(400);
			print(".");
			Thread.sleep(600);
			println("\n");


			int random = (int)(Math.random() * 9 + 1);

			while(true){
				if(currBoard[random-1].equals(" ")){
					currBoard[random-1] = "O";
					break;
				} else{
					random = (int)(Math.random() * 9 + 1);
				}
			}
			printBoard();
			checkForWinner();
			if(gameOver == false)
				playerMove();
		}
	}

	public static void checkForWinner(){
		// Horizontal Winning Moves
		if(currBoard[0] == currBoard[1] && currBoard[1] == currBoard[2]){
			if(currBoard[0].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
		} else if(currBoard[3] == currBoard[4] && currBoard[4] == currBoard[5]){
			if(currBoard[3].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
			} else if(currBoard[3].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
		} else if(currBoard[6] == currBoard[7] && currBoard[7] == currBoard[8]){
			if(currBoard[8].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
			} else if(currBoard[8].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
		}
		// Vertical Winning Moves
		else if(currBoard[0] == currBoard[3] && currBoard[3] == currBoard[6]){
			if(currBoard[0].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
		} else if(currBoard[1] == currBoard[4] && currBoard[4] == currBoard[7]){
			if(currBoard[1].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
			} else if(currBoard[1].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
		} else if(currBoard[2] == currBoard[5] && currBoard[5] == currBoard[8]){
			if(currBoard[8].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
			} else if(currBoard[8].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
		}
		// Diagonal Winning Moves
		else if(currBoard[0] == currBoard[4] && currBoard[4] == currBoard[8]){
			if(currBoard[0].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
		} else if(currBoard[2] == currBoard[4] && currBoard[4] == currBoard[6]){
			if(currBoard[1].equals("X")){
				gameOver = true;
				println("Congratulations you Won!!!");
			} else if(currBoard[1].equals("O")){
				gameOver = true;
				println("Sorry you lost, please try again");
			}
		} 
	}


	private static void printBoard(){
		println();
		println("+++++++++");
		println("*********");
		println("+++++++++");
		println();
		println(currBoard[0] + " | " + currBoard[1] + " | " + currBoard[2]);
		println("--+---+--");
		println(currBoard[3] + " | " + currBoard[4] + " | " + currBoard[5]);
		println("--+---+--");
		println(currBoard[6] + " | " + currBoard[7] + " | " + currBoard[8]);
		println();
		println("+++++++++");
		println("*********");
		println("+++++++++");
		println();
	}










	private static void print(String phrase){
		System.out.print(phrase);
	}
	private static void print(){
		System.out.print("");
	}
	private static void println(String phrase){
		System.out.println(phrase);
	}
	private static void println(){
		System.out.println("");
	}



}
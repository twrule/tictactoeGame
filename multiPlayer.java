import java.util.Scanner;

public class multiPlayer{

	public static Scanner sc = new Scanner(System.in);
	public static boolean gameOver = false;
	public static String[] currBoard;
	public static String playerOne;
	public static String playerTwo;

	public void play(String[] board) throws InterruptedException{
		print("Player 1, what's your name? ");
		playerOne = sc.next();
		println("What's up " + playerOne + "! It is lovely to meet you.");

		print("Player 2, what is your name? ");
		playerTwo = sc.next();
		println("Right on " + playerTwo + ".  Hope you're ready to win!");


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
			println(playerOne + ", you're going first!");
			println();
			println("+++++++++");
			println("*********");
			println("+++++++++");
			println();
			firstPlayerMove();
		}else{
			println(playerTwo + ", you're up!");
			println();
			println("+++++++++");
			println("*********");
			println("+++++++++");
			println();
			secondPlayerMove();
		}
	}

	public static void firstPlayerMove(){
		if(gameOver == false){
			print("Where would you like to move (1-9)? ");
			int move = sc.nextInt();
			while(true){
				if(currBoard[move-1].equals(" ")){
					currBoard[move-1] = "X";
					break;
				} else{
					print("Already taken, try again: ");
					move = sc.nextInt();
				}
			}
			printBoard();
			checkForWinner();
			if(gameOver == false)
				secondPlayerMove();
		}
	}

	public static void secondPlayerMove(){
		if(gameOver == false){
			print("Where would you like to move (1-9)? ");
			int move = sc.nextInt();
			while(true){
				if(currBoard[move-1].equals(" ")){
					currBoard[move-1] = "O";
					break;
				} else{
					print("Already taken, try again: ");
					move = sc.nextInt();
				}
			}
			printBoard();
			checkForWinner();
			if(gameOver == false)
				firstPlayerMove();
		}
	}

	public static void checkForWinner(){
		// Horizontal Winning Moves
		if(currBoard[0] == currBoard[1] && currBoard[1] == currBoard[2]){
			if(currBoard[0].equals("X")){
				gameOver = true;
				println("Congratulations " + playerOne + ", You Won!!!");
				println(playerTwo + ", it sucks to be you");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Heck Ya " + playerTwo + "! Good job winning!!!");
				println(playerOne + " you need to work on your gameplay.");
			}
		} else if(currBoard[3] == currBoard[4] && currBoard[4] == currBoard[5]){
			if(currBoard[3].equals("X")){
				gameOver = true;
				println("Congratulations " + playerOne + ", You Won!!!");
				println(playerTwo + ", it sucks to be you");
			} else if(currBoard[3].equals("O")){
				gameOver = true;
				println("Heck Ya " + playerTwo + "! Good job winning!!!");
				println(playerOne + " you need to work on your gameplay.");
			}
		} else if(currBoard[6] == currBoard[7] && currBoard[7] == currBoard[8]){
			if(currBoard[8].equals("X")){
				gameOver = true;
				println("Congratulations " + playerOne + ", You Won!!!");
				println(playerTwo + ", it sucks to be you");
			} else if(currBoard[8].equals("O")){
				gameOver = true;
				println("Heck Ya " + playerTwo + "! Good job winning!!!");
				println(playerOne + " you need to work on your gameplay.");
			}
		}
		// Vertical Winning Moves
		else if(currBoard[0] == currBoard[3] && currBoard[3] == currBoard[6]){
			if(currBoard[0].equals("X")){
				gameOver = true;
				println("Congratulations " + playerOne + ", You Won!!!");
				println(playerTwo + ", it sucks to be you");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Heck Ya " + playerTwo + "! Good job winning!!!");
				println(playerOne + " you need to work on your gameplay.");
			}
		} else if(currBoard[1] == currBoard[4] && currBoard[4] == currBoard[7]){
			if(currBoard[1].equals("X")){
				gameOver = true;
				println("Congratulations " + playerOne + ", You Won!!!");
				println(playerTwo + ", it sucks to be you");
			} else if(currBoard[1].equals("O")){
				gameOver = true;
				println("Heck Ya " + playerTwo + "! Good job winning!!!");
				println(playerOne + " you need to work on your gameplay.");
			}
		} else if(currBoard[2] == currBoard[5] && currBoard[5] == currBoard[8]){
			if(currBoard[8].equals("X")){
				gameOver = true;
				println("Congratulations " + playerOne + ", You Won!!!");
				println(playerTwo + ", it sucks to be you");
			} else if(currBoard[8].equals("O")){
				gameOver = true;
				println("Heck Ya " + playerTwo + "! Good job winning!!!");
				println(playerOne + " you need to work on your gameplay.");
			}
		}
		// Diagonal Winning Moves
		else if(currBoard[0] == currBoard[4] && currBoard[4] == currBoard[8]){
			if(currBoard[0].equals("X")){
				gameOver = true;
				println("Congratulations " + playerOne + ", You Won!!!");
				println(playerTwo + ", it sucks to be you");
			} else if(currBoard[0].equals("O")){
				gameOver = true;
				println("Heck Ya " + playerTwo + "! Good job winning!!!");
				println(playerOne + " you need to work on your gameplay.");
			}
		} else if(currBoard[2] == currBoard[4] && currBoard[4] == currBoard[6]){
			if(currBoard[1].equals("X")){
				gameOver = true;
				println("Congratulations " + playerOne + ", You Won!!!");
				println(playerTwo + ", it sucks to be you");
			} else if(currBoard[1].equals("O")){
				gameOver = true;
				println("Heck Ya " + playerTwo + "! Good job winning!!!");
				println(playerOne + " you need to work on your gameplay.");
			}
		}

		println();
		println(); 
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
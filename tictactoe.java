import java.util.Scanner;
public class tictactoe{

	public static Scanner sc = new Scanner(System.in);
	public static String[] currBoard = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

	public static void main(String[] args) throws InterruptedException{
		String gameMode = welcomeMessage();
		printBoard();
		resetBoard();

		if(gameMode.equals("s")){
			singlePlayer sing;
			sing = new singlePlayer();
			sing.play(currBoard);
		}
		else{
			multiPlayer mult;
			mult = new multiPlayer();
			mult.play(currBoard);
		}

	}

	private static void singlePlayer(){
		int random = (int)(Math.random() * 50 + 1);
		println("Welcome to Single Player Mode!");


	}

	private static String welcomeMessage(){
		String singOrMult;
		println("Welcome to tic-tac-toe");
		print("Would you like to play Solo[S] or Multiplayer[M]: ");
		singOrMult = sc.next();

		while(!(singOrMult.equalsIgnoreCase("S") || singOrMult.equalsIgnoreCase("M"))){
			println("Oops! Invalid entry!");
			print("Please enter 'S' for single player or 'M' for multiplayer: ");
			singOrMult = sc.next();
		}
		
		return singOrMult.toLowerCase();
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

	public static void printBoard(String[] board){
		println();
		println("+++++++++");
		println("*********");
		println("+++++++++");
		println();
		println(board[0] + " | " + board[1] + " | " + board[2]);
		println("--+---+--");
		println(board[3] + " | " + board[4] + " | " + board[5]);
		println("--+---+--");
		println(board[6] + " | " + board[7] + " | " + board[8]);
		println();
		println("+++++++++");
		println("*********");
		println("+++++++++");
		println();
	}

	private static void resetBoard(){
		for(int i = 0; i < 9; i++){
			currBoard[i] = " ";
		}
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
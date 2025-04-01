import java.util.Scanner;

//To Create the Board
public class Main{
    public char[][] board;
    public char player;
    //Constructor to initialize the board
    public Main(){
        board=new char[][]{
            {'-','-','-'},
            {'-','-','-'},
            {'-','-','-'}
        };
        player='X';
    }

//To Print the Board
public void printBoard(){
        for(char row[]:board){
            for(char cell:row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }
}

//To check whether it is a valid move
public boolean isValidMove(int row, int col){
    return row>=0&&row<3 && col>=0&&col<3 && board[row][col]=='-';
}


//Check whether it is win
public boolean checkWin(char player){
    for(int i=0;i<3;i++){
        if((board[i][0]==player && board[i][1]==player && board[i][2]==player) || board[0][i]==player && board[1][i]==player &&board[2][i]==player){
            return true;
        }
    }
        return ((board[0][0]==player && board[1][1]==player && board[2][2]==player)||board[2][0]==player && board[1][1]==player && board[0][2]==player);
}

//Check whether it is draw
public boolean isBoardFull(){
    for(char row[]: board){
        for(char cell: row){
            if(cell=='-')
                return false;
        }
    }
    return true;
}

//Change the Player turn
public void switchPlayer(){
    player=(player=='X')?'O':'X';
}

//Loop the Game
public void playGame(){
    Scanner sc=new Scanner(System.in);
    boolean running=true;
    System.out.println("Welcome to Tic Tac Toe Game!!!");
    System.out.println();
    printBoard();
    
    while(running){
        System.out.println();
        System.out.println("Player "+player+" enter row and column seperated by space between 0 - 2");
        int row=sc.nextInt();
        int col=sc.nextInt();
        if(isValidMove(row,col)){
            board[row][col]=player;
            System.out.println();
            printBoard();
            if(checkWin(player)){
                System.out.println("Player "+player+" wins!!!");
                running=false;
            }
            else if(isBoardFull()){
                System.out.println("It's a draw");
                running=false;
            }
            else{
                switchPlayer();
            }
        }
        else{
            System.out.println("Invalid Move. Try Again!!!");
        }
    }
}
    
public static void main(String[] args) {
    Main game=new Main();
    game.playGame();
}
}

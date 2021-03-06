import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
    programmer: Mathew Borg
    Date: 2021-04-8
    Program Name: U2A4P1_Borg_TicTacToe
    Program Discription: This program is a virtual TicTacToe board Game
*/
public class TicTacEvent implements ItemListener, ActionListener, Runnable { //creates a class that responds to mouse and keyboard input by “listening.”
    TicTac gui; //associates the game board with the event.
    Thread playing;
    ImageIcon a = new ImageIcon("src//images//xbox.jpg"); //creats imageicon
    ImageIcon b = new ImageIcon("src//images//ps.jpg"); //creats imageicon
    final ImageIcon back = new ImageIcon("src//images//cardback.jpg"); //creats new image icon with cardback.jpg

    //created to check for a winner.
    int clicks = 0, win = 0, xWins = 0, oWins = 0, catGames = 0, run = 0; //creats ints
    int[][] check = new int[4][4]; //creats a 2d int list
    
    
    public TicTacEvent (TicTac in){ //associates the two files to be used together.
        gui = in;
        //for loops initiates the winner check array.
        for (int row=0; row < check.length; row++){ 
           for (int col=0; col < check[row].length; col++){
               check[row][col]=0; //sets check to 0
           }
       }
       
       
    }
    /*
    Function:   actionPerformed
    Purpose:    This method detects when an action is preformed and does a task based on that action
    Parameters: ActionEvent event to detect an action event 
    Return:     void 
    */
    @Override
    public void actionPerformed(ActionEvent event) { //tells the program what to do when a button is clicked.
        String command = event.getActionCommand(); //takes the button name as input from the button that is clicked.    
        
        
        //checks the command variable and calls the appropriate method.
        if (command.equals("Play")) {
            startPlaying();
        }
        if (command.equals("Reset")) {
            resetGame();
        }
        if (run == 1) { 
            if (command.equals("1")) {
                btn(0, 0);
            }
            if (command.equals("2")) {
                btn(0, 1);
            }
            if (command.equals("3")) {
                btn(0, 2);
            }
            if (command.equals("4")) {
                btn(0, 3);
            }
            if (command.equals("5")) {
                btn(1, 0);
            }
            if (command.equals("6")) {
                btn(1, 1);
            }
            if (command.equals("7")) {
                btn(1, 2);
            }
            if (command.equals("8")) {
                btn(1, 3);
            }
            if (command.equals("9")) {
                btn(2, 0);
            }
            if (command.equals("10")) {
                btn(2, 1);
            }
            if (command.equals("11")) {
                btn(2, 2);
            }
            if (command.equals("12")) {
                btn(2, 3);
            }
            if (command.equals("13")) {
                btn(3, 0);
            }
            if (command.equals("14")) {
                btn(3, 1);
            }
            if (command.equals("15")) {
                btn(3, 2);
            }
            if (command.equals("16")) {
                btn(3, 3);
            }
        } else {
            TicTac.playBtnInstructions.setText("Click Start!!!!");
        }
    }
    /*
    Function:   btn
    Purpose:    to put ether an x or o on the bord when a tile is clicked
    Parameters: int twoDArrayX to add the 2d array x value
                int twoDArrayY to add the 2d array y value
    Return:     void 
    */
    void btn(int twoDArrayX, int twoDArrayY) {
        clicks = clicks + 1; //keeps track of the number of boxes chosen
        if ((clicks % 2) == 1) { //puts an X on the board and declares that square to be taken.
            gui.boxes[twoDArrayX][twoDArrayY].setIcon(a);
            check[twoDArrayX][twoDArrayY] = 1;
        } else { //puts an O on the board and declares that square to be taken.
            gui.boxes[twoDArrayX][twoDArrayY].setIcon(b);
            check[twoDArrayX][twoDArrayY] = 2;
        }
        winner(); //run winner method
  
    }
 
    /*
    Function:   winner
    Purpose:    to check who wone of if there is a tie
    Parameters: N/A         
    Return:     void 
    */
    void winner() {
        /** Check rows for winner */
        
        for (int x=0; x < check.length; x++){ //for loop checks eatch row
            //if statements  checks to see if all entries are X, or all entries are O
           if ((check[x][0]==check[x][1])&&(check[x][0]==check[x][2])&&(check[x][0]==check[x][3])) {
                if (check[x][0]==1) {
                    JOptionPane.showMessageDialog(null, "X Box is the winner"); // creates a pop up box declaring a winner
                    win = 1;
                    xWins = setWinVars(xWins);//calls setWinVars method
                } else if (check[x][0]==2){
                    JOptionPane.showMessageDialog(null, "Play Station is the winner"); //  creates a pop up box declaring a winner.
                    win = 1;
                    oWins = setWinVars(oWins);//calls setWinVars method
                }
            }
        }

        /** Check columns for winner */
        for (int x=0; x < check.length; x++){ //for loop checks each columns
            //if statements  checks to see if all entries are X, or all entries are O
            if ((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])&&(check[0][x]==check[3][x])) {
                if (check[0][x]==1) {
                    JOptionPane.showMessageDialog(null, "X Box is the winner"); // creates a pop up box declaring a winner
                    win = 1; //sets win to 1
                    xWins = setWinVars(xWins);//calls setWinVars method
                } else if (check[0][x]==2) {
                    JOptionPane.showMessageDialog(null, "Play Station is the winner"); //  creates a pop up box declaring a winner.
                    win = 1; //sets win to 1
                    oWins = setWinVars(oWins);//calls setWinVars method
                }
            }
        }

        /** Check diagonals for winner */
        if (((check[0][0]==check[1][1])&&(check[0][0]==check[2][2])&&(check[0][0]==check[3][3]))|| 
                ((check[3][0]==check[1][2])&&(check[1][2]==check[2][1])&&(check[2][1]==check[0][3]))){ // checks for diagonal matches
            if (check[1][1]==1 && check[2][2]==1 || check[1][2]==1 && check[2][1]==1) { //checks for X or O winner.
                JOptionPane.showMessageDialog(null, "X Box is the winner"); //creates a pop up box declaring a winner.
                win = 1; //sets win to 1
                xWins = setWinVars(xWins);//calls setWinVars method
            } else if (check[1][1]==2 && check[2][2]==2 || check[1][2]==2 && check[2][1]==2) {
                JOptionPane.showMessageDialog(null, "Play Station is the winner"); //creates a pop up box declaring a winner.
                win = 1; //sets win to 1
                oWins = setWinVars(oWins);//calls setWinVars method
            }

        }

        /** 
         * Checks if the game is a tie 
         * This structure checks to see if nine boxes have been 
         * chosen (clicks) and that a winner has not been declared (win == 0).
         */
        if ((clicks==16) && (win==0)) {
            JOptionPane.showMessageDialog(null, "The game is a tie"); //creates a pop up box declaring a tie.
            catGames = setWinVars(catGames); //calls setWinVars method
        }
    }
    
    /*
    Function:   outPrint
    Purpose:    to print all our data
    Parameters: N/A         
    Return:     void 
    */
    void outPrint(){
        //Converts ints to strings
        String sXWins = Integer.toString(xWins);
        String sOWins = Integer.toString(oWins);
        String sCatGames = Integer.toString(catGames);

        //sets text feilds
        TicTac.displayXWin.setText("x Wins = " + sXWins);
        TicTac.displayOWin.setText("o Wins = " + sOWins);
        TicTac.displayCatWin.setText("Cat Games = " + sCatGames);
        TicTac.playBtnInstructions.setText("Click Play To Start");
        TicTac.resetBtnInstructions.setText("Reset All Game Data");
        TicTac.author.setText("Game By: Mathew Borg");
    }
    
    /*
    Function:   clearCards
    Purpose:    to set all cars back to defult 
    Parameters: N/A         
    Return:     void 
    */
    void clearCards(){
        for (int x = 0; x < gui.boxes.length; x++) { //for loops intalise 2d array
            for (int y = 0; y < gui.boxes[x].length; y++) {
                gui.boxes[x][y].setIcon(back); //sets all cards to back image
                check[x][y]=0; //sets check to 0
            }
        }
    }
    
    /*
    Function:   setWinVars
    Purpose:    to set vars every time there is a win
    Parameters: N/A         
    Return:     int 
    */
    int setWinVars(int winVar) {
        winVar += 1; //adds 1 to x winVar
        run = 0; //sets run to 0
        gui.play.setEnabled(true); //enables play btn
        return winVar; //returns winVar
    }
    
    /*
    Function:   startPlaying
    Purpose:    to start playing the game
    Parameters: N/A         
    Return:     void 
    */
    void startPlaying() {
        playing = new Thread(this); //the execution of the program. (this – within an instance method or a constructor, this is a reference to the current object.)
        playing.start(); //starts the game
        gui.play.setEnabled(false); //disables the play button
    }
    
    /*
    Function:   resetGame
    Purpose:    reset all stored game data
    Parameters: N/A         
    Return:     void 
    */
    void resetGame() {
        //sets ints to 0
        xWins = 0; 
        oWins = 0;
        catGames = 0;
        run = 0;
        gui.play.setEnabled(true); //enables play btn
        clearCards(); //runs method clearCards
        outPrint(); //runs method outPrint
    }
    
    /*
    Function:   itemStateChanged
    Purpose:    to throw error
    Parameters: N/A         
    Return:     void 
    */
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /*
    Function:   run
    Purpose:    to throw error
    Parameters: N/A         
    Return:     void 
    */
    @Override
    public void run() {
        run = 1; //sets run to 1
        clicks = 0; //sets clicks to 0
        clearCards(); //runs method clearCards0o=
        outPrint(); //runs method outPrint
    }
}

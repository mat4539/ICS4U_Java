
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathew Borg
 */
public class Main extends javax.swing.JFrame {
    private static String [] bookName;
    private static int [] bookNumber;

    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textTitle = new javax.swing.JLabel();
        textAuthor = new javax.swing.JLabel();
        textDescription1 = new javax.swing.JLabel();
        textDescription2 = new javax.swing.JLabel();
        textDescription3 = new javax.swing.JLabel();
        textEnterRefNum = new javax.swing.JLabel();
        inputRefNum = new javax.swing.JTextField();
        btnFindIt = new javax.swing.JButton();
        textLinearSearch = new javax.swing.JLabel();
        textBinarySearch = new javax.swing.JLabel();
        outputLinearSearch = new javax.swing.JTextField();
        outputBinarySearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textTitle.setBackground(new java.awt.Color(0, 0, 0));
        textTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textTitle.setForeground(new java.awt.Color(10, 10, 255));
        textTitle.setText("Children's Classic Books");

        textAuthor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textAuthor.setText("By: Mathew Borg");

        textDescription1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textDescription1.setText("This program will find the title of a book accourding to thr library");

        textDescription2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textDescription2.setText("reference number. The program will use a Binary Search");

        textDescription3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textDescription3.setText("and a Linear Search");

        textEnterRefNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textEnterRefNum.setText("Enter The Reference Number:");

        btnFindIt.setText("Find It!!!");
        btnFindIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindItActionPerformed(evt);
            }
        });

        textLinearSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textLinearSearch.setText("Linear Search:");
        textLinearSearch.setFocusTraversalPolicyProvider(true);

        textBinarySearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textBinarySearch.setText("Binary Search:");

        outputLinearSearch.setEditable(false);

        outputBinarySearch.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textLinearSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputLinearSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textBinarySearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputBinarySearch))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(textAuthor)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textTitle)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textEnterRefNum)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnFindIt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(inputRefNum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(textDescription3)
                        .addGap(179, 179, 179))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDescription1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(textDescription2)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(textTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(textDescription1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textDescription2)
                .addGap(2, 2, 2)
                .addComponent(textDescription3)
                .addGap(18, 18, 18)
                .addComponent(textEnterRefNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputRefNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFindIt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textLinearSearch)
                    .addComponent(outputLinearSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBinarySearch)
                    .addComponent(outputBinarySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindItActionPerformed
        String stringInput = ""; //creats int and sets it to 0
        int intInput = 0;
        
        try{ //trys to convert string input to interger
            stringInput = inputRefNum.getText(); //sets string to inputNum value
            intInput = Integer.parseInt(stringInput); //converts string to int
        } catch (NumberFormatException e) { //catch letters are typed in
            inputRefNum.setText("Enter Numbers Only!!"); //set Text to Enter Numbers Only!!
            return; //retry the program
        }

        inputRefNum.setText(""); //clears input text box

        //Linear
        boolean foundLinear = LinearBinaryCalculator.linearSearch(bookNumber, intInput); //creats boolean and sets its value to the return of linear search method form LinearBinaryCalculator class
        if (foundLinear) { //if found linear is true
            outputLinearSearch.setText(bookName[LinearBinaryCalculator.linearPosition]); //set the outputLinearSearch text feild to book name array at position of the linearPosition var
        }else{ //else
            outputLinearSearch.setText("Book Not Found"); //set the outputLinearSearch text feild to Book not found
        }
        
        //Binary
        boolean foundBinary = LinearBinaryCalculator.binarySearch(bookNumber, intInput); //creats boolean and sets its value to the return of binary search method form LinearBinaryCalculator class
        if (foundBinary) { //if found binary is true 
            outputBinarySearch.setText(bookName[LinearBinaryCalculator.binaryPosition]); //sets the outputBinarySearch text feild to book name array at the position of the binaryPosition var
        }else{ //else
            outputBinarySearch.setText("Book Not Found"); //set the outputBinarySearch text feild to Book not found
        }

    }//GEN-LAST:event_btnFindItActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                getTxt(); //runs the get text method
                new Main().setVisible(true);
            }
        });
    }
    
    /*
    Function: getTxt
    Purpose:  to get data form a text file and set them to the correct arrays
    Parameters: n/a
    Return: n/a 
    */
    public static void getTxt(){        
        //creats array lists of strings (used so we dont need to know the size of the file)
        ArrayList <String> books = new ArrayList <String>();
        ArrayList<String> bookNameTemp = new ArrayList<>();
        ArrayList<String> bookNumTemp = new ArrayList<>();
        
        BufferedReader br = null; //creats a buffer reader br

        try { //trys to 
            br = new BufferedReader(new FileReader("BookList.txt")); //locate the file
            String word; //creats string word
            while ((word = br.readLine()) != null) { //sets word to the first line in the text file and repeats till there is no new lines
                books.add(word); //adds word to the books array list
            }
        } catch (IOException e) { // catch 
            e.printStackTrace(); //makes sure you dont read past the end of the file
        } finally { //finaly 
            try { //try
                br.close(); // to close the file 
            } catch (IOException ex) { //catch
                ex.printStackTrace(); //makes sure you dont read past the end of the file
            }
        }

        String [] bookList = new String[books.size()]; //creats string array and gets the size to the size of books arraylist
        books.toArray(bookList); //converts books array list to array bookList

        //Name
        for (int i = 1; i <= bookList.length; i++) { //for loop to count the size of bookList
            if (i % 2 != 0) { //gets every other value even
                bookNameTemp.add(bookList[i]); //sets every other value of book list to bookNameTmep
            }

        }
        //Number
        for (int j = 0; j <= bookList.length - 1; j++) { //for loop to count the size of bookList
            if (j % 2 == 0) { //gets every other value odd
                bookNumTemp.add(bookList[j]); //sets every other value of book list to bookNumTemp
            }

        }
        
        //adds array lists to appropreate arrays
        //Name
        bookName = new String[bookNameTemp.size()]; //initalises bookName array size 
        bookNameTemp.toArray(bookName); //sets bookNameTemp array list to array book name

        //Number
        String[] sTemp = new String[bookNumTemp.size()]; //creats temp string and inits size
        bookNumTemp.toArray(sTemp); //sets bookNumTemp array list to array sTemp
        bookNumber = new int[sTemp.length]; //initalises bookNumber array size
        for (int i = 0; i < sTemp.length; i++) { //creats for loop of sTemp size
            bookNumber[i] = Integer.parseInt(sTemp[i]); //converts string array sTemp to int array bookNumber
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFindIt;
    private javax.swing.JTextField inputRefNum;
    private javax.swing.JTextField outputBinarySearch;
    private javax.swing.JTextField outputLinearSearch;
    private javax.swing.JLabel textAuthor;
    private javax.swing.JLabel textBinarySearch;
    private javax.swing.JLabel textDescription1;
    private javax.swing.JLabel textDescription2;
    private javax.swing.JLabel textDescription3;
    private javax.swing.JLabel textEnterRefNum;
    private javax.swing.JLabel textLinearSearch;
    private javax.swing.JLabel textTitle;
    // End of variables declaration//GEN-END:variables
}

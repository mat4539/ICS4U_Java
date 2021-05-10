/*
    programmer:         Mathew Borg
    Date:               2021-05-1
    Program Name:       U3A2P1_Borg_Fibonaaci
    Program Discription:This program will use a recursive function to find the 
                        value of the nth Fibonacci number.
*/
public class Main extends javax.swing.JFrame {

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

        titleMain = new javax.swing.JLabel();
        titleAuthor = new javax.swing.JLabel();
        titleFirstNums = new javax.swing.JLabel();
        titleNums = new javax.swing.JLabel();
        titleEnterNum = new javax.swing.JLabel();
        calculateFibonacci = new javax.swing.JButton();
        inputNum = new javax.swing.JTextField();
        outputFibonacciNum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleMain.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titleMain.setForeground(new java.awt.Color(255, 10, 10));
        titleMain.setText("Fibonacci Numbers");
        titleMain.setFocusTraversalPolicyProvider(true);

        titleAuthor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleAuthor.setText("By: Mathew Borg");

        titleFirstNums.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleFirstNums.setText("The First Nine Fibonacci Numbers Are Listed As Follows:");

        titleNums.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleNums.setText("1, 1, 2, 3, 5, 8, 13, 21, 34");

        titleEnterNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleEnterNum.setText("Enter The Fibonacci Number You Would Like To See");

        calculateFibonacci.setText("Find Fibonacci Number");
        calculateFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateFibonacciActionPerformed(evt);
            }
        });

        outputFibonacciNum.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleFirstNums))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(calculateFibonacci))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(inputNum, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleNums)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(outputFibonacciNum, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleEnterNum))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleMain)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleAuthor)
                        .addGap(141, 141, 141))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleMain)
                .addGap(1, 1, 1)
                .addComponent(titleAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleFirstNums)
                .addGap(1, 1, 1)
                .addComponent(titleNums)
                .addGap(18, 18, 18)
                .addComponent(titleEnterNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(calculateFibonacci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputFibonacciNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateFibonacciActionPerformed
        int numInput = 0; //creats int and sets it to 0
        
        try{ //trys to convert string input to interger
            String sTemp = inputNum.getText(); //sets string to inputNum value
            numInput = Integer.parseInt(sTemp); //changes sting to Integer
        }catch(NumberFormatException e){ //catch letters are typed in
            outputFibonacciNum.setText("Enter Numbers Only!!"); //set Text to Enter Numbers Only!!
            return; //retry the program
        }
        
        int fibonacciNumber = nThFibonacciCalculator.nThCalculator(numInput); //creats int and sets it to the retun value of nThCalculator (passes numInput to function)
        
        outputFibonacciNum.setText("Fibonacci Number " + numInput + " is " + fibonacciNumber); //set Text to Enter Numbers Only!!
        
        inputNum.setText(""); //clears input text box

    }//GEN-LAST:event_calculateFibonacciActionPerformed

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
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateFibonacci;
    private javax.swing.JTextField inputNum;
    private javax.swing.JTextField outputFibonacciNum;
    private javax.swing.JLabel titleAuthor;
    private javax.swing.JLabel titleEnterNum;
    private javax.swing.JLabel titleFirstNums;
    private javax.swing.JLabel titleMain;
    private javax.swing.JLabel titleNums;
    // End of variables declaration//GEN-END:variables
}

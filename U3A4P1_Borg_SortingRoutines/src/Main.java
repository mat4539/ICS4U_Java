
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mborg
 */
public class Main extends javax.swing.JFrame {
    int[] test = {10,6,3,8,19,3,1,5};
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

        sortType = new javax.swing.ButtonGroup();
        sortOrder = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        enterInfo = new javax.swing.JLabel();
        sortAlgorithumText = new javax.swing.JLabel();
        sortTypeText = new javax.swing.JLabel();
        ammountNumSort = new javax.swing.JLabel();
        btnSortNum = new javax.swing.JButton();
        originalNumbers = new javax.swing.JLabel();
        sortedNumbers = new javax.swing.JLabel();
        btnSelection = new javax.swing.JRadioButton();
        btnBubble = new javax.swing.JRadioButton();
        btnInsertion = new javax.swing.JRadioButton();
        btnQuick = new javax.swing.JRadioButton();
        btnAscending = new javax.swing.JRadioButton();
        btnDescending = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputOriginalNumbers = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputSortedNumbers = new javax.swing.JTextArea();
        inputNumbersToSort = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(10, 10, 255));
        title.setText("Sorting Routines");

        author.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        author.setText("By: Mathew Borg");

        enterInfo.setText("Enter The following information:");

        sortAlgorithumText.setText("Sorting Algorithm:");

        sortTypeText.setText("Sort Order");

        ammountNumSort.setText("Amount of Numbers to Sort:");

        btnSortNum.setText("Sort Numbers");
        btnSortNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortNumActionPerformed(evt);
            }
        });

        originalNumbers.setText("Original Numbers");

        sortedNumbers.setText("Sorted Numbers");

        sortType.add(btnSelection);
        btnSelection.setText("Selection");

        sortType.add(btnBubble);
        btnBubble.setText("Bubble");

        sortType.add(btnInsertion);
        btnInsertion.setText("Insertion");
        btnInsertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertionActionPerformed(evt);
            }
        });

        sortType.add(btnQuick);
        btnQuick.setText("Quick");

        sortOrder.add(btnAscending);
        btnAscending.setText("Ascending");

        sortOrder.add(btnDescending);
        btnDescending.setText("Desending");

        outputOriginalNumbers.setColumns(20);
        outputOriginalNumbers.setRows(5);
        outputOriginalNumbers.setEnabled(false);
        jScrollPane1.setViewportView(outputOriginalNumbers);

        outputSortedNumbers.setColumns(20);
        outputSortedNumbers.setRows(5);
        outputSortedNumbers.setEnabled(false);
        jScrollPane2.setViewportView(outputSortedNumbers);

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
                                .addComponent(ammountNumSort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputNumbersToSort, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnQuick)
                            .addComponent(btnSelection)
                            .addComponent(btnInsertion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sortAlgorithumText)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sortTypeText)
                                    .addComponent(sortedNumbers)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAscending)
                                    .addComponent(btnDescending)
                                    .addComponent(btnSortNum)))
                            .addComponent(originalNumbers)
                            .addComponent(enterInfo)
                            .addComponent(btnBubble)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(author)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(6, 6, 6)
                .addComponent(author)
                .addGap(18, 18, 18)
                .addComponent(enterInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortAlgorithumText)
                    .addComponent(sortTypeText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelection)
                    .addComponent(btnAscending))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBubble)
                    .addComponent(btnDescending))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsertion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuick)
                    .addComponent(btnSortNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ammountNumSort)
                    .addComponent(inputNumbersToSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(originalNumbers)
                    .addComponent(sortedNumbers))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortNumActionPerformed
        int[] arr = SortingRoutines.sortSelection(test, false, true);
        System.out.println(Arrays.toString(arr));
    }//GEN-LAST:event_btnSortNumActionPerformed

    private void btnInsertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertionActionPerformed

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
    private javax.swing.JLabel ammountNumSort;
    private javax.swing.JLabel author;
    private javax.swing.JRadioButton btnAscending;
    private javax.swing.JRadioButton btnBubble;
    private javax.swing.JRadioButton btnDescending;
    private javax.swing.JRadioButton btnInsertion;
    private javax.swing.JRadioButton btnQuick;
    private javax.swing.JRadioButton btnSelection;
    private javax.swing.JButton btnSortNum;
    private javax.swing.JLabel enterInfo;
    private javax.swing.JTextField inputNumbersToSort;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel originalNumbers;
    private javax.swing.JTextArea outputOriginalNumbers;
    private javax.swing.JTextArea outputSortedNumbers;
    private javax.swing.JLabel sortAlgorithumText;
    private javax.swing.ButtonGroup sortOrder;
    private javax.swing.ButtonGroup sortType;
    private javax.swing.JLabel sortTypeText;
    private javax.swing.JLabel sortedNumbers;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

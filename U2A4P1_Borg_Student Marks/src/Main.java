import java.util.ArrayList;
import java.util.Iterator;

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
    ArrayList<ArrayList<String>> studentData = new ArrayList<ArrayList<String>>(); //creats 2d array list
    
    String sFirstName, sLastName, sTest1, sTest2, sTest3, sTest4; //creats strings

    //creats arraylist
    ArrayList<String> firstName = new ArrayList();
    ArrayList<String> lastName = new ArrayList();
    ArrayList<String> testOne = new ArrayList();
    ArrayList<String> testTwo = new ArrayList();
    ArrayList<String> testThree = new ArrayList();
    ArrayList<String> testFour = new ArrayList();
    
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
        textFirstName = new javax.swing.JLabel();
        textLastName = new javax.swing.JLabel();
        textTest1 = new javax.swing.JLabel();
        textTest2 = new javax.swing.JLabel();
        textTest3 = new javax.swing.JLabel();
        textTest4 = new javax.swing.JLabel();
        inputFirstName = new javax.swing.JTextField();
        inputLastName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        inputTest1 = new javax.swing.JTextField();
        inputTest2 = new javax.swing.JTextField();
        inputTest3 = new javax.swing.JTextField();
        inputTest4 = new javax.swing.JTextField();
        btnStudentAvarage = new javax.swing.JButton();
        btnCourseAverage = new javax.swing.JButton();
        outputList = new javax.swing.JTextArea();
        outputAverage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textTitle.setForeground(new java.awt.Color(10, 255, 10));
        textTitle.setText("Student Marks");

        textAuthor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textAuthor.setText("By: Mathew Borg");

        textFirstName.setText("First Name:");

        textLastName.setText("Last Name:");

        textTest1.setText("Test 1:");

        textTest2.setText("Test 2:");

        textTest3.setText("Test 3:");

        textTest4.setText("Test 4:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnList.setText("List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        inputTest1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        inputTest2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        inputTest3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        inputTest4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnStudentAvarage.setText("Student Average");
        btnStudentAvarage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentAvarageActionPerformed(evt);
            }
        });

        btnCourseAverage.setText("Course Average");
        btnCourseAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseAverageActionPerformed(evt);
            }
        });

        outputList.setEditable(false);
        outputList.setLineWrap(true);
        outputList.setWrapStyleWord(true);
        outputList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        outputAverage.setColumns(20);
        outputAverage.setRows(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textAuthor)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputList)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textTest1)
                            .addComponent(textLastName)
                            .addComponent(textTest2)
                            .addComponent(textTest3)
                            .addComponent(textTest4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputFirstName)
                            .addComponent(inputLastName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputTest4, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(inputTest2)
                                    .addComponent(inputTest1)
                                    .addComponent(inputTest3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnStudentAvarage, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(btnCourseAverage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(outputAverage))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textTitle)
                .addGap(1, 1, 1)
                .addComponent(textAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFirstName)
                    .addComponent(inputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLastName)
                    .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTest1)
                    .addComponent(btnAdd)
                    .addComponent(inputTest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentAvarage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTest2)
                    .addComponent(btnList)
                    .addComponent(inputTest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCourseAverage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTest3)
                    .addComponent(inputTest3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTest4)
                    .addComponent(btnExit)
                    .addComponent(inputTest4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputList, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{ //trys to get number data 
            //sets text input to strings
            sFirstName = inputFirstName.getText(); 
            sLastName = inputFirstName.getText();
            sTest1 = inputTest1.getText();
            sTest2 = inputTest1.getText();
            sTest3 = inputTest1.getText();
            sTest4 = inputTest1.getText();
        }catch(NumberFormatException e){ //if there are numbers it will display Please Enter Letters Only
            outputAverage.setText("Please Enter Letters Only!!!");
        }
        
        //Adds sStrings to ArrayLists
        firstName.add(sFirstName);
        lastName.add(sLastName);
        testOne.add(sTest1);
        testTwo.add(sTest2);
        testThree.add(sTest3);
        testFour.add(sTest4);
        
        //Adds ArrayLists to 2d ArrayLists
        studentData.add(new ArrayList<>(firstName));
        studentData.add(new ArrayList<>(lastName));
        studentData.add(new ArrayList<>(testOne));
        studentData.add(new ArrayList<>(testTwo));
        studentData.add(new ArrayList<>(testThree));
        studentData.add(new ArrayList<>(testFour));
        
        //clears ArrayList 
        firstName.clear();
        lastName.clear();
        testOne.clear();
        testTwo.clear();
        testThree.clear();
        testFour.clear();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed

        for (int i = 0; i < studentData.size(); i++) {
            for (int j = 0; j < studentData.get(i).size(); j++) {
                System.out.println(studentData.get(i).get(j));
            }
        }
    }//GEN-LAST:event_btnListActionPerformed

    private void btnStudentAvarageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentAvarageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentAvarageActionPerformed

    private void btnCourseAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseAverageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCourseAverageActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0); // exits program
    }//GEN-LAST:event_btnExitActionPerformed

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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCourseAverage;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnStudentAvarage;
    private javax.swing.JTextField inputFirstName;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JTextField inputTest1;
    private javax.swing.JTextField inputTest2;
    private javax.swing.JTextField inputTest3;
    private javax.swing.JTextField inputTest4;
    private javax.swing.JTextArea outputAverage;
    private javax.swing.JTextArea outputList;
    private javax.swing.JLabel textAuthor;
    private javax.swing.JLabel textFirstName;
    private javax.swing.JLabel textLastName;
    private javax.swing.JLabel textTest1;
    private javax.swing.JLabel textTest2;
    private javax.swing.JLabel textTest3;
    private javax.swing.JLabel textTest4;
    private javax.swing.JLabel textTitle;
    // End of variables declaration//GEN-END:variables
}

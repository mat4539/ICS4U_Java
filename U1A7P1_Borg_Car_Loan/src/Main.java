/**
    File Name:	U1A5P2_Borg_Tri Area
    Programmer:	Mathew Borg
    Date:	2021-3-7
    Description:This program calculates the monthly payment, the total interest paid and the total payback of a car loan.
 */
public class Main extends javax.swing.JFrame {
    private int eLoanAmount, eAnnualInterestRate, eTimePeriod;
    private String stringLoanAmount, stringAnnualInterestRate, stringTimePeriod, stringMonthlyPayment, stringTotalIntrestPayed, stringTotalPayback;
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

        title = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        amountTitle = new javax.swing.JLabel();
        annualIntrestRateTitle = new javax.swing.JLabel();
        timePeriodTitle = new javax.swing.JLabel();
        monthlyPaymentTitle = new javax.swing.JLabel();
        totalInterestPaidTitle = new javax.swing.JLabel();
        totalPaybackTitle = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        inputLoanAmount = new javax.swing.JTextField();
        inputAnnualIntrestRate = new javax.swing.JTextField();
        inputTimePeriod = new javax.swing.JTextField();
        outputMonthlyPayment = new javax.swing.JTextField();
        outputTotalIntrestPaid = new javax.swing.JTextField();
        outputTotalPayback = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(10, 255, 50));
        title.setText("Car Loan");

        author.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        author.setText("By: Mathew Borg");

        amountTitle.setText("Loan Amount ($)");

        annualIntrestRateTitle.setText("Annual Intrest Rate (%)");

        timePeriodTitle.setText("Time Period (Years)");

        monthlyPaymentTitle.setText("Monthly Payment ($)");

        totalInterestPaidTitle.setText("Total Interest Paid (%)");

        totalPaybackTitle.setText("Total Payback ($)");

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        inputLoanAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputLoanAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLoanAmountActionPerformed(evt);
            }
        });

        inputAnnualIntrestRate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputAnnualIntrestRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAnnualIntrestRateActionPerformed(evt);
            }
        });

        inputTimePeriod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTimePeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTimePeriodActionPerformed(evt);
            }
        });

        outputMonthlyPayment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outputMonthlyPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputMonthlyPaymentActionPerformed(evt);
            }
        });

        outputTotalIntrestPaid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outputTotalIntrestPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputTotalIntrestPaidActionPerformed(evt);
            }
        });

        outputTotalPayback.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outputTotalPayback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputTotalPaybackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amountTitle)
                    .addComponent(annualIntrestRateTitle)
                    .addComponent(timePeriodTitle)
                    .addComponent(monthlyPaymentTitle)
                    .addComponent(totalInterestPaidTitle)
                    .addComponent(totalPaybackTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(calculate))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputLoanAmount)
                        .addComponent(inputAnnualIntrestRate)
                        .addComponent(inputTimePeriod)
                        .addComponent(outputMonthlyPayment)
                        .addComponent(outputTotalIntrestPaid)
                        .addComponent(outputTotalPayback, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(author)
                            .addComponent(title))
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(clear)
                        .addGap(167, 167, 167))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(author)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountTitle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputAnnualIntrestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annualIntrestRateTitle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTimePeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timePeriodTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(calculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthlyPaymentTitle)
                    .addComponent(outputMonthlyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalInterestPaidTitle)
                    .addComponent(outputTotalIntrestPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputTotalPayback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPaybackTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        /**
        * Gets the text from our GUI input boxes and sets them to strings
        */
        stringLoanAmount = inputLoanAmount.getText();
        stringAnnualInterestRate = inputAnnualIntrestRate.getText();
        stringTimePeriod = inputTimePeriod.getText();
        
        /*
        * Passes the string data to the vareable ints we created
        * For Box Loan Amount
        */
        try{ //trys to get number data 
            eLoanAmount = Integer.parseInt(stringLoanAmount);
        }catch (NumberFormatException e){ //if there are no numbers it will display Enter Numbers Only and retry the program
            inputLoanAmount.setText("Enter Numbers Only");
            return;
        }if (eLoanAmount <= 0){ //if number is negative or 0 display Positive Numbers Only and retry the program
            inputLoanAmount.setText("Positive Numbers Only");
            return;
        }
        //For Box Annual Interest Rate
        try{ //trys to get number data 
            eAnnualInterestRate = Integer.parseInt(stringAnnualInterestRate);
        }catch (NumberFormatException e){ //if there are no numbers it will display Enter Numbers Only and retry the program
            inputAnnualIntrestRate.setText("Enter Numbers Only");
            return;
        }if (eAnnualInterestRate <= 0){ //if number is negative or 0 display Positive Numbers Only and retry the program
            inputAnnualIntrestRate.setText("Positive Numbers Only");
            return;
        }
        //For Box Time Period
        try{ //trys to get number data 
            eTimePeriod = Integer.parseInt(stringTimePeriod);
        }catch (NumberFormatException e){ //if there are no numbers it will display Enter Numbers Only and retry the program
            inputTimePeriod.setText("Enter Numbers Only");
            return;
        }if (eTimePeriod <= 0){ //if number is negative or 0 display Positive Numbers Only and retry the program
            inputTimePeriod.setText("Positive Numbers Only");
            return;
        }
        
        double monthlyPayment = LoanCalculator.monthlyPayment(eLoanAmount,eAnnualInterestRate,eTimePeriod); //returns the value of monthly payment
        stringMonthlyPayment = Double.toString(monthlyPayment); //sets double value to string
        outputMonthlyPayment.setText(stringMonthlyPayment); //sets monthly payment box to corasponding value
        
        double totalIntrestPayed = LoanCalculator.totalIntrestPayed(eLoanAmount,eAnnualInterestRate,eTimePeriod); //returns the value of Total Intrest Payed
        stringTotalIntrestPayed = Double.toString(totalIntrestPayed); //sets double value to string
        outputTotalIntrestPaid.setText(stringTotalIntrestPayed); //sets Total Intrest Payed box to corasponding value
        
        double totalPayback = LoanCalculator.totalPayback(eLoanAmount,eAnnualInterestRate,eTimePeriod); //returns the value of Total Payback
        stringTotalPayback = Double.toString(totalPayback); //sets double value to string
        outputTotalPayback.setText(stringTotalPayback); //sets Total Payback box to corasponding value
    }//GEN-LAST:event_calculateActionPerformed

    private void inputAnnualIntrestRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAnnualIntrestRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAnnualIntrestRateActionPerformed

    private void inputLoanAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLoanAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLoanAmountActionPerformed

    private void inputTimePeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTimePeriodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTimePeriodActionPerformed

    private void outputMonthlyPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputMonthlyPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputMonthlyPaymentActionPerformed

    private void outputTotalIntrestPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputTotalIntrestPaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputTotalIntrestPaidActionPerformed

    private void outputTotalPaybackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputTotalPaybackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputTotalPaybackActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

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
    private javax.swing.JLabel amountTitle;
    private javax.swing.JLabel annualIntrestRateTitle;
    private javax.swing.JLabel author;
    private javax.swing.JButton calculate;
    private javax.swing.JButton clear;
    private javax.swing.JTextField inputAnnualIntrestRate;
    private javax.swing.JTextField inputLoanAmount;
    private javax.swing.JTextField inputTimePeriod;
    private javax.swing.JLabel monthlyPaymentTitle;
    private javax.swing.JTextField outputMonthlyPayment;
    private javax.swing.JTextField outputTotalIntrestPaid;
    private javax.swing.JTextField outputTotalPayback;
    private javax.swing.JLabel timePeriodTitle;
    private javax.swing.JLabel title;
    private javax.swing.JLabel totalInterestPaidTitle;
    private javax.swing.JLabel totalPaybackTitle;
    // End of variables declaration//GEN-END:variables
}

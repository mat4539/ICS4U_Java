
import javax.swing.JOptionPane;

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
    public static String fileName = "players.xml", inputPlayerName, playerName;
    public static int playerBalance, playerBet;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        outputPlayerName.setText(playerName);
        outputPlayerBalance.setText(Integer.toString(playerBalance));
        outputPlayerBet.setText(Integer.toString(playerBet));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        btnDeal = new javax.swing.JButton();
        dealersHand = new javax.swing.JLabel();
        yourHand = new javax.swing.JLabel();
        dealerFirstCard = new javax.swing.JLabel();
        playerFirstCard = new javax.swing.JLabel();
        dealerSecondCard = new javax.swing.JLabel();
        playerSecondCard = new javax.swing.JLabel();
        firstCard = new javax.swing.JLabel();
        secondCard = new javax.swing.JLabel();
        welcomeBack = new javax.swing.JLabel();
        outputPlayerBalance = new javax.swing.JTextField();
        balanceIs = new javax.swing.JLabel();
        outputPlayerName = new javax.swing.JTextField();
        youAreCurrentlyBetting = new javax.swing.JLabel();
        outputPlayerBet = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(10, 155, 10));
        title.setText("Black Jack");

        author.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        author.setText("By: Mathew Borg");

        btnDeal.setText("Deal");
        btnDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDealActionPerformed(evt);
            }
        });

        dealersHand.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dealersHand.setText("Dealers Hand");

        yourHand.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yourHand.setText("Your Hand");

        dealerFirstCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gray_back.png"))); // NOI18N
        dealerFirstCard.setMaximumSize(new java.awt.Dimension(240, 264));
        dealerFirstCard.setMinimumSize(new java.awt.Dimension(240, 264));

        playerFirstCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gray_back.png"))); // NOI18N
        playerFirstCard.setMaximumSize(new java.awt.Dimension(240, 264));
        playerFirstCard.setMinimumSize(new java.awt.Dimension(240, 264));

        dealerSecondCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gray_back.png"))); // NOI18N

        playerSecondCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gray_back.png"))); // NOI18N

        firstCard.setText("First");

        secondCard.setText("Second");

        welcomeBack.setText("You are playing as:");

        outputPlayerBalance.setEnabled(false);

        balanceIs.setText("Your Balance Is:");

        outputPlayerName.setEnabled(false);

        youAreCurrentlyBetting.setText("You Are Currently Betting:");

        outputPlayerBet.setEnabled(false);

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
                                .addGap(45, 45, 45)
                                .addComponent(firstCard)
                                .addGap(87, 87, 87)
                                .addComponent(secondCard))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dealerFirstCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(playerFirstCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(playerSecondCard)
                                    .addComponent(dealerSecondCard)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(author))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(welcomeBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(outputPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(dealersHand))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(balanceIs)
                            .addComponent(yourHand)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(youAreCurrentlyBetting)
                            .addComponent(outputPlayerBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(outputPlayerBet)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnDeal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(author)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dealersHand)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dealerFirstCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dealerSecondCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCard)
                    .addComponent(secondCard))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerFirstCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerSecondCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yourHand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balanceIs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPlayerBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(youAreCurrentlyBetting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPlayerBet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDealActionPerformed
        String[] playerFirst, playerSecond, DealerFirst, DealerSecond;
        int playerHandValue = 0, dealerHandValue = 0;
        boolean acePlayer = false, aceDealer = false;
        int[] playerCards = new int[2];
        int[] dealerCards = new int[2];

        playerFirst = CardDeck.generateCard();
        String sPlayerFirstCardValue = playerFirst[0];
        int playerFirstCardValue = CardDeck.cardValue(sPlayerFirstCardValue);
        if (playerFirstCardValue == 0) {
            acePlayer = true;
        }
        String playerFirstCardName = CardDeck.getCardName(playerFirst);
        
        playerSecond = CardDeck.generateCard();
        String sPlayerSecondCardValue = playerSecond[0];
        int playerSecondCardValue = CardDeck.cardValue(sPlayerSecondCardValue);
        if (playerSecondCardValue == 0){
            acePlayer = true;
        }
        String playerSecondCardName = CardDeck.getCardName(playerSecond);
        
        DealerFirst = CardDeck.generateCard();
        String sDealerFirstCardValue = DealerFirst[0];
        int DealerFirstCardValue = CardDeck.cardValue(sDealerFirstCardValue);
        if (DealerFirstCardValue == 0){
            aceDealer = true;
        }
        String DealerFirstCardName = CardDeck.getCardName(DealerFirst);
        
        DealerSecond = CardDeck.generateCard();
        String sDealerSecondCardValue = DealerSecond[0];
        int DealerSecondCardValue = CardDeck.cardValue(sDealerSecondCardValue);
        if (DealerSecondCardValue == 0){
            aceDealer = true;
        }
        String DealerSecondCardName = CardDeck.getCardName(DealerSecond);

        playerCards[0] = playerFirstCardValue;
        playerCards[1] = playerSecondCardValue;
        playerHandValue =  CardDeck.handValue(playerCards, acePlayer);
        
        dealerCards[0] = DealerFirstCardValue;
        dealerCards[1] = DealerSecondCardValue;
        dealerHandValue =  CardDeck.handValue(dealerCards, aceDealer);
        
        JOptionPane.showMessageDialog(null, "You have a total valve of " + playerHandValue + "The Dealers Has A Total Value of" + dealerHandValue); // creates a pop up box with no values found
        
        settleBets(playerHandValue, dealerHandValue);
    }//GEN-LAST:event_btnDealActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        start();
        playerInit();
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
    
     public static void start(){
        JOptionPane.showMessageDialog(null, "Welcome to Black Jack!! Please Click Ok to Continue"); // creates a pop up box with no values found
        inputPlayerName = JOptionPane.showInputDialog("Who do you want to play as. (Ritch, Wise or Poor)");
        String betTemp = JOptionPane.showInputDialog("Please enter bet value");
        try{
            playerBet = Integer.parseInt(betTemp);
        }catch (NumberFormatException e){ //if there ar
             JOptionPane.showMessageDialog(null, "Use Numbers Only"); // creates a pop up box with no values found
             return;
        }
    }

    public static void playerInit(){
        XmlCommands.findXml();
        
        boolean userExist = XmlCommands.checkPlayerXmlElement(inputPlayerName);
        
        if (userExist) {
            String[] usernames = XmlCommands.printXml("player", "username"), totalGames = XmlCommands.printXml("player", "totalGames"), balance = XmlCommands.printXml("player", "balance");
            int[] gTemp = new int[usernames.length], bTemp = new int[usernames.length];
            playerName = usernames[XmlCommands.playerPosition];
            for (int i = 0; i <  usernames.length; i++) {
                gTemp[i] = Integer.parseInt(totalGames[i]);
                bTemp[i] = Integer.parseInt(balance[i]);
            }
            playerBalance = bTemp[XmlCommands.playerPosition];
        }else{
            JOptionPane.showMessageDialog(null, "Not a Valid User!"); // creates a pop up box with no values found
            inputPlayerName = JOptionPane.showInputDialog ("Who do you want to play as. (Ritch, Wise or Poor)");
        }
    }
    
    public static void settleBets (int player, int dealer){
        if (player > 21){
            //lost
            updatePlayerBallance(XmlCommands.playerPosition,false);
            JOptionPane.showMessageDialog(null, "You have lost your bet of " + playerBet); // creates a pop up box with no values found
        } else if (player == dealer){
            //tie
            JOptionPane.showMessageDialog(null, "You Have Tied The Dealer. Your Ballance Will Remain the Same"); // creates a pop up box with no values found
        }else if(player < dealer && dealer <=21){
            //playerloss
            updatePlayerBallance(XmlCommands.playerPosition,false);
            JOptionPane.showMessageDialog(null, "You have lost your bet of " + playerBet); // creates a pop up box with no values found
        }else if(player == 21){
            //player wins
            updatePlayerBallance(XmlCommands.playerPosition,true);
            JOptionPane.showMessageDialog(null, "You have won " + playerBet); // creates a pop up box with no values found
        }else {
            //player has won
            updatePlayerBallance(XmlCommands.playerPosition,true);
            JOptionPane.showMessageDialog(null, "You have won " + playerBet); // creates a pop up box with no values found
        }
    }
    
    public static void updatePlayerBallance(int playerPosition, boolean win){
        String[] allBallance = XmlCommands.printXml("player", "balance");
        String sPlayerBallance = allBallance[playerPosition];
        XmlCommands.findXml();
        int PlayerBallance = Integer.parseInt(sPlayerBallance);
        int winings = 0, losses;
        if (win){
            winings = playerBet;
            PlayerBallance += winings; 
            String newBallance = String.valueOf(PlayerBallance);
            XmlCommands.updateXmlElement(playerPosition, "balance", newBallance);
        }else{
            PlayerBallance -= playerBet;
            String newBallance = String.valueOf(PlayerBallance);
            XmlCommands.updateXmlElement(playerPosition, "balance", newBallance);
        }
        XmlCommands.updateXml();
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author;
    private javax.swing.JLabel balanceIs;
    private javax.swing.JButton btnDeal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dealerFirstCard;
    private javax.swing.JLabel dealerSecondCard;
    private javax.swing.JLabel dealersHand;
    private javax.swing.JLabel firstCard;
    private javax.swing.JTextField outputPlayerBalance;
    private javax.swing.JTextField outputPlayerBet;
    private javax.swing.JTextField outputPlayerName;
    private javax.swing.JLabel playerFirstCard;
    private javax.swing.JLabel playerSecondCard;
    private javax.swing.JLabel secondCard;
    private javax.swing.JLabel title;
    private javax.swing.JLabel welcomeBack;
    private javax.swing.JLabel youAreCurrentlyBetting;
    private javax.swing.JLabel yourHand;
    // End of variables declaration//GEN-END:variables
}

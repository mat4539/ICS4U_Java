/*
    programmer: Mathew Borg
    Date: 2021-06-6
    Program Name: U3A5P2_Borg_XMLCreate
    Program Discription: This program reads an xml file changes and adds elements by the push of btns
 */
public class Main extends javax.swing.JFrame {
    public static String fileName = "courses.xml"; //creats public string for the name of the xml file
    
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
        jScrollPane1 = new javax.swing.JScrollPane();
        outputXmlData = new javax.swing.JTextArea();
        btnAddData = new javax.swing.JButton();
        btnPrintXml = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 10, 10));
        title.setText("XML Create");

        author.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        author.setText("By: Mathew Borg");

        outputXmlData.setColumns(20);
        outputXmlData.setRows(5);
        outputXmlData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(outputXmlData);

        btnAddData.setText("Click To Add New Data");
        btnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataActionPerformed(evt);
            }
        });

        btnPrintXml.setText("Click To Print XML");
        btnPrintXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintXmlActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(author)
                    .addComponent(title))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrintXml, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddData)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(author)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrintXml)
                    .addComponent(btnAddData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintXmlActionPerformed
        printXML(); //runs printXML method
    }//GEN-LAST:event_btnPrintXmlActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
        //runs the addXmlElement method and adds the following elements with corosponding info
        XmlCommands.addXmlElement(0, "course", "schoolBoard", "RCDSB");
        XmlCommands.addXmlElement(1, "course", "schoolBoard", "SCDSB");
        XmlCommands.addXmlElement(2, "course", "schoolBoard", "SCDSB");
        
        //runs the updateXMLElement method and changes the following elements to corosponding new info
        XmlCommands.updateXmlElement(0, "teacher", "Mr. Matthews");
        XmlCommands.updateXmlElement(1, "teacher", "Mrs. Mitchell");
        XmlCommands.updateXmlElement(2, "teacher", "Mr. Haas");
        
        XmlCommands.updateXml(); //runs updateXml method to update the file
        
        printXML(); //runs printXML method
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //runs the removeXmlElement method and removes the following elements
        XmlCommands.removeXmlElement(0, "schoolBoard");
        XmlCommands.removeXmlElement(1, "schoolBoard");
        XmlCommands.removeXmlElement(2, "schoolBoard");
        
        //runs the updateXMLElement method and changes the following elements to corosponding new info
        XmlCommands.updateXmlElement(0, "teacher", "Teacher A");
        XmlCommands.updateXmlElement(1, "teacher", "Teacher B");
        XmlCommands.updateXmlElement(2, "teacher", "Teacher C");

        XmlCommands.updateXml(); //runs updateXml method to update the file

        printXML(); //runs printXML method
    }//GEN-LAST:event_btnResetActionPerformed

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
    
    /*
    Function: printXML
    Purpose:  to print all the arrays the printXml method returns
    Parameters: n/a
    Return: void
     */
    private void printXML() {
        //creats string arrays that will be set as the return of printXml method
        String[] code = XmlCommands.printXml("course", "code");
        String[] description = XmlCommands.printXml("course", "description");
        String[] teacher = XmlCommands.printXml("course", "teacher");
        String[] fileType = XmlCommands.printXml("course", "fileType");

        try { //try
            String[] schoolBoard = XmlCommands.printXml("course", "schoolBoard"); //creat string array that will be set as the return of printXml method
            //set outputXmlData text too the string arrays at the corosponding positions
            outputXmlData.setText("Course Code: " + code[0] + "Course Description: " + description[0] + "Course Teacher: " + teacher[0] + "File Type: " + fileType[0] + "School Board: " + schoolBoard[0] + "\n" 
                    + "Course Code: " + code[1] + "Course Description: " + description[1] + "Course Teacher: " + teacher[1] + "File Type: " + fileType[1] + "School Board: " + schoolBoard[1] + "\n"
                    + "Course Code: " + code[2] + "Course Description: " + description[2] + "Course Teacher: " + teacher[2] + "File Type: " + fileType[2] + "School Board: " + schoolBoard[2] + "\n");
        } catch (Exception e) { //catch expetopn e 
            //set outputXmlData text too the string arrays at the corosponding positions
            outputXmlData.setText("Course Code: " + code[0] + "Course Description: " + description[0] + "Course Teacher: " + teacher[0] + "File Type: " +  fileType[0] + "\n"
                    + "Course Code: " + code[1] + "Course Description: " + description[1] + "Course Teacher: " + teacher[1] + "File Type: " + fileType[1] + "\n"
                    + "Course Code: " + code[2] + "Course Description: " + description[2] + "Course Teacher: " + teacher[2] + "File Type: " + fileType[2] + "\n");
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author;
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnPrintXml;
    private javax.swing.JButton btnReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputXmlData;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

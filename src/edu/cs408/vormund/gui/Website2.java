/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cs408.vormund.gui;

import javax.swing.JOptionPane;

import edu.cs408.vormund.DBHelpers;

/**
 *
 * @author isabellee
 */
public class Website2 extends javax.swing.JFrame {

    /**
     * Creates new form NewBank
     */
	private DBHelpers helpers;
    public Website2(DBHelpers h) {
        initComponents();
        helpers = h;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        q1label = new javax.swing.JLabel();
        q1field = new javax.swing.JTextField();
        an1field = new javax.swing.JTextField();
        donebutton = new javax.swing.JButton();
        an1label = new javax.swing.JLabel();
        q2label = new javax.swing.JLabel();
        an2field = new javax.swing.JTextField();
        q2field = new javax.swing.JTextField();
        q3field = new javax.swing.JTextField();
        an3field = new javax.swing.JTextField();
        an2label = new javax.swing.JLabel();
        q3label = new javax.swing.JLabel();
        an3label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vormund");

        q1label.setText("Question 1:");

        donebutton.setText("Done");
        donebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donebuttonMouseClicked(evt);
            }
        });

        an1label.setText("Answer 1:");

        q2label.setText("Question 2:");

        an2label.setText("Answer 2:");

        q3label.setText("Question 3:");

        an3label.setText("Answer 3:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(donebutton)
                .add(155, 155, 155))
            .add(layout.createSequentialGroup()
                .add(39, 39, 39)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(q2label)
                    .add(q1label)
                    .add(an1label)
                    .add(an2label)
                    .add(q3label)
                    .add(an3label))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(an3field)
                            .add(q3field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(0, 44, Short.MAX_VALUE)
                        .add(jLabel1)
                        .add(169, 169, 169))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(q1field, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .add(an1field)
                            .add(an2field, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .add(q2field, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(q1label)
                    .add(q1field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(an1field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(an1label))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(q2label)
                    .add(q2field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(7, 7, 7)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(an2field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(an2label))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(q3field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(7, 7, 7)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(an3field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(an3label)))
                    .add(q3label))
                .add(19, 19, 19)
                .add(donebutton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void donebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donebuttonMouseClicked
        // TODO add your handling code here:
        
        //Check info
        //Add Q/A to database
    	//UserAccount usacc = new UserAccount();
    	Website web = new Website(helpers);
		String q1 = q1field.getText().toString();
		String a1 = an1field.getText().toString();
		String q2 = q2field.getText().toString();
		String a2 = an2field.getText().toString();
		String q3 = q3field.getText().toString();
		String a3 = an3field.getText().toString();
		Boolean done = true;
		/*
    	if(q1.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please fill up the question 1 field!");
    		done = false;
    	}
    	else if(a1.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please fill up the answer 1 field!");
    		done = false;
    	}
    	if(q2.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please fill up the question 2 field!");
    		done = false;
    	}
    	else if(a2.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please fill up the answer 2 field!");
    		done = false;
    	}

    	if(q3.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please fill up the question 3 field!");
    		done = false;
    	}
    	else if(a3.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please fill up the answer 3 field!");
    		done = false;
    	}
    	
    	if(usacc.updating == true){
        	//Need to add the questions in an array
    		//DBHelp.updateWeb(webid,web.name,web.user,web.u,web.em,array[][]);
        	usacc.updating = false;
		}
    	else
    	{
    		;
    		//Fix the array thing
    		//DBHelp.newWebsite(web.name,web.user,web.u,web.em,array[][]);
    	}*/
        
        //go back to user account window
        if(done == true){
        	new UserAccount(helpers).setVisible(true);
        
        	//dispose
        	dispose();
        }
    }//GEN-LAST:event_donebuttonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField an1field;
    private javax.swing.JLabel an1label;
    private javax.swing.JTextField an2field;
    private javax.swing.JLabel an2label;
    private javax.swing.JTextField an3field;
    private javax.swing.JLabel an3label;
    private javax.swing.JButton donebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField q1field;
    private javax.swing.JLabel q1label;
    private javax.swing.JTextField q2field;
    private javax.swing.JLabel q2label;
    private javax.swing.JTextField q3field;
    private javax.swing.JLabel q3label;
    // End of variables declaration//GEN-END:variables
}

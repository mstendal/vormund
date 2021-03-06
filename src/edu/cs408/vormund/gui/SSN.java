package edu.cs408.vormund.gui;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import javax.swing.JOptionPane;
import edu.cs408.vormund.DBHelpers;
import edu.cs408.vormund.SSNInfo;

/**
 *
 * @author isabellee
 */
public class SSN extends javax.swing.JFrame {

  int data_id = -1;
  boolean isUpdating = false;
    /**
     * Creates new form LoginWindow
     */
	private DBHelpers helpers;
	private UserAccount parent;

    public SSN(DBHelpers h, UserAccount parent) {
        initComponents();
        helpers = h;
        this.parent = parent;
    }

    public SSN(DBHelpers h, int data_id, UserAccount parent) {
      helpers = h;
      isUpdating = true;
      this.data_id = data_id;
      initComponents();
      this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        snn = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        ssnfield = new javax.swing.JTextField();
        done = new javax.swing.JButton();

        if(data_id != -1) {
          SSNInfo ssn = helpers.getSocial(data_id);
          namefield.setText(ssn.getName());
          ssnfield.setText(ssn.getSSN());
        }

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        title1.setText("Vormund");
        name.setText("Name");
        snn.setText("SSN");

        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            try {
					    doneMouseClicked(evt);
				    } catch (SQLException e) {
					    // TODO Auto-generated catch block
					    e.printStackTrace();
				    }
          }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(172, 172, 172)
                        .add(title1))
                    .add(layout.createSequentialGroup()
                        .add(60, 60, 60)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(name)
                            .add(snn))
                        .add(34, 34, 34)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(namefield, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .add(ssnfield)))
                    .add(layout.createSequentialGroup()
                        .add(145, 145, 145)
                        .add(done)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(title1)
                .add(34, 34, 34)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(name)
                    .add(namefield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(snn)
                    .add(ssnfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(30, 30, 30)
                .add(done)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Defects:
     *   Pressing Enter does not submit the form
     */
    private void doneMouseClicked(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_doneMouseClicked
    	String user_name = namefield.getText().toString();
		  String social = ssnfield.getText().toString();
		  Boolean done = true;

    	if(user_name.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please fill up the name field!");
    		done = false;
    	}
    	else if(social.length()!=9)
     	{
     	 JOptionPane.showMessageDialog(null, "Social security numbers must be 9 digits long.");
     	 done = false;
     	}
    	else {
        if(!isUpdating) {
          if( helpers.newSocial(user_name, social) == -1 ) {
            JOptionPane.showMessageDialog(null, "There is already an SSN for this name.");
            done = false;
          }
        } else {
          if( helpers.updateSocial(data_id, user_name, social) == -1 ) {
            JOptionPane.showMessageDialog(null, "There was an issue updating the database.");
            done = false;
          } else {
            done = true;
          }
        }
      }

    	if(done == true) {
    		//new UserAccount(helpers).setVisible(true);

    		//dispose
    		parent.refreshSocialsList();
    		dispose();
    	}
    }//GEN-LAST:event_doneMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton done;
    public javax.swing.JLabel name;
    private javax.swing.JTextField namefield;
    private javax.swing.JLabel snn;
    public javax.swing.JTextField ssnfield;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}

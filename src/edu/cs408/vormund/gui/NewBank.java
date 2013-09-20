/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cs408.vormund.gui;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import edu.cs408.vormund.BankInfo;
import edu.cs408.vormund.DBHelpers;

/**
 *
 * @author isabellee
 */
public class NewBank extends javax.swing.JFrame {

    /**
     * Creates new form NewBank
     */
	private DBHelpers helpers;	
	
	private boolean isUpdating;
	
	private int data_id;
	
    public NewBank(DBHelpers h) {
        helpers = h;
        isUpdating = false;
        data_id = -1;
        initComponents();
    }
    
    public NewBank(DBHelpers h, int data_id) {
    	helpers = h;
        isUpdating = true;
        this.data_id = data_id;
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

        jLabel1 = new javax.swing.JLabel();
        bankname = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        accountnum = new javax.swing.JLabel();
        routinglab = new javax.swing.JLabel();
        accounttype = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        addressfield = new javax.swing.JTextField();
        accountfield = new javax.swing.JTextField();
        routingfield = new javax.swing.JTextField();
        acctypefield = new javax.swing.JTextField();
        donebutton2 = new javax.swing.JButton();
        
        if(data_id != -1)
        {
	        BankInfo bank = helpers.getBank(data_id);
	        namefield.setText(bank.getBankName());
	        addressfield.setText(bank.getBankAddress());
	        accountfield.setText(bank.getAccountNumber());
	        routingfield.setText(bank.getRoutingNumber());
	        acctypefield.setText(bank.getAccountType());
        }
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vormund");

        bankname.setText("Name:");

        address.setText("Address:");

        accountnum.setText("Account #:");

        routinglab.setText("Routing #:");

        accounttype.setText("Account type:");

        donebutton2.setText("Done");
        donebutton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					donebutton2MouseClicked(evt);
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
                .add(39, 39, 39)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(address)
                    .add(bankname)
                    .add(accountnum)
                    .add(routinglab)
                    .add(accounttype))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(namefield, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .add(addressfield)
                    .add(accountfield)
                    .add(routingfield)
                    .add(acctypefield))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(169, 169, 169))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(donebutton2)
                        .add(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bankname)
                    .add(namefield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(address)
                    .add(addressfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(accountfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(accountnum))
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(routingfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(routinglab))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(accounttype)
                    .add(acctypefield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(donebutton2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void donebutton2MouseClicked(java.awt.event.MouseEvent evt) throws SQLException {//GEN-FIRST:event_donebutton2MouseClicked
        // TODO add your handling code here:

        //Check title
    	String bank = namefield.getText().toString();
		String add = addressfield.getText().toString();
		String accnum = accountfield.getText().toString();
		String rou_bal = routingfield.getText().toString();
		String acctype = acctypefield.getText().toString();
		Boolean done = true;
    	
		
    	if(bank.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please enter a bank name!");
    		done = false;
    	}
    	else if(add.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please enter an address");
    		done = false;
    	}
    	else if(accnum.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please enter an account number");
    		done = false;
    	}
    	else if(rou_bal.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please enter a routing number");    
    		done = false;
    	}
    	else if(acctype.length() == 0)
    	{
    		JOptionPane.showMessageDialog(null,"Please enter an account type");
    		done = false;
    	}
    	
    	if(!isUpdating){
    		int result = helpers.newBank(bank, accnum, rou_bal, add, acctype);
    		if(result == -1)
    		{
    			JOptionPane.showMessageDialog(null,"An entry with the given account number already exists");
    			return;
    		}
    		
    		done = true;
    	}
    	else
    	{
    		if( helpers.updateBank(data_id, bank, accnum, rou_bal, add, acctype) == -1 ) {
            	JOptionPane.showMessageDialog(null, "There was an issue updating the database.");
	            done = false;
	        } else {
	            done = true;
	        }
    	}
    	
    	
    	if(done == true)
    	{
    		new UserAccount(helpers).setVisible(true);
        
    		//dispose
    		dispose();
    	}
    }//GEN-LAST:event_donebutton2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountfield;
    public javax.swing.JLabel accountnum;
    public javax.swing.JLabel accounttype;
    private javax.swing.JTextField acctypefield;
    public javax.swing.JLabel address;
    private javax.swing.JTextField addressfield;
    public javax.swing.JLabel bankname;
    private javax.swing.JButton donebutton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField routingfield;
    public javax.swing.JLabel routinglab;
    // End of variables declaration//GEN-END:variables
}

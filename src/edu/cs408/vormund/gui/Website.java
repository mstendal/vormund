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
public class Website extends javax.swing.JFrame {

	/**
	 * Creates new form NewBank
	 */
	private DBHelpers helpers;
	private int user_id;
	private boolean isUpdating;

	// DBHelpers DBHelp = new DBHelpers();

	public Website(DBHelpers h) {
		helpers = h;
		user_id = -1;
		isUpdating = false;
		initComponents();
	}

	public Website(DBHelpers h, int user_id) {
		helpers = h;
		this.user_id = user_id;
		isUpdating = true;
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		url = new javax.swing.JLabel();
		usernamelabel = new javax.swing.JLabel();
		passlab = new javax.swing.JLabel();
		email = new javax.swing.JLabel();
		namefield = new javax.swing.JTextField();
		addressfield = new javax.swing.JTextField();
		accountfield = new javax.swing.JTextField();
		acctypefield = new javax.swing.JTextField();
		donebutton2 = new javax.swing.JButton();
		passfield = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Vormund");

		jLabel2.setText("Name:");

		url.setText("URL:");

		usernamelabel.setText("Username:");

		passlab.setText("Password:");

		email.setText("Email:");

		// change from done to next name
		donebutton2.setText("Next");
		donebutton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				donebutton2MouseClicked(evt);
			}
		});

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(layout
						.createSequentialGroup()
						.add(39, 39, 39)
						.add(layout
								.createParallelGroup(
										org.jdesktop.layout.GroupLayout.TRAILING)
										.add(url).add(jLabel2).add(usernamelabel)
										.add(passlab).add(email))
										.add(18, 18, 18)
										.add(layout
												.createParallelGroup(
														org.jdesktop.layout.GroupLayout.LEADING,
														false)
														.add(namefield,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																176, Short.MAX_VALUE).add(addressfield)
																.add(accountfield).add(acctypefield)
																.add(passfield))
																.addContainerGap(
																		org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
																		.add(org.jdesktop.layout.GroupLayout.TRAILING,
																				layout.createSequentialGroup()
																				.addContainerGap(174, Short.MAX_VALUE)
																				.add(layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																								.add(org.jdesktop.layout.GroupLayout.TRAILING,
																										layout.createSequentialGroup()
																										.add(jLabel1)
																										.add(169, 169, 169))
																										.add(org.jdesktop.layout.GroupLayout.TRAILING,
																												layout.createSequentialGroup()
																												.add(donebutton2)
																												.add(135, 135, 135)))));
		layout.setVerticalGroup(layout
				.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(layout
						.createSequentialGroup()
						.add(21, 21, 21)
						.add(jLabel1)
						.add(18, 18, 18)
						.add(layout
								.createParallelGroup(
										org.jdesktop.layout.GroupLayout.BASELINE)
										.add(jLabel2)
										.add(namefield,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(
														org.jdesktop.layout.LayoutStyle.UNRELATED)
														.add(layout
																.createParallelGroup(
																		org.jdesktop.layout.GroupLayout.BASELINE)
																		.add(url)
																		.add(addressfield,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																				.add(18, 18, 18)
																				.add(layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.TRAILING)
																								.add(accountfield,
																										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																										org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																										.add(usernamelabel))
																										.add(28, 28, 28)
																										.add(layout
																												.createParallelGroup(
																														org.jdesktop.layout.GroupLayout.BASELINE)
																														.add(passlab)
																														.add(passfield,
																																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																																.addPreferredGap(
																																		org.jdesktop.layout.LayoutStyle.UNRELATED)
																																		.add(layout
																																				.createParallelGroup(
																																						org.jdesktop.layout.GroupLayout.TRAILING)
																																						.add(email)
																																						.add(acctypefield,
																																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																																								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																																								.add(18, 18, 18).add(donebutton2)
																																								.addContainerGap(12, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void donebutton2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_donebutton2MouseClicked
		// TODO add your handling code here:

		String name = namefield.getText().toString();
		String u = addressfield.getText().toString();
		String user = accountfield.getText().toString();
		String pass = passfield.getText().toString();
		String em = acctypefield.getText().toString();

		if (name.length() == 0) {
			JOptionPane.showMessageDialog(null,
					"Please fill up the name field!");
		} 
		else if (u.length() == 0) {
			JOptionPane
			.showMessageDialog(null, "Please fill up the url field!");
		} else if (user.length() == 0) {
			JOptionPane.showMessageDialog(null,
					"Please fill up the user field!");
		} else if (pass.length() == 0) {
			JOptionPane.showMessageDialog(null,
					"Please fill up the pass field!");
		} else if (em.length() == 0) {
			JOptionPane.showMessageDialog(null, "Please fill up the em field!");
		} else {
			new Website2(helpers).setVisible(true);
			dispose();
		}
	}// GEN-LAST:event_donebutton2MouseClicked


	// Variables declaration - do not modify//GEN-BEGIN:variables
	public javax.swing.JTextField accountfield;
	public javax.swing.JTextField acctypefield;
	public javax.swing.JTextField addressfield;
	private javax.swing.JButton donebutton2;
	private javax.swing.JLabel email;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	public javax.swing.JTextField namefield;
	public javax.swing.JPasswordField passfield;
	private javax.swing.JLabel passlab;
	private javax.swing.JLabel url;
	private javax.swing.JLabel usernamelabel;
	// End of variables declaration//GEN-END:variables
}

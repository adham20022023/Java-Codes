package login_form;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    DefaultTableModel dtn;
    Connection con;
    ArrayList<Integer> deptids = new ArrayList<>();
    ArrayList<Integer> empids = new ArrayList<>();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        dtn = new DefaultTableModel();
        dtn.addColumn("Employee Name");
        dtn.addColumn("Employee Salary");
        dtn.addColumn("Employee Gender");
        dtn.addColumn("Department Name");

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "adham2020...flash");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR failed To Connect Database");
        }
        fillcombox();
        filltable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edit_text_salary = new javax.swing.JTextField();
        edit_text_name = new javax.swing.JTextField();
        rbtn_male = new javax.swing.JRadioButton();
        rbtn_female = new javax.swing.JRadioButton();
        box_departement = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_show = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_button = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Employee Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Employee Salary :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Employee Gender:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Departement Name :");

        edit_text_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_text_nameActionPerformed(evt);
            }
        });

        rbtn_male.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup1.add(rbtn_male);
        rbtn_male.setForeground(new java.awt.Color(51, 51, 255));
        rbtn_male.setSelected(true);
        rbtn_male.setText("Male");
        rbtn_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_maleActionPerformed(evt);
            }
        });

        rbtn_female.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup1.add(rbtn_female);
        rbtn_female.setForeground(new java.awt.Color(51, 51, 255));
        rbtn_female.setText("Female");
        rbtn_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_femaleActionPerformed(evt);
            }
        });

        box_departement.setBackground(new java.awt.Color(204, 255, 204));
        box_departement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_departementActionPerformed(evt);
            }
        });

        tbl_show.setBackground(new java.awt.Color(204, 255, 204));
        tbl_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Salary", "Gender", "Departement"
            }
        ));
        tbl_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_showMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_show);

        btn_add.setBackground(new java.awt.Color(51, 255, 204));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(0, 0, 204));
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_button.setBackground(new java.awt.Color(102, 255, 204));
        btn_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_button.setForeground(new java.awt.Color(0, 0, 153));
        btn_button.setText("Update");
        btn_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buttonActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(153, 255, 204));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(0, 0, 153));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_text_name, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rbtn_male, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbtn_female)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(box_departement, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit_text_salary)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_text_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_text_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtn_male)
                            .addComponent(rbtn_female)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_departement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_delete)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void fillcombox() {
        try {
            PreparedStatement stn = con.prepareStatement("select dept_id,dept_name from department");
            ResultSet rs = stn.executeQuery();
            while (rs.next()) {
                deptids.add(rs.getInt(1));
                box_departement.addItem(rs.getString(2));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "You Get Error");
        }
    }

    private void filltable() {
        {
            try {
                dtn.setRowCount(0);
                PreparedStatement stn = con.prepareStatement("select emp_id,emp_name,salary,gender,dept_name from empolyee, department where empolyee.dept_id=department.dept_id");
                ResultSet rs = stn.executeQuery();
                while (rs.next()) {
                    empids.add(rs.getInt(1));
                    dtn.addRow(new Object[]{rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5)});

                }
                tbl_show.setModel(dtn);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "You Get Error");
            }
        }
    }

    private void edit_text_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_text_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_text_nameActionPerformed

    private void rbtn_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_maleActionPerformed

    private void rbtn_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_femaleActionPerformed

    }//GEN-LAST:event_rbtn_femaleActionPerformed

    private void box_departementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_departementActionPerformed

    }//GEN-LAST:event_box_departementActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        if (!edit_text_name.getText().isEmpty() && !edit_text_salary.getText().equals("")) {
            try {
                String empName = edit_text_name.getText();
                double empsalary = Double.valueOf(edit_text_salary.getText());
                String gender = "";
                if (rbtn_female.isSelected()) {
                    gender = "female";
                } else {
                    gender = "male";
                }

                PreparedStatement stmt = con.prepareStatement("insert into empolyee(emp_name,salary,gender,dept_id)values (?,?,?,?)");
                stmt.setString(1, empName);
                stmt.setDouble(2, empsalary);
                stmt.setString(3, gender);
                stmt.setInt(4, deptids.get(box_departement.getSelectedIndex()));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "this added successful :");
                filltable();
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "error conection between employee table try again");
            }

            String deptname = box_departement.getSelectedItem().toString();


    }//GEN-LAST:event_btn_addActionPerformed
    }
    private void tbl_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_showMouseClicked
        edit_text_name.setText(tbl_show.getValueAt(tbl_show.getSelectedRow(), 0).toString());
        edit_text_salary.setText(tbl_show.getValueAt(tbl_show.getSelectedRow(), 1).toString());
        if (tbl_show.getValueAt(tbl_show.getSelectedRow(), 2) != null) {
            if (tbl_show.getValueAt(tbl_show.getSelectedRow(), 2).toString().equals("male")) {
                rbtn_male.setSelected(true);
            } else {
                rbtn_female.setSelected(true);
            }
        }
        box_departement.setSelectedItem(tbl_show.getValueAt(tbl_show.getSelectedRow(), 3));
    }//GEN-LAST:event_tbl_showMouseClicked

    private void btn_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buttonActionPerformed
        if (!edit_text_name.getText().isEmpty() && !edit_text_salary.getText().equals("")) {
            try {
                String empName = edit_text_name.getText();
                double empsalary = Double.valueOf(edit_text_salary.getText());
                String gender = "";
                if (rbtn_female.isSelected()) {
                    gender = "female";
                } else {
                    gender = "male";
                }

                PreparedStatement stmt = con.prepareStatement("update empolyee set emp_name=?,salary=?,gender=?,dept_id=? where emp_id=?");
                stmt.setString(1, empName);
                stmt.setDouble(2, empsalary);
                stmt.setString(3, gender);
                stmt.setInt(4, deptids.get(box_departement.getSelectedIndex()));
                stmt.setInt(5, empids.get(tbl_show.getSelectedRow()));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "this updated successful :");
                filltable();
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "error conection between employee table try again");
            }

            String deptname = box_departement.getSelectedItem().toString();

        }
    }//GEN-LAST:event_btn_buttonActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            PreparedStatement stmt = con.prepareStatement("delete from empolyee  where emp_id=?");
            stmt.setInt(1, empids.get(tbl_show.getSelectedRow()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "this Deleted successful :");
            filltable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error connection failed in delete function");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         this.dispose();
         new nextframe().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_departement;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_button;
    private javax.swing.JButton btn_delete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edit_text_name;
    private javax.swing.JTextField edit_text_salary;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JTable tbl_show;
    // End of variables declaration//GEN-END:variables
}

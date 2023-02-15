/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip.calculator.by.blackbird;
import java.util.*;
import java.util.regex.*;
import java.util.logging.*; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ashish Waykar
 */
public class IPCalculatorByBlackBird extends JFrame {

    /**
     * @param args the command line arguments
     */
     JTextArea ID;
    JTextField bin_ip;
    JTextField class_1;
    JButton close;
    JButton compute;
    JButton dm;
    JTextField good;
    JTextField ipadd;
    JButton jButton2;
    JLabel jLabel1;
    JLabel jLabel10;
    JLabel jLabel11;
    JLabel jLabel12;
    JLabel jLabel13;
    JLabel jLabel14;
    JLabel jLabel15;
    JLabel jLabel16;
    JLabel jLabel17;
    JLabel jLabel18;
    JLabel jLabel19;
    JLabel jLabel2;
    JLabel jLabel20;
    JLabel jLabel21;
    JLabel jLabel3;
    JLabel jLabel4;
    JLabel jLabel5;
    JLabel jLabel6;
    JLabel jLabel7;
    JLabel jLabel8;
    JLabel jLabel9;
    JPanel jPanel1;
    JPanel jPanel2;
    JPanel jPanel3;
    JPanel jPanel4;
    JScrollPane jScrollPane1;
    JTextField jTextField1;
    JTextField mask_bin;
    JTextField no_host;
    JTextField nwID;
    JTextField nwID_bin;
    JTextField range;
    JButton reset;
    JTextField subnet_mask1;
    JTextField subnw;
    JTextField type;
    
    String ip_type ;
int cidr;
    public IPCalculatorByBlackBird() {
        initComponents();
    }

    
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        ipadd = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        nwID = new JTextField();
        reset = new JButton();
        dm = new JButton();
        compute = new JButton();
        subnet_mask1 = new JTextField();
        jPanel2 = new JPanel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        good = new JTextField();
        jLabel6 = new JLabel();
        type = new JTextField();
        jLabel12 = new JLabel();
        class_1 = new JTextField();
        jLabel13 = new JLabel();
        jTextField1 = new JTextField();
        jLabel14 = new JLabel();
        jPanel3 = new JPanel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        bin_ip = new JTextField();
        jLabel9 = new JLabel();
        mask_bin = new JTextField();
        jLabel10 = new JLabel();
        nwID_bin = new JTextField();
        close = new JButton();
        jButton2 = new JButton();
        jLabel21 = new JLabel();
        jLabel20 = new JLabel();
        jPanel4 = new JPanel();
        jLabel11 = new JLabel();
        jLabel15 = new JLabel();
        subnw = new JTextField();
        jLabel16 = new JLabel();
        no_host = new JTextField();
        jLabel17 = new JLabel();
        range = new JTextField();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jScrollPane1 = new JScrollPane();
        ID = new JTextArea();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ip calculator by, BlackBird_SR71");

        jLabel1.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("IP Address : ");

        ipadd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ipaddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Subnet Mask :");

        jLabel3.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Network ID : ");

        nwID.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                nwIDActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        dm.setText("Default Mask");
        dm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dmActionPerformed(evt);
            }
        });

        compute.setText("Compute Now");
        compute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                computeActionPerformed(evt);
            }
        });

        

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ipadd, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nwID, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compute, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subnet_mask1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dm, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ipadd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dm)
                    .addComponent(subnet_mask1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nwID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(compute))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel4.setFont(new Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel4.setText("Network Information ");

        jLabel5.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText(" Ip address Class :");

        good.setEditable(false);

        jLabel6.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Address Type : ");

        type.setEditable(false);
        

        jLabel12.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Good IP for Host :");

        class_1.setEditable(false);

        jLabel13.setText("Yes/No");

        

        jLabel14.setText("Reason");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(class_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(type)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(good, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField1))))))
                .addContainerGap())
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(class_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(good, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel7.setFont(new Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel7.setText("Binary Information");

        jLabel8.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("IP Address :");

        bin_ip.setEditable(false);

        jLabel9.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Mask :");

        mask_bin.setEditable(false);
        

        jLabel10.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Network ID:");

        close.setText("CLOSE");
        

        jButton2.setText("SAVE ");
        

        jLabel21.setFont(new Font("SimSun", 1, 18));
        jLabel21.setText("Reg.ID : 2021BIT507 & 2021BIT508");

        jLabel20.setFont(new Font("SimSun", 1, 18)); 
        jLabel20.setText("Created By, Ashish Waykar & Shree Jogi");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(63, 63, 63))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(bin_ip)
                    .addComponent(mask_bin)
                    .addComponent(nwID_bin)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel20, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bin_ip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mask_bin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nwID_bin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(close, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(6, 6, 6)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        jLabel11.setFont(new Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel11.setText("Subnetting Information");

        jLabel15.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Network ID's");

        subnw.setEditable(false);
        

        jLabel16.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("  No. of Subnetworks :");

        no_host.setEditable(false);
        

        jLabel17.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("  No. of Hosts :");

        range.setEditable(false);
        ;

        jLabel18.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("          Broadcast ID's");

        jLabel19.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("  Network Range :");

        ID.setColumns(20);
        ID.setRows(5);
        jScrollPane1.setViewportView(ID);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(subnw, GroupLayout.Alignment.TRAILING)
                    .addComponent(no_host)
                    .addComponent(range)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(subnw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(no_host, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(range, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addComponent(jPanel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))))
        );

        pack();
    }                      

    private void ipaddActionPerformed(ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void typeActionPerformed(ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void nwIDActionPerformed(ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void resetActionPerformed(ActionEvent evt) {                                      
        // TODO add your handling code here:
        ipadd.setText("");
        type.setText("");
        nwID.setText("");
    }                                     

    private void dmActionPerformed(ActionEvent evt) {
        subnw.setText("0");
        String ip_add = ipadd.getText();
        System.out.print(ip_add);
       String[] ipadd = ip_add.split(Pattern.quote("."));
       String ip = ipadd[0];
       System.out.print(ip);
       int ip_cl= Integer.parseInt(ip);
       
           if( ip_cl <= 126 ){
               subnet_mask1.setText("255.0.0.0");
               
               ip_type = "a";
               class_1.setText("A");
               
           }
           else if( ip_cl>=127 && ip_cl <= 191 ){
               subnet_mask1.setText("255.255.0.0");
               ip_type = "b";
               class_1.setText("B");
           }
           else if( ip_cl>= 192 && ip_cl <= 223 ){
               subnet_mask1.setText("255.255.255.0");
               ip_type = "c";
               class_1.setText("C");
           }
           else {
               JOptionPane.showMessageDialog(rootPane, "Please enter valid ip address");
           }
       
       
        
    }                                  

    private void computeActionPerformed(ActionEvent evt) {                                        
        
       String ip_add = ipadd.getText();
        System.out.print(ip_add);
       String[] ipadd = ip_add.split(Pattern.quote("."));
       String ip1 = ipadd[0];
       String ip2 = ipadd[1];
       String ip3 = ipadd[2];
       String ip4 = ipadd[3];
       int ip_0 = Integer.parseInt(ip1);
       int ip_1 = Integer.parseInt(ip2);
       int ip_2 = Integer.parseInt(ip3);
       int ip_3 = Integer.parseInt(ip4);
       good.setText("Yes");
       String cidrv = subnet_mask1.getText();
           switch(cidrv){
           case "0.0.0.0" : cidr=0;subnet_mask1.setText("0.0.0.0"); no_host.setText("4292967294"); break;
           case "128.0.0.0" : cidr=1;subnet_mask1.setText("128.0.0.0");no_host.setText("2147483646"); break;
           case "192.0.0.0": cidr=2;subnet_mask1.setText("192.0.0.0");no_host.setText("1073741822"); break;
           case "224.0.0.0": cidr=3;subnet_mask1.setText("224.0.0.0");no_host.setText("536870910"); break;
           case "240.0.0.0": cidr=4;subnet_mask1.setText("240.0.0.0");no_host.setText("268435454"); break;
           case "248.0.0.0": cidr=5;subnet_mask1.setText("248.0.0.0");no_host.setText("134217726"); break;
           case "252.0.0.0": cidr=6;subnet_mask1.setText("252.0.0.0"); no_host.setText("67108862");break;
           case "254.0.0.0": cidr=7;subnet_mask1.setText("254.0.0.0");no_host.setText("33554430"); break;
           case "255.0.0.0": cidr=8;subnet_mask1.setText("255.0.0.0");no_host.setText("16777214"); subnw.setText("0");break;
           case "255.128.0.0": cidr=9;subnet_mask1.setText("255.128.0.0"); no_host.setText("8388606");subnw.setText("2 (0)");break;
           case "255.192.0.0": cidr=10;subnet_mask1.setText("255.192.0.0"); no_host.setText("4194302");subnw.setText("4 (2)");break;
           case "255.224.0.0": cidr=11;subnet_mask1.setText("255.224.0.0"); no_host.setText("2097150");subnw.setText("8 (6)");break;
           case "255.240.0.0": cidr=12;subnet_mask1.setText("255.240.0.0");no_host.setText("1048574"); subnw.setText("16 (14");break;
           case "255.248.0.0": cidr=13;subnet_mask1.setText("255.248.0.0"); no_host.setText("524286");subnw.setText("32 (30)");break;
           case "255.252.0.0": cidr=14;subnet_mask1.setText("255.252.0.0");no_host.setText("262142");subnw.setText("64 (62)"); break;
           case "255.254.0.0": cidr=15;subnet_mask1.setText("255.254.0.0"); no_host.setText("131070");subnw.setText("128 (126)");break;
           case "255.255.0.0": cidr=16;subnet_mask1.setText("255.255.0.0");no_host.setText("65534"); subnw.setText("256 (254)");break;
           case "255.255.128.0": cidr=17;subnet_mask1.setText("255.255.128.0");no_host.setText("32766");subnw.setText("512 (510)"); break;
           case "255.255.192.0": cidr=18;subnet_mask1.setText("255.255.192.0");no_host.setText("16382"); subnw.setText("1024 (1022");break;
           case "255.255.224.0": cidr=19;subnet_mask1.setText("255.255.224.0");no_host.setText("8190"); subnw.setText("2048 (2046)");break;
           case "255.255.240.0": cidr=20;subnet_mask1.setText("255.255.240.0"); no_host.setText("4094");subnw.setText("4096 (4094)");break;
           case "255.255.248.0": cidr=21;subnet_mask1.setText("255.255.248.0"); no_host.setText("2046");subnw.setText("8192 (8190))");break;
           case "255.255.252.0": cidr=22;subnet_mask1.setText("255.255.252.0");no_host.setText("1022"); subnw.setText("16384 (16382)");break;
           case "255.255.254.0": cidr=23;subnet_mask1.setText("255.255.254.0");no_host.setText("510"); subnw.setText("32768 (32766)");break;
           case "255.255.255.0": cidr=24;subnet_mask1.setText("255.255.255.0"); no_host.setText("254");subnw.setText("65536 (65534)");break;
           case "255.255.255.128": cidr=25;subnet_mask1.setText("255.255.255.128"); no_host.setText("126");subnw.setText("131072 (131070)");break;
           case "255.255.255.192": cidr=26;subnet_mask1.setText("255.255.255.192"); no_host.setText("62");subnw.setText("262144 (262142)");break;
           case "255.255.255.224": cidr=27;subnet_mask1.setText("255.255.255.224"); no_host.setText("30");subnw.setText("524288 (524286)");break;
           case "255.255.255.240": cidr=28;subnet_mask1.setText("255.255.255.240"); no_host.setText("14");subnw.setText("1048576 (1048574)");break;
           case "255.255.255.248": cidr=29;subnet_mask1.setText("255.255.255.248"); no_host.setText("6");subnw.setText("2097152 (2097150)");break;
           case "255.255.255.252": cidr=30;subnet_mask1.setText("255.255.255.252"); no_host.setText("2");subnw.setText("2097152 (2097150)");break;
           case "255.255.255.254": cidr=31;subnet_mask1.setText("255.255.255.254"); no_host.setText("0");subnw.setText("2097152 (2097150)");break;
           case "255.255.255.255": cidr=32;subnet_mask1.setText("255.255.255.255"); no_host.setText("0");subnw.setText("2097152 (2097150)");break;
               
           default: subnet_mask1.setText("Invalid");
       }
      
        if(ip_type == "a"){
            range.setText("1");
            
            
            nwID.setText(ip1+".0.0.0"+"./"+cidr);
           
             ID.setText(ip1+"."+ip2+"."+ip3+"."+ip4+"  \t     \t"+ip1+"."+ip2+"."+ip3+"."+"255");
            if( ip_0==10 ){
               if (ip_1 <=255 && ip_2 <=255 && ip_3<=255) {
                   type.setText("Reserved");
               }
                
            }
        }
        if(ip_type == "b"){
            range.setText("2");
             
            
             ID.setText(ip1+"."+ip2+"."+ip3+"."+ip4+"  \t     \t"+ip1+"."+ip2+"."+"255"+"."+"255");
             
            nwID.setText(ip1+"."+ip2+".0.0"+"./"+cidr);
            if( ip_0==127 && ip_1 == 16 ){
               if (  ip_2 <=255 && ip_3<=255) {
                   type.setText("Reserved");
               }
                
            }
        }
        if(ip_type == "c"){
            range.setText("1");
             
            
             ID.setText(ip1+"."+ip2+"."+ip3+"."+ip4+"  \t     \t"+ip1+"."+"255"+"."+"255"+"."+"255");
            nwID.setText(ip1+"."+ip2+"."+ip3+".0"+"./"+cidr);
            if( ip_0==192 && ip_1 == 168 ){
               if (  ip_2 <=255 && ip_3<=255) {
                   type.setText("Reserved");
               }
                
            }
        }
        String ip0_b = Integer.toBinaryString(ip_0);
        String ip1_b = Integer.toBinaryString(ip_1);
        String ip2_b = Integer.toBinaryString(ip_2);
        String ip3_b = Integer.toBinaryString(ip_3);
        String z = "";
        String z1 = "";String z2 = "";String z3 = "";
        if(ip0_b.length() <8 ){
            for (int i=0;i<(8 - ip0_b.length());i++){
                z = z.concat("0");
            }
        }
        if(ip1_b.length() <8 ){
           
            for (int i=0;i<(8 - ip1_b.length());i++){
                z1 = z1.concat("0");
            }
        }
        if(ip2_b.length() <8 ){
           for (int i=0;i<(8 - ip2_b.length());i++){
                z2 = z2.concat("0");
            }
        }
        if(ip3_b.length() <8 ){
           for (int i=0;i<(8 - ip3_b.length());i++){
                z3 = z3.concat("0");
            }
        }
        
        String ip0 = z.concat(String.valueOf(ip0_b));
        String ip11 = z1.concat(String.valueOf(ip1_b));
        String ip22 = z2.concat(String.valueOf(ip2_b));
        String ip23 = z3.concat(String.valueOf(ip3_b));
        bin_ip.setText(ip0+"."+ip11+"."+ip22+"."+ip23);
        
         String mask = subnet_mask1.getText();
        String[] m = mask.split(Pattern.quote("."));
       String m11 = m[0];
       String m12 = m[1];
       String m13 = m[2];
       String m14 = m[3];
       
       int m111 = Integer.parseInt(m11);
       int m121 = Integer.parseInt(m12);
       int m131 = Integer.parseInt(m13);
       int m141 = Integer.parseInt(m14);
       
       
       String m1 = Integer.toBinaryString(m111);
       String m2 = Integer.toBinaryString(m121);
       String m3 = Integer.toBinaryString(m131);
       String m4 = Integer.toBinaryString(m141);
       String zm = "";
        String zm1 = "";String zm2 = "";String zm3 = "";
        if(m1.length() <8 ){
            for (int i=0;i<(8 - m1.length());i++){
                zm = zm.concat("0");
            }
        }
        if(m2.length() <8 ){
           
            for (int i=0;i<(8 - m2.length());i++){
                zm1 = zm1.concat("0");
            }
        }
        if(m3.length() <8 ){
           for (int i=0;i<(8 - m3.length());i++){
                zm2 = zm2.concat("0");
            }
        }
        if(m4.length() <8 ){
           for (int i=0;i<(8 - m4.length());i++){
                zm3 = zm3.concat("0");
            }
        }
        
        String im0 = zm.concat(String.valueOf(m1));
        String im1 = zm1.concat(String.valueOf(m2));
        String im2 = zm2.concat(String.valueOf(m3));
        String im3 = zm3.concat(String.valueOf(m4));
        mask_bin.setText(im0+"."+im1+"."+im2+"."+im3);
        
        String network = nwID.getText();
        String[] n = network.split(Pattern.quote("."));
       String n1 = n[0];
       String n2 = n[1];
       String n3 = n[2];
       String n4 = n[3];
       
        int n11 = Integer.parseInt(n1);
       int n12 = Integer.parseInt(n2);
       int n13 = Integer.parseInt(n3);
       int n14 = Integer.parseInt(n4);
       
       
       String n111 = Integer.toBinaryString(n11);
        String n121 = Integer.toBinaryString(n12);
        String n131 = Integer.toBinaryString(n13);
        String n141 = Integer.toBinaryString(n14);
       String zn = "";
        String zn1 = "";String zn2 = "";String zn3 = "";
        if(n111.length() <8 ){
            for (int i=0;i<(8 - n111.length());i++){
                zn = zn.concat("0");
            }
        }
        if(n121.length() <8 ){
           
            for (int i=0;i<(8 - n121.length());i++){
                zn1 = zn1.concat("0");
            }
        }
        if(n131.length() <8 ){
           for (int i=0;i<(8 - n131.length());i++){
                zn2 = zn2.concat("0");
            }
        }
        if(n141.length() <8 ){
           for (int i=0;i<(8 - n141.length());i++){
                zn3 = zn3.concat("0");
            }
        }
        
        String in0 = zn.concat(String.valueOf(n111));
        String in1 = zn1.concat(String.valueOf(n121));
        String in2 = zn2.concat(String.valueOf(n131));
        String in3 = zn3.concat(String.valueOf(n141));
        nwID_bin.setText(in0+"."+in1+"."+in2+"."+in3);
        
    }                                       
        
    public static void main(String args[]) {
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Ashish We Encountered Error !");
            Logger.getLogger(IPCalculatorByBlackBird.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IPCalculatorByBlackBird().setVisible(true);
            }
        });
    }

    
}

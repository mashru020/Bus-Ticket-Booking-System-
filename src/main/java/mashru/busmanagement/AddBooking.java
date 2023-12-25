package mashru.busmanagement;


import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author mashru
 */
public final class AddBooking extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBooking
     */
    
    private final String luser;
    
    public String dburl = "jdbc:postgresql://localhost:5432/bums";
    public String dbuser = "postgres";
    public String dbpassword = "postgres";
    
    public AddBooking(String loginuser) {
        initComponents();
        sourceCBFillData();
        destinationCBFillData();
        this.luser=loginuser;
    }
    
    public void sourceCBFillData() {
        try (Connection connection = DriverManager.getConnection(dburl, dbuser, dbpassword)){
             String query = "SELECT bus_source FROM \"bus\".bus_details";
             try (PreparedStatement pst = connection.prepareStatement(query);
                 ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    jComboBox1.addItem(rs.getString("bus_source"));
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void destinationCBFillData() {
        try (Connection connection = DriverManager.getConnection(dburl, dbuser, dbpassword)){
             String query = "SELECT bus_dest FROM \"bus\".bus_details";
             try (PreparedStatement pst = connection.prepareStatement(query);
                 ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    jComboBox2.addItem(rs.getString("bus_dest"));
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("Add Booking Info");

        jLabel2.setText("Source : ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]  {}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Destination : ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Date : ");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Search Result ...........");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bus No", "Movement", "Source", "Destimnation", "Date", "time", "Price", "Seat"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setText("Booking Details ......................");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Booked By", "Journey Date", "Bus No", "Seat No", "Passanger Name", "Phone Number"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); 
        String src = (String)jComboBox1.getSelectedItem();
        String dest = (String)jComboBox2.getSelectedItem();
        String date = jTextField1.getText();
        
        try (Connection connection = DriverManager.getConnection(dburl, dbuser, dbpassword)) {
            String query = "SELECT * FROM \"bus\".bus_details WHERE bus_source='"+src+"' and bus_dest='"+dest+"'";
            try (PreparedStatement pst = connection.prepareStatement(query);
                 ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String busNo = rs.getString("bus_no");
                    String movement = rs.getString("movement");
                    String source = rs.getString("bus_source");
                    String destination = rs.getString("bus_dest");
                    String dDate = rs.getString("depart_date");
                    String dTime = rs.getString("depart_time");
                    String price = rs.getString("price");
                    String seat = rs.getString("total_seat");

                    model.addRow(new Object[]{busNo,movement, source, destination,dDate,dTime, price, seat});
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void infoMessage(String message, String tittle) {
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int index =jTable2.getSelectedRow();
        TableModel model=jTable2.getModel();
        String bus_no=(String) model.getValueAt(index, 0);
        String movement=(String) model.getValueAt(index, 1);
        String bus_source=(String) model.getValueAt(index, 2);
        String bus_dest=(String) model.getValueAt(index, 3);
        String depart_date=model.getValueAt(index, 4).toString();  
        String depart_time=(String) model.getValueAt(index, 5);
        String price=(String) model.getValueAt(index, 6);
        String avail_seat=(String) model.getValueAt(index, 7);

        BookingFormFrame=new JFrame();
        BookingFormPanel=new JPanel();
        gl=new GridLayout(0,4);
        l1=new JLabel("Bus No");
        l11=new JLabel(bus_no);
        l2=new JLabel("Movement");
        l12=new JLabel(movement);
        l3=new JLabel("Bus Source");
        l13=new JLabel(bus_source);
        l4=new JLabel("Bus Dest");
        l14=new JLabel(bus_dest);
        l5=new JLabel("Depart Date");
        l15=new JLabel(depart_date);
        l6=new JLabel("Depart Time");
        l16=new JLabel(depart_time);
        l7=new JLabel("Price/seat");
        l17=new JLabel(price);
        l8=new JLabel("Available Seat");
        l18=new JLabel(avail_seat);
        seatnoL=new JLabel("Seat No");
        phonenoL=new JLabel("Phone No.");
        fnameL=new JLabel("Name");
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(20);
        
        BookingFormFrame.getContentPane().add(BookingFormPanel);
        BookingFormPanel.setLayout(gl);
        
        BookingFormPanel.add(l1);
        BookingFormPanel.add(l11);
        BookingFormPanel.add(l2);
        BookingFormPanel.add(l12);
        BookingFormPanel.add(l3);
        BookingFormPanel.add(l13);
        BookingFormPanel.add(l4);
        BookingFormPanel.add(l14);
        BookingFormPanel.add(l5);
        BookingFormPanel.add(l15);
        BookingFormPanel.add(l6);
        BookingFormPanel.add(l16);
        BookingFormPanel.add(l7);
        BookingFormPanel.add(l17);
        BookingFormPanel.add(l8);
        BookingFormPanel.add(l18);
        
        BookingFormPanel.add(seatnoL);
        BookingFormPanel.add(t1);
        BookingFormPanel.add(phonenoL);
         BookingFormPanel.add(t2);
        BookingFormPanel.add(fnameL);
         BookingFormPanel.add(t3);
        
       int result = JOptionPane.showConfirmDialog(BookingFormFrame,BookingFormPanel,"Booking Form",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if(result==JOptionPane.OK_OPTION)
        {
            String booking_user=luser;
            String seatno=t1.getText();
            String phoneno=t2.getText();
            String name=t3.getText();
            try(Connection connection = DriverManager.getConnection(dburl, dbuser, dbpassword)){
            Statement stat = connection.createStatement();    
            String selectQuery = "select * from \"bus\".bus_booking where bus_no ='"+bus_no+"' and journey_date='"+depart_date+"' and seat='"+seatno+"'";
            System.out.println(selectQuery);
            ResultSet rs=stat.executeQuery(selectQuery);
         //   System.out.println(rs.next());
           if(rs.next())
           {
             infoMessage("Already Booked", "ALert !!");
            
           }
           else
           {
               String insertQuery= "INSERT INTO \"bus\".bus_booking (booking_user, journey_date, bus_no, seat, passenger_name, phone_no) VALUES (?, ?,?,?,?,?)";
         
                try (PreparedStatement insertStatement = connection.prepareStatement(insertQuery)) {
                    // Set values for the parameters in the SQL statement
                    insertStatement.setString(1, booking_user);
                    insertStatement.setString(2, depart_date);
                    insertStatement.setString(3, bus_no );
                    insertStatement.setString(4, seatno);
                    insertStatement.setString(5, name);
                    insertStatement.setString(6, phoneno);

                    // Execute the insert statement
                    int rowsAffected = insertStatement.executeUpdate();
                    
                    // Check the result
                    if (rowsAffected > 0) {
                        int remaining_seat=Integer.parseInt(avail_seat)-Integer.parseInt(seatno);
           
                        String updateQuery="update \"bus\".bus_details set total_seat='"+remaining_seat+"' where bus_no='"+bus_no+"' and movement='"+movement+"' and depart_date='"+depart_date+"'";
                        int j=stat.executeUpdate(updateQuery);
                        if(j==1)
                        {

                            String src = (String)jComboBox1.getSelectedItem();
                            String dest = (String)jComboBox2.getSelectedItem();


                            infoMessage("Booking Done", "Alert !!");

//                            String selectQuery1 = "SELECT * FROM \"bus\".bus_booking WHERE bus_source='"+src+"' and bus_dest='"+dest+"'";
                            String selectQuery1 = "SELECT * FROM \"bus\".bus_booking";
                            ResultSet rs1=stat.executeQuery(selectQuery1);

                          jTable3.setModel(DbUtils.resultSetToTableModel(rs1));
                          jTable3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

                        }
//                        dispose();
                    } else {
                        System.out.println("Failed to insert data.");
                    }
                }
//                
                int i= stat.executeUpdate(insertQuery);
            }
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
            
        }
    }//GEN-LAST:event_jTable2MouseClicked
    GridLayout gl;    
    public JFrame BookingFormFrame;
    public JPanel BookingFormPanel;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l11,l12,l13,l14,l15,l16,l17,l18,seatnoL,phonenoL,fnameL,lnameL;
    public JComboBox seatCB;
    public JTextField t1,t2,t3;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

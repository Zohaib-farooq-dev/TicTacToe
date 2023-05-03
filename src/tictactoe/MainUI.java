/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author zubair farooq
 */
public class MainUI extends javax.swing.JFrame {

    private String startgame = "X";
    private int xcount = 0;
    private int ocount = 0;
    private int i =0;
   
    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
    }
    private void gamescore()
    {
        playerxxx.setText(String.valueOf(xcount));
        playerooo.setText(String.valueOf(ocount));
    }
    private void choose_a_player()
    {
        if(startgame.equalsIgnoreCase("X"))
        {
            startgame = "O";
        }
        else
        {
            startgame = "X";
        }
    }
    private void highlight(){
        if(startgame.equalsIgnoreCase("X")){
            playero.setForeground(Color.LIGHT_GRAY);
            //playerx.setForeground(Color.red);
        }else{
            playerx.setForeground(Color.red);
            //playero.setForeground(Color.red);
        }
    }
    private void dehighlight(){
        playerx.setForeground(Color.LIGHT_GRAY);
        playero.setForeground(Color.LIGHT_GRAY);
    }
    private void winninggame()
    {
        String b1 = jButton2.getText();
        String b2 = jButton1.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        
        //player X coding
        if(b1 =="X"&& b2=="X"&& b3 == "X")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player X win");
            xcount++;
            gamescore();
            
            jButton2.setBackground(Color.ORANGE);
            jButton1.setBackground(Color.ORANGE);
            jButton3.setBackground(Color.ORANGE);
        }
        else if(b4 =="X"&& b5=="X"&& b6 == "X")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player X win");
            xcount++;
            gamescore();
            
            jButton4.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
        }
        else  if(b7 =="X"&& b8=="X"&& b9 == "X")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player X win");
            xcount++;
            gamescore();
            
            jButton7.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
        }
        else if(b1 =="X"&& b4=="X"&& b7 == "X")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player X win");
            xcount++;
            gamescore();
            
            jButton2.setBackground(Color.ORANGE);
            jButton4.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
        }
        else if(b2 =="X"&& b5=="X"&& b8 == "X")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player X win");
            xcount++;
            gamescore();
            
            jButton1.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
        }
        else if(b3 =="X"&& b6=="X"&& b9 == "X")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player X win");
            xcount++;
            gamescore();
            
            jButton3.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
        }
        else if(b1 =="X"&& b5=="X"&& b9 == "X")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player X win");
            xcount++;
            gamescore();
            
            jButton2.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
        }
        else if(b3 =="X"&& b5=="X"&& b7 == "X")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player X win");
            xcount++;
            gamescore();
            
            jButton3.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
        }
        
       //player O coding
        else if(b1 =="O"&& b2=="O"&& b3 == "O")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player O win");
            ocount++;
            gamescore();
            
            jButton2.setBackground(Color.ORANGE);
            jButton1.setBackground(Color.ORANGE);
            jButton3.setBackground(Color.ORANGE);
        }
        else  if(b4 =="O"&& b5=="O"&& b6 == "O")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player O win");
            ocount++;
            gamescore();
            
            jButton4.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
        }
        else if(b7 =="O"&& b8=="O"&& b9 == "O")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player O win");
            ocount++;
            gamescore();
            
            jButton7.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
        }
        else if(b1 =="O"&& b4=="O"&& b7 == "O")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player O win");
            ocount++;
            gamescore();
            
            jButton2.setBackground(Color.ORANGE);
            jButton4.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
        }
        else  if(b2 =="O"&& b5=="O"&& b8 == "O")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player O win");
            ocount++;
            gamescore();
            
            jButton1.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
        }
        else if(b3 =="O"&& b6=="O"&& b9 == "O")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player X win");
            xcount++;
            gamescore();
            
            jButton3.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
        }
        else if(b1 =="O"&& b5=="O"&& b9 == "O")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player O win");
            ocount++;
            gamescore();
            
            jButton2.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
        }
        else  if(b3 =="O"&& b5=="O"&& b7 == "O")
        {
            JOptionPane.showMessageDialog(MainUI.this, " Player O win");
            ocount++;
            gamescore();
            
            jButton3.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
        }
        else if( i==9 )
        {
            JOptionPane.showMessageDialog(MainUI.this, "Draw !! No Player win!!");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        playerxxx = new javax.swing.JLabel();
        playerooo = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tic Tac Toe Game ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(212, 212, 212))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Microsoft YaHei", 3, 18)); // NOI18N
        jButton10.setText("Reset ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Microsoft YaHei", 3, 18)); // NOI18N
        jButton11.setText("Exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black));

        playero.setFont(new java.awt.Font("Microsoft YaHei", 3, 14)); // NOI18N
        playero.setText("Player O :");

        playerxxx.setFont(new java.awt.Font("Microsoft YaHei", 3, 14)); // NOI18N
        playerxxx.setText("XXXXX");

        playerooo.setFont(new java.awt.Font("Microsoft YaHei", 3, 14)); // NOI18N
        playerooo.setText("XXXXX");

        playerx.setFont(new java.awt.Font("Microsoft YaHei", 3, 14)); // NOI18N
        playerx.setText("Player X :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerxxx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerooo)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        highlight();
        jButton2.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.RED);
        }
        else
        {
           jButton2.setForeground(Color.MAGENTA);
        }
        
        choose_a_player();
        i++;
        winninggame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(startgame);
         
        highlight();
        dehighlight();
        if(startgame.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.RED);
        }
        else
        {
           jButton1.setForeground(Color.MAGENTA);
        }
       
        choose_a_player();
        i++;
        winninggame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want EXit!!",
                "Main UI", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(startgame);
         dehighlight();
        highlight();
        if(startgame.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.RED);
        }
        else
        {
           jButton3.setForeground(Color.MAGENTA);
        }
       
        choose_a_player();
        i++;
        winninggame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(startgame);
         dehighlight();
        highlight();
        if(startgame.equalsIgnoreCase("X"))
        {
            jButton4.setForeground(Color.RED);
        }
        else
        {
           jButton4.setForeground(Color.MAGENTA);
        }
       
        choose_a_player();
        i++;
        winninggame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(startgame);
         dehighlight();
        highlight();
        if(startgame.equalsIgnoreCase("X"))
        {
            jButton5.setForeground(Color.RED);
        }
        else
        {
           jButton5.setForeground(Color.MAGENTA);
        }
       
        choose_a_player();
        i++;
        winninggame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(startgame);
         dehighlight();
        highlight();
        if(startgame.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(Color.RED);
        }
        else
        {
           jButton6.setForeground(Color.MAGENTA);
        }
       
        choose_a_player();
        i++;
        winninggame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(startgame);
         dehighlight();
        highlight();
        if(startgame.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.RED);
        }
        else
        {
           jButton7.setForeground(Color.MAGENTA);
        }
       
        choose_a_player();
        i++;
        winninggame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(startgame);
        if(startgame.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.RED);
        }
        else
        {
           jButton8.setForeground(Color.MAGENTA);
        }
        dehighlight();
        highlight();
        choose_a_player();
        i++;
        winninggame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(startgame);
        if(startgame.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.RED);
        }
        else
        {
           jButton9.setForeground(Color.MAGENTA);
        }
        dehighlight();
        highlight();
        i++;
        choose_a_player();
        winninggame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        i =0;
        jButton1.setText(null);
        jButton2.setText(null); 
        jButton3.setText(null);
        
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
            
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
        playerx.setForeground(Color.BLACK);
        playero.setForeground(Color.BLACK);
         
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    // End of variables declaration//GEN-END:variables
}

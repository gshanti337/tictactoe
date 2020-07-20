/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictoktoc;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Shanti
 */
public class Tik_Tok_Toe extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    int i=0;//for draw_value 
    int value=0; //0--for x and 1--0
    String s="X"; //It changing w.r.t value which is already declare above
    boolean m1=false;
    boolean m2=false;
    boolean m3=false;
    boolean m4=false;
    boolean m5=false;
    boolean m6=false;
    boolean m7=false;
    boolean m8=false;
    JButton[] a;// from button b1 to b9 array
    JButton[] a1;//for add 3 into it expect these button all button will be disabled
    String name;//disply winner name
    boolean firstFrameValue=false; /* for open next frame for which purpose like when player play or when computer play
                        2 player (firstFrameValue-true) or compuer (firstFrameValue-false)*/
    int buttonNumber; //it defines  actual position  button on graphics
    computerGame CG=new computerGame();
    JButton[][] arrayOfBoxes;
    public Tik_Tok_Toe(boolean b) {
        initComponents();
       this.getContentPane().setBackground(Color.white);
        Win_Or_Draw_Disply.setFont(new java.awt.Font("Tahoma",1,18));
        if(b)
           this.firstFrameValue=b;
        else
        {
            CG.initialValueOfBox();//Initialize value of box array;
            bname2.setText("Computer");
            jLabel2.setText("Player2");
            bname2.setEditable(false);
        }
    } 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 9), new java.awt.Dimension(0, 9), new java.awt.Dimension(32767, 9));
        Win_Or_Draw_Disply = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bname1 = new javax.swing.JTextField();
        bname2 = new javax.swing.JTextField();
        bResetGAme = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 198, 202));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        b4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        b7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        b2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        b5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        b8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        b3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        b6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        b9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        Win_Or_Draw_Disply.setFont(new java.awt.Font("Goudy Stout", 2, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Player1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Player2");

        bname1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bname1.setText("Player1");
        bname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bname1ActionPerformed(evt);
            }
        });

        bname2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bname2.setText("Player2");

        bResetGAme.setBackground(new java.awt.Color(255, 255, 255));
        bResetGAme.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bResetGAme.setText("New Game");
        bResetGAme.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bResetGAme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetGAmeActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Win_Or_Draw_Disply)
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(bname1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(bname2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(bResetGAme, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(bname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bResetGAme, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65)
                .addComponent(Win_Or_Draw_Disply)
                .addGap(51, 51, 51)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       setTextOnButton(b5);
            if(m4(b5) || m7(b5) || m6(b5) || m3(b5))
            {
             Win_Or_Draw_Disply.setText(name+" Won The Game"); 
               afterGameWin(b5);
            }
            else 
             drawGame(b5);
        if(!firstFrameValue)
           clickByComputer();
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       setTextOnButton(b4);
            if(m2(b4) || m7(b4) )
            {
              Win_Or_Draw_Disply.setText(name+" Won The Game"); 
               afterGameWin(b4);
            }
            else 
             drawGame(b4);
        if(!firstFrameValue)
            clickByComputer();
    }//GEN-LAST:event_b4ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
       setTextOnButton(b8);
            if(m8(b8) || m4(b8))
            {
               Win_Or_Draw_Disply.setText(name+" Won The Game"); 
               afterGameWin(b8);
            }
            else 
             drawGame(b8);
        if(!firstFrameValue)
           clickByComputer();
    }//GEN-LAST:event_b8ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       setTextOnButton(b3);
       if(m1(b3) || m5(b3) || m6(b3))
       {
           Win_Or_Draw_Disply.setText(name+" Won The Game"); 
           afterGameWin(b3);
       }
       else 
        drawGame(b3);
        if(!firstFrameValue)
            clickByComputer();
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       setTextOnButton(b1);
        if(m1(b1) || m2(b1) || m3(b1))
        {
           Win_Or_Draw_Disply.setText(name+" Won The Game"); 
           afterGameWin(b1);
        }
        else
          drawGame(b1);
        if(!firstFrameValue)
           clickByComputer();
       
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
     setTextOnButton(b2);
         if(m1(b2) || m4(b2))
         {
           Win_Or_Draw_Disply.setText(name+" Won The Game"); 
           afterGameWin(b2);
         }
         else
           drawGame(b2);
        if(!firstFrameValue)
          clickByComputer();
       
    }//GEN-LAST:event_b2ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
       setTextOnButton(b6);
        if(m5(b6) || m7(b6))
        {
           Win_Or_Draw_Disply.setText(name+" Won The Game"); 
           afterGameWin(b6);
        }
        else
          drawGame(b6);
        if(!firstFrameValue)
          clickByComputer();
       
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
      setTextOnButton(b7);
        if(m6(b7) || m2(b7) || m8(b7))
        {
           Win_Or_Draw_Disply.setText(name+" Won The Game"); 
           afterGameWin(b7);
        }
        else drawGame(b7);
        if(!firstFrameValue)
           clickByComputer();
    }//GEN-LAST:event_b7ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
       setTextOnButton(b9);
       if(m5(b9) || m3(b9) || m8(b9))
       {
           Win_Or_Draw_Disply.setText(name+" Won The Game"); 
           afterGameWin(b9);
       }
       else
        drawGame(b9);
       if(!firstFrameValue)
            clickByComputer();
    }//GEN-LAST:event_b9ActionPerformed

    private void bname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bname1ActionPerformed
        
    }//GEN-LAST:event_bname1ActionPerformed

    private void bResetGAmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetGAmeActionPerformed
       JTextField[] t={bname1,bname2};
       JButton[] a={b1,b2,b3,b4,b5,b6,b7,b8,b9};
       boolean[] m={m1,m2,m3,m4,m5,m6,m7,m8};
       a1=new JButton[]{};
       Win_Or_Draw_Disply.setText("");
       i=0;//Drawgame set value
       m1=false;
       m2=false;
       m3=false;
       m4=false;
       m5=false;
       m6=false;
       m7=false;
       m8=false;
       for(int i=0;i < 9;i++)
       {
           value=0;
           a[i].setBackground(Color.white);
           a[i].setText("");
           a[i].setEnabled(true);
          // m[i]=false;         
       }
       for(int i=0;i < 2;i++)
       {
           t[i].setText("Player"+(i+1));
           t[i].setEditable(true);
           t[i].setBackground(Color.white);
       }
       if(!firstFrameValue) bname2.setText("Computer");
       CG.initialValueOfBox();
       
     
    }//GEN-LAST:event_bResetGAmeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        startProject s=new startProject();
        this.dispose();
        s.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

   public void drawGame(JButton b)
   { 
       i++;
       b.setEnabled(false);
       if(i==9)
       {
           Win_Or_Draw_Disply.setText("Game Draw");
       }
   }
   public void setTextOnButton(JButton b)
   {
      if(firstFrameValue)
      {
        if(value == 0)
         {
             s="X";
             b.setText(s);
             bname1.setBackground(Color.red);
             name=bname1.getText();
             bname2.setBackground(Color.white);
             value=1;
         }
        else if(value  == 1)
         {
             s="0";
             b.setText(s);
             bname2.setBackground(Color.red);
             name=bname2.getText();
             bname1.setBackground(Color.white);
             value=0;
         } 
      }
      else
      { 
        if(value != -1)
        {
        bname1.setEditable(false);
        name=bname1.getText();
        a=new JButton[]{b1,b2,b3,b4,b5,b6,b7,b8,b9};
        b.setText("X");
        switch(Arrays.asList(a).indexOf(b)) /*mapping logically with box[][] with a[] i.e::o-box[0][0] like this
                                            a[0]-b1==box[0][0] a[1]-b2==box[0][1] a[2]-b3==box[0][2]
                                            a[3]-b4==box[1][0] a[4]-b1==box[1][1]  a[5]-b1==box[1][2] 
                                            a[6]-b1==box[2][0]    a[7]-b1==box[2][1]  a[8]-b1==box[2][2]*/

        {
            case 0:
                CG.box[0][0]=3;
                break;
            case 1:
                CG.box[0][1]=3;
                break;
            case 2:
                CG.box[0][2]=3;
                break;
            case 3:
                CG.box[1][0]=3;
                break;
            case 4:
                CG.box[1][1]=3;
                break;
            case 5:
                CG.box[1][2]=3;
                break;
            case 6:
                CG.box[2][0]=3;
                break;
            case 7:
                CG.box[2][1]=3;
                break;
            case 8:
                CG.box[2][2]=3;
                break;
         } 
      }
       
   } 
   }
   public void clickByComputer()
   {
       if(value != -1)
        {
        buttonNumber = CG.winningchance();
        if(buttonNumber == -1)
             buttonNumber = CG.randomClickByComputerOnBox();
        
        switch(buttonNumber)
        {
            case 0:
                CG.box[0][0]=5;
                a[0].setText("0"); 
                name="Computer";
                if(m1(b1) || m2(b1) || m3(b1))
                {
                   Win_Or_Draw_Disply.setText("Computer" + " Won The Game"); 
                  afterGameWin(b1);
                } 
                else drawGame(a[0]);
                break;
            case 1:
                a[1].setText("0");
                CG.box[0][1]=5;
                name="Computer";
                  if(m1(b2) || m4(b2))
                  {
                      Win_Or_Draw_Disply.setText("Computer" + " Won The Game");
                      afterGameWin(b2);
                  }
                  else drawGame(a[1]);
                break;
            case 2:
                a[2].setText("0");
                CG.box[0][2]=5;
                name="Computer";
                if(m1(b3) || m5(b3) || m6(b3))
                {
                   Win_Or_Draw_Disply.setText("Computer" + " Won The Game");
                  afterGameWin(b3);
                }
                else drawGame(a[2]);
                break;
            case 3:
                a[3].setText("0");
                CG.box[1][0]=5;
                name="Computer";
                if(m2(b4) || m7(b4) )
                {
                     Win_Or_Draw_Disply.setText("Computer" + " Won The Game");
                   afterGameWin(b4);
                }
                else drawGame(a[3]);
                break;
            case 4:
                a[4].setText("0");
                CG.box[1][1]=5;
                name="Computer";
                if(m4(b5) || m7(b5) || m6(b5) || m3(b5))
                  {
                    Win_Or_Draw_Disply.setText("Computer" + " Won The Game");
                     afterGameWin(b5);
                  }
                else drawGame(a[4]);
                break;
            case 5:
                a[5].setText("0");
                CG.box[1][2]=5;
                name="Computer";
                  if(m5(b6) || m7(b6))
                  {
                     Win_Or_Draw_Disply.setText("Computer" + " Won The Game");
                    afterGameWin(b6);
                  }
                  else drawGame(a[5]);
                break;
            case 6:
                a[6].setText("0");
                CG.box[2][0]=5;
                name="Computer";
                if(m6(b7) || m2(b7) || m8(b7))
              {
                 Win_Or_Draw_Disply.setText("Computer" + " Won The Game");
                afterGameWin(b7);
              }
               else drawGame(a[6]);
                break;
            case 7:
                a[7].setText("0");
                CG.box[2][1]=5;
                name="Computer";
                if(m8(b8) || m4(b8))
                  {
                      Win_Or_Draw_Disply.setText("Computer" + " Won The Game");
                     afterGameWin(b8);
                  }
                else drawGame(a[7]);
                      break;
            case 8:
                a[8].setText("0");
                CG.box[2][2]=5;
                name="Computer";
                if(m5(b9) || m3(b9) || m8(b9))
               {
                 Win_Or_Draw_Disply.setText("Computer" + " Won The Game");
                afterGameWin(b9);
               }
                else drawGame(a[8]);
                break;
              }
        
        }
   
   }
   public boolean m1(JButton b) //only b1,b2,b3 related all possibily
   {
       if(b1.getText().equals(b2.getText())&& b1.getText().equals(b3.getText()))
       {
           m1=true;
           a1=new JButton[]{b1,b2,b3};
           value=-1;
           for(int i=0;i<3;i++)
              a1[i].setBackground(Color.green);
           
       }
       return m1;
   }
   public boolean m2 (JButton b) //only b1,b4,b7 related all possibily
   {
       if(b1.getText().equals(b4.getText())&& b1.getText().equals(b7.getText()))
       {
           m2=true;
           a1=new JButton[]{b1,b4,b7};
           value=-1;
           for(int i=0;i<3;i++)
              a1[i].setBackground(Color.green);
       }
       return m2;
   }
   public boolean m3 (JButton b) //only b1,b5,b9 related all possibily
   {
       if(b1.getText().equals(b5.getText())&& b1.getText().equals(b9.getText()))
       {
            m3=true;
            a1=new JButton[]{b1,b5,b9};
            value=-1;
            for(int i=0;i<3;i++)
              a1[i].setBackground(Color.green);
       }
       return m3;
   }
   public boolean m4 (JButton b) //only b2,b5,b8 related all possibily
   {
       if(b2.getText().equals(b5.getText())&& b2.getText().equals(b8.getText()))
       {
           m4=true;
           a1=new JButton[]{b2,b5,b8};
           value=-1;
           for(int i=0;i<3;i++)
              a1[i].setBackground(Color.green);
       }
       return m4;
   }
   public boolean m5 (JButton b) //only b1,b6,b9 related all possibily
   {
       if(b3.getText().equals(b6.getText())&& b3.getText().equals(b9.getText()))
       {
           m5=true;
           a1=new JButton[]{b3,b6,b9};   
           value=-1;
           for(int i=0;i<3;i++)
              a1[i].setBackground(Color.green);
       }
       return m5;
   }
   public boolean m6 (JButton b) //only b3,b5,b7 related all possibily
   {
       if(b3.getText().equals(b5.getText())&& b3.getText().equals(b7.getText()))
       {
           m6=true; 
           a1=new JButton[]{b3,b5,b7};
           value=-1;
           for(int i=0;i<3;i++)
              a1[i].setBackground(Color.green);
           
       }
       return m6;
   }
   public boolean m7 (JButton b) //only b4,b5,b6 related all possibily
   {
       if(b4.getText().equals(b5.getText())&& b4.getText().equals(b6.getText()))
       {
           m7=true;
           a1=new JButton[]{b4,b5,b6}; 
           value=-1;
           for(int i=0;i<3;i++)
              a1[i].setBackground(Color.green);
       }
       return m7;
   }
   public boolean m8 (JButton b) //only b7,b8,b9 related all possibily
   {
       if(b7.getText().equals(b8.getText())&& b7.getText().equals(b9.getText()))
       {
           m8=true;
           a1=new JButton[]{b8,b9,b7};
           value=-1;
           for(int i=0;i<3;i++)
              a1[i].setBackground(Color.green);
           
       }
       return m8;
   }
   public void afterGameWin(JButton b)//do not do anything after game is win
   {
       JButton[] a={b1,b2,b3,b4,b5,b6,b7,b8,b9};
       l1:for(int i=0;i < 9;i++ )
       {
           for(int j=0;j < 3;j++)
           {
              if(a1[j] == a[i])
              {
                 a[i].setEnabled(true);
                 continue l1; 
              }
           }
           a[i].setEnabled(false);
           }
           
   }
   
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
            java.util.logging.Logger.getLogger(Tik_Tok_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tik_Tok_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tik_Tok_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tik_Tok_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Tik_Tok_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Win_Or_Draw_Disply;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bResetGAme;
    private javax.swing.JTextField bname1;
    private javax.swing.JTextField bname2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

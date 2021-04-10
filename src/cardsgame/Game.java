
package cardsgame;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JFrame {

    private Player playerOne;
    private Player playerTwo;
    private int numberWinsHouse;
    private int numberWinsPlayer;
    
    
    public Game() {
        initComponents();
        initGame();       
    }
    
    private void caculationScore(int indexCard, JButton homeButton, JButton playerButton)
    {
        int scoreCardPlayerOne = playerOne.getHandGame()[indexCard].getCard().getScore();
        int scoreCardPlayerTwo = playerTwo.getHandGame()[indexCard].getCard().getScore();
        
        if(scoreCardPlayerOne > scoreCardPlayerTwo)
        {
            playerOne.sumScoreCards(playerOne.getHandGame()[indexCard].getCard(), playerTwo.getHandGame()[indexCard].getCard());
            ScoreHouseLable.setText(String.valueOf(playerOne.getScore()));
            homeButton.setBackground(Color.RED);
        }else
        {
            playerTwo.sumScoreCards(playerOne.getHandGame()[indexCard].getCard(), playerTwo.getHandGame()[indexCard].getCard());
            ScorePlayerLable.setText(String.valueOf(playerTwo.getScore()));
            playerButton.setBackground(Color.RED);
        }     
    }
    
    private void initGame()
    {
        try {
            playerOne = new Player("Casa", DeckCards.generatesDeck());
            playerTwo = new Player("Alex Ferraro", DeckCards.generatesDeck());
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CenterPanel = new javax.swing.JPanel();
        FirstHouseButton = new javax.swing.JButton();
        SecondHouseButton = new javax.swing.JButton();
        ThirdHouseButton = new javax.swing.JButton();
        FIfthHouseButton = new javax.swing.JButton();
        FourthHouseButton = new javax.swing.JButton();
        FirstPlayerButton = new javax.swing.JButton();
        SecondPlayerButton = new javax.swing.JButton();
        ThirdPlayerButton = new javax.swing.JButton();
        FourthPlayerButton = new javax.swing.JButton();
        FIfthPlayerButton = new javax.swing.JButton();
        FirstCardHouseLable = new javax.swing.JLabel();
        ThirdCardHouseLable = new javax.swing.JLabel();
        SecondCardHouseLable = new javax.swing.JLabel();
        FifthCardHouseLable = new javax.swing.JLabel();
        FourthCardHouseLable = new javax.swing.JLabel();
        FifthCardPlayerLable = new javax.swing.JLabel();
        FourthCardPlayerLable = new javax.swing.JLabel();
        ThirdCardPlayerLable = new javax.swing.JLabel();
        SecondCardPlayerLable = new javax.swing.JLabel();
        FirstCardPlayerLable = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ScoreHouseLable = new javax.swing.JLabel();
        ScorePlayerLable = new javax.swing.JLabel();
        NewGameButton = new javax.swing.JButton();
        NumberWinsHouseLable = new javax.swing.JLabel();
        NumberWinsPlayerLable = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FirstHouseButton.setText("Jogar");
        FirstHouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstHouseButtonActionPerformed(evt);
            }
        });

        SecondHouseButton.setText("Jogar");
        SecondHouseButton.setEnabled(false);
        SecondHouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondHouseButtonActionPerformed(evt);
            }
        });

        ThirdHouseButton.setText("Jogar");
        ThirdHouseButton.setEnabled(false);
        ThirdHouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdHouseButtonActionPerformed(evt);
            }
        });

        FIfthHouseButton.setText("Jogar");
        FIfthHouseButton.setEnabled(false);
        FIfthHouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIfthHouseButtonActionPerformed(evt);
            }
        });

        FourthHouseButton.setText("Jogar");
        FourthHouseButton.setEnabled(false);
        FourthHouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourthHouseButtonActionPerformed(evt);
            }
        });

        FirstPlayerButton.setText("Jogar");
        FirstPlayerButton.setEnabled(false);
        FirstPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstPlayerButtonActionPerformed(evt);
            }
        });

        SecondPlayerButton.setText("Jogar");
        SecondPlayerButton.setEnabled(false);
        SecondPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondPlayerButtonActionPerformed(evt);
            }
        });

        ThirdPlayerButton.setText("Jogar");
        ThirdPlayerButton.setEnabled(false);
        ThirdPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdPlayerButtonActionPerformed(evt);
            }
        });

        FourthPlayerButton.setText("Jogar");
        FourthPlayerButton.setEnabled(false);
        FourthPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourthPlayerButtonActionPerformed(evt);
            }
        });

        FIfthPlayerButton.setText("Jogar");
        FIfthPlayerButton.setEnabled(false);
        FIfthPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIfthPlayerButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Pontos da Casa");

        jLabel2.setText("Pontos do Jogador");

        ScoreHouseLable.setText("0");

        ScorePlayerLable.setText("0");

        NewGameButton.setText("Novo Jogo");
        NewGameButton.setEnabled(false);
        NewGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameButtonActionPerformed(evt);
            }
        });

        NumberWinsHouseLable.setText("0");

        NumberWinsPlayerLable.setText("0");

        jLabel3.setText("Votórias da Casa");

        jLabel4.setText("Vitórias do Jogador");

        javax.swing.GroupLayout CenterPanelLayout = new javax.swing.GroupLayout(CenterPanel);
        CenterPanel.setLayout(CenterPanelLayout);
        CenterPanelLayout.setHorizontalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CenterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NewGameButton)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CenterPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CenterPanelLayout.createSequentialGroup()
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FirstCardHouseLable, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstHouseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SecondHouseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SecondCardHouseLable, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ThirdCardHouseLable, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ThirdHouseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FourthCardHouseLable, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FourthHouseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FIfthHouseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FifthCardHouseLable, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CenterPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1))
                            .addGroup(CenterPanelLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(ScoreHouseLable))))
                    .addGroup(CenterPanelLayout.createSequentialGroup()
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FirstCardPlayerLable, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(FirstPlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SecondCardPlayerLable, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(SecondPlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ThirdCardPlayerLable, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(ThirdPlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FourthCardPlayerLable, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(FourthPlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FifthCardPlayerLable, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(FIfthPlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CenterPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(CenterPanelLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(ScorePlayerLable)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CenterPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CenterPanelLayout.createSequentialGroup()
                                .addComponent(NumberWinsPlayerLable)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CenterPanelLayout.createSequentialGroup()
                                .addComponent(NumberWinsHouseLable)
                                .addGap(89, 89, 89))))
                    .addGroup(CenterPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
        CenterPanelLayout.setVerticalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CenterPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstHouseButton)
                            .addComponent(SecondHouseButton)
                            .addComponent(FourthHouseButton)
                            .addComponent(ThirdHouseButton)
                            .addComponent(FIfthHouseButton)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstCardHouseLable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ThirdCardHouseLable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SecondCardHouseLable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FourthCardHouseLable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FifthCardHouseLable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CenterPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ScoreHouseLable)
                            .addComponent(NumberWinsHouseLable))))
                .addGap(74, 74, 74)
                .addComponent(NewGameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CenterPanelLayout.createSequentialGroup()
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstCardPlayerLable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ThirdCardPlayerLable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SecondCardPlayerLable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FourthCardPlayerLable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FifthCardPlayerLable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CenterPanelLayout.createSequentialGroup()
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ScorePlayerLable)
                            .addComponent(NumberWinsPlayerLable))
                        .addGap(35, 35, 35)))
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstPlayerButton)
                    .addComponent(SecondPlayerButton)
                    .addComponent(ThirdPlayerButton)
                    .addComponent(FourthPlayerButton)
                    .addComponent(FIfthPlayerButton))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CenterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CenterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstHouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstHouseButtonActionPerformed
        FirstCardHouseLable.setIcon(playerOne.getHandGame()[0].getImageIco());
        FirstPlayerButton.setEnabled(true);
        FirstHouseButton.setEnabled(false);
    }//GEN-LAST:event_FirstHouseButtonActionPerformed

    private void SecondHouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondHouseButtonActionPerformed
        SecondCardHouseLable.setIcon(playerOne.getHandGame()[1].getImageIco());
        SecondPlayerButton.setEnabled(true);
        SecondHouseButton.setEnabled(false);
    }//GEN-LAST:event_SecondHouseButtonActionPerformed

    private void ThirdHouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdHouseButtonActionPerformed
        ThirdCardHouseLable.setIcon(playerOne.getHandGame()[2].getImageIco());
        ThirdPlayerButton.setEnabled(true);
        ThirdHouseButton.setEnabled(false);
    }//GEN-LAST:event_ThirdHouseButtonActionPerformed

    private void FourthHouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourthHouseButtonActionPerformed
        FourthCardHouseLable.setIcon(playerOne.getHandGame()[3].getImageIco());
        FourthPlayerButton.setEnabled(true);
        FourthHouseButton.setEnabled(false);
    }//GEN-LAST:event_FourthHouseButtonActionPerformed

    private void FIfthHouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIfthHouseButtonActionPerformed
        FifthCardHouseLable.setIcon(playerOne.getHandGame()[4].getImageIco());
        FIfthPlayerButton.setEnabled(true);
        FIfthHouseButton.setEnabled(false);
    }//GEN-LAST:event_FIfthHouseButtonActionPerformed

    private void FirstPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstPlayerButtonActionPerformed
        FirstCardPlayerLable.setIcon(playerTwo.getHandGame()[0].getImageIco());
        SecondHouseButton.setEnabled(true);
        FirstPlayerButton.setEnabled(false);
        caculationScore(0, FirstHouseButton, FirstPlayerButton);  
    }//GEN-LAST:event_FirstPlayerButtonActionPerformed

    private void SecondPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondPlayerButtonActionPerformed
        SecondCardPlayerLable.setIcon(playerTwo.getHandGame()[1].getImageIco());
        ThirdHouseButton.setEnabled(true);
        SecondPlayerButton.setEnabled(false);
        caculationScore(1, SecondHouseButton, SecondPlayerButton);
    }//GEN-LAST:event_SecondPlayerButtonActionPerformed

    private void ThirdPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdPlayerButtonActionPerformed
        ThirdCardPlayerLable.setIcon(playerTwo.getHandGame()[2].getImageIco());  
        FourthHouseButton.setEnabled(true);
        ThirdPlayerButton.setEnabled(false);
        caculationScore(2, ThirdHouseButton, ThirdPlayerButton); 
    }//GEN-LAST:event_ThirdPlayerButtonActionPerformed

    private void FourthPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourthPlayerButtonActionPerformed
        FourthCardPlayerLable.setIcon(playerTwo.getHandGame()[3].getImageIco());
        FIfthHouseButton.setEnabled(true);
        FourthPlayerButton.setEnabled(false);
        caculationScore(3, FourthHouseButton, FourthPlayerButton); 
    }//GEN-LAST:event_FourthPlayerButtonActionPerformed

    private void FIfthPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIfthPlayerButtonActionPerformed
        FifthCardPlayerLable.setIcon(playerTwo.getHandGame()[4].getImageIco());
        FIfthPlayerButton.setEnabled(false);
        caculationScore(4, FIfthHouseButton, FIfthPlayerButton); 
        
        if(playerOne.getScore() > playerTwo.getScore())
        {
            numberWinsHouse++;
            NumberWinsHouseLable.setText(String.valueOf(numberWinsHouse));
            JOptionPane.showMessageDialog(this, "O casa venceu a partida por " + playerOne.getScore() + " à " + playerTwo.getScore(), "Sorry, você perdeu!", JOptionPane.OK_OPTION);
        }
        else if(playerOne.getScore() < playerTwo.getScore())
        {
            numberWinsPlayer++;
            NumberWinsPlayerLable.setText(String.valueOf(numberWinsPlayer));
            JOptionPane.showMessageDialog(this, "O jogador venceu a partida por " + playerTwo.getScore() + " à " + playerOne.getScore(), "Parabéns, o " + playerTwo.getName() + "venceu!", JOptionPane.OK_OPTION);
        }           
        else
            JOptionPane.showMessageDialog(this, "O jogo empatou.", "Empate", JOptionPane.OK_OPTION);

        NewGameButton.setEnabled(true);
    }//GEN-LAST:event_FIfthPlayerButtonActionPerformed

    private void NewGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameButtonActionPerformed
        initGame();
        FirstCardHouseLable.setIcon(null);
        SecondCardHouseLable.setIcon(null);
        ThirdCardHouseLable.setIcon(null);
        FourthCardHouseLable.setIcon(null);
        FifthCardHouseLable.setIcon(null);
        
        FirstCardPlayerLable.setIcon(null);
        SecondCardPlayerLable.setIcon(null);
        ThirdCardPlayerLable.setIcon(null);
        FourthCardPlayerLable.setIcon(null);
        FifthCardPlayerLable.setIcon(null);
        
        FirstHouseButton.setBackground(null);
        SecondHouseButton.setBackground(null);
        ThirdHouseButton.setBackground(null);
        FourthHouseButton.setBackground(null);
        FIfthHouseButton.setBackground(null);
        
        FirstPlayerButton.setBackground(null);
        SecondPlayerButton.setBackground(null);
        ThirdPlayerButton.setBackground(null);
        FourthPlayerButton.setBackground(null);
        FIfthPlayerButton.setBackground(null);
        
        NewGameButton.setEnabled(false);
        
        FirstHouseButton.setEnabled(true);
        
        ScoreHouseLable.setText("0");
        ScorePlayerLable.setText("0");
    }//GEN-LAST:event_NewGameButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JButton FIfthHouseButton;
    private javax.swing.JButton FIfthPlayerButton;
    private javax.swing.JLabel FifthCardHouseLable;
    private javax.swing.JLabel FifthCardPlayerLable;
    private javax.swing.JLabel FirstCardHouseLable;
    private javax.swing.JLabel FirstCardPlayerLable;
    private javax.swing.JButton FirstHouseButton;
    private javax.swing.JButton FirstPlayerButton;
    private javax.swing.JLabel FourthCardHouseLable;
    private javax.swing.JLabel FourthCardPlayerLable;
    private javax.swing.JButton FourthHouseButton;
    private javax.swing.JButton FourthPlayerButton;
    private javax.swing.JButton NewGameButton;
    private javax.swing.JLabel NumberWinsHouseLable;
    private javax.swing.JLabel NumberWinsPlayerLable;
    private javax.swing.JLabel ScoreHouseLable;
    private javax.swing.JLabel ScorePlayerLable;
    private javax.swing.JLabel SecondCardHouseLable;
    private javax.swing.JLabel SecondCardPlayerLable;
    private javax.swing.JButton SecondHouseButton;
    private javax.swing.JButton SecondPlayerButton;
    private javax.swing.JLabel ThirdCardHouseLable;
    private javax.swing.JLabel ThirdCardPlayerLable;
    private javax.swing.JButton ThirdHouseButton;
    private javax.swing.JButton ThirdPlayerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

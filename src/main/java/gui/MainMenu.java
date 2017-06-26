/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainMenu.java
 *
 * Created on 22.10.2016,S 11:33:51
 */
package gui;

import gameLogic.Game;

import java.awt.*;
import java.util.Arrays;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class MainMenu extends javax.swing.JFrame {

    private MainMenu() {
        initComponents();
    }

    public MainMenu(Game game) {
        initComponents();
        lableMessage.setText("     ");
        bAddPlayer.addActionListener(game.new AddPlayerActivity());
        bCreateNewPlayer.addActionListener(game.new StartCreatingPlayerActivity());
        bDelBasePlayer.addActionListener(game.new DelBasePlayerActivity());
        bDelGamePlayer.addActionListener(game.new DelPlayerActivity());
        bStartGame.addActionListener(game.new StartGameActivity());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bAddPlayer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listOfGamePlayers = new javax.swing.JList();
        bDelGamePlayer = new javax.swing.JButton();
        bStartGame = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listOfBasePlayers = new javax.swing.JList();
        bCreateNewPlayer = new javax.swing.JButton();
        lableMessage = new javax.swing.JLabel();
        bDelBasePlayer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);

        jLabel1.setFont(new java.awt.Font("Calibri", Font.PLAIN, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("����� ���������� � ����!");

        bAddPlayer.setFont(new java.awt.Font("Calibri", Font.PLAIN, 14));
        bAddPlayer.setText("�������� ������");
        bAddPlayer.setName("bAddPlayer"); // NOI18N
        bAddPlayer.addActionListener(evt -> bAddPlayerActionPerformed());

        listOfGamePlayers.setFont(new java.awt.Font("Calibri", Font.PLAIN, 14));
        listOfGamePlayers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "��������� ������" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listOfGamePlayers);

        bDelGamePlayer.setText("������� ������");
        bDelGamePlayer.setMaximumSize(new java.awt.Dimension(165, 25));
        bDelGamePlayer.setMinimumSize(new java.awt.Dimension(165, 25));
        bDelGamePlayer.addActionListener(evt -> bDelGamePlayerActionPerformed());

        bStartGame.setText("������ ����");
        bStartGame.addActionListener(evt -> bStartGameActionPerformed());

        listOfBasePlayers.setFont(new java.awt.Font("Calibri", Font.PLAIN, 14));
        listOfBasePlayers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "���� �������" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listOfBasePlayers);

        bCreateNewPlayer.setFont(new java.awt.Font("Calibri", Font.PLAIN, 14));
        bCreateNewPlayer.setText("������� ������ ������");
        bCreateNewPlayer.setAlignmentY(0.0F);
        bCreateNewPlayer.addActionListener(evt -> bCreateNewPlayerActionPerformed());

        lableMessage.setFont(new java.awt.Font("Calibri", Font.PLAIN, 14)); // NOI18N
        lableMessage.setText("jLabel3");

        bDelBasePlayer.setFont(new java.awt.Font("Calibri", Font.PLAIN, 14));
        bDelBasePlayer.setText("������� ������ �� ����");
        bDelBasePlayer.setMaximumSize(new java.awt.Dimension(165, 25));
        bDelBasePlayer.setMinimumSize(new java.awt.Dimension(165, 25));
        bDelBasePlayer.addActionListener(evt -> bDelBasePlayerActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(bStartGame, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(bDelBasePlayer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(bCreateNewPlayer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(bDelGamePlayer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(bAddPlayer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lableMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(jLabel1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lableMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bAddPlayer)
                                                .addGap(26, 26, 26)
                                                .addComponent(bDelGamePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bCreateNewPlayer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bDelBasePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bStartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddPlayerActionPerformed() {//GEN-FIRST:event_bAddPlayerActionPerformed
    }//GEN-LAST:event_bAddPlayerActionPerformed

    public String getBaseSelectedName() {
        return (String) listOfBasePlayers.getSelectedValue();
    }

    public String getGameSelectedName() {
        return (String) listOfGamePlayers.getSelectedValue();
    }

    public void updateBaseList(String[] namesInBase) {
        Arrays.sort(namesInBase);
        listOfBasePlayers.setListData(namesInBase);
    }

    public void updateGameList(TreeSet<String> namesInGame) {
        Object[] namesArray = namesInGame.toArray();
        Arrays.sort(namesArray);
        listOfGamePlayers.setListData(namesArray);
    }

    public void setLableMessage(String s) {
        lableMessage.setText(s);
    }

    private void bDelGamePlayerActionPerformed() {//GEN-FIRST:event_bDelGamePlayerActionPerformed
    }//GEN-LAST:event_bDelGamePlayerActionPerformed

    private void bStartGameActionPerformed() {//GEN-FIRST:event_bStartGameActionPerformed
    }//GEN-LAST:event_bStartGameActionPerformed

    private void bCreateNewPlayerActionPerformed() {//GEN-FIRST:event_bCreateNewPlayerActionPerformed
    }//GEN-LAST:event_bCreateNewPlayerActionPerformed

    private void bDelBasePlayerActionPerformed() {//GEN-FIRST:event_bDelBasePlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bDelBasePlayerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MainMenu().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddPlayer;
    private javax.swing.JButton bCreateNewPlayer;
    private javax.swing.JButton bDelBasePlayer;
    private javax.swing.JButton bDelGamePlayer;
    private javax.swing.JButton bStartGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lableMessage;
    private javax.swing.JList listOfBasePlayers;
    private javax.swing.JList listOfGamePlayers;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GameMenu.java
 *
 * Created on 23.10.2016, 18:43:50
 */
package gui;

import gameLogic.Game;

/**
 *
 * @author admin
 */
public class GameMenu extends javax.swing.JFrame {

    /** Creates new form GameMenu */
    private GameMenu() {
        initComponents();
    }

    public GameMenu(Game game) {
        initComponents();
        bEndGame.addActionListener(game.new EndGameActivity());
        bEndTurn.addActionListener(game.new EndTurnActivity());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bEndTurn = new javax.swing.JButton();
        textPoints = new javax.swing.JTextField();
        lableCurrentPlayer = new javax.swing.JLabel();
        lableWinningPlayer = new javax.swing.JLabel();
        bEndGame = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePoints = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bEndTurn.setText("��������� ���"); // NOI18N
        bEndTurn.addActionListener(this::bEndTurnActionPerformed);

        textPoints.setText("������� ����"); // NOI18N
        textPoints.addActionListener(this::textPointsActionPerformed);

        lableCurrentPlayer.setText("��� ���:"); // NOI18N

        lableWinningPlayer.setText("�����:"); // NOI18N

        bEndGame.setText("��������� ����"); // NOI18N
        bEndGame.addActionListener(this::bEndGameActionPerformed);

        tablePoints.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Name", "Current Points", "Max Points in game"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePoints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(textPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lableCurrentPlayer))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(bEndGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lableWinningPlayer)
                                                        .addComponent(bEndTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lableCurrentPlayer)
                                        .addComponent(lableWinningPlayer))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bEndTurn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bEndGame)
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int getPlayerPoins() {
        return Integer.valueOf(textPoints.getText());
    }

    public void setLeader(String s) {
        lableWinningPlayer.setText("�����: " + s);
    }

    public void setCurrentPlayer(String s) {
        lableCurrentPlayer.setText("��� ���: " + s);
    }

    public void setTableValueAt(Object a, int column, int row) {
        tablePoints.setValueAt(a, row, column);
    }

    private void textPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPointsActionPerformed

    private void bEndTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEndTurnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEndTurnActionPerformed

    private void bEndGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEndGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEndGameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new GameMenu().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEndGame;
    private javax.swing.JButton bEndTurn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lableCurrentPlayer;
    private javax.swing.JLabel lableWinningPlayer;
    private javax.swing.JTable tablePoints;
    private javax.swing.JTextField textPoints;
    // End of variables declaration//GEN-END:variables
}
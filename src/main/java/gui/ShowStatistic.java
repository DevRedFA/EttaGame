/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ShowStatictic.java
 *
 * Created on 25.10.2016, 20:34:03
 */

package gui;

/**
 *
 * @author admin
 */
public class ShowStatistic extends javax.swing.JFrame {

    /** Creates new form ShowStatictic */
    private ShowStatistic() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

//        javax.swing.JScrollBar jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 457, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new ShowStatistic().setVisible(true));
    }

    // End of variables declaration//GEN-END:variables

}

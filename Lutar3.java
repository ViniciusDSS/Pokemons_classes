/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac1pokemons;

/**
 *
 * @author Samsung
 */
public class Lutar3 extends javax.swing.JFrame {

    /**
     * Creates new form Lutar3
     */
    public Lutar3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Pikachu = new javax.swing.JLabel();
        Squirtle = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jButton1.setText("Vamos lá!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 370));
        setPreferredSize(new java.awt.Dimension(400, 370));
        getContentPane().setLayout(null);

        Pikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ac1pokemons/Pics/pikachu-f.png"))); // NOI18N
        getContentPane().add(Pikachu);
        Pikachu.setBounds(280, 190, 96, 96);

        Squirtle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ac1pokemons/Pics/squirtle.png"))); // NOI18N
        Squirtle.setText("jLabel1");
        getContentPane().add(Squirtle);
        Squirtle.setBounds(60, 200, 90, 70);

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setText("Vamos lá!!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 50, 120, 23);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ac1pokemons/Pics/fundo.png"))); // NOI18N
        background.setText("jLabel3");
        getContentPane().add(background);
        background.setBounds(0, 0, 430, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pokemons MyPokemon = new pokemons("Bulbasaur", "Planta", 1);
        pokemons InimigoPokemon = new pokemons("Pikachu", "Eletricidade", 1);

        batalha newbatalha = new batalha();
        System.out.println("Seu pokemon: ");
        MyPokemon.imprimaAtributos();
        System.out.println("Pokemon inimigo: ");
        InimigoPokemon.imprimaAtributos();

        newbatalha.myPokemon(MyPokemon.getNome(), (int) MyPokemon.getHp(), (int)MyPokemon.getHit(),(int)MyPokemon.getDef());

        newbatalha.inimigoPokemon(InimigoPokemon.getNome(),(int)InimigoPokemon.getHp(), (int)InimigoPokemon.getHit(),(int)InimigoPokemon.getDef());

        newbatalha.batalhar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pokemons MyPokemon = new pokemons("Squirtle", "Agua", 1);
        pokemons InimigoPokemon = new pokemons("Pikachu", "Eletricidade", 1);

        batalha newbatalha = new batalha();
        System.out.println("Seu pokemon: ");
        MyPokemon.imprimaAtributos();
        System.out.println("Pokemon inimigo: ");
        InimigoPokemon.imprimaAtributos();

        newbatalha.myPokemon(MyPokemon.getNome(), (int) MyPokemon.getHp(), (int)MyPokemon.getHit(),(int)MyPokemon.getDef());

        newbatalha.inimigoPokemon(InimigoPokemon.getNome(),(int)InimigoPokemon.getHp(), (int)InimigoPokemon.getHit(),(int)InimigoPokemon.getDef());

        newbatalha.batalhar();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Lutar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lutar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lutar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lutar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lutar3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pikachu;
    private javax.swing.JLabel Squirtle;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testando;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class EditarProdutos extends javax.swing.JFrame {

    Interface stub;
    Registry registry;
    int id = 0;
    Object[][] dataL;
    Object[][] dataC;

    /**
     * Creates new form EditarTurmas
     */
    public EditarProdutos(Registry reg, int id) throws RemoteException, NotBoundException {
        initComponents();
        registry = reg;
        stub = (Interface) registry.lookup("Hello");
        this.id = id;
        dataC = stub.getProduto(id);
        tfNome.setText((String) dataC[0][2]);
        stub = (Interface) registry.lookup("Hello");

        tfAutor.setText((String) dataC[0][3]);

        dataL = stub.ListarCategorias();
        PreencheCb((int) dataC[0][1]);

    }

    private void PreencheCb(int pos) {
        //Função para preencher o combo box com todos os cursos previamente cadastrados
        int i = 0;
        int aux = -1;
        cbEscolha.removeAllItems();
        while (i < dataL.length) {//povoamento tanto da matriz de dados quanto do combobox
            if ((int) dataL[i][0] == pos) {
                aux = i;
            }
            cbEscolha.addItem(dataL[i][1].toString());
            i++;
        }
        if (aux != -1) {
            cbEscolha.setSelectedIndex(aux);
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

        jLabel1 = new javax.swing.JLabel();
        tfAutor = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        cbEscolha = new javax.swing.JComboBox<>();
        btEnviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("EDITAR PRODUTOS");

        cbEscolha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEscolhaActionPerformed(evt);
            }
        });

        btEnviar.setText("EDITAR");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Capacidade:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Categoria:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEnviar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEnviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEscolhaActionPerformed

    }//GEN-LAST:event_cbEscolhaActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        //validação de campos e inserção de informações ao BD
        int index = cbEscolha.getSelectedIndex();
        int id_categoria = (int) dataL[index][0];
        //Conseguir acesso a chave estrageira da tabela através do index do combo box
        //E associando isso ao id do elemento "index" da matriz preenchida com os registros do BD
        String nome = tfNome.getText();
        String estoque = tfAutor.getText();
        if (nome.compareTo("") == 0 && estoque.compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!!!", "RESULTADO:", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                if (stub.EditarProdutos(nome, estoque, id_categoria, id)) {
                    JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!!!", "RESULTADO:", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível alterar registro!!!", "RESULTADO:", JOptionPane.ERROR_MESSAGE);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(InserirProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            tfNome.setText("");
            this.dispose();
            ListarProdutos listagem = null;
            try {
                listagem = new ListarProdutos(registry);
            } catch (RemoteException ex) {
                Logger.getLogger(InserirProdutos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(InserirProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            listagem.setVisible(true);
        }
    }//GEN-LAST:event_btEnviarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JComboBox<String> cbEscolha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfAutor;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}

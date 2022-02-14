package verificarsenhas;

/**
 *
 * @author Davi
 */
public class VerificadorDeSenhas extends javax.swing.JFrame {

   
    public VerificadorDeSenhas() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botaoSubmit = new javax.swing.JButton();
        texto = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Verificador de senhas fortes");

        botaoSubmit.setText("verificar");
        botaoSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSubmit)
                    .addComponent(jLabel1)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(botaoSubmit)
                .addGap(35, 35, 35))
        );

        pack();
    }

    public void botaoSubmitActionPerformed(java.awt.event.ActionEvent evt) {
        String valor = campoSenha.getText();
        
        
        
         if(valor.length() < 6){
            texto.setText("a senha deve conter 6 caracteres");
        }else if(!valor.matches("(?=.*[}{,!@#$%^&*()-.?~=+\\-_\\/*\\-+.\\|]).{6,}")){
            texto.setText("sua senha deve conter pelo menos 1 caractere especial (!@#$%^&*()-+)");
        }else if(!valor.matches("(?=.*[A-Z]).{6,}")){
            texto.setText("sua senha deve conter pelo menos uma letra maiúscula");
        }else if(!valor.matches("(?=.*[a-z]).{6,}")){
            texto.setText("sua senha deve conter pelo menos uma letra minúscula ");
        }
        else if(!valor.matches("(?=.*[0-9]).{6,}")){
            texto.setText("sua senha deve conter pelo menos 1 número");
        }else{
            texto.setText("sua senha � forte");
        }
    }
    
   

   
    private javax.swing.JButton botaoSubmit;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel texto;
    
}

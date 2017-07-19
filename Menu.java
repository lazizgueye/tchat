import java.io.Serializable;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.DefaultListModel;
import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

/**
 *
 * @author Aziiz
 */

public class Menu extends javax.swing.JFrame {
	
    ChatServer CS;
    ChatClientImpl CCI;
    Timer timer = new Timer();

	// Variables declaration - do not modify                     
    private javax.swing.JPanel VarPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton varBtConnexion;
    private javax.swing.JButton varBtEnvoyerMessage;
    private javax.swing.JButton varBtQuitter;
    private javax.swing.JButton varBtHistoriq;
    private javax.swing.JLabel varLblConnectes;
    private javax.swing.JList varListConnectes;
    private javax.swing.JList varListLesMessages;
    private javax.swing.JScrollPane varScrollConnectees;
    private javax.swing.JScrollPane varScrollLesMessages;
    private javax.swing.JTextField varTxtIdentifiant;
    private javax.swing.JTextField varTxtMonMessage;

    DefaultListModel listModel = new DefaultListModel();
    DefaultListModel listModelConnectes = new DefaultListModel();	

    // End of variables declaration 
    /**
     * Creates new form Menu
     */
    public Menu(ChatClientImpl cci) {        
        initComponents();
        cacher(false);
	this.CCI = cci;

		try	{
			
			new Thread(this.CCI).start();
		}
		catch (Exception e)		{
			System.err.println("Probleme") ;
		}
    }
	

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        varBtConnexion = new javax.swing.JButton();
        varBtQuitter = new javax.swing.JButton();
        varTxtIdentifiant = new javax.swing.JTextField();
        VarPanel = new javax.swing.JPanel();
        varLblConnectes = new javax.swing.JLabel();
        varTxtMonMessage = new javax.swing.JTextField();
        varBtEnvoyerMessage = new javax.swing.JButton();
        varScrollLesMessages = new javax.swing.JScrollPane();
        varListLesMessages = new javax.swing.JList();
        varScrollConnectees = new javax.swing.JScrollPane();
        varListConnectes = new javax.swing.JList();
	varBtHistoriq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setPreferredSize(new java.awt.Dimension(721, 500));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to LeopoldChat");

        jLabel3.setText("Copyright  Gueye Leopold Aziz");

        varBtConnexion.setText("Connexion");
        varBtConnexion.setName("btDeconecter"); // NOI18N
        varBtConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varBtConnexionActionPerformed(evt);
            }
        });

        varBtQuitter.setText("Quitter");
        varBtQuitter.setName("btQuitter"); // NOI18N
        varBtQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varBtQuitterActionPerformed(evt);
            }
        });

        varTxtIdentifiant.setName("txtIdentifiant"); // NOI18N

        VarPanel.setName("txtPanel"); // NOI18N

        varLblConnectes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        varLblConnectes.setText("Les Connecte(e)s");

        varTxtMonMessage.setName("txtMonMessage"); // NOI18N

        varBtEnvoyerMessage.setText("Envoyer");
        varBtEnvoyerMessage.setName("btEnvoyerMessage"); // NOI18N
        varBtEnvoyerMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varBtEnvoyerMessageActionPerformed(evt);
            }
        });

        varScrollLesMessages.setName("txtScrollLesMessages"); // NOI18N

        varListLesMessages.setName("txtListLesMessages"); // NOI18N
        varScrollLesMessages.setViewportView(varListLesMessages);

        varScrollConnectees.setName("txtScrollListConnectes"); // NOI18N

        varListConnectes.setName("txtListConnectes"); // NOI18N
        varScrollConnectees.setViewportView(varListConnectes);

	varBtHistoriq.setText("Charger Historique");
        varBtHistoriq.setName("btChargerHistoriq"); // NOI18N
        varBtHistoriq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varBtHistoriqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VarPanelLayout = new javax.swing.GroupLayout(VarPanel);
        VarPanel.setLayout(VarPanelLayout);
        VarPanelLayout.setHorizontalGroup(
            VarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(VarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varLblConnectes)
                    .addGroup(VarPanelLayout.createSequentialGroup()
                        .addComponent(varScrollConnectees, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(VarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(varScrollLesMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VarPanelLayout.createSequentialGroup()
                                .addComponent(varTxtMonMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varBtEnvoyerMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addComponent(varBtHistoriq)))))
        );
        VarPanelLayout.setVerticalGroup(
            VarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VarPanelLayout.createSequentialGroup()
                .addComponent(varLblConnectes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(varScrollConnectees, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VarPanelLayout.createSequentialGroup()
                        .addComponent(varScrollLesMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(varBtHistoriq)                        
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(VarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(varTxtMonMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varBtEnvoyerMessage))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

	varBtHistoriq.getAccessibleContext().setAccessibleName("varBtHistorique");
	
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(varTxtIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(varBtConnexion)
                                .addGap(18, 18, 18)
                                .addComponent(varBtQuitter))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(varBtConnexion)
                            .addComponent(varBtQuitter)
                            .addComponent(varTxtIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addGap(27, 27, 27)
                .addComponent(VarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>                        

    private void varBtConnexionActionPerformed(java.awt.event.ActionEvent evt)  {       
	                                      
        // TODO add your handling code here:
        if(varBtConnexion.getText().equals("Connexion")){
            if(!varTxtIdentifiant.getText().equals("")){
                varTxtIdentifiant.setEnabled(false);
                varBtConnexion.setText("Deconnexion");
                cacher(true);		
		try	{
		this.CCI.setIdenfiant(varTxtIdentifiant.getText());
		this.CCI.getMycs().broadcastConnectes(varTxtIdentifiant.getText());
		this.CCI.chargerHistoriq();
		if(this.CCI.Historique.isEmpty()){
			varBtHistoriq.setEnabled(false);
		}
		else{this.CCI.Historique.clear();}
		}
			catch(Exception e){
				System.err.println("Connexion server impossible");
			}
		javax.swing.Timer t2 = new javax.swing.Timer(1000, actionL);  
		t2.start();
            }
        }
        else{
            varTxtIdentifiant.setText("");
            varTxtIdentifiant.setEnabled(true);
            varBtConnexion.setText("Connexion");
            cacher(false);
	    try	{
		this.CCI.deconnexion();
		}
	    catch(Exception e){
		System.err.println("");
	    }
	    listModel.clear();
	    listModelConnectes.clear();	
        }
    }                                              

    private void varBtHistoriqActionPerformed(java.awt.event.ActionEvent evt)  {    
	try{
		this.CCI.chargerHistoriq();
		if(!this.CCI.Historique.isEmpty()){
			LinkedList<String> intermediaire = new LinkedList<String>();
			intermediaire.addAll(this.CCI.Historique);
			listModel.clear();
			this.CCI.resetMessages();
			this.CCI.Messages.addAll(intermediaire);
			intermediaire.clear();
			varBtHistoriq.setEnabled(false);
		}
		else{varBtHistoriq.setEnabled(false);}
	}catch(Exception ioe){}
    }

    private void varBtQuitterActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
	try	{
		this.CCI.deconnexion();		
	}
			catch(Exception e){
				System.err.println("");
			}	
        System.exit(0);
    }                                            

    private void varBtEnvoyerMessageActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
	try	{
		this.CCI.getMycs().broadcast(varTxtIdentifiant.getText(), varTxtMonMessage.getText());			
	}
	catch(Exception e){}
	varTxtMonMessage.setText("");
    }      
                                           
    
    public boolean cacher(boolean valeur){
        varBtEnvoyerMessage.setVisible(valeur);
        varScrollConnectees.setVisible(valeur);
        varScrollLesMessages.setVisible(valeur);
        varListConnectes.setVisible(valeur);
        varListLesMessages.setVisible(valeur);
        varTxtMonMessage.setVisible(valeur);
        varLblConnectes.setVisible(valeur);
	varBtHistoriq.setVisible(valeur);
	varBtHistoriq.setEnabled(valeur);
        //this.setPreferredSize(new Dimension(721,280));
        if(!valeur)
            this.setSize(721,280);
        else
            this.setSize(721, 500);
        return valeur;
    }


	ActionListener actionL = new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent arg0){
	 // while(true){
		try{
		     if(!CCI.Messages.isEmpty()){
		     	for(int i=0; i<CCI.Messages.size(); i++){
		     	  listModel.addElement(CCI.Messages.get(i));
			}
			varListLesMessages.setModel(listModel);
			varListLesMessages.repaint();
			CCI.resetMessages();
		     }
		     if(!CCI.Connectes.isEmpty()){
			listModelConnectes.clear();
		     	for(int i=0; i<CCI.Connectes.size(); i++){
		     	  listModelConnectes.addElement(CCI.Connectes.get(i));
			}
			varListConnectes.setModel(listModelConnectes);
			varListConnectes.repaint();
			CCI.Connectes.clear();
		     }
		}catch(Exception e)		{
			System.err.println("Probleme") ;
		}
	//  }
	}
     }; 
	

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
		try	{
		String url = "rmi://localhost/ChatServer";
		ChatServer cs= (ChatServer) Naming.lookup(url);
		ChatClientImpl cci = new ChatClientImpl(cs, "helo");
                new Menu(cci).setVisible(true);
		}
		catch (Exception e)		{
			System.err.println("Probleme") ;
		}
            }
        });
	
/*Timer timer = new Timer();
	timer.scheduleAtFixedRate(new TimerTask(){
	@Override
	public void run(){

	}
    	},2*60*1000, 2*60*1000);*/

    }

                      
}
package interfaceGraphique.gestion;


import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import serveur.BDD;

public class PanelAddSuprr extends JPanel {
	protected String idAffiche;
	protected String idParent;
	protected BDD accesGestion;
	
	public PanelAddSuprr(String idAffiche, String idParent, BDD accesGestion) {
		this.idParent = idParent;
		this.accesGestion = accesGestion;
		this.idAffiche = idAffiche;
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_1 = new JLabel(idAffiche);
		this.add(lblNewLabel_1);
		Component horizontalStrut = Box.createHorizontalStrut(20);
		this.add(horizontalStrut);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(this::btnDelete);
		this.add(btnNewButton_2);
		
		Component horizontalStrut2 = Box.createHorizontalStrut(20);
		this.add(horizontalStrut2);
	}
	
	protected void btnDelete(ActionEvent event) {
		accesGestion.supprimerUtilisateurGroupe(idAffiche, idParent);
	}
}

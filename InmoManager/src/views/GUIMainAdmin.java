package views;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import controllers.ControllerMainAdmin;
import util.GlobalResources;

public class GUIMainAdmin extends JFrame {
	private static final long serialVersionUID = 1L;
	private GUILogin gLogin;
	private JPanel titlePanel;
	private JLabel lblTitle;
	private JButton btnManageProperties;
	private JButton btnManageManagers;
	private JButton btnManageClients;
	private JButton btnReturn;
	private JSeparator separator;
	private JButton btnStatistics;
	public GUIMainAdmin(GUILogin login) {
		this.gLogin =  login;
		setTitle("Admin View");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(gLogin);
		setBounds(100, 100, 404, 207);
		setResizable(false);
		getContentPane().setLayout(null);
		setLocationRelativeTo(login);
		
		GlobalResources.setFrameIcon(this);
		
		titlePanel = new JPanel();
		titlePanel.setBounds(80, 6, 228, 50);
		getContentPane().add(titlePanel);
		titlePanel.setLayout(null);

		lblTitle = new JLabel("Admin View");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblTitle.setBounds(22, 13, 184, 28);
		titlePanel.add(lblTitle);

		btnManageProperties = new JButton("Manage Properties");
		btnManageProperties.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnManageProperties.setBounds(29, 80, 150, 30);
		getContentPane().add(btnManageProperties);

		btnManageManagers = new JButton("Manage Managers");
		btnManageManagers.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnManageManagers.setBounds(208, 80, 150, 30);
		getContentPane().add(btnManageManagers);

		btnReturn = new JButton("");
		btnReturn.setBounds(8, 6, 30, 30);
		btnReturn.setIcon(GlobalResources.getIconReturn());
		btnReturn.setBorderPainted(false);
		btnReturn.setContentAreaFilled(false);
		getContentPane().add(btnReturn);

		separator = new JSeparator();
		separator.setBounds(8, 63, 372, 9);
		getContentPane().add(separator);
		
		btnManageClients = new JButton("Manage Clients");
		btnManageClients.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnManageClients.setBounds(29, 121, 150, 30);
		getContentPane().add(btnManageClients);
		
		btnStatistics = new JButton("Statistics");
		btnStatistics.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnStatistics.setBounds(208, 121, 150, 30);
		getContentPane().add(btnStatistics);
		
		new ControllerMainAdmin(this);

		setVisible(true);
	}
	
	public void addActListeners(ActionListener listener) {
		btnManageProperties.addActionListener(listener);
		btnManageManagers.addActionListener(listener);
		btnManageClients.addActionListener(listener);
		btnStatistics.addActionListener(listener);
		btnReturn.addActionListener(listener);
	}
	
	

	public JButton getBtnStatistics() {
		return btnStatistics;
	}

	public void setBtnStatistics(JButton btnStatistics) {
		this.btnStatistics = btnStatistics;
	}

	public GUILogin getgLogin() {
		return gLogin;
	}

	public JButton getBtnManageProperties() {
		return btnManageProperties;
	}

	public JButton getBtnManageManagers() {
		return btnManageManagers;
	}

	public JButton getBtnManageClients() {
		return btnManageClients;
	}

	public JButton getBtnReturn() {
		return btnReturn;
	}

	public void setgLogin(GUILogin gLogin) {
		this.gLogin = gLogin;
	}

	public void setBtnManageProperties(JButton btnManageProperties) {
		this.btnManageProperties = btnManageProperties;
	}

	public void setBtnManageManagers(JButton btnManageManagers) {
		this.btnManageManagers = btnManageManagers;
	}

	public void setBtnManageClients(JButton btnManageClients) {
		this.btnManageClients = btnManageClients;
	}

	public void setBtnReturn(JButton btnReturn) {
		this.btnReturn = btnReturn;
	}
}

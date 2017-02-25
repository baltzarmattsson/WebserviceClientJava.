import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.JButton;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.beans.PropertyChangeEvent;
import javax.swing.JScrollPane;

public class View {

	private JFrame frame;
	private JTable mainDataTable;
	private JTextArea fileContentTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane mainTabHolder = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(mainTabHolder, BorderLayout.CENTER);
		
		JPanel wsAndErpTab = new JPanel();
		mainTabHolder.addTab("WStabeller och ERP-queries", null, wsAndErpTab, null);
		GridBagLayout gbl_wsAndErpTab = new GridBagLayout();
		gbl_wsAndErpTab.columnWidths = new int[]{135, 0, 0};
		gbl_wsAndErpTab.rowHeights = new int[]{0, 0, 0, 0};
		gbl_wsAndErpTab.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_wsAndErpTab.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		wsAndErpTab.setLayout(gbl_wsAndErpTab);
		
		JLabel lblChooseFunction = new JLabel("Välj funktion");
		GridBagConstraints gbc_lblChooseFunction = new GridBagConstraints();
		gbc_lblChooseFunction.anchor = GridBagConstraints.WEST;
		gbc_lblChooseFunction.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseFunction.gridx = 0;
		gbc_lblChooseFunction.gridy = 0;
		wsAndErpTab.add(lblChooseFunction, gbc_lblChooseFunction);
		
		JComboBox<String> webServiceComboBox = new JComboBox<String>();	
		
		GridBagConstraints gbc_webServiceComboBox = new GridBagConstraints();
		gbc_webServiceComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_webServiceComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_webServiceComboBox.gridx = 1;
		gbc_webServiceComboBox.gridy = 0;
		wsAndErpTab.add(webServiceComboBox, gbc_webServiceComboBox);
		
		JComboBox<String> erpComboBox = new JComboBox<String>();
				
		GridBagConstraints gbc_erpComboBox = new GridBagConstraints();
		gbc_erpComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_erpComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_erpComboBox.gridx = 1;
		gbc_erpComboBox.gridy = 1;
		wsAndErpTab.add(erpComboBox, gbc_erpComboBox);
		
		JScrollPane mainDataTableScrollPaneHolder = new JScrollPane();
		GridBagConstraints gbc_mainDataTableScrollPaneHolder = new GridBagConstraints();
		gbc_mainDataTableScrollPaneHolder.gridwidth = 2;
		gbc_mainDataTableScrollPaneHolder.insets = new Insets(0, 0, 0, 5);
		gbc_mainDataTableScrollPaneHolder.fill = GridBagConstraints.BOTH;
		gbc_mainDataTableScrollPaneHolder.gridx = 0;
		gbc_mainDataTableScrollPaneHolder.gridy = 2;
		wsAndErpTab.add(mainDataTableScrollPaneHolder, gbc_mainDataTableScrollPaneHolder);
		
		mainDataTable = new JTable();
		mainDataTableScrollPaneHolder.setViewportView(mainDataTable);
		
		JPanel wsFileChooseTab = new JPanel();
		mainTabHolder.addTab("Få fildata genom WS", null, wsFileChooseTab, null);
		GridBagLayout gbl_wsFileChooseTab = new GridBagLayout();
		gbl_wsFileChooseTab.columnWidths = new int[]{94, 0, 0};
		gbl_wsFileChooseTab.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_wsFileChooseTab.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_wsFileChooseTab.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		wsFileChooseTab.setLayout(gbl_wsFileChooseTab);
		
		JLabel chooseFileLabel = new JLabel("V\u00E4lj fil");
		GridBagConstraints gbc_chooseFileLabel = new GridBagConstraints();
		gbc_chooseFileLabel.anchor = GridBagConstraints.WEST;
		gbc_chooseFileLabel.insets = new Insets(0, 0, 5, 5);
		gbc_chooseFileLabel.gridx = 0;
		gbc_chooseFileLabel.gridy = 0;
		wsFileChooseTab.add(chooseFileLabel, gbc_chooseFileLabel);
		
		JButton chooseFileButton = new JButton("V\u00E4lj fil");

		GridBagConstraints gbc_chooseFileButton = new GridBagConstraints();
		gbc_chooseFileButton.anchor = GridBagConstraints.WEST;
		gbc_chooseFileButton.insets = new Insets(0, 0, 5, 0);
		gbc_chooseFileButton.gridx = 1;
		gbc_chooseFileButton.gridy = 0;
		wsFileChooseTab.add(chooseFileButton, gbc_chooseFileButton);
		
		fileContentTextArea = new JTextArea();
		GridBagConstraints gbc_fileContentTextArea = new GridBagConstraints();
		gbc_fileContentTextArea.gridwidth = 2;
		gbc_fileContentTextArea.gridheight = 4;
		gbc_fileContentTextArea.fill = GridBagConstraints.BOTH;
		gbc_fileContentTextArea.gridx = 0;
		gbc_fileContentTextArea.gridy = 2;
		wsFileChooseTab.add(fileContentTextArea, gbc_fileContentTextArea);
		
		// Adding data to the dropdown boxes
		try {
			for (String availableTable : WebServiceController.GetTableNamesForWS())
				webServiceComboBox.addItem(availableTable);
			for (String availableErpQuery : WebServiceController.GetErpQueries())
				erpComboBox.addItem(availableErpQuery);
		} catch (RemoteException e1) {
				this.handleConnectException(e1);
		}
		
		webServiceComboBox.addItemListener(e -> this.handleWSTableRequest(e, webServiceComboBox.getSelectedItem()));
		erpComboBox.addItemListener(e -> this.handleERPQueryRequest(e, erpComboBox.getSelectedItem()));
		chooseFileButton.addActionListener(e -> this.handleFilePickerButtonClick());
		
	}
	
	// METHODS
	private void handleConnectException(RemoteException e1) {

		if (e1.getCause() != null && e1.getCause().toString().contains("ConnectException"))
			JOptionPane.showMessageDialog(frame, "Could not connect to webservice, please check the webservice state and try again");
		else 
			JOptionPane.showMessageDialog(frame, "RemoteExceptio: " + e1.getMessage());
		System.exit(0);
	}

	public void handleWSTableRequest(ItemEvent ie, Object selectedItem) {
		if (ie.getStateChange() == ItemEvent.SELECTED)
			this.updateDataTable(ComboBoxSender.WS, (String)selectedItem);
	}
	
	public void handleERPQueryRequest(ItemEvent ie, Object selectedItem) {	
		if (ie.getStateChange() == ItemEvent.SELECTED)
			this.updateDataTable(ComboBoxSender.ERP, (String)selectedItem);
	}
	
	public enum ComboBoxSender {
		ERP, WS
	}

	private void updateDataTable(ComboBoxSender comboBoxSender, String selectedItem) {
		try {
			Object[][] results = null;
			if (comboBoxSender == ComboBoxSender.WS)
				results = (Object[][]) WebServiceController.GetInfoFromDatabaseTable(selectedItem);
			else
				results = (Object[][]) WebServiceController.GetInfoFromERPQuery(selectedItem);

			if (results != null) {
				Object[] colNames = results[0];
				Object[][] data = new Object[results.length - 1][results[0].length];
				for (int i = 1; i < results.length; i++)
					data[i - 1] = results[i];

				SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				for (int i = 0; i < data.length; i++)
					for (int j = 0; j < data[i].length; j++)
						if (data[i][j] instanceof GregorianCalendar) {
							GregorianCalendar gregInstance = (GregorianCalendar) data[i][j];
							gregInstance.add(Calendar.HOUR, -1);
							f.setCalendar(gregInstance);
							data[i][j] = f.format(gregInstance.getTime());
						}

				DefaultTableModel dtm = new DefaultTableModel(data, colNames);
				mainDataTable.setModel(dtm);
			} else {
				System.out.println("Results are null");
			}

		} catch (RemoteException re) {
			this.handleConnectException(re);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void handleFilePickerButtonClick() {
		JFileChooser fileChooser = new JFileChooser();
		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
			try {
				String fileContent = WebServiceController.GetFileContent(selectedFilePath);
				fileContentTextArea.setText(fileContent);
			} catch (RemoteException re) {
				this.handleConnectException(re);
			}
		}
	}
}

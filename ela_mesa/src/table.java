import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Choice;
import java.awt.List;
import java.awt.Window;

import javax.swing.JComboBox;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class table {
	private static JTextField textOnoma;
	private static JTextField textKostos;
	private static JTextField textAtoma;
    private static int k=1;
	public static void main(String[] args) {
	
		JTable table=new JTable();
        Object[] columns = {"ID", "ONOMA", "METRHTA-KARTA"};
        DefaultTableModel model = new DefaultTableModel();
        
        
        JFrame frame= new JFrame("ELA MESA");
        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.getContentPane().setForeground(Color.WHITE);
        frame.setBounds(100,100,701,681);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        
        
        
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        
        table.setBackground(Color.white);
        table.setForeground(Color.black);
        table.setSelectionBackground(Color.red);
        table.setGridColor(Color.red);
        table.setSelectionForeground(Color.white);
        table.setRowHeight(30);
        table.setAutoCreateRowSorter(true);
        
        textOnoma = new JTextField();
        textOnoma.setBounds(104, 456, 120, 25);
        frame.getContentPane().add(textOnoma);
        textOnoma.setColumns(10);
        textOnoma.setVisible(true);
        
        textKostos = new JTextField();
        textKostos.setBounds(164, 13, 60, 19);
        frame.getContentPane().add(textKostos);
        textKostos.setColumns(10);
        textKostos.setVisible(true);
        
        JLabel lblOnoma = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
        lblOnoma.setFont(new Font("Dialog", Font.PLAIN, 19));
        lblOnoma.setForeground(Color.WHITE);
        lblOnoma.setEnabled(true);
        lblOnoma.setBounds(33, 449, 61, 30);
        frame.getContentPane().add(lblOnoma);
        
        String[] payment= {"DEN PLHRWSE","METRHTA", "KARTA"};
        JComboBox comboBox1 = new JComboBox(payment);
        comboBox1.setBounds(183, 492, 108, 30);
        comboBox1.setVisible(true);
        frame.getContentPane().add(comboBox1);
        textAtoma = new JTextField();
        textAtoma.setBounds(174, 42, 60, 19);
        frame.getContentPane().add(textAtoma);
        textAtoma.setColumns(10);
        
        Button button_kostos = new Button("OK");
        button_kostos.setBackground(Color.MAGENTA);
        button_kostos.setBounds(36, 77, 66, 21);
        frame.getContentPane().add(button_kostos);
        button_kostos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	     int kostos=Integer.parseInt(textKostos.getText());
        		 int kostos_simm=Integer.parseInt(textAtoma.getText());
        		 
        		
        	}
        });
        
        
        JLabel lblKostos = new JLabel("\u039A\u03CC\u03C3\u03C4\u03BF\u03C2 \u03B5\u03BA\u03B4\u03C1\u03BF\u03BC\u03AE\u03C2");
        lblKostos.setForeground(Color.WHITE);
        lblKostos.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblKostos.setBounds(33, 10, 121, 22);
        frame.getContentPane().add(lblKostos);
        lblKostos.setEnabled(true);
        lblKostos.setVisible(true);
        
        JLabel lblpayment = new JLabel("\u039A\u03AC\u03C1\u03C4\u03B1-\u039C\u03B5\u03C4\u03C1\u03B7\u03C4\u03AC");
        lblpayment.setForeground(Color.WHITE);
        lblpayment.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblpayment.setBounds(33, 489, 140, 29);
        frame.getContentPane().add(lblpayment);
        lblpayment.setEnabled(true);
        
        Object[] row = new Object[3];
        
        JButton btnAdd = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7");
            
        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnAdd.setBounds(33, 532, 191, 30);
        frame.getContentPane().add(btnAdd);
        
       
        comboBox1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(e.getSource()==comboBox1) {
        		 row[2]=comboBox1.getSelectedItem();
        		}
        	    if(row[2].equals("METRHTA"))
        	    {
        	    	
        	    }
        	    else if(row[2].equals("KARTA"))
        	    {
        	    	
        	    }
        	}
        });
        
      
       
        JButton btlDelete = new JButton("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE");
        btlDelete.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btlDelete.setBounds(33, 572, 191, 29);
        frame.getContentPane().add(btlDelete);
        
       
        
        
        JLabel lblAtoma = new JLabel("\u0391\u03C1\u03B9\u03B8\u03BC\u03CC\u03C2 \u03B1\u03C4\u03CC\u03BC\u03C9\u03BD");
        lblAtoma.setForeground(Color.WHITE);
        lblAtoma.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblAtoma.setBounds(33, 42, 140, 29);
        frame.getContentPane().add(lblAtoma);
        
        JButton btnUpdate = new JButton("\u0395\u03BD\u03B7\u03BC\u03AD\u03C1\u03C9\u03C3\u03B7");
        btnUpdate.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		DefaultTableModel tblModel=(DefaultTableModel) table.getModel();
        		if(table.getSelectedRowCount()>=0) {
        			String name=textOnoma.getText();
        			String id="";
        			row[2]=comboBox1.getSelectedItem();
        			tblModel.setValueAt(id, table.getSelectedRow(), 0);
        			tblModel.setValueAt(name, table.getSelectedRow(), 1);
        			tblModel.setValueAt(row[2],table.getSelectedRow(), 2);
        		}
        		
        	}
        });
       
        
        btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if (textOnoma.getText().equals(""))
        			JOptionPane.showMessageDialog(frame,"Vale onoma");
        		else
        		{
        		
        		row[0]= k;
        		k++;        		
        		row[1]= textOnoma.getText();
        		textOnoma.setText("");
        		row[2]=comboBox1.getSelectedItem();
        		model.addRow(row);
        		}
        	}
        });
               
      
        btlDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		int i=table.getSelectedRow();
        		if(i>=0) {
        			
        			model.removeRow(i);	
        			
        			for (int j=i; j<model.getRowCount();j++)
        			{
        				model.setValueAt(j+1+"", j, 0);
        			}     			
        		}
        		else {
        			JOptionPane.showMessageDialog(frame,"Delete Error");
        		}
        	}
        });
        frame.revalidate();
        frame.setVisible(true);
        btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnUpdate.setBounds(33, 611, 191, 30);
        frame.getContentPane().add(btnUpdate);
        
        JScrollPane pane =new JScrollPane(table);
        
        pane.setForeground((Color.RED));
        pane.setBackground((Color.WHITE));
        pane.setBounds(36,122,625,285);
        frame.getContentPane().add(pane);
        
      
        
       
 
      
         
	}
}

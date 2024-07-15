import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Swing {

	private static final String EXIT_ON_CLOSE = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("Java");
		jf.setSize(300,200);
		jf.setBounds(100,100,450,215);
		jf.setDefaultCloseOperation(JFrame,EXIT_ON_CLOSE);
		jf.setVisible(true);
		JLabel jl=new JLabel("Username ");
		jl.setBounds(30,20,250,30);
		jf.add(jl);
		JTextField jt=new JTextField();
		jt.setBounds(214,32,96,20);
		jt.getContentPane().add(TextField);
		jt.setColumns(10);
		JButton bn=new JButton("Display");
		bn.setBounds(61,83,89,23);
		bn.addActionListener(new ActionListener() {
			public void ActionPerformed(ActionEvent e) {
				String name=textField.getText();
				
			}
		})

	}

}

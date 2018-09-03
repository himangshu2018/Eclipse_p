import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Frame18 extends JFrame {
	private ImageIcon icon;
	private Container con;
	private JPasswordField f;
	Frame18()
	{
		initcomponent();
	}
	public void initcomponent()
	
	{   con=this.getContentPane();
	    con.setBackground(Color.green);
	
		icon=new ImageIcon(getClass().getResource("FrameIcon.jpg"));
		this.setIconImage(icon.getImage());
	}
	
	public static void main(String[] args) {
		Frame18 obj=new Frame18();
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setTitle("KUMAR");
		obj.setBounds(200, 100, 500, 400);
		obj.setResizable(false);
		

	}

}

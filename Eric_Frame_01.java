import java.awt.Frame;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Image;

public class Eric_Frame_01 extends Frame
{
	public static void main(String[] args)
	{
		Eric_Frame_01 frm = new Eric_Frame_01();
		// Image img = Toolkit.getDefaultToolkit().getImage("river.jpg");
		// frm.setIconImage(img);
		Color clr = new Color(130, 170, 200);
		frm.setBackground(clr);
		frm.setSize(800, 600);
		frm.setLocation(100, 100);
		frm.setVisible(true);
	}
}
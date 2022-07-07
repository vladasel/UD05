import javax.swing.JOptionPane;

public class ej3 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Bienvenid@ " + name);
	}

}

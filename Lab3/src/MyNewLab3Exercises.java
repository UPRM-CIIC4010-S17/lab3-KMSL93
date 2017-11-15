import javax.swing.JFrame;
public class MyNewLab3Exercises {
	
		public static void main(String[] args) {
			JFrame myFrame = new JFrame("Kevin Sanchez");
			myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			myFrame.setLocation(200, 200);
			myFrame.setSize(200, 200);
			MyNewPanelClass myPanel = new MyNewPanelClass();
	        myFrame.getContentPane().add(myPanel);
			myFrame.setVisible(true);
		}
	}


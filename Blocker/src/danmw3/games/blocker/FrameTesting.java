package danmw3.games.blocker;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextField;

//please dont mess with this class    im testing something  :)
public class FrameTesting extends JFrame {

	JButton startGame = new BtnTesting("Start Game", 120, 40, 2, 404);
	JButton exitGame = new BtnTesting("Exit Game", 120, 40, 147, 404);
	JButton sendInput = new BtnTesting("Send", 65, 20, 527, 425);

	static JTextField cmdInput = new JTextField("");
	static JEditorPane consoleOutput = new JEditorPane();

	public FrameTesting(String title, int id, int sizeX, int sizeY) {
		super(title);
		if (id == 0) {
			Blocker app = new Blocker();
			setSize(sizeX, sizeY);
			setLayout(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			add(startGame);
			add(exitGame);
			setVisible(true);
		} else if (id == 1) {
			// frame properties
			setSize(sizeX, sizeY);
			setLayout(null);
			setResizable(false);
			// cmdInput properties
			cmdInput.setSize(525, 20); // 595
			cmdInput.setLocation(2, 425);
			// consoleOutput properties
			consoleOutput.setSize(595, 425);
			// add elements
			add(cmdInput);
			add(sendInput);
			add(consoleOutput);
			setVisible(true);
		}
	}
}

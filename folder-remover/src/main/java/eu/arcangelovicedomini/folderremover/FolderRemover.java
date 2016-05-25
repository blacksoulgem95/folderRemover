package eu.arcangelovicedomini.folderremover;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import eu.arcangelovicedomini.folderremover.gui.MainContainer;
import eu.arcangelovicedomini.folderremover.gui.Menu;
import eu.arcangelovicedomini.folderremover.gui.StatusBar;

/**
 * Main class
 */
public class FolderRemover {
	JFrame mainFrame;
	
	
	public FolderRemover() {
		mainFrame = new JFrame("FolderRemover - by Arcangelo Vicedomini");
		mainFrame.setSize(640, 480);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.setJMenuBar(new Menu());
		mainFrame.add(new MainContainer(), BorderLayout.CENTER);
		mainFrame.add(new StatusBar(), BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		FolderRemover mainApp = new FolderRemover();
		mainApp.mainFrame.pack();
		mainApp.mainFrame.setVisible(true);
	}
}

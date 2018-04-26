package art.controller;

import art.view.ArtFrame;
import javax.swing.JOptionPane;

public class ArtController
{
	private ArtFrame appFrame;
	
	public void start()
	{
		appFrame = new ArtFrame(this);
		JOptionPane.showMessageDialog(appFrame, "Welcome to the art app!");
	}
	
	public ArtFrame getArtFrame()
	{
		return appFrame;
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
}

package art.controller;

import art.controller.ArtController;

/**
 * Runs the project by calling the PokemonController
 * @author Dustin Schimel
 *
 */
public class Runner
{
	public static void main (String [] args)
	{
		ArtController app = new ArtController();
		app.start();
	}
}

package com.pokemc.pluginname;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.Server;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;


/*
 * 		mcmod.info
 * The "modid" should have the same value as "id"
 * The "name" should have the same value as "name"
 */

/*
 * id = "Main" <- Should be the same as `name` & the Plugin Name itself
 * name = "Main" <- Should be the same as `id` & the Plugin Name itself
 */

@Plugin(id = "Main", name = "Main", version = "0.0.1")
public class Main
{
	/*
	 * PluginName is a variable to easily access the name of the plugin from within the code.
	 * PluginVersion is a variable to easily access the version of the plugin from within the code.
	 * Revision is a variable to indicate a difference in small updates.
	 */
	public static final String PluginName = "Main";
	public static final String PluginVersion = "0.0.1";
	public static final int Revision = 0;
	
	public static Game game;
	public static Server server;
	public static Logger logger;
	
	@Inject
	private void setLogger(Logger _logger)
	{
		/*
		 * The 'logger' is used to send Messages to the Console.
		 * Format: logger.info(STRING);
		 * If used from outside 'Main.java' class you'd use: Main.logger.info(STRING);
		 */
		Main.logger = _logger;
	}

	@Inject
	private void setGame(Game _game)
	{
		Main.game = _game;
	}
	
	/*
	 * GameStartedServerEvent is called when the Server is Starting Up.
	 * You want to initialize the config, database, etc in this method.
	 */
	@Listener
	public void OnGameStarted(GameStartedServerEvent event)
	{
		logger.info(PluginName + " v" + PluginVersion + " is Loading...");

		server = game.getServer();
		
		/*
		 * This is an example of how you'd register 'Event Listeners' for your plugin.
		 * 
		 * The Parameters:
		 * 		this = links the 'Main Plugin Class' to the Listener
		 * 		new ClassName() = creates a new Instance of the 'ClassName' which will handle called Events
		 */
		//game.getEventManager().registerListeners(this, new ClassName());
		
		logger.info(PluginName + " has been Enabled! Version: " + PluginVersion);
	}
}

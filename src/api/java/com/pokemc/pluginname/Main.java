package com.pokemc.pluginname;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.Server;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "Main", name = "Main", version = "0.0.1")
public class Main
{
	public static final String PluginName = "Main";
	public static final String PluginVersion = "0.0.1";
	public static final int Revision = 0;
	
	public static Game game;
	public static Server server;
	public static Logger logger;
	
	@Inject
	private void setLogger(Logger _logger)
	{
		Main.logger = _logger;
	}

	@Inject
	private void setGame(Game _game)
	{
		Main.game = _game;
	}
	
	@Listener
	public void OnGameStarted(GameStartedServerEvent event)
	{
		logger.info(PluginName + " v" + PluginVersion + " is Loading...");

		server = game.getServer();
		
		logger.info(PluginName + " has been Enabled! Version: " + PluginVersion);
	}
}

package com.jstnf.damagelistener;

import org.bukkit.plugin.java.JavaPlugin;

public class DLPlugin extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getLogger().info("Registering listeners...");
		registerListeners();
	}

	@Override
	public void onDisable()
	{

	}

	public void registerListeners()
	{
		getServer().getPluginManager().registerEvents(new DamageListener(this), this);
	}
}
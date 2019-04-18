package com.jstnf.damagelistener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListener implements Listener
{
	private DLPlugin plugin;

	public DamageListener(DLPlugin plugin)
	{
		this.plugin = plugin;
	}

	@EventHandler
	public void onEntityDamage(EntityDamageEvent e)
	{
		plugin.getServer().broadcastMessage(
				"[DamageListener] " + e.getEntity() + " took " + e.getDamage() + " damage by " + e.getCause() + ".");
		plugin.getServer().broadcastMessage("Modified damage: " + e.getFinalDamage());
	}
}
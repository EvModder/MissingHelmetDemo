package net.evmodder.MissingHelmetDemo;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MissingHelmetDemo extends JavaPlugin implements Listener{
	@Override
	public final void onEnable(){
		getServer().getPluginManager().registerEvents(/*listener=*/this, /*plugin=*/this);
	}

	@EventHandler
	public void onEntityDeathEvent(EntityDeathEvent event){
		if(event.getEntity().getEquipment().getHelmetDropChance() >= 1f){
			getServer().broadcastMessage("Entity's Helmet Type:" + event.getEntity().getEquipment().getHelmet().getType());
		}
	}
}
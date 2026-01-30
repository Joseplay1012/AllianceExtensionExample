package net.alliancecraft.allianceExtensionExample;

import net.alliancecraft.allianceutils.api.internalListener.AuListener;
import net.alliancecraft.allianceutils.api.internalListener.annotations.AuEventHandler;
import net.alliancecraft.allianceutils.api.internalListener.events.ExtensionDisabledEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ExampleListener implements Listener, AuListener {
    @AuEventHandler
    public void onExtensionDisabled(ExtensionDisabledEvent event){
        if (event.getExtension().getExtensionName().equalsIgnoreCase(AllianceExtensionExample.getInstance().getExtensionName())){
            AllianceExtensionExample.getInstance().getLogger().info("Extension disabled!");
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        // event logic
    }
}

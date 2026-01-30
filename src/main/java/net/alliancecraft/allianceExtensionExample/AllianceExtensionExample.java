package net.alliancecraft.allianceExtensionExample;

import net.alliancecraft.allianceutils.Allianceutils;
import net.alliancecraft.allianceutils.api.extensions.Alliance;
import net.alliancecraft.allianceutils.api.extensions.AlliancePlugin;

public final class AllianceExtensionExample extends AlliancePlugin {
    public static AllianceExtensionExample instance;

    @Override
    public void onEnable(Allianceutils allianceutils) {
        instance = this;

        Alliance.getAllianceCommandManager().registerCommand(this, new ExampleCommand());
        Alliance.getAllianceListenerManager().registerListener(this, new ExampleListener());
    }

    @Override
    public void onDisable() {
        // Extension shutdown logic
    }


    public static AllianceExtensionExample getInstance() {
        return instance;
    }
}

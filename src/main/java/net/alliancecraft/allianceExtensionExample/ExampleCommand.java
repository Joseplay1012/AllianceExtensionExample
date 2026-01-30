package net.alliancecraft.allianceExtensionExample;

import net.alliancecraft.allianceutils.api.extensions.interfaces.AllianceCommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class ExampleCommand implements AllianceCommandExecutor {
    @Override
    public String getName() {
        return "example";
    }

    @Override
    public List<String> alliances() {
        return List.of("ex");
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        //Logic
    }

    @Override
    public List<String> tabComplete(Player player, String[] strings) {
        return List.of();
    }
}

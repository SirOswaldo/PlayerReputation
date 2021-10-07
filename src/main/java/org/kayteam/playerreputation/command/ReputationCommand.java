package org.kayteam.playerreputation.command;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.kayteam.kayteamapi.command.SimpleCommand;
import org.kayteam.playerreputation.PlayerReputation;

public class ReputationCommand extends SimpleCommand {

    private final PlayerReputation PLUGIN;

    public ReputationCommand(PlayerReputation PLUGIN) {
        super("Reputation");
        this.PLUGIN = PLUGIN;
    }

    @Override
    public void onPlayerExecute(Player sender, String[] args) {

    }

    @Override
    public void onConsoleExecute(ConsoleCommandSender sender, String[] args) {

    }

}
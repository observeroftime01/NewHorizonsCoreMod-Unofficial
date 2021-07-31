package com.dreammaster.loginhandler;

import com.dreammaster.config.CoreModConfig;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class LoginHandler {
    @SuppressWarnings("unused")
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
    	event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "=====================================================" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD + "Welcome to Gregtech: New Horizons " + EnumChatFormatting.GREEN + CoreModConfig.ModPackVersion + "-ex"));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "DO NOT REPORT BUGS TO OFFICIAL GTNH MODPACK DEVS" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "THIS IS A CUSTOM BUILD NOT MEANT FOR GENERAL USE BY THE PUBLIC" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GREEN + "Instead, drop an issue on the GitHub Page if you care"));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "https://github.com/observeroftime01/NewHorizonsCoreMod-Unofficial" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "=====================================================" ));
    }
}

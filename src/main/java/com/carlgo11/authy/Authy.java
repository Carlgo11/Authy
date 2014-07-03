package com.carlgo11.authy;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Authy extends JavaPlugin {
    
    String prefix = ChatColor.YELLOW+"[Authy] "+ChatColor.RESET;
    public void onEnable(){
        
    }
    
    public void onDisable(){
        
    }
    
    public boolean hasPermission(CommandSender sender, String perm){
        
        if(sender.hasPermission("authy."+perm)){
            return true;
        }else{
            sendMessage(sender, ChatColor.RED+"You don't have permission for that");
            return false;
        }
    }
    
    public void sendMessage(CommandSender sender, String message){
        sender.sendMessage(prefix+message);
    }
    
    public void sendMessage(Player player, String message){
        player.sendMessage(prefix+message);
    }
    
    public void error(Player player, String message){
        this.sendMessage(player, ChatColor.RED+"[Error]: "+message);
    }
    public void error(CommandSender sender, String message){
        this.sendMessage(sender, ChatColor.RED+"[Error]: "+message);
    }

}

package com.carlgo11.authy.player.commands;

import com.authy.*;
import com.authy.api.*;
import com.carlgo11.authy.Authy;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AuthyCommand implements CommandExecutor {

    private Authy plugin;

    public AuthyCommand(Authy plug) {
        this.plugin = plug;
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        if(plugin.hasPermission(sender, "authy")){
            if(args.length==0){
                
            }else{
                if(args[0].equalsIgnoreCase("register")){
                 this.register(sender, cmd, commandLabel, args);
                }
            }
        }
        
        return true;
    }
    
    void help(){
        
    }
    void register(CommandSender sender, Command cmd, String commandLabel, String[] args){
        if(args.length==1){
            plugin.error(sender, "/authy register (email) (phone number)");
        }else if(args.length == 3){
        }
        
    }
    
    

}

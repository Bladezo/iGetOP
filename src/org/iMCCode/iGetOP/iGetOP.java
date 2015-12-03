package org.iMCCode.iGetOP;

import com.google.common.base.Function;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.io.IOException;
import java.sql.SQLException;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

public class iGetOP extends JavaPlugin {
  
    public static iGetOP plugin;
    public static SocketServer socketServer;
    public static FileConfiguration config;
    public static Thread thread;  
    
  @Override  
    public void onEnable() {
      iGOP_Logger.info("iGetOP is now enabled!");
      iGOP_Logger.info("iGetOP was created by the: iMCCode, and the TF Devs");
      iGOP_Logger.info("the Owner of iMCCode is iHess");
      iGOP_Logger.info(buildCreator + " compiled iGetOP");
    }
  
  iGetOP.buildCreator = props.getProperty("program.buildcreator");
  
} 

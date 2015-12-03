package org.iMCCode.iGetOP;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import static org.bukkit.Bukkit.getPlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class iGOP_Utility {
  
  public static Random random = new Random();  
  
  // See https://github.com/TotalFreedom/License - None of the listed names may be removed.
  
  // the iGetOP Team. (DO NOT CHANGE/REMOVE!!)
  public static final List<String> GOP_Developers = Arrays.asList("Madgeek1450", "Prozza", "DarthSalmon", "AcidicCyanide", "Wild1145", "WickedGamingUK");
  
  // TotalFreedom.
  public static final List<String> TF_Owner = Arrays.asList("markbyron");
  
  // Server Team. (Changable/Addable/Removable!!)
  public static final List<String> Developers = Arrays.asList("");
  
  // the iMCCode Development Team. (DO NOT CHANGE/REMOVE!!)
  public static final List<String> iMCCode_Founder = Arrays.asList("iHess");
  public static final List<String> iMCCode_CoFounder = Arrays.asList("mathboy601", "MysteriAce", "mrgames71");
  public static final List<String> iMCCode_Developers = Arrays.asList("falceso");
  public static final List<String> iMCCode_Members = Arrays.asList("blooddrenched56", "SanikIsFast");
  
  public static final List<ChatColor> RANDOMCOLORS = Arrays.asList(
            ChatColor.DARK_BLUE,
            ChatColor.DARK_GREEN,
            ChatColor.DARK_AQUA,
            ChatColor.DARK_RED,
            ChatColor.DARK_PURPLE,
            ChatColor.GOLD,
            ChatColor.BLUE,
            ChatColor.GREEN,
            ChatColor.AQUA,
            ChatColor.RED,
            ChatColor.LIGHT_PURPLE,
            ChatColor.YELLOW    
    );
    
    public static void bcMsg(String message, ChatColor color) {
        iGOP_Logger.info(message, true);

        for (Player player : Bukkit.getOnlinePlayers())
        {
            player.sendMessage((color == null ? "" : color) + message);
        }
    }

    public static void bcMsg(String message) {
        iGOP_Utility.bcMsg(message, null);
    }
    
    public static void adminAction(String adminName, String action, boolean isRed)
    {
        iGOP_Utility.bcMsg(adminName + " - " + action, (isRed ? ChatColor.RED : ChatColor.AQUA));
    }
    
    public static boolean msgFormat(String message, Player sender, String[] args) {
    final Player player = getPlayer(args[0]);
        if (player == null)
        {
            sender.sendMessage(ChatColor.GRAY + "That player is not online");
            return true;
        }
      sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + sender.getName() + ChatColor.GRAY + " --- " + ChatColor.DARK_AQUA + player.getName() + ChatColor.DARK_GRAY + "] " + ChatColor.YELLOW + message);
      player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + sender.getName() + ChatColor.GRAY + " --- " + ChatColor.DARK_AQUA + player.getName() + ChatColor.DARK_GRAY + "] " + ChatColor.YELLOW + message);
      sender.sendMessage(ChatColor.GRAY + "That message has been successfully send!");
    
      return true;
    }
    
    public static ChatColor randomisicChatColor() {
      return RANDOMCOLORS.get(RANDOM.nextInt(RANDOMCOLORS.size()));
    }
    
    public static String formattedCode(String string) {
      return ChatColor.translateAlternateColorCodes('&', string);
    }
    
  public static void adminChatMessage(CommandSender sender, String message, boolean senderIsConsole) {
    
  }  
}

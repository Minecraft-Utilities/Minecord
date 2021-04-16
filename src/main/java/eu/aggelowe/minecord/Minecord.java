package eu.aggelowe.minecord;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import eu.aggelowe.minecord.util.Reference;

/**
 * <p >
 * This class is the main class of the plugin and is used to execute all
 * mandatory commands for the plugin to work. Changes in this class should only
 * happen if necessary and not without a reason as the change might break theF
 * plugin.
 * </p>
 * 
 * <p>
 * <b>Note: </b> The class is <code>final</code> and cannot be extended. Also
 * the methods in this class should not be called by any class as they may break
 * the plugin.
 * </p>
 * 
 * @author Aggelowe
 *
 */
public final class Minecord extends JavaPlugin {

	
	@Override
	public void onLoad() {
		super.getServer().getConsoleSender().sendMessage("[" + Reference.getName() + "]" + " The " + ChatColor.DARK_PURPLE + Reference.getName() + ChatColor.RESET + "(" + Reference.getVersion() + ")" + " plugin by " + ChatColor.YELLOW + Reference.getCreator() + ChatColor.RESET + " has been " + ChatColor.GRAY + "loaded" + ChatColor.RESET + "!");
	}

	@Override
	public void onEnable() {
		super.getServer().getConsoleSender().sendMessage("[" + Reference.getName() + "]" + " The " + ChatColor.DARK_PURPLE + Reference.getName() + ChatColor.RESET + "(" + Reference.getVersion() + ")" + " plugin by " + ChatColor.YELLOW + Reference.getCreator() + ChatColor.RESET + " has been " + ChatColor.GREEN + "enabled" + ChatColor.RESET + "!");
	}

	@Override
	public void onDisable() {
		super.getServer().getConsoleSender().sendMessage("[" + Reference.getName() + "]" + " The " + ChatColor.DARK_PURPLE + Reference.getName() + ChatColor.RESET + "(" + Reference.getVersion() + ")" + " plugin by " + ChatColor.YELLOW + Reference.getCreator() + ChatColor.RESET + " has been " + ChatColor.RED + "disabled" + ChatColor.RESET + "!");
	}

}

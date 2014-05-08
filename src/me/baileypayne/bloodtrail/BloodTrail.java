
package me.baileypayne.bloodtrail;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Bailey
 */
public class BloodTrail extends JavaPlugin {
        
    public void onEnable(){
                getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
    }
}

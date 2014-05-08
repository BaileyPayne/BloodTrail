
package me.baileypayne.bloodtrail;

import java.util.Random;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

/**
 *
 * @author Bailey
 */
class PlayerListener implements Listener {
    
    private BloodTrail plugin;
    
    Random random = new Random();
    int Chance = random.nextInt(200);


    public PlayerListener(BloodTrail aThis) {
        this.plugin = aThis;
    }
    @EventHandler
    public void onEntityDamageEvent(EntityDamageEvent event){
        Player player = (Player) event.getEntity();
        Block block = player.getLocation().getBlock();
        if(event.getEntityType() == EntityType.PLAYER){
        if(event.getCause() == DamageCause.ENTITY_ATTACK){
            if(Chance >= 25){
                   player.getWorld().playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES , 1);
            }
            else {
                block.setType(Material.REDSTONE_WIRE);
            }
            
        }
        
    }
    
    
}
}
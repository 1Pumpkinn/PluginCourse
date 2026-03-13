package net.saturn.pluginCourse;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityHitEvent implements Listener {

    @EventHandler
    public void onEntityHit(EntityDamageByEntityEvent e) {

        if (e.getDamager() instanceof Player attacker) {

            e.getEntity().setGlowing(true);
            attacker.sendMessage("WOAAH you attacked a entity you are a real meanie!");
            e.getEntity().teleport(attacker);
        }

    }
}

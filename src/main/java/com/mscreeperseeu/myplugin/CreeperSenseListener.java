package com.mscreeperseeu.myplugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.entity.Mob;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CreeperSenseListener implements Listener {

    private final JavaPlugin plugin;

    public CreeperSenseListener(JavaPlugin plugin) {
        this.plugin = plugin;
        startCreeperSenseTask();
    }

    private void startCreeperSenseTask() {
        new BukkitRunnable() {
            @Override
            public void run() {
                List<Creeper> allLoadedCreepers = Bukkit.getWorlds().stream()
                        .flatMap(world -> world.getEntitiesByClass(Creeper.class).stream())
                        .filter(creeper -> creeper.getLocation().getChunk().isLoaded())
                        .collect(Collectors.toList());

                for (Creeper creeper : allLoadedCreepers) {
                    Player closestPlayer = Bukkit.getOnlinePlayers().stream()
                            .filter(player -> player.isOnline() && !player.isDead())
                            .min(Comparator.comparingDouble(p -> p.getLocation().distanceSquared(creeper.getLocation())))
                            .orElse(null);

                    if (closestPlayer != null) {
                        creeper.setTarget(closestPlayer);

                        if (creeper instanceof Mob) {
                            Mob mobCreeper = (Mob) creeper;
                            mobCreeper.getPathfinder().moveTo(closestPlayer.getLocation(), 1.5D); // 移速 默认1.0
                        }
                    }
                }
            }
        }.runTaskTimer(plugin, 0L, 20L);
    }
}

package coma112.cbountyapi;

import coma112.cbounty.CBounty;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class CBountyAPI extends JavaPlugin {
    @Getter private static CBounty plugin;

    @Override
    public void onEnable() {
        plugin = CBounty.getInstance();
    }
}

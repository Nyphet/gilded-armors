package crystalspider.gildedarmors;

import crystalspider.gildedarmors.config.GildedArmorsConfig;
import net.fabricmc.api.ModInitializer;
import net.minecraftforge.api.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

/**
 * Gilded Armors mod loader.
 */
public class GildedArmorsLoader implements ModInitializer {
  /**
   * ID of this mod.
   */
  public static final String MODID = "gildedarmors";

  @Override
	public void onInitialize() {
    ModLoadingContext.registerConfig(MODID, ModConfig.Type.COMMON, GildedArmorsConfig.SPEC);
  }
}
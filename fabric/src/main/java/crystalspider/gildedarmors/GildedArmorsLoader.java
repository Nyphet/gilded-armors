package crystalspider.gildedarmors;

import crystalspider.gildedarmors.config.GildedArmorsConfig;
import net.fabricmc.api.ModInitializer;
import net.minecraftforge.api.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

/**
 * Torch hit! mod loader.
 */
public class GildedArmorsLoader implements ModInitializer {
  /**
   * ID of this mod.
   */
  public static final String MODID = "torchhit";

  @Override
	public void onInitialize() {
    ModLoadingContext.registerConfig(MODID, ModConfig.Type.COMMON, GildedArmorsConfig.SPEC);
  }
}
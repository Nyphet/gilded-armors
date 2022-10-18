package crystalspider.gildedarmors;

import crystalspider.gildedarmors.config.GildedArmorsConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

/**
 * Gilded Armors mod loader.
 */
@Mod(GildedArmorsLoader.MODID)
public class GildedArmorsLoader {
  /**
   * ID of this mod.
   */
  public static final String MODID = "gildedarmors";

  /**
   * Network channel protocol version.
   */
  public static final String PROTOCOL_VERSION = "1.18-1.0";
  /**
   * {@link SimpleChannel} instance for compatibility client-server.
   */
  public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, "main"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, (version) -> true);

  public GildedArmorsLoader() {
    ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GildedArmorsConfig.SPEC);
  }
}
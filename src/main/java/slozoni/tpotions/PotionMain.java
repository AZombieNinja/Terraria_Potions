package slozoni.tpotions;

import net.minecraft.world.damagesource.DamageTypes;

import net.minecraft.world.entity.player.Player;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(PotionMain.MODID)
@EventBusSubscriber(modid = PotionMain.MODID, bus = Bus.FORGE)
public class PotionMain {
    public static final String MODID = "tpotions";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PotionMain() {
        // Register the common setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::fillTab);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register custom items and potions
        ModItems.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModPotions.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Pre-load any data or configurations if needed
        LOGGER.info("Setting up common config for Obsidian Skin Potion mod");
    }
    private void fillTab(BuildCreativeModeTabContentsEvent ev) {
        if (ev.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            ev.accept(ModItems.OBSIDIAN_SKIN_POTION_ITEM);
            ev.accept(ModItems.IRONSKIN_POTION);
     }
    }

    public static int secondsToTicks(int seconds)
    {
        return seconds * 20;
    }
}

package slozoni.tpotions;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, PotionMain.MODID);

    public static final RegistryObject<Potion> OBSIDIAN_SKIN = POTIONS.register("obsidian_skin_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}

package slozoni.tpotions;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PotionMain.MODID)
public class PlayerEvents {


    @SubscribeEvent
    public static void onItemUseFinish(LivingEntityUseItemEvent.Finish event) {
        LivingEntity entity = event.getEntity();

        ItemStack item = event.getItem();

        // Check if the consumed item is the Obsidian Skin Potion
        if (item.getItem() == ModItems.OBSIDIAN_SKIN_POTION_ITEM.get()) {
            // Apply the Fire Resistance effect
            entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, PotionMain.secondsToTicks(600))); // 3 minutes of Fire Resistance
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, PotionMain.secondsToTicks(600)));
        }
            if (item.getItem() == ModItems.IRONSKIN_POTION.get()) {
                // Apply the Fire Resistance effect
                entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, PotionMain.secondsToTicks(350), 2));
            }
    }
}
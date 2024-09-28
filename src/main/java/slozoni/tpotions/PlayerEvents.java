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

            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, PotionMain.secondsToTicks(350), 2));
        }
        if (item.getItem() == ModItems.GILLS_POTION.get()) {

            entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, PotionMain.secondsToTicks(500), 0));
        }
        if (item.getItem() == ModItems.NIGHT_OWL_POTION.get()) {

            entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, PotionMain.secondsToTicks(350), 1));
        }
        if (item.getItem() == ModItems.SWIFTNESS_POTION.get()) {

            entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, PotionMain.secondsToTicks(250), 1));
        }
        if (item.getItem() == ModItems.HEALTH_BOOST_POTION.get()) {

            entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, PotionMain.secondsToTicks(350), 1));
        }
        if (item.getItem() == ModItems.POTION_OF_REGENERATION.get()) {

            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, PotionMain.secondsToTicks(350), 1));
        }
        if (item.getItem() == ModItems.POTION_OF_LUCK.get()) {

            entity.addEffect(new MobEffectInstance(MobEffects.LUCK, PotionMain.secondsToTicks(350), 1));
        }
    }
}

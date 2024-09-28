package slozoni.tpotions;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.ItemStack; // Ensure this is imported
import net.minecraft.world.item.alchemy.PotionUtils; // Ensure this is imported
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PotionMain.MODID);

    // Register the potion item
    public static final RegistryObject<Item> OBSIDIAN_SKIN_POTION_ITEM = ITEMS.register("obsidian_skin_potion_item",
            () -> new PotionItem(new Item.Properties()));

    public static ItemStack createObsidianSkinPotionStack() {
        return PotionUtils.setPotion(new ItemStack(OBSIDIAN_SKIN_POTION_ITEM.get()), ModPotions.OBSIDIAN_SKIN.get());
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package slozoni.tpotions;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PotionMain.MODID);

    // Register the potion item
    public static final RegistryObject<Item> OBSIDIAN_SKIN_POTION_ITEM = ITEMS.register("obsidian_skin_potion_item",
            () -> new PotionItem(new Item.Properties()));
    public static final RegistryObject<Item> IRONSKIN_POTION = ITEMS.register("iron_skin_potion_item",
            () -> new PotionItem(new Item.Properties()));
    public static final RegistryObject<Item> GILLS_POTION = ITEMS.register("gills_potion_item",
            () -> new PotionItem(new Item.Properties()));
    public static final RegistryObject<Item> NIGHT_OWL_POTION = ITEMS.register("night_owl_potion_item",
            () -> new PotionItem(new Item.Properties()));
    public static final RegistryObject<Item> SWIFTNESS_POTION = ITEMS.register("swiftness_potion_item",
            () -> new PotionItem(new Item.Properties()));
    public static final RegistryObject<Item> POTION_OF_REGENERATION = ITEMS.register("potion_of_regeneration_item",
            () -> new PotionItem(new Item.Properties()));
    public static final RegistryObject<Item> HEALTH_BOOST_POTION = ITEMS.register("health_boost_potion_item",
            () -> new PotionItem (new Item.Properties()));
    public static final RegistryObject<Item> POTION_OF_GREATER_LUCK = ITEMS.register("potion_of_greater_luck_item",
            () -> new PotionItem (new Item.Properties()));
    public static final RegistryObject<Item> WRATH_POTION = ITEMS.register("wrath_potion_item",
            () -> new PotionItem (new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

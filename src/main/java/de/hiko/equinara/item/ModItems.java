package de.hiko.equinara.item;

import de.hiko.equinara.Equinara;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Equinara.MOD_ID);

    //Schatten Erz verarbeitet
    public static final DeferredItem<Item>  UMBRIUM = ITEMS.register("umbrium",
            () -> new Item(new Item.Properties()));

    //Schatten Erz Roh
    public static final DeferredItem<Item>  RAW_UMBRIUM = ITEMS.register("raw_umbrium",
            () -> new Item(new Item.Properties()));

    //Licht Erz
    public static final DeferredItem<Item>  LUXIUM = ITEMS.register("luxium",
            () -> new Item(new Item.Properties()));

    //Licht Erz Roh
    public static final DeferredItem<Item>  RAW_LUXIUM = ITEMS.register("raw_luxium",
            () -> new Item(new Item.Properties()));

    //Legierung aus Licht und Schatten
    public static final DeferredItem<Item>  DUALIUM = ITEMS.register("dualium",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

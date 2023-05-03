package net.swutm.cookedapplea.item.custom;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.cookedapplea.cookedapplea;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, cookedapplea.MOD_ID);

    public static final RegistryObject<Item> COOKED_APPLES = ITEMS.register("cooked_apples",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.COOKED_APPLES)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

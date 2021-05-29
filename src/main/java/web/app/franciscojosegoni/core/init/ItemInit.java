package web.app.franciscojosegoni.core.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import web.app.franciscojosegoni.ExampleMod;


public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
															()-> new Item(
																	new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	//Block Items
	public static final RegistryObject<Item> EXAMPLE_BLOCK = ITEMS.register("example_block",
			()-> new BlockItem(
					BlockInit.EXAMPLE_BLOCK.get(),
					new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
}

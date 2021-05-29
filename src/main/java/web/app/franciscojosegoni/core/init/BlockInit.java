package web.app.franciscojosegoni.core.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import web.app.franciscojosegoni.ExampleMod;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
			()-> new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE)
					.harvestTool(ToolType.AXE).strength(15f, 15f)
					.harvestLevel(2)
					.sound(SoundType.ANVIL)));
}

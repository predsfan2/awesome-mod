
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.awesome.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.awesome.block.TestPortalBlock;
import net.mcreator.awesome.AwesomeMod;

public class AwesomeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AwesomeMod.MODID);
	public static final RegistryObject<Block> TEST_PORTAL = REGISTRY.register("test_portal", () -> new TestPortalBlock());
}

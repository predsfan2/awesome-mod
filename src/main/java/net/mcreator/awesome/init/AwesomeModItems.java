
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.awesome.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.awesome.item.TestItem;
import net.mcreator.awesome.AwesomeMod;

public class AwesomeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AwesomeMod.MODID);
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
}

/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.nether;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.discovery.ASMDataTable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

import net.mcreator.nether.gui.GuiSmithingGUI;
import net.mcreator.nether.gui.GuiBarrelGUI;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class ElementsNetherMod implements IFuelHandler, IWorldGenerator {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<Biome>> biomes = new ArrayList<>();
	public final List<Supplier<EntityEntry>> entities = new ArrayList<>();
	public final List<Supplier<Potion>> potions = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public ElementsNetherMod() {
		sounds.put(new ResourceLocation("nether", "music.crimson_forest"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "music.crimson_forest")));
		sounds.put(new ResourceLocation("nether", "music.pigstep"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "music.pigstep")));
		sounds.put(new ResourceLocation("nether", "music.nether_waste"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "music.nether_waste")));
		sounds.put(new ResourceLocation("nether", "blocks.basalt.break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "blocks.basalt.break")));
		sounds.put(new ResourceLocation("nether", "block.respawn_ancor.charge"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "block.respawn_ancor.charge")));
		sounds.put(new ResourceLocation("nether", "block.respawn_ancor.set_spawnpoint"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "block.respawn_ancor.set_spawnpoint")));
		sounds.put(new ResourceLocation("nether", "mob.zoglin.step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.zoglin.step")));
		sounds.put(new ResourceLocation("nether", "mob.zoglin.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.zoglin.hurt")));
		sounds.put(new ResourceLocation("nether", "mob.zoglin.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.zoglin.death")));
		sounds.put(new ResourceLocation("nether", "mob.hoglin.ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.hoglin.ambient")));
		sounds.put(new ResourceLocation("nether", "mob.hoglin.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.hoglin.death")));
		sounds.put(new ResourceLocation("nether", "mob.hoglin.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.hoglin.hurt")));
		sounds.put(new ResourceLocation("nether", "mob.piglinbrute.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.piglinbrute.death")));
		sounds.put(new ResourceLocation("nether", "mob.piglinbrute.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.piglinbrute.hurt")));
		sounds.put(new ResourceLocation("nether", "mob.piglinbrute.step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.piglinbrute.step")));
		sounds.put(new ResourceLocation("nether", "mob.piglinbrute.idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.piglinbrute.idle")));
		sounds.put(new ResourceLocation("nether", "mob.piglin.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.piglin.death")));
		sounds.put(new ResourceLocation("nether", "mob.piglin.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.piglin.hurt")));
		sounds.put(new ResourceLocation("nether", "mob.piglin.ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.piglin.ambient")));
		sounds.put(new ResourceLocation("nether", "mob.piglin.step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "mob.piglin.step")));
		sounds.put(new ResourceLocation("nether", "block.basalt.break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "block.basalt.break")));
		sounds.put(new ResourceLocation("nether", "block.shroomlight.break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "block.shroomlight.break")));
		sounds.put(new ResourceLocation("nether", "block.barrel.open"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "block.barrel.open")));
		sounds.put(new ResourceLocation("nether", "smithing_table"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "smithing_table")));
		sounds.put(new ResourceLocation("nether", "block.chain.destroy"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "block.chain.destroy")));
		sounds.put(new ResourceLocation("nether", "block.chain.break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "block.chain.break")));
		sounds.put(new ResourceLocation("nether", "block.warpedfloor"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "block.warpedfloor")));
		sounds.put(new ResourceLocation("nether", "nylium"), new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "nylium")));
		sounds.put(new ResourceLocation("nether", "netherrack"), new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "netherrack")));
		sounds.put(new ResourceLocation("nether", "ancientdebris"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "ancientdebris")));
		sounds.put(new ResourceLocation("nether", "basalt.ambience"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("nether", "basalt.ambience")));
	}

	public void preInit(FMLPreInitializationEvent event) {
		try {
			for (ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
				Class<?> clazz = Class.forName(asmData.getClassName());
				if (clazz.getSuperclass() == ElementsNetherMod.ModElement.class)
					elements.add((ElementsNetherMod.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(ElementsNetherMod.ModElement::initElements);
		this.addNetworkMessage(NetherModVariables.WorldSavedDataSyncMessageHandler.class, NetherModVariables.WorldSavedDataSyncMessage.class,
				Side.SERVER, Side.CLIENT);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
		elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.provider.getDimension(), cg, cp));
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData mapdata = NetherModVariables.MapVariables.get(event.player.world);
			WorldSavedData worlddata = NetherModVariables.WorldVariables.get(event.player.world);
			if (mapdata != null)
				NetherMod.PACKET_HANDLER.sendTo(new NetherModVariables.WorldSavedDataSyncMessage(0, mapdata), (EntityPlayerMP) event.player);
			if (worlddata != null)
				NetherMod.PACKET_HANDLER.sendTo(new NetherModVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP) event.player);
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData worlddata = NetherModVariables.WorldVariables.get(event.player.world);
			if (worlddata != null)
				NetherMod.PACKET_HANDLER.sendTo(new NetherModVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP) event.player);
		}
	}
	private int messageID = 0;
	public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass,
			Side... sides) {
		for (Side side : sides)
			NetherMod.PACKET_HANDLER.registerMessage(handler, messageClass, messageID, side);
		messageID++;
	}
	public static class GuiHandler implements IGuiHandler {
		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == GuiSmithingGUI.GUIID)
				return new GuiSmithingGUI.GuiContainerMod(world, x, y, z, player);
			if (id == GuiBarrelGUI.GUIID)
				return new GuiBarrelGUI.GuiContainerMod(world, x, y, z, player);
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == GuiSmithingGUI.GUIID)
				return new GuiSmithingGUI.GuiWindow(world, x, y, z, player);
			if (id == GuiBarrelGUI.GUIID)
				return new GuiBarrelGUI.GuiWindow(world, x, y, z, player);
			return null;
		}
	}
	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityEntry>> getEntities() {
		return entities;
	}

	public List<Supplier<Potion>> getPotions() {
		return potions;
	}
	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final ElementsNetherMod elements;
		protected final int sortid;
		public ModElement(ElementsNetherMod elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLInitializationEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void registerModels(ModelRegistryEvent event) {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}

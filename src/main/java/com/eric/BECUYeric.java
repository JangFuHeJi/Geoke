package com.eric;

import com.ibm.icu.impl.UtilityExtensions;
import com.llamalad7.mixinextras.sugar.impl.ref.LocalRefClassGenerator;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.TallBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.IndexedIterable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.sql.Blob;
import java.sql.Ref;

public class BECUYeric implements ModInitializer {
	public static final String MOD_ID = "becuyeric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//服务器
	// 相关
	//物品
	public static final Item miantain = new Item(new FabricItemSettings().maxCount(50));
	public static final Item miantain2 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item miantain3 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item miantain4 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item miantain5 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item miantain6 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item miantain7 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item miantain8 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item miantain9 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item miantain10 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item miantain11 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item miantain12 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item becuymoney_10 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item becuymoney_1 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item becuymoney_50 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item becuymoney_100 = new Item(new FabricItemSettings().maxCount(50));
	//除夕夜跨年
	public static final Block spring_festival_activity = new Block(FabricBlockSettings.create().strength(80.0f,1400.0f).nonOpaque());
	//
	@Override
	public void onInitialize() {
		//物品服务器相关
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain"),miantain);
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain2"),miantain2);
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain3"),miantain3);
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain4"),miantain4);
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain5"),miantain5);
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain6"),miantain6);
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain7"),miantain7);
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain8"),miantain8);
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain9"),miantain9);
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain10"),miantain10);
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain11"),miantain11);
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"miantain12"),miantain12);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_10"),becuymoney_10);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_1"),becuymoney_1);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_50"),becuymoney_50);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "beucymoney_100"),becuymoney_100);
		//spring festival
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID,"spring_festival_activity"),spring_festival_activity) ;
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"spring_festival_activity"),new BlockItem(spring_festival_activity,new Item.Settings()));

	}
}
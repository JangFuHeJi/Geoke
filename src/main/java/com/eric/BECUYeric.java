package com.eric;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.item.Item;

import com.eric.tools.weapon.Eric_052;
import com.eric.tools.weapon.gold_weapon;

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
	public static final Item Presidents_office_Reception_Room = new Item(new FabricItemSettings().maxCount(1));
	public static final Item gold = new Item(new FabricItemSettings().maxCount(64));
	//除夕夜跨年
	public static final Block spring_festival_activity = new Block(FabricBlockSettings.create().strength(80.0f,1400.0f).nonOpaque());
	//方块相关
	public  static final Block FunctionBlocks_GreenScreen= new Block(FabricBlockSettings.create().strength(80.0f,1400.0f).nonOpaque());
	public static final Block  JoinGame = new Block(FabricBlockSettings.create().strength(80.0f, 1400.0f).nonOpaque());
	public static final Block kick = new Block(FabricBlockSettings.create().strength(46.00f, 1400.0f).nonOpaque());
	public static final Block gold_block = new Block(FabricBlockSettings.create().strength(2.0f, 1400.0f).nonOpaque().requiresTool());
	//tools
	public static final gold_weapon gold_weapon = new gold_weapon(new com.eric.tools.gold_weapon(),8,-0.8f,new Item.Settings());
	public static final Eric_052 Eric_052 = new Eric_052(new com.eric.tools.Eric_052(),60,-0.8f,new Item.Settings());
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
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_100"),becuymoney_100);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold"),gold);
		//spring festival
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID,"spring_festival_activity"),spring_festival_activity) ;
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"spring_festival_activity"),new BlockItem(spring_festival_activity,new Item.Settings()));
		//方块相关
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "functionblocks_greenscreen"),FunctionBlocks_GreenScreen);
	        Registry.register(Registries.ITEM,new Identifier(MOD_ID, "functioblocks_greenscreen"),new BlockItem(FunctionBlocks_GreenScreen,new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "joingame"),JoinGame);
		    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "joingame"),new BlockItem(JoinGame,new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "kick"),kick);
		    Registry.register(Registries.ITEM,new Identifier(MOD_ID, "kick"),new BlockItem(kick,new Item.Settings()));
			Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "gold_block"),gold_block);
			Registry.register(Registries.ITEM,new Identifier(MOD_ID, "gold_block"),new BlockItem(gold_block,new Item.Settings()));
		//tools
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_weapon"),gold_weapon);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "presidents_office_reception_room"),Presidents_office_Reception_Room);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "eric_052"), Eric_052);
	}
}
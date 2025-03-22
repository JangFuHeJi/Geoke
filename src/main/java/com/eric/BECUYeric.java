package com.eric;

import com.eric.tools.weapon.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BECUYeric implements ModInitializer {
	public static final String MOD_ID = "becuyeric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//服务器
	// 相关
	//物品
	public static final Block miantain = new Block(FabricBlockSettings.create().strength(-1f,1400f).nonOpaque());
	public static final Block miantain2 = new Block(FabricBlockSettings.create().strength(-1f, 1400.0f).nonOpaque());
	public static final Block miantain3 = new Block(FabricBlockSettings.create().strength(-1f, 1400.0f).nonOpaque());
	public static final Block miantain4 = new Block(FabricBlockSettings.create().strength(-1f,1400.0f).nonOpaque());
	public static final Block miantain5 = new Block(FabricBlockSettings.create().strength(-1f,1400.0f).nonOpaque());
	public static final Block miantain6 = new Block(FabricBlockSettings.create().strength(-1f,1400.0f).nonOpaque());
	public static final Block miantain7 = new Block(FabricBlockSettings.create().strength(-1f,1400.0f).nonOpaque());
	public static final Block miantain8 = new Block(FabricBlockSettings.create().strength(-1f,1400.0f).nonOpaque());
	public static final Block miantain9 = new Block(FabricBlockSettings.create().strength(-1f,1400.0f).nonOpaque());
	public static final Block miantain10 = new Block(FabricBlockSettings.create().strength(-1f,1400.0f).nonOpaque());
	public static final Block miantain11 = new Block(FabricBlockSettings.create().strength(-1f,1400.0f).nonOpaque());
	public static final Block miantain12 = new Block(FabricBlockSettings.create().strength(-1f,1400.0f).nonOpaque());
	public static final Item becuymoney_10 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item becuymoney_1 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item becuymoney_50 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item becuymoney_100 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item gold = new Item(new FabricItemSettings().maxCount(64));
	//方块相关
	public static final Block FunctionBlocks_GreenScreen= new Block(FabricBlockSettings.create().strength(80.0f,1400.0f).nonOpaque());
	public static final Block JoinGame = new Block(FabricBlockSettings.create().strength(80.0f, 1400.0f).nonOpaque());
	public static final Block kick = new Block(FabricBlockSettings.create().strength(46.00f, 1400.0f).nonOpaque());
	public static final Block gold_block = new Block(FabricBlockSettings.create().strength(2.0f, 1400.0f).nonOpaque().requiresTool());
	public static final Block welcome = new Block(FabricBlockSettings.create().strength(1000.0f,1400.0f).nonOpaque());
	public static final Block gold_wblock = new Block(FabricBlockSettings.create().strength(5.0f,1400.0f).nonOpaque());
	//tools
	public static final gold_weapon gold_weapon = new gold_weapon(new com.eric.tools.gold_weapon(),8,-0.8f,new Item.Settings());
	public static final Eric_052 Eric_052 = new Eric_052(new com.eric.tools.Eric_052(),60,-0.8f,new Item.Settings());
	public static final Ilikebvvd Ilikebvvd = new Ilikebvvd(new com.eric.tools.Ilikebvvd(),50,-0.8f,new Item.Settings());
	public static final wcn wcn = new wcn(new com.eric.tools.wcn(),55,-0.8f,new Item.Settings());
	public static final dengji1 dengji1 = new dengji1(new com.eric.tools.dengji1(),10,-0.8f,new Item.Settings());
	public static final dengji2 dengji2 = new dengji2(new com.eric.tools.dengji2(),15,-0.8f,new Item.Settings());
	public static final miaosha miaosha = new miaosha(new com.eric.tools.miaosha(),100,-0.8f,new Item.Settings());
	public static final miaoshamuch miaoshamuch = new miaoshamuch(new com.eric.tools.miaoshamuch(),1000,1f,new Item.Settings());
	public static final dengji3 dengji3 = new dengji3(new com.eric.tools.dengji3(),10000,1f,new Item.Settings());
	public static final chx chx = new chx(new com.eric.tools.chx(), 10000,1f,new Item.Settings());
	//交通
	public static final Item jiaotongka = new Item(new FabricItemSettings().maxCount(1));
	public static final Block train_block = new Block(FabricBlockSettings.create().strength(1400.0f,1000.0f).nonOpaque());
	public static final Block door_not_in_use = new Block(FabricBlockSettings.create().strength(1400.0f,1000.0f).nonOpaque());
	public static final Block rubbish = new Block(FabricBlockSettings.create().strength(1400.0f,1000.0f).nonOpaque());
	@Override
	public void onInitialize() {
		//物品服务器相关
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_10"), becuymoney_10);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_1"), becuymoney_1);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_50"), becuymoney_50);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_100"), becuymoney_100);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold"), gold);
		//方块相关
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "functionblocks_greenscreen"), FunctionBlocks_GreenScreen);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "functioblocks_greenscreen"), new BlockItem(FunctionBlocks_GreenScreen, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "joingame"), JoinGame);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "joingame"), new BlockItem(JoinGame, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "kick"), kick);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "kick"), new BlockItem(kick, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "gold_block"), gold_block);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_block"), new BlockItem(gold_block, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain"), miantain);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain"), new BlockItem(miantain, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain2"), miantain2);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain2"), new BlockItem(miantain2, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain3"), miantain3);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain3"), new BlockItem(miantain3, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain4"), miantain4);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain4"), new BlockItem(miantain4, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain5"), miantain5);
	    	Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain5"), new BlockItem(miantain5, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain6"), miantain6);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain6"), new BlockItem(miantain6, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain7"), miantain7);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain7"), new BlockItem(miantain7, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain8"), miantain8);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain8"), new BlockItem(miantain8, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain9"), miantain9);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain9"), new BlockItem(miantain9, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain10"), miantain10);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain10"), new BlockItem(miantain10, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain11"), miantain11);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain11"), new BlockItem(miantain11, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "miantain12"), miantain12);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miantain12"), new BlockItem(miantain12, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "welcome"), welcome);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "welcome"), new BlockItem(welcome, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "gold_wblock"), gold_wblock);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_wblock"), new BlockItem(gold_wblock, new Item.Settings()));
		//tools
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_weapon"), gold_weapon);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "eric_052"), Eric_052);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ilikebvvd"), Ilikebvvd);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "wcn"), wcn);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dengji1"), dengji1);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dengji2"), dengji2);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miaosha"), miaosha);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miaoshamuch"), miaoshamuch);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dengji3"), dengji3);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chx"),chx);
		//交通
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "jiaotongka"),jiaotongka);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "train_block"), train_block);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "train_block"),new BlockItem(train_block, new Item.Settings()));
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "door_not_in_use"),door_not_in_use);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "door_not_in_use"),new BlockItem(door_not_in_use, new Item.Settings()));
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "rubbish"),rubbish);
		   Registry.register(Registries.ITEM, new Identifier(MOD_ID, "rubbish"),new BlockItem(rubbish, new Item.Settings()));

	}
}
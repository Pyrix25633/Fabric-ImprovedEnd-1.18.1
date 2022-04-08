package net.rupyber_studios.improved_end.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.block.custom.*;
import net.rupyber_studios.improved_end.item.ModItemGroup;
import net.rupyber_studios.improved_end.util.MinecraftBlocks;

public class ModBlocks {
    //Variables keep control of block hardness and resistance
    static final float woodHardness = 2f, woodResistance = 3f, stoneHardness = 2f, stoneResistance = 6f,
            leavesStrength = 0.2f;
    static final FabricBlockSettings stoneSettings = FabricBlockSettings.of(Material.STONE)
            .strength(stoneHardness, stoneResistance).sounds(BlockSoundGroup.STONE).requiresTool();
    static final FabricBlockSettings woodSettings = FabricBlockSettings.of(Material.WOOD)
            .strength(woodHardness, woodResistance).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings leavesSettings = FabricBlockSettings.of(Material.LEAVES).strength(leavesStrength)
            .sounds(BlockSoundGroup.GRASS).nonOpaque().ticksRandomly().allowsSpawning(MinecraftBlocks::canSpawnOnLeaves)
            .suffocates(MinecraftBlocks::never).blockVision(MinecraftBlocks::never);
    static final FabricBlockSettings lanternSettings = FabricBlockSettings.of(Material.METAL)
            .strength(3.5f).sounds(BlockSoundGroup.LANTERN).luminance(15)
            .requiresTool().nonOpaque();
    static final FabricBlockSettings bookshelfSettings = FabricBlockSettings.of(Material.WOOD)
            .strength(1.5F).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings buttonSettings = FabricBlockSettings.of(Material.DECORATION)
            .noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings pressurePlateSettings = FabricBlockSettings.of(Material.WOOD)
            .noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings trapdoorSettings = FabricBlockSettings.of(Material.WOOD)
            .strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque().allowsSpawning(MinecraftBlocks::never);

    //Grass
    public static final Block DARK_GRASS = registerBiomesBlock("dark_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.BLACK)));
    public static final Block INFUSORIAL_GRASS = registerBiomesBlock("infusorial_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.PURPLE)));
    public static final Block BUDDING_GRASS = registerBiomesBlock("budding_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.PINK)));
    public static final Block REDLEAF_GRASS = registerBiomesBlock("redleaf_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.RED)));
    public static final Block FIRE_GRASS = registerBiomesBlock("fire_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.ORANGE)));
    public static final Block SHINING_GRASS = registerBiomesBlock("shining_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.YELLOW)));
    public static final Block SERENE_GRASS = registerBiomesBlock("serene_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.LIME)));
    public static final Block SCAB_GRASS = registerBiomesBlock("scab_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.LIGHT_BLUE)));
    public static final Block INDIGO_GRASS = registerBiomesBlock("indigo_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.BLUE)));

    //Logs
    public static final Block DARK_LOG = registerBiomesBlock("dark_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_LOG = registerBiomesBlock("infusorial_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_LOG = registerBiomesBlock("budding_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_LOG = registerBiomesBlock("redleaf_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_LOG = registerBiomesBlock("fire_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_LOG = registerBiomesBlock("shining_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_LOG = registerBiomesBlock("serene_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_LOG = registerBiomesBlock("scab_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_LOG = registerBiomesBlock("indigo_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Stripped Logs
    public static final Block STRIPPED_DARK_LOG = registerBiomesBlock("stripped_dark_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block STRIPPED_INFUSORIAL_LOG = registerBiomesBlock("stripped_infusorial_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block STRIPPED_BUDDING_LOG = registerBiomesBlock("stripped_budding_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block STRIPPED_REDLEAF_LOG = registerBiomesBlock("stripped_redleaf_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block STRIPPED_FIRE_LOG = registerBiomesBlock("stripped_fire_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block STRIPPED_SHINING_LOG = registerBiomesBlock("stripped_shining_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block STRIPPED_SERENE_LOG = registerBiomesBlock("stripped_serene_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block STRIPPED_SCAB_LOG = registerBiomesBlock("stripped_scab_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block STRIPPED_INDIGO_LOG = registerBiomesBlock("stripped_indigo_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Wood
    public static final Block DARK_WOOD = registerBiomesBlock("dark_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_WOOD = registerBiomesBlock("infusorial_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_WOOD = registerBiomesBlock("budding_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_WOOD = registerBiomesBlock("redleaf_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_WOOD = registerBiomesBlock("fire_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_WOOD = registerBiomesBlock("shining_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_WOOD = registerBiomesBlock("serene_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_WOOD = registerBiomesBlock("scab_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_WOOD = registerBiomesBlock("indigo_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Stripped Wood
    public static final Block STRIPPED_DARK_WOOD = registerBiomesBlock("stripped_dark_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block STRIPPED_INFUSORIAL_WOOD = registerBiomesBlock("stripped_infusorial_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block STRIPPED_BUDDING_WOOD = registerBiomesBlock("stripped_budding_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block STRIPPED_REDLEAF_WOOD = registerBiomesBlock("stripped_redleaf_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block STRIPPED_FIRE_WOOD = registerBiomesBlock("stripped_fire_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block STRIPPED_SHINING_WOOD = registerBiomesBlock("stripped_shining_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block STRIPPED_SERENE_WOOD = registerBiomesBlock("stripped_serene_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block STRIPPED_SCAB_WOOD = registerBiomesBlock("stripped_scab_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block STRIPPED_INDIGO_WOOD = registerBiomesBlock("stripped_indigo_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Planks
    public static final Block DARK_PLANKS = registerBiomesBlock("dark_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_PLANKS = registerBiomesBlock("infusorial_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_PLANKS = registerBiomesBlock("budding_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_PLANKS = registerBiomesBlock("redleaf_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_PLANKS = registerBiomesBlock("fire_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_PLANKS = registerBiomesBlock("shining_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_PLANKS = registerBiomesBlock("serene_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_PLANKS = registerBiomesBlock("scab_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_PLANKS = registerBiomesBlock("indigo_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Slabs
    public static final Block DARK_SLAB = registerBiomesBlock("dark_slab",
            new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_SLAB = registerBiomesBlock("infusorial_slab",
            new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_SLAB = registerBiomesBlock("budding_slab",
            new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_SLAB = registerBiomesBlock("redleaf_slab",
            new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_SLAB = registerBiomesBlock("fire_slab",
            new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_SLAB = registerBiomesBlock("shining_slab",
            new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_SLAB = registerBiomesBlock("serene_slab",
            new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_SLAB = registerBiomesBlock("scab_slab",
            new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_SLAB = registerBiomesBlock("indigo_slab",
            new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Stairs
    public static final Block DARK_STAIRS = registerBiomesBlock("dark_stairs",
            new ModStairsBlock(ModBlocks.DARK_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_STAIRS = registerBiomesBlock("infusorial_stairs",
            new ModStairsBlock(ModBlocks.INFUSORIAL_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_STAIRS = registerBiomesBlock("budding_stairs",
            new ModStairsBlock(ModBlocks.BUDDING_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_STAIRS = registerBiomesBlock("redleaf_stairs",
            new ModStairsBlock(ModBlocks.REDLEAF_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_STAIRS = registerBiomesBlock("fire_stairs",
            new ModStairsBlock(ModBlocks.FIRE_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_STAIRS = registerBiomesBlock("shining_stairs",
            new ModStairsBlock(ModBlocks.SHINING_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_STAIRS = registerBiomesBlock("serene_stairs",
            new ModStairsBlock(ModBlocks.SERENE_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_STAIRS = registerBiomesBlock("scab_stairs",
            new ModStairsBlock(ModBlocks.SCAB_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_STAIRS = registerBiomesBlock("indigo_stairs",
            new ModStairsBlock(ModBlocks.INDIGO_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Vertical Slabs
    public static final Block DARK_VERTICAL_SLAB = registerBiomesBlock("dark_vertical_slab",
            new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_VERTICAL_SLAB = registerBiomesBlock("infusorial_vertical_slab",
            new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_VERTICAL_SLAB = registerBiomesBlock("budding_vertical_slab",
            new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_VERTICAL_SLAB = registerBiomesBlock("redleaf_vertical_slab",
            new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_VERTICAL_SLAB = registerBiomesBlock("fire_vertical_slab",
            new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_VERTICAL_SLAB = registerBiomesBlock("shining_vertical_slab",
            new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_VERTICAL_SLAB = registerBiomesBlock("serene_vertical_slab",
            new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_VERTICAL_SLAB = registerBiomesBlock("scab_vertical_slab",
            new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_VERTICAL_SLAB = registerBiomesBlock("indigo_vertical_slab",
            new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Buttons
    public static final Block DARK_BUTTON = registerBiomesBlock("dark_button",
            new ModWoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_BUTTON = registerBiomesBlock("infusorial_button",
            new ModWoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_BUTTON = registerBiomesBlock("budding_button",
            new ModWoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_BUTTON = registerBiomesBlock("redleaf_button",
            new ModWoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_BUTTON = registerBiomesBlock("fire_button",
            new ModWoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_BUTTON = registerBiomesBlock("shining_button",
            new ModWoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_BUTTON = registerBiomesBlock("serene_button",
            new ModWoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_BUTTON = registerBiomesBlock("scab_button",
            new ModWoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_BUTTON = registerBiomesBlock("indigo_button",
            new ModWoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Pressure Plates
    public static final Block DARK_PRESSURE_PLATE = registerBiomesBlock("dark_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    pressurePlateSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_PRESSURE_PLATE = registerBiomesBlock("infusorial_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    pressurePlateSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_PRESSURE_PLATE = registerBiomesBlock("budding_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    pressurePlateSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_PRESSURE_PLATE = registerBiomesBlock("redleaf_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    pressurePlateSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_PRESSURE_PLATE = registerBiomesBlock("fire_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    pressurePlateSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_PRESSURE_PLATE = registerBiomesBlock("shining_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    pressurePlateSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_PRESSURE_PLATE = registerBiomesBlock("serene_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    pressurePlateSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_PRESSURE_PLATE = registerBiomesBlock("scab_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    pressurePlateSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_PRESSURE_PLATE = registerBiomesBlock("indigo_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    pressurePlateSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Trapdoors
    public static final Block DARK_TRAPDOOR = registerBiomesBlock("dark_trapdoor",
            new ModTrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_TRAPDOOR = registerBiomesBlock("infusorial_trapdoor",
            new ModTrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_TRAPDOOR = registerBiomesBlock("budding_trapdoor",
            new ModTrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_TRAPDOOR = registerBiomesBlock("redleaf_trapdoor",
            new ModTrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_TRAPDOOR = registerBiomesBlock("fire_trapdoor",
            new ModTrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_TRAPDOOR = registerBiomesBlock("shining_trapdoor",
            new ModTrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_TRAPDOOR = registerBiomesBlock("serene_trapdoor",
            new ModTrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_TRAPDOOR = registerBiomesBlock("scab_trapdoor",
            new ModTrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_TRAPDOOR = registerBiomesBlock("indigo_trapdoor",
            new ModTrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Hollow Logs
    public static final Block HOLLOW_DARK_LOG = registerBiomesBlock("hollow_dark_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK).nonOpaque()));
    public static final Block HOLLOW_INFUSORIAL_LOG = registerBiomesBlock("hollow_infusorial_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE).nonOpaque()));
    public static final Block HOLLOW_BUDDING_LOG = registerBiomesBlock("hollow_budding_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK).nonOpaque()));
    public static final Block HOLLOW_REDLEAF_LOG = registerBiomesBlock("hollow_redleaf_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED).nonOpaque()));
    public static final Block HOLLOW_FIRE_LOG = registerBiomesBlock("hollow_fire_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE).nonOpaque()));
    public static final Block HOLLOW_SHINING_LOG = registerBiomesBlock("hollow_shining_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW).nonOpaque()));
    public static final Block HOLLOW_SERENE_LOG = registerBiomesBlock("hollow_serene_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME).nonOpaque()));
    public static final Block HOLLOW_SCAB_LOG = registerBiomesBlock("hollow_scab_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).nonOpaque()));
    public static final Block HOLLOW_INDIGO_LOG = registerBiomesBlock("hollow_indigo_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE).nonOpaque()));

    //Stripped Hollow Logs
    public static final Block STRIPPED_HOLLOW_DARK_LOG = registerBiomesBlock("stripped_hollow_dark_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_INFUSORIAL_LOG = registerBiomesBlock("stripped_hollow_infusorial_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_BUDDING_LOG = registerBiomesBlock("stripped_hollow_budding_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_REDLEAF_LOG = registerBiomesBlock("stripped_hollow_redleaf_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_FIRE_LOG = registerBiomesBlock("stripped_hollow_fire_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_SHINING_LOG = registerBiomesBlock("stripped_hollow_shining_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_SERENE_LOG = registerBiomesBlock("stripped_hollow_serene_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_SCAB_LOG = registerBiomesBlock("stripped_hollow_scab_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_INDIGO_LOG = registerBiomesBlock("stripped_hollow_indigo_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE).nonOpaque()));

    //Lanterns
    public static final Block DARK_LANTERN = registerBiomesBlock("dark_lantern",
            new LanternBlock(lanternSettings));
    public static final Block INFUSORIAL_LANTERN = registerBiomesBlock("infusorial_lantern",
            new LanternBlock(lanternSettings));
    public static final Block BUDDING_LANTERN = registerBiomesBlock("budding_lantern",
            new LanternBlock(lanternSettings));
    public static final Block REDLEAF_LANTERN = registerBiomesBlock("redleaf_lantern",
            new LanternBlock(lanternSettings));
    public static final Block FIRE_LANTERN = registerBiomesBlock("fire_lantern",
            new LanternBlock(lanternSettings));
    public static final Block SHINING_LANTERN = registerBiomesBlock("shining_lantern",
            new LanternBlock(lanternSettings));
    public static final Block SERENE_LANTERN = registerBiomesBlock("serene_lantern",
            new LanternBlock(lanternSettings));
    public static final Block SCAB_LANTERN = registerBiomesBlock("scab_lantern",
            new LanternBlock(lanternSettings));
    public static final Block INDIGO_LANTERN = registerBiomesBlock("indigo_lantern",
            new LanternBlock(lanternSettings));

    //Bookshelves
    public static final Block DARK_BOOKSHELF = registerBiomesBlock("dark_bookshelf",
            new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_BOOKSHELF = registerBiomesBlock("infusorial_bookshelf",
            new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_BOOKSHELF = registerBiomesBlock("budding_bookshelf",
            new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_BOOKSHELF = registerBiomesBlock("redleaf_bookshelf",
            new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_BOOKSHELF = registerBiomesBlock("fire_bookshelf",
            new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_BOOKSHELF = registerBiomesBlock("shining_bookshelf",
            new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_BOOKSHELF = registerBiomesBlock("serene_bookshelf",
            new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_BOOKSHELF = registerBiomesBlock("scab_bookshelf",
            new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_BOOKSHELF = registerBiomesBlock("indigo_bookshelf",
            new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Leaves
    public static final Block DARK_LEAVES = registerBiomesBlock("dark_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_LEAVES = registerBiomesBlock("infusorial_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_LEAVES = registerBiomesBlock("budding_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_LEAVES = registerBiomesBlock("redleaf_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_LEAVES = registerBiomesBlock("fire_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_LEAVES = registerBiomesBlock("shining_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_LEAVES = registerBiomesBlock("serene_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_LEAVES = registerBiomesBlock("scab_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_LEAVES = registerBiomesBlock("indigo_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //End Stone and Purpur
    public static final Block POLISHED_END_STONE = registerBiomesBlock("polished_end_stone",
            new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block END_STONE_TILES = registerBiomesBlock("end_stone_tiles",
            new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block CRACKED_END_STONE_BRICKS = registerBiomesBlock("cracked_end_stone_bricks",
            new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block CHISELED_END_STONE_BRICKS = registerBiomesBlock("chiseled_end_stone_bricks",
            new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block END_STONE_PILLAR = registerBiomesBlock("end_stone_pillar",
            new PillarBlock(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block CRACKED_PURPUR = registerBiomesBlock("cracked_purpur",
            new Block(stoneSettings.mapColor(MapColor.MAGENTA).strength(1.5f, 6.0f)));

    private static Block registerBiomesBlock(String name, Block block) {
        registerBiomesBlockItem(name, block, ModItemGroup.IMPROVED_END_BIOMES_BLOCKS);
        return Registry.register(Registry.BLOCK, new Identifier(ImprovedEnd.MOD_ID, name), block);
    }

    private static Item registerBiomesBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ImprovedEnd.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + ImprovedEnd.MOD_ID);
    }
}
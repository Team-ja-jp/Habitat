package mod.schnappdragon.habitat.core.registry;

import mod.schnappdragon.habitat.common.block.*;
import mod.schnappdragon.habitat.common.block.misc.*;
import mod.schnappdragon.habitat.core.Habitat;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class HabitatBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Habitat.MOD_ID);

    public static final RegistryObject<Block> RAFFLESIA = BLOCKS.register("rafflesia", () -> new RafflesiaBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.RED).zeroHardnessAndResistance().sound(SoundType.PLANT).tickRandomly().doesNotBlockMovement().notSolid()));
    public static final RegistryObject<Block> POTTED_RAFFLESIA = BLOCKS.register("potted_rafflesia", () -> new FlowerPotBlock(RAFFLESIA.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> KABLOOM_BUSH = BLOCKS.register("kabloom_bush", () -> new KabloomBushBlock(AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().sound(SoundType.PLANT).tickRandomly().doesNotBlockMovement().notSolid()));
    public static final RegistryObject<Block> POTTED_KABLOOM_BUSH = BLOCKS.register("potted_kabloom_bush", () -> new FlowerPotBlock(KABLOOM_BUSH.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> SLIME_FERN = BLOCKS.register("slime_fern", () -> new SlimeFernBlock(AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().sound(SoundType.PLANT).doesNotBlockMovement().notSolid()));
    public static final RegistryObject<Block> WALL_SLIME_FERN = BLOCKS.register("wall_slime_fern", () -> new WallSlimeFernBlock(AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().lootFrom(SLIME_FERN).sound(SoundType.PLANT).doesNotBlockMovement().notSolid()));
    public static final RegistryObject<Block> POTTED_SLIME_FERN = BLOCKS.register("potted_slime_fern", () -> new FlowerPotBlock(SLIME_FERN.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> ORANGE_BALL_CACTUS_FLOWER = BLOCKS.register("orange_ball_cactus_flower", () -> new BallCactusFlowerBlock(BallCactusColor.ORANGE, HabitatEffects.PRICKLING, 5, AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().sound(SoundType.PLANT).doesNotBlockMovement().notSolid().tickRandomly()));
    public static final RegistryObject<Block> PINK_BALL_CACTUS_FLOWER = BLOCKS.register("pink_ball_cactus_flower", () -> new BallCactusFlowerBlock(BallCactusColor.PINK, HabitatEffects.PRICKLING, 5, AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().sound(SoundType.PLANT).doesNotBlockMovement().notSolid().tickRandomly()));
    public static final RegistryObject<Block> RED_BALL_CACTUS_FLOWER = BLOCKS.register("red_ball_cactus_flower", () -> new BallCactusFlowerBlock(BallCactusColor.RED, HabitatEffects.PRICKLING, 5, AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().sound(SoundType.PLANT).doesNotBlockMovement().notSolid().tickRandomly()));
    public static final RegistryObject<Block> YELLOW_BALL_CACTUS_FLOWER = BLOCKS.register("yellow_ball_cactus_flower", () -> new BallCactusFlowerBlock(BallCactusColor.YELLOW, HabitatEffects.PRICKLING, 5, AbstractBlock.Properties.create(Material.PLANTS).zeroHardnessAndResistance().sound(SoundType.PLANT).doesNotBlockMovement().notSolid().tickRandomly()));
    public static final RegistryObject<Block> GROWING_ORANGE_BALL_CACTUS = BLOCKS.register("growing_orange_ball_cactus", () -> new GrowingBallCactusBlock(BallCactusColor.ORANGE, AbstractBlock.Properties.create(Material.CACTUS).zeroHardnessAndResistance().sound(SoundType.CLOTH).notSolid().tickRandomly()));
    public static final RegistryObject<Block> GROWING_PINK_BALL_CACTUS = BLOCKS.register("growing_pink_ball_cactus", () -> new GrowingBallCactusBlock(BallCactusColor.PINK, AbstractBlock.Properties.create(Material.CACTUS).zeroHardnessAndResistance().sound(SoundType.CLOTH).notSolid().tickRandomly()));
    public static final RegistryObject<Block> GROWING_RED_BALL_CACTUS = BLOCKS.register("growing_red_ball_cactus", () -> new GrowingBallCactusBlock(BallCactusColor.RED, AbstractBlock.Properties.create(Material.CACTUS).zeroHardnessAndResistance().sound(SoundType.CLOTH).notSolid().tickRandomly()));
    public static final RegistryObject<Block> GROWING_YELLOW_BALL_CACTUS = BLOCKS.register("growing_yellow_ball_cactus", () -> new GrowingBallCactusBlock(BallCactusColor.YELLOW, AbstractBlock.Properties.create(Material.CACTUS).zeroHardnessAndResistance().sound(SoundType.CLOTH).notSolid().tickRandomly()));
    public static final RegistryObject<Block> ORANGE_BALL_CACTUS = BLOCKS.register("orange_ball_cactus", () -> new BallCactusBlock(BallCactusColor.ORANGE, AbstractBlock.Properties.create(Material.CACTUS).hardnessAndResistance(1).sound(SoundType.CLOTH).notSolid().tickRandomly()));
    public static final RegistryObject<Block> PINK_BALL_CACTUS = BLOCKS.register("pink_ball_cactus", () -> new BallCactusBlock(BallCactusColor.PINK, AbstractBlock.Properties.create(Material.CACTUS).hardnessAndResistance(1).sound(SoundType.CLOTH).notSolid().tickRandomly()));
    public static final RegistryObject<Block> RED_BALL_CACTUS = BLOCKS.register("red_ball_cactus", () -> new BallCactusBlock(BallCactusColor.RED, AbstractBlock.Properties.create(Material.CACTUS).hardnessAndResistance(1).sound(SoundType.CLOTH).notSolid().tickRandomly()));
    public static final RegistryObject<Block> YELLOW_BALL_CACTUS = BLOCKS.register("yellow_ball_cactus", () -> new BallCactusBlock(BallCactusColor.YELLOW, AbstractBlock.Properties.create(Material.CACTUS).hardnessAndResistance(1).sound(SoundType.CLOTH).notSolid().tickRandomly()));
    public static final RegistryObject<Block> FLOWERING_ORANGE_BALL_CACTUS = BLOCKS.register("flowering_orange_ball_cactus", () -> new FloweringBallCactusBlock(BallCactusColor.ORANGE, AbstractBlock.Properties.create(Material.CACTUS).hardnessAndResistance(1).sound(SoundType.CLOTH).notSolid()));
    public static final RegistryObject<Block> FLOWERING_PINK_BALL_CACTUS = BLOCKS.register("flowering_pink_ball_cactus", () -> new FloweringBallCactusBlock(BallCactusColor.PINK, AbstractBlock.Properties.create(Material.CACTUS).hardnessAndResistance(1).sound(SoundType.CLOTH).notSolid()));
    public static final RegistryObject<Block> FLOWERING_RED_BALL_CACTUS = BLOCKS.register("flowering_red_ball_cactus", () -> new FloweringBallCactusBlock(BallCactusColor.RED, AbstractBlock.Properties.create(Material.CACTUS).hardnessAndResistance(1).sound(SoundType.CLOTH).notSolid()));
    public static final RegistryObject<Block> FLOWERING_YELLOW_BALL_CACTUS = BLOCKS.register("flowering_yellow_ball_cactus", () -> new FloweringBallCactusBlock(BallCactusColor.YELLOW, AbstractBlock.Properties.create(Material.CACTUS).hardnessAndResistance(1).sound(SoundType.CLOTH).notSolid()));
    public static final RegistryObject<Block> POTTED_ORANGE_BALL_CACTUS_FLOWER = BLOCKS.register("potted_orange_ball_cactus_flower", () -> new FlowerPotBlock(ORANGE_BALL_CACTUS_FLOWER.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> POTTED_PINK_BALL_CACTUS_FLOWER = BLOCKS.register("potted_pink_ball_cactus_flower", () -> new FlowerPotBlock(PINK_BALL_CACTUS_FLOWER.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> POTTED_RED_BALL_CACTUS_FLOWER = BLOCKS.register("potted_red_ball_cactus_flower", () -> new FlowerPotBlock(RED_BALL_CACTUS_FLOWER.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> POTTED_YELLOW_BALL_CACTUS_FLOWER = BLOCKS.register("potted_yellow_ball_cactus_flower", () -> new FlowerPotBlock(YELLOW_BALL_CACTUS_FLOWER.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> POTTED_ORANGE_BALL_CACTUS = BLOCKS.register("potted_orange_ball_cactus", () -> new FlowerPotBlock(ORANGE_BALL_CACTUS.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> POTTED_PINK_BALL_CACTUS = BLOCKS.register("potted_pink_ball_cactus", () -> new FlowerPotBlock(PINK_BALL_CACTUS.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> POTTED_RED_BALL_CACTUS = BLOCKS.register("potted_red_ball_cactus", () -> new FlowerPotBlock(RED_BALL_CACTUS.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> POTTED_YELLOW_BALL_CACTUS = BLOCKS.register("potted_yellow_ball_cactus", () -> new FlowerPotBlock(YELLOW_BALL_CACTUS.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM = BLOCKS.register("fairy_ring_mushroom", () -> new FairyRingMushroomBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.YELLOW).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT).setNeedsPostProcessing((state, reader, pos) -> true).setLightLevel((state) -> state.get(FairyRingMushroomBlock.MUSHROOMS) * 2 + 4).notSolid().tickRandomly()));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_BLOCK = BLOCKS.register("fairy_ring_mushroom_block", () -> new HugeFairyRingMushroomBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).setLightLevel((state) -> 1).setEmmisiveRendering((state, reader, pos) -> true).hardnessAndResistance(0.2F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_STEM = BLOCKS.register("fairy_ring_mushroom_stem", () -> new HugeMushroomBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.QUARTZ).hardnessAndResistance(0.2F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRYLIGHT = BLOCKS.register("fairylight", () -> new Block(AbstractBlock.Properties.create(Material.ORGANIC, MaterialColor.SAND).hardnessAndResistance(1.0F).sound(SoundType.SHROOMLIGHT).setLightLevel((state) -> 15)));
    public static final RegistryObject<Block> POTTED_FAIRY_RING_MUSHROOM = BLOCKS.register("potted_fairy_ring_mushroom", () -> new FlowerPotBlock(FAIRY_RING_MUSHROOM.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().setLightLevel((state) -> 4).notSolid()));

    public static final RegistryObject<Block> STRIPPED_FAIRY_RING_MUSHROOM_STEM = BLOCKS.register("stripped_fairy_ring_mushroom_stem", () -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ENHANCED_FAIRY_RING_MUSHROOM_STEM = BLOCKS.register("enhanced_fairy_ring_mushroom_stem", () -> new LogBlock(STRIPPED_FAIRY_RING_MUSHROOM_STEM, AbstractBlock.Properties.create(Material.WOOD, (state) -> state.get(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MaterialColor.YELLOW : MaterialColor.QUARTZ).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_FAIRY_RING_MUSHROOM_HYPHAE = BLOCKS.register("stripped_fairy_ring_mushroom_hyphae", () -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_HYPHAE = BLOCKS.register("fairy_ring_mushroom_hyphae", () -> new LogBlock(STRIPPED_FAIRY_RING_MUSHROOM_HYPHAE, AbstractBlock.Properties.create(Material.WOOD, MaterialColor.QUARTZ).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_PLANKS = BLOCKS.register("fairy_ring_mushroom_planks", () -> new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_SLAB = BLOCKS.register("fairy_ring_mushroom_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_STAIRS = BLOCKS.register("fairy_ring_mushroom_stairs", () -> new StairsBlock(FAIRY_RING_MUSHROOM_PLANKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_PRESSURE_PLATE = BLOCKS.register("fairy_ring_mushroom_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_FENCE = BLOCKS.register("fairy_ring_mushroom_fence", () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_FENCE_GATE = BLOCKS.register("fairy_ring_mushroom_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_BUTTON = BLOCKS.register("fairy_ring_mushroom_button", () -> new WoodButtonBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_TRAPDOOR = BLOCKS.register("fairy_ring_mushroom_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid().setAllowsSpawn((state, reader, pos, entity) -> false)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_DOOR = BLOCKS.register("fairy_ring_mushroom_door", () -> new DoorBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_SIGN = BLOCKS.register("fairy_ring_mushroom_sign", () -> new HabitatStandingSignBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), HabitatWoodType.FAIRY_RING_MUSHROOM));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_WALL_SIGN = BLOCKS.register("fairy_ring_mushroom_wall_sign", () -> new HabitatWallSignBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(FAIRY_RING_MUSHROOM_SIGN), HabitatWoodType.FAIRY_RING_MUSHROOM));

    public static final RegistryObject<Block> VERTICAL_FAIRY_RING_MUSHROOM_PLANKS = BLOCKS.register("vertical_fairy_ring_mushroom_planks", () -> new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_VERTICAL_SLAB = BLOCKS.register("fairy_ring_mushroom_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_BOOKSHELF = BLOCKS.register("fairy_ring_mushroom_bookshelf", () -> new BookshelfBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(1.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_LADDER = BLOCKS.register("fairy_ring_mushroom_ladder", () -> new LadderBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).harvestTool(ToolType.AXE).hardnessAndResistance(0.4F).sound(SoundType.LADDER).notSolid()));
    public static final RegistryObject<Block> STRIPPED_FAIRY_RING_MUSHROOM_POST = BLOCKS.register("stripped_fairy_ring_mushroom_post", () -> new WoodPostBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_POST = BLOCKS.register("fairy_ring_mushroom_post", () -> new WoodPostBlock(STRIPPED_FAIRY_RING_MUSHROOM_POST, AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_CHEST = BLOCKS.register("fairy_ring_mushroom_chest", () -> new HabitatChestBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_TRAPPED_CHEST = BLOCKS.register("fairy_ring_mushroom_trapped_chest", () -> new HabitatTrappedChestBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_BEEHIVE = BLOCKS.register("fairy_ring_mushroom_beehive", () -> new HabitatBeehiveBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(0.3F).sound(SoundType.WOOD)));
}
package mod.schnappdragon.bloom_and_gloom.core.tags;

import mod.schnappdragon.bloom_and_gloom.core.BloomAndGloom;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag.INamedTag;

public class BGBlockTags {
    public static final INamedTag<Block> RAFFLESIA_PLANTABLE_ON = makeTag("rafflesia_plantable_on");
    public static final INamedTag<Block> BALL_CACTI = makeTag("ball_cacti");
    public static final INamedTag<Block> BALL_CACTI_SEEDLINGS = makeTag("ball_cacti_seedlings");
    public static final INamedTag<Block> BALL_CACTUS_FLOWERS = makeTag("ball_cactus_flowers");
    public static final INamedTag<Block> BALL_CACTUS_PLANTABLE_ON = makeTag("ball_cactus_plantable_on");
    public static final INamedTag<Block> BALL_CACTUS_FLOWER_PLACEABLE_ON = makeTag("ball_cactus_flower_placeable_on");

    private static INamedTag<Block> makeTag(String id) {
        return BlockTags.makeWrapperTag(BloomAndGloom.MOD_ID + ":" + id);
    }
}
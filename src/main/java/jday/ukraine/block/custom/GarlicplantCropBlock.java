package jday.ukraine.block.custom;

import jday.ukraine.item.UkraineItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
public class GarlicplantCropBlock extends CropBlock {
    public static final IntProperty AGE = IntProperty.of("age", 0, 3);

    public GarlicplantCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return UkraineItems.UKRAINE_GARLIC;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}

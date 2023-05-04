package jday.ukraine.item;
import jday.ukraine.Ukraine;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
public class UkraineItemGroup {
    public static ItemGroup UKRAINE;

    public static void registerItemGroups() {
        UKRAINE = FabricItemGroup.builder(new Identifier(Ukraine.MOD_ID, "ukraine"))
                .displayName(Text.translatable("itemgroup.ukraine"))
                .icon(() -> new ItemStack(UkraineItems.EMBLEM)).build();
    }
}

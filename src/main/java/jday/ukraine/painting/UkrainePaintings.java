package jday.ukraine.painting;

import jday.ukraine.Ukraine;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class UkrainePaintings {
    public static final PaintingVariant UKRAINE_TARAS = registerPainting("taras", new PaintingVariant(32,32));
    public static final PaintingVariant UKRAINE_LESYA = registerPainting("lesya", new PaintingVariant(32,32));
    public static final PaintingVariant UKRAINE_ZELENSKIY = registerPainting("zelenskiy", new PaintingVariant(32,32));
    public static final PaintingVariant UKRAINE_BANDERA = registerPainting("bandera", new PaintingVariant(32,32));
    public static final PaintingVariant UKRAINE_BOHDAN = registerPainting("bohdan", new PaintingVariant(32,32));
    public static final PaintingVariant UKRAINE_KIEV = registerPainting("kiev", new PaintingVariant(64,32));
    public static final PaintingVariant UKRAINE_PIVEN = registerPainting("piven", new PaintingVariant(64,64));
    public static final PaintingVariant UKRAINE_IVAN = registerPainting("ivan", new PaintingVariant(32,32));
    public static final PaintingVariant UKRAINE_VALERA = registerPainting("valera", new PaintingVariant(32,32));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(Ukraine.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        Ukraine.LOGGER.debug("Registering Paintings for " + Ukraine.MOD_ID);
    }
}

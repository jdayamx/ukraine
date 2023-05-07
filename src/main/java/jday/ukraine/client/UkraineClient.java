package jday.ukraine.client;

import jday.ukraine.block.UkraineBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
public class UkraineClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(UkraineBlocks.UKRAINE_ONION_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(UkraineBlocks.UKRAINE_GARLIC_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(UkraineBlocks.RED_VIBURNUM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(UkraineBlocks.RED_VIBURNUM_SAPLING, RenderLayer.getCutout());

        //EntityRendererRegistry.register(ModEntities.TIGER, TigerRenderer::new);

        //BlockEntityRendererFactories.register(ModBlockEntities.ANIMATED_BLOCK_ENTITY, AnimatedBlockRenderer::new);
    }
}

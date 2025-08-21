package net.bjnzoom2.ruby.datagen;

import net.bjnzoom2.ruby.Ruby;
import net.bjnzoom2.ruby.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Ruby.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.RAW_RUBY.get());

        basicItem(ModItems.CHISEL.get());
    }
}

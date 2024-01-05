package cmod.content.blocks;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.production.*;
import mindustry.content.Items;


public class cmodProduction {
    public static Block steelBlock;

    public static void load() {
        
        steelBlock = new GenericCrafter("steel-block") {{
            Object withItems;
            requirements(Category.crafting,ItemStack.with(Items.titanium , 25 , Items.lead , 25));
            size = 2;
        }};
    }
}

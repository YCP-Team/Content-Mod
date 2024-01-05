package cmod.content.blocks;

import mindustry.world.Block;
import mindustry.world.blocks.production.GenericCrafter;

public class cmodProduction {
    public static Block steelBlock;

    public static void load() {
        
        steelBlock = new GenericCrafter("steel-block") {{

        }};
    }
}

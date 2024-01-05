package cmod.content;

import mindustry.type.Item;
import arc.graphics.Color;

public class cmodItems {
    public static Item
    steel;

    public static void load(){
        steel = new Item("steel"){{
            cost = 1.5f;
            alwaysUnlocked = false;
            }};
    }
}

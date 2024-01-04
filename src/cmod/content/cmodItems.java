package cmod.content;

import mindustry.type.Item;
import arc.graphics.Color;

public class cmodItems {
    public static Item
    testitem;

    public static void load(){
        testitem = new Item("testitem"){{
            cost = 0.5f;
            alwaysUnlocked = true;
            }};
    }
}

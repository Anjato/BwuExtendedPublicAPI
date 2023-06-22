package net.botwithus.api.game.hud;

import net.botwithus.api.game.hud.inventories.Backpack;
import net.botwithus.rs3.interfaces.Interface;
import net.botwithus.rs3.queries.builders.inventories.InventoryQuery;
import net.botwithus.rs3.util.Random;
import net.botwithus.rs3.menu.MiniMenu;
import net.botwithus.rs3.menu.types.ComponentAction;
import net.botwithus.rs3.script.Delay;

public class DestroyInterface {
    public static final int NO_ID = 77529094, YES_ID = 77529093;

    public static boolean isOpen() {
        return Interface.isInterfaceOpen(1183);
    }

    /**
     *
     *   Destroys an item in the player's backpack.
     *
     *   @param name The name of the item to be destroyed.
     */
    public static void destroyItem(String name) {
        if (Backpack.contains(name) && !isOpen()) {
            Backpack.doAction(name, 8);
            Delay.delayUntil(Random.nextInt(800, 1400), (p) -> isOpen());
        }
        if (isOpen())
            MiniMenu.doAction(ComponentAction.COMPONENT.getType(), 0, -1, YES_ID);
    }
}

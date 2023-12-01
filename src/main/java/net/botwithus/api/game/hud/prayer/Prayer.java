package net.botwithus.api.game.hud.prayer;

import net.botwithus.rs3.game.skills.Skills;
import net.botwithus.rs3.game.vars.VarManager;

public final class Prayer {

    private Prayer() {
    }

    /**
     * Checks if the Quick Prayer toggle is active.
     *
     * @return true if the Quick Prayer toggle is active, false otherwise
     */
    public static boolean isQuickPrayerActive() {
        return VarManager.getVarbitValue(5941) == 1;
    }

    /**
     * Toggles the quick prayer setting.
     *
     * @return {@code true} if the quick prayer setting was successfully toggled, {@code false} otherwise.
     */
//    public static boolean toggleQuickPrayer() {
//        var toggle = InterfaceMode.getInterface(Prayer.class, "quick_prayer_toggle");
//        return ComponentQuery.newQuery(toggle.getInterfaceIndex()).option(
//                "Turn quick prayers on").results().first().map(c -> c.interact(1)).orElse(false);
//    }

    /**
     * Gets the current prayer points of the player.
     *
     * @return The current prayer points of the player.
     */
    public static int getPrayerPoints() {
        return VarManager.getVarbitValue(16736);
    }

    /**
     * Returns the maximum number of prayer points a player can have.
     *
     * @return the maximum number of prayer points a player can have
     */
    public static int getMaxPrayerPoints() {
        return Skills.PRAYER.getActualLevel() * 10;
    }


    /**
     * Returns the player's prayer book (0 = Normal, 1 = Curses)
     *
     * @return the player's prayer book (0 = Normal, 1 = Curses)
     */

    public static int getPrayerBook() { return VarManager.getVarbitValue(16789); }

//    /**
//     * Checks if the given {@link PrayerAbility} is active.
//     *
//     * @param ability the {@link PrayerAbility} to check
//     * @return true if the {@link PrayerAbility} is active, false otherwise
//     */
//    public static boolean isActive(PrayerAbility ability) {
//        return ability.isActive();
//    }
//
//    /**
//     * Toggles the given {@link PrayerAbility}.
//     *
//     * @param ability The {@link PrayerAbility} to toggle.
//     * @return {@code true} if the {@link PrayerAbility} was successfully toggled, {@code false} otherwise.
//     */
//    public static boolean toggle(PrayerAbility ability) {
//        return ability.interact(ComponentAction.COMPONENT);
//    }


}

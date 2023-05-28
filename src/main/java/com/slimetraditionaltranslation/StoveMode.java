package com.slimetraditionaltranslation;

import org.mini2Dx.gettext.GetText;

public class StoveMode {
    public static String stoveMode(String mode) {
        return switch (mode) {
            case "Oven" -> GetText.tr("Oven");
            case "Frying" -> GetText.tr("Frying");
            case "Pot" -> GetText.tr("Pot");
            case "Brewing" -> GetText.tr("Brewing");
            default -> GetText.tr("Unknown Mode, please report to SlimeTraditionalTranslation Team!");
        };
    }

}

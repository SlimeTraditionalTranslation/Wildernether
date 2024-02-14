package me.schntgaispock.wildernether.integration;

import io.github.schntgaispock.slimehud.SlimeHUD;
import io.github.schntgaispock.slimehud.waila.HudRequest;
import lombok.experimental.UtilityClass;
import me.schntgaispock.wildernether.slimefun.items.BlackstoneStove;
import org.mini2Dx.gettext.GetText;

@UtilityClass
public class SlimeHUDSetup {
    
    public static void setup() {

        SlimeHUD.getHudController().registerCustomHandler(BlackstoneStove.class, (HudRequest request) -> {
            return GetText.tr("&7| Mode: ") + BlackstoneStove.getMode(request.getLocation());
        });

    }

}

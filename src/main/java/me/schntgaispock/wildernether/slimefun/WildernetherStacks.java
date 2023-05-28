package me.schntgaispock.wildernether.slimefun;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.schntgaispock.wildernether.util.ItemUtil;
import me.schntgaispock.wildernether.util.Theme;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.mini2Dx.gettext.GetText;

public class WildernetherStacks {

    // Guide Use Only
    public static final CustomItemStack GUIDE_WILDERNETHER, GUIDE_MATERIALS, GUIDE_PLANTS, GUIDE_CUISINE, 
        GUIDE_TOOLS, GUIDE_BREWS, GUIDE_RECIPE_HOGLIN_BOUILLON;
    
    public static final CustomItemStack RECIPE_BREAK_NETHER_PLANTS, RECIPE_BLACKSTONE_STOVE_OVEN,
        RECIPE_BLACKSTONE_STOVE_FRYING, RECIPE_BLACKSTONE_STOVE_POT, RECIPE_BLACKSTONE_STOVE_BREWING,
        RECIPE_KILL_MOB, RECIPE_HOGLIN;

    // Utility
    public static final ItemStack WATER_BOTTLE;

    // Materials
    public static final SlimefunItemStack CRIMSON_FRAME, WARPED_FRAME, SOUL_STONE;
    public static final SlimefunItemStack FUNGAL_IRON_SCRAP, FUNGAL_GOLD_SCRAP;

    // Tools
    public static final SlimefunItemStack BLACKSTONE_SCYTHE, SOUL_SCYTHE, NETHER_COMPOSTER, BLACKSTONE_STOVE;

    // Common
    public static final SlimefunItemStack WARPED_CACTUS, BLAZESPROUT, NETHER_TUBERS, CRYSTAL_MUSHROOM,
        SHROOMLIGHT_SPORES, WARPED_ROSE, RED_CARROT;
    // Uncommon
    public static final SlimefunItemStack CRIMSON_DREADLOCKS, TWISTED_BEAN_SPROUT, RED_SPIDER_LILY, WARPED_LOTUS;
    // Rare
    public static final SlimefunItemStack SMOLDERING_HERBS, IMMOLATED_VINES, OCTARINE_NETHERCAP, EMERALD_FIREBLOOM;
    // Secret
    public static final SlimefunItemStack GARDEN_OF_THE_LOST_SOUL, TULIP_OF_PARTINGS, BLOOM_OF_UNHEARD_CRIES,
    BLOSSOM_OF_SOLITUDE, LAMENT_OF_THE_DAMNED;

    // Ingredients
    public static final SlimefunItemStack HOGLIN_SPARE_RIB, HOGLIN_BELLY, HOGLIN_TROTTERS, HOGLIN_BOUILLON, CACTUS_JUICE;
    // Crafted
    public static final SlimefunItemStack WARPED_SALAD, MUSHROOM_SLICES;
    // Oven
    public static final SlimefunItemStack BAKED_NETHER_TUBERS, GLOWING_BEANS;
    // Frying
    public static final SlimefunItemStack NETHER_CHIPS, FRIED_WARPED_FUNGUS, FRIED_CRIMSON_FUNGUS, SPICY_FRIED_LOTUS;
    // Pot
    public static final SlimefunItemStack CRIMSON_STEW, WARPED_STEW, NETHER_HOTPOT, PORK_BONE_SOUP,
        BOILED_NETHER_TUBERS, BOILED_WARPED_CACTUS;
    // Brews
    public static final SlimefunItemStack BREW_OF_FIRE_WARDING, BREW_OF_FARSIGHT, BREW_OF_CELERITY;

    static {
        // ---------- Guide Items ----------
        GUIDE_WILDERNETHER = new CustomItemStack(
            Material.WARPED_ROOTS,
            Theme.WARPED.getColor() + GetText.tr("Wildernether")
        );

        GUIDE_MATERIALS = new CustomItemStack(
            Material.MAGMA_CREAM,
            Theme.CRIMSON.getColor() + GetText.tr("Materials")
        );

        GUIDE_TOOLS = new CustomItemStack(
            Material.STONE_HOE,
            Theme.BLACKSTONE.getColor() + GetText.tr("Tools")
        );

        GUIDE_PLANTS = new CustomItemStack(
            Material.NETHER_SPROUTS,
            Theme.WARPED.getColor() + GetText.tr("Plants")
        );
        
        GUIDE_CUISINE = new CustomItemStack(
            Material.COOKED_PORKCHOP,
            Theme.CUISINE.getColor() + GetText.tr("Cuisine")
        );
        
        GUIDE_BREWS = new CustomItemStack(
            Material.GLASS_BOTTLE,
            Theme.BREW.getColor() + GetText.tr("Brews")
        );

        GUIDE_RECIPE_HOGLIN_BOUILLON = new CustomItemStack(
            Material.PORKCHOP,
            Theme.CUISINE.getColor() + GetText.tr("Any Hoglin meat")
        );

        RECIPE_BREAK_NETHER_PLANTS = new CustomItemStack(
            Material.NETHER_SPROUTS,
            GetText.tr("&bBreak Nether Plants"),
            GetText.tr("&7This resource is obtained by harvesting"),
            GetText.tr("&7(breaking) plants in the nether with a"),
            GetText.tr("&7scythe. The available plants are Nether Sprouts,"),
            GetText.tr("&7Warped Roots, Warped Fungus, Twisting Vines,"),
            GetText.tr("&7Crimson Root, Crimson Fungus, Weeping Vines,"),
            GetText.tr("&7and Shroomlight")
        );

        RECIPE_BLACKSTONE_STOVE_OVEN = new CustomItemStack(
            Material.BLAST_FURNACE,
            GetText.tr("&bBlackstone Stove (Oven)"),            
            GetText.trc("wildenether_recipe_blackstone_stove_oven.lore.01", "&7This recipe is crafted using the Blackstone"),
            GetText.trc("wildenether_recipe_blackstone_stove_oven.lore.02", "&7Stove's oven mode. This is the default.")
        );

        RECIPE_BLACKSTONE_STOVE_FRYING = new CustomItemStack(
            Material.BLAST_FURNACE,
            GetText.tr("&bBlackstone Stove (Frying)"),
            GetText.trc("wildenether_recipe_blackstone_stove_frying.lore.01", "&7This recipe is crafted using the Blackstone"),
            GetText.trc("wildenether_recipe_blackstone_stove_frying.lore.02", "&7Stove's frying mode. Place a Heavy Weighted"),
            GetText.trc("wildenether_recipe_blackstone_stove_frying.lore.03", "&7Pressure Plate (Iron Pressure Plate) on top"),
            GetText.trc("wildenether_recipe_blackstone_stove_frying.lore.04", "&7of the stove to use this mode.")
        );

        RECIPE_BLACKSTONE_STOVE_POT = new CustomItemStack(
            Material.BLAST_FURNACE,
            GetText.tr("&bBlackstone Stove (Pot)"),
            GetText.trc("wildenether_recipe_blackstone_stove_pot.lore.01", "&7This recipe is crafted using the Blackstone"),
            GetText.trc("wildenether_recipe_blackstone_stove_pot.lore.02", "&7Stove's pot mode. Place a Cauldron on top"),
            GetText.trc("wildenether_recipe_blackstone_stove_pot.lore.03", "&7of the stove to use this mode.")
        );

        RECIPE_BLACKSTONE_STOVE_BREWING = new CustomItemStack(
            Material.BLAST_FURNACE,
            GetText.tr("&bBlackstone Stove (Brewing)"),
            GetText.trc("wildenether_recipe_blackstone_stove_brewing.lore.01", "&7This recipe is crafted using the Blackstone"),
            GetText.trc("wildenether_recipe_blackstone_stove_brewing.lore.02", "&7Stove's brewing mode. Place a Light Weighted"),
            GetText.trc("wildenether_recipe_blackstone_stove_brewing.lore.03", "&7Pressure Plate (Gold Pressure Plate) on top"),
            GetText.trc("wildenether_recipe_blackstone_stove_brewing.lore.04", "&7of the stove to use this mode. Water Bottles"),
            GetText.trc("wildenether_recipe_blackstone_stove_brewing.lore.05", "&7can be substituted with Cactus Juice.")
        );

        RECIPE_KILL_MOB = new CustomItemStack(
            Material.GOLDEN_SWORD,
            GetText.tr("&bHunting"),
            GetText.tr("&7This item is obtained by killing the"),
            GetText.tr("&7Specified mob")
        );

        RECIPE_HOGLIN = new CustomItemStack(
            Material.HOGLIN_SPAWN_EGG,
            GetText.tr("&fHoglin")
        );

        WATER_BOTTLE = ItemUtil.getWaterBottle();

        // ---------- Materials ----------
        CRIMSON_FRAME = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "CRIMSON_FRAME",
            Material.CRIMSON_FENCE_GATE,
            GetText.tr("Crimson Frame"),
            "",
            GetText.trc("wildenether_crimson_frame.lore.01", "A sturdy frame made from the stem of"),
            GetText.trc("wildenether_crimson_frame.lore.02", "a large Crimson Fungus")
        );

        WARPED_FRAME = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "WARPED_FRAME",
            Material.WARPED_FENCE_GATE,
            GetText.tr("Warped Frame"),
            "",
            GetText.trc("wildenether_warped_frame.lore.01", "A sturdy frame made from the stem of"),
            GetText.trc("wildenether_warped_frame.lore.02", "a large Warped Fungus")
        );

        SOUL_STONE = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "SOUL_STONE",
            Material.LODESTONE,
            Theme.SOUL.getColor() + GetText.tr("Soul Stone"),
            "",
            GetText.tr("You can hear strange whisperings coming"),
            GetText.tr("from deep within")
        );

        FUNGAL_IRON_SCRAP = ItemUtil.formattedSlimefunItemStack(
            Theme.NEUTRAL,
            "FUNGAL_IRON_SCRAP",
            Material.IRON_NUGGET,
            Theme.NEUTRAL.getColor() + GetText.tr("Fungal Iron Scrap"),
            "",
            GetText.trc("wildenether_fungal_iron_scrap.lore.01", "A piece of scrap iron overgrown"),
            GetText.trc("wildenether_fungal_iron_scrap.lore.02", "with fungus"),
            "",
            GetText.tr("&7&oUsable in Workbench")
        );

        FUNGAL_GOLD_SCRAP = ItemUtil.formattedSlimefunItemStack(
            Theme.NEUTRAL,
            "FUNGAL_GOLD_SCRAP",
            Material.GOLD_NUGGET,
            Theme.NEUTRAL.getColor() + GetText.tr("Fungal Gold Scrap"),
            "",
            GetText.trc("wildenether_fungal_gold_scrap.lore.01", "A piece of scrap gold overgrown"),
            GetText.trc("wildenether_fungal_gold_scrap.lore.02", "with fungus"),
            "",
            GetText.tr("&7&oUsable in Workbench")
        );
        
        // ---------- Tools ----------
        BLACKSTONE_SCYTHE = ItemUtil.formattedSlimefunItemStack(
            Theme.BLACKSTONE,
            "BLACKSTONE_SCYTHE",
            Material.STONE_HOE,
            Theme.BLACKSTONE.getColor() + GetText.tr("Blackstone Scythe"),
            "",
            GetText.tr("Its extra-sharp blade makes it perfect"),
            GetText.tr("for cutting the tough plants that grow"),
            GetText.tr("in the nether")
        );
        
        SOUL_SCYTHE = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "SOUL_SCYTHE",
            Material.NETHERITE_HOE,
            Theme.SOUL.getColor() + GetText.tr("Soul Scythe"),
            "",
            GetText.tr("Its blade quivers with soft whispers."),
            GetText.tr("If you use this to harvest plants in the"),
            GetText.tr("nether, you might discover plants with"),
            GetText.tr("secrets to tell!")
        );

        NETHER_COMPOSTER = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "NETHER_COMPOSTER",
            Material.COMPOSTER,
            GetText.tr("Nether Composter"),
            "",
            GetText.tr("Crafted with the wood of the underworld,"),
            GetText.tr("it is suitable for breaking down even"),
            GetText.tr("the hardiest of plants")
        );

        BLACKSTONE_STOVE = ItemUtil.formattedSlimefunItemStack(
            Theme.BLACKSTONE,
            "BLACKSTONE_STOVE",
            Material.BLAST_FURNACE,
            Theme.BLACKSTONE.getColor() + GetText.tr("Blackstone Stove"),
            "",
            GetText.tr("Using netherrack, it is able to keep"),
            GetText.tr("itself lit forever!")
        );

        // ---------- Plants ----------
        WARPED_CACTUS = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "WARPED_CACTUS",
            Material.CACTUS,
            GetText.tr("Warped Cactus"),
            "",
            GetText.tr("A tiny, twisted cactus growing from the"),
            GetText.tr("hypha of a warped fungus. Be careful not"),
            GetText.tr("to step on it!")
        );

        BLAZESPROUT = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "BLAZESPROUT",
            Material.RED_DYE,
            GetText.tr("Blazesprout"),
            "",
            GetText.tr("The hypha of a nether fungus has"),
            GetText.tr("absorbed some powder from a blaze,"),
            GetText.tr("leading to the formation of a fiery"),
            GetText.tr("blister."),
            "",
            GetText.tr("&7&oUse in the Nether Composter")
        );

        NETHER_TUBERS = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "NETHER_TUBERS",
            Material.POTATO,
            GetText.tr("Nether Tubers"),
            "",
            GetText.tr("It's a potato.")
        );

        CRYSTAL_MUSHROOM = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "CRYSTAL_MUSHROOM",
            Material.RED_MUSHROOM,
            GetText.tr("Crystal Mushroom"),
            "",
            GetText.tr("An excess of quartz in its surroundings"),
            GetText.tr("has given rise to this strange mushroom,"),
            GetText.tr("growing crystals of quartz in its cap")
        );

        SHROOMLIGHT_SPORES = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "SHROOMLIGHT_SPORES",
            Material.PUMPKIN_SEEDS,
            GetText.tr("Shroomlight Spores"),
            "",
            GetText.tr("These spores don't appear to glow, unlike"),
            GetText.tr("the bulbs that they dropped from.")
        );

        WARPED_ROSE = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "WARPED_ROSE",
            Material.WITHER_ROSE,
            GetText.tr("Warped Rose"),
            "",
            GetText.tr("This rose's thorns are bigger than its"),
            GetText.tr("leaves")
        );

        RED_CARROT = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "RED_CARROT",
            Material.CARROT,
            GetText.tr("Red Carrot"),
            "",
            GetText.tr("It's red")
        );

        // Uncommon
        CRIMSON_DREADLOCKS = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "CRIMSON_DREADLOCKS",
            Material.WEEPING_VINES,
            GetText.tr("Crimson Dreadlocks"),
            "",
            GetText.tr("Each one of these vines is as thick as"),
            GetText.tr("your arm...")
        );

        TWISTED_BEAN_SPROUT = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "TWISTED_BEAN_SPROUT",
            Material.TWISTING_VINES,
            GetText.tr("Twisted Bean Sprout"),
            "",
            GetText.tr("High source of fibre!")
        );

        RED_SPIDER_LILY = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "RED_SPIDER_LILY",
            Material.POPPY,
            GetText.tr("Red Spider Lily"),
            "",
            GetText.tr("Its curling petals seem to be grabbing"),
            GetText.tr("at you")
        );

        WARPED_LOTUS = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "WARPED_LOTUS",
            Material.SPORE_BLOSSOM,
            GetText.tr("Warped Lotus"),
            "",
            GetText.tr("Don't they normally grow on water?")
        );

        // Rare
        SMOLDERING_HERBS = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON_DARK,
            "SMOLDERING_HERBS",
            Material.FERN,
            GetText.tr("Smoldering Herbs"),
            "",
            GetText.tr("They don't actually burn")
        );

        IMMOLATED_VINES = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON_DARK,
            "IMMOLATED_VINES",
            Material.WEEPING_VINES,
            GetText.tr("Immolated Vines"),
            "",
            GetText.tr("Even after being cut from the fungus,"),
            GetText.tr("it pulsates like a heart")
        );

        OCTARINE_NETHERCAP = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED_DARK,
            "OCTARINE_NETHERCAP",
            Material.WARPED_FUNGUS,
            GetText.tr("Octarine Nethercap"),
            "",
            GetText.tr("A fluorescent greenish-yellow purple")
        );

        EMERALD_FIREBLOOM = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED_DARK,
            "EMERALD_FIREBLOOM",
            Material.FERN,
            GetText.tr("Emerald Firebloom"),
            "",
            GetText.tr("Its petals undulate like the flames"),
            GetText.tr("of a fire")
        );
        

        // Secret
        GARDEN_OF_THE_LOST_SOUL = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "GARDEN_OF_THE_LOST_SOUL",
            Material.GRASS,
            GetText.tr("Garden of the Lost Soul"),
            GetText.tr("&7Chapter 1"),
            "",
            GetText.tr("The only refuge in this blazing land"),
            GetText.tr("for the adventurer trapped in hell."), 
            GetText.tr("He cultivated this garden with the"),
            GetText.tr("flora of a peaceful world, escaping"),
            GetText.tr("into a transient dream")
        );

        TULIP_OF_PARTINGS = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "TULIP_OF_PARTINGS",
            Material.WHITE_TULIP,
            GetText.tr("Tulip of Partings"),
            GetText.tr("&7Chapter 2"),
            "",
            GetText.tr("His oasis, the winds of the wastes"),
            GetText.tr("scattered and warped. In the end"),
            GetText.tr("the adventurer was left with a single"),
            GetText.tr("fragile tulip, the only reminder of"),
            GetText.tr("the world from which he came")
        );

        BLOOM_OF_UNHEARD_CRIES = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "BLOOM_OF_UNHEARD_CRIES",
            Material.FLOWERING_AZALEA,
            GetText.tr("Bloom of Unheard Cries"),
            GetText.tr("&7Chapter 3"),
            "",
            GetText.tr("Gone was his sanctuary, every last"), 
            GetText.tr("bloom warped into horror. Fearing the"),
            GetText.tr("dangers of staying there, he set out"),
            GetText.tr("to find a way home. Alas, his shouts"),
            GetText.tr("reached nothing but the domineering"),
            GetText.tr("netherrack sky, and the brown sand"),
            GetText.tr("dragging down his feet")
        );

        BLOSSOM_OF_SOLITUDE = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "BLOSSOM_OF_SOLITUDE",
            Material.CRIMSON_FUNGUS,
            GetText.tr("Blossom of Solitude"),
            GetText.tr("&7Chapter 4"),
            "",
            GetText.tr("After days of walking, the adventurer"),
            GetText.tr("could move no longer. He collapsed on the"),
            GetText.tr("hard rock, scarlet blood flowing from"),
            GetText.tr("festering wounds. No more did he feel the"),
            GetText.tr("itch of a stinging scrape, nor the aching"),
            GetText.tr("of an empty stomach.")
        );

        LAMENT_OF_THE_DAMNED = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "LAMENT_OF_THE_DAMNED",
            Material.WEEPING_VINES,
            GetText.tr("Lament of the Damned"),
            GetText.tr("&7Chapter 5"),
            "",
            GetText.tr("Once fiery brimstone, this land became"),
            GetText.tr("overgrown with the twisted forms of flora"),
            GetText.tr("that flew on the wind, and mutated with"),
            GetText.tr("time. However, no more could his soul be"),
            GetText.tr("soothed, for he was damned to this"),
            GetText.tr("unknown land for the rest of eternity")
        );

        
        // ---------- Cuisine ----------

        // Ingredients
        HOGLIN_SPARE_RIB = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "HOGLIN_SPARE_RIB",
            Material.BEEF,
            GetText.tr("Hoglin Spare Rib"),
            "",
            GetText.trc("wildenether_hoglin_spare_rib.lore.01", "A thick cut of meat from the side"),
            GetText.trc("wildenether_hoglin_spare_rib.lore.02", "of a hoglin")
        );
        
        HOGLIN_BELLY = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "HOGLIN_BELLY",
            Material.PORKCHOP,
            GetText.tr("Hoglin Belly"),
            "",
            GetText.trc("wildenether_hoglin_belly.lore.01", "A fatty cut of meat from the underside"),
            GetText.trc("wildenether_hoglin_belly.lore.02", "of a hoglin")
        );
        
        HOGLIN_TROTTERS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "HOGLIN_TROTTERS",
            Material.RABBIT_FOOT,
            GetText.tr("Hoglin Trotters"),
            "",
            GetText.tr("The foot of a hoglin")
        );

        HOGLIN_BOUILLON = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "HOGLIN_BOUILLON",
            Material.WATER_BUCKET,
            GetText.tr("Hoglin Bouillon"),
            "",
            GetText.tr("A flavourful broth made by simmering"),
            GetText.tr("hoglin meat")
        );

        BOILED_WARPED_CACTUS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "BOILED_WARPED_CACTUS",
            Material.GREEN_DYE,
            GetText.tr("Boiled Warped Cactus"),
            "",
            GetText.tr("You can eat cactus?"),
            "",
            LoreBuilder.hunger(1)
        );

        CACTUS_JUICE = ItemUtil.modifyWaterBottle(
            ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
                "CACTUS_JUICE",
                Material.POTION,
                GetText.tr("Cactus Juice"),
                "",
                GetText.tr("A regular water bottle that smells"),
                GetText.tr("faintly of sulfur and cactus")
            ),
            Color.fromRGB(0x7c, 0xd3, 0x9c)
        );

        // Crafted
        WARPED_SALAD = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "WARPED_SALAD",
            Material.GREEN_DYE,
            GetText.tr("Warped Salad"),
            "",
            GetText.tr("Salads are green, so its okay to eat"),
            "",
            LoreBuilder.hunger(4)
        );

        MUSHROOM_SLICES = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "MUSHROOM_SLICES",
            Material.BEETROOT_SEEDS,
            GetText.tr("Mushroom Slices"),
            "",
            GetText.tr("An assortment of oddly coloured fungi"),
            "",
            LoreBuilder.hunger(3)
        );

        BAKED_NETHER_TUBERS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "BAKED_NETHER_TUBERS",
            Material.BAKED_POTATO,
            GetText.tr("Baked Nether Tubers"),
            "",
            GetText.tr("It's a baked potato."),
            "",
            LoreBuilder.hunger(3)
        );

        GLOWING_BEANS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "GLOWING_BEANS",
            Material.GLOW_BERRIES,
            GetText.tr("Glowing Beans"),
            "",
            GetText.tr("It looks like cooking has brought out"),
            GetText.tr("The luminescent elements in the spores"),
            "",
            LoreBuilder.hunger(0.5)
        );

        // Frying
        NETHER_CHIPS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "NETHER_CHIPS",
            Material.BREAD,
            GetText.tr("Nether Chips™"),
            "",
            GetText.tr("You'll get fat if you eat too much"),
            "",
            LoreBuilder.hunger(1.5)
        );

        FRIED_WARPED_FUNGUS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "FRIED_WARPED_FUNGUS",
            Material.WARPED_FUNGUS,
            GetText.tr("Fried Warped Fungus"),
            "",
            GetText.tr("Crunchy!"),
            "",
            LoreBuilder.hunger(1)
        );

        FRIED_CRIMSON_FUNGUS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "FRIED_CRIMSON_FUNGUS",
            Material.CRIMSON_FUNGUS,
            GetText.tr("Fried Crimson Fungus"),
            "",
            GetText.tr("Crunchy!"),
            "",
            LoreBuilder.hunger(1)
        );

        SPICY_FRIED_LOTUS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "SPICY_FRIED_LOTUS",
            Material.COOKIE,
            GetText.tr("Spicy Fried Lotus"),
            "",
            GetText.tr("Sweet, savoury, &oand spicy!"),
            "",
            LoreBuilder.hunger(3.5)
        );

        // Pot
        CRIMSON_STEW = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "CRIMSON_STEW",
            Material.BEETROOT_SOUP,
            GetText.tr("Crimson Stew"),
            "",
            GetText.tr("A thick clump of fungus floats on the top."),
            GetText.tr("It should be safe to eat, right?"),
            "",
            LoreBuilder.hunger(5)
        );

        WARPED_STEW = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "WARPED_STEW",
            Material.SUSPICIOUS_STEW,
            GetText.tr("Warped Stew"),
            "",
            GetText.tr("The surface of the soup shines green."),
            GetText.tr("It should be safe to eat, right?"),
            "",
            LoreBuilder.hunger(5)
        );

        NETHER_HOTPOT = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "NETHER_HOTPOT",
            Material.RABBIT_STEW,
            GetText.tr("Nether Hotpot"),
            "",
            GetText.tr("Piping hot!"),
            "",
            LoreBuilder.hunger(6)
        );

        PORK_BONE_SOUP = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "PORK_BONE_SOUP",
            Material.MUSHROOM_STEW,
            GetText.tr("Pork Bone Soup"),
            "",
            GetText.tr("Very filling!"),
            "",
            LoreBuilder.hunger(8.5)
        );

        BOILED_NETHER_TUBERS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "BOILED_NETHER_TUBERS",
            Material.POTATO,
            GetText.tr("Boiled Nether Tubers"),
            "",
            GetText.tr("It's a boiled potato."),
            "",
            LoreBuilder.hunger(3)
        );

        // ---------- Brews ----------
        BREW_OF_FIRE_WARDING = ItemUtil.modifyPotionStack(
            ItemUtil.formattedSlimefunItemStack(
                Theme.BREW,
                "BREW_OF_FIRE_WARDING",
                Material.POTION,
                GetText.tr("Brew of Fire Warding")
            ),
            Color.fromRGB(0xfc, 0x8d, 0x0f),
            new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300*20, 0)
        );

        BREW_OF_FARSIGHT = ItemUtil.modifyPotionStack(
            ItemUtil.formattedSlimefunItemStack(
                Theme.BREW,
                "BREW_OF_FARSIGHT",
                Material.POTION,
                GetText.tr("Brew of Farsight")
            ),
            Color.fromRGB(0x0f, 0x7d, 0xfc),
            new PotionEffect(PotionEffectType.NIGHT_VISION, 300*20, 0)
        );

        BREW_OF_CELERITY = ItemUtil.modifyPotionStack(
            ItemUtil.formattedSlimefunItemStack(
                Theme.BREW,
                "BREW_OF_CELERITY",
                Material.POTION,
                GetText.tr("Brew of Celerity")
            ),
            Color.fromRGB(0xfc, 0xf4, 0xfa),
            new PotionEffect(PotionEffectType.FAST_DIGGING, 10*20, 1),
            new PotionEffect(PotionEffectType.SPEED, 10*20, 1),
            new PotionEffect(PotionEffectType.JUMP, 10*20, 0),
            new PotionEffect(PotionEffectType.CONFUSION, 10*20, 0)
        );
       
    }
}
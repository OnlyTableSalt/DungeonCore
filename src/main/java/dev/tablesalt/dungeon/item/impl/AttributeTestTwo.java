package dev.tablesalt.dungeon.item.impl;

import dev.tablesalt.dungeon.item.ItemAttribute;
import dev.tablesalt.dungeon.item.Rarity;
import dev.tablesalt.dungeon.item.Tier;
import dev.tablesalt.dungeon.util.TBSItemUtil;
import lombok.Getter;

import java.util.List;

public final class AttributeTestTwo extends ItemAttribute {

    @Getter
    private static final AttributeTestTwo instance = new AttributeTestTwo();

    @Getter
    private final Rarity rarity;

    private AttributeTestTwo() {
        super();

        this.rarity = Rarity.MYTHIC;
    }

    @Override
    public String getName() {
        return "Attribute Two";
    }

    @Override
    public List<String> getAttributeLore(Tier tier) {
        return List.of(new String[]{ " ",
                TBSItemUtil.makeItemTitle(getName() + " " + tier.getAsRomanNumeral()),
                rarity.getFormattedName() + "&7A Simple attribute that does nothing",
                "&7but add &b" + (tier.getAsInteger() + 5) + " &7of some stat!",
                " "
        });
    }



}

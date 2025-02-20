package com.rosebushes.alchemyexpanded.data.loot_table;

import com.mraof.minestuck.data.loot_table.MSBlockLootTables;
import com.mraof.minestuck.data.loot_table.MSChestLootTables;
import com.mraof.minestuck.data.loot_table.MSGiftLootTables;
import com.mraof.minestuck.data.loot_table.MSMiscLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class AELootTableProvider {
    public AELootTableProvider() {
    }

    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(new LootTableProvider.SubProviderEntry(AEChestLootTables::new, LootContextParamSets.CHEST)));
    }
}

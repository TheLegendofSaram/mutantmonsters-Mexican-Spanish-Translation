package fuzs.mutantmonsters.neoforge.world.item;

import fuzs.mutantmonsters.world.item.ArmorBlockItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.block.Block;

public class ArmorBlockNeoForgeItem extends ArmorBlockItem {

    public ArmorBlockNeoForgeItem(ArmorMaterial material, Block floorBlock, Block wallBlockIn, Properties propertiesIn) {
        super(material, floorBlock, wallBlockIn, propertiesIn);
    }

    @Override
    public int getEnchantmentValue(ItemStack stack) {
        return this.material.getEnchantmentValue();
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment) || enchantment.category == EnchantmentCategory.ARMOR || enchantment.category == EnchantmentCategory.ARMOR_HEAD;
    }
}

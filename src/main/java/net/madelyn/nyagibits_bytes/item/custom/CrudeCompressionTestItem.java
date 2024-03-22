package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrudeCompressionTestItem extends Item {
    public CrudeCompressionTestItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("We got a box, with some dirt").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("lets see what the properties").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("of the soil is").withStyle(ChatFormatting.GRAY));
        components.add(Component.literal("SMASH!").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, level, components, flag);
    }
}

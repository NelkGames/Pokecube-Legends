package pokecube.legends.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DestructOrb extends ItemBase {

	public DestructOrb(String name,int num) {
		super(name, num);
		setMaxStackSize(1);
	}
	
	/** allows items to add custom lines of information to the mouseover
     * description */
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> list, ITooltipFlag advanced)
    {
        if (GuiScreen.isShiftKeyDown()) list.add(I18n.format("legends.destructorb.tooltip"));
        else list.add(I18n.format("pokecube.tooltip.advanced"));
    }
}

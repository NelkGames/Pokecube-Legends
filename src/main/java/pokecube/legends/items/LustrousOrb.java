package pokecube.legends.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LustrousOrb extends ItemBase
{
	public LustrousOrb(String name, int num) 
	{
		super(name, num);
		setMaxStackSize(1);
	}
	
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
		super.addInformation(itemstack, world, list, flag);
		list.add("Use this item on 'Time and Space Spawn' to Spawn Palkia");
	}
}

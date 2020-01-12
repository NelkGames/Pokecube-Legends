package pokecube.legends.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CobbleUltraBlock extends BlockBase 
{
	public CobbleUltraBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(6.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
	@SuppressWarnings("unused")
	@Override
	public void onEntityWalk(World world, BlockPos pos, Entity entity) {
		super.onEntityWalk(world, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		Block block = this;
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			executeProcedure($_dependencies);
		}
	}
	
	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof EntityPlayer)) {
			if (((entity.dimension) != 0)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 120, (int) 1));
			}
		}
	}
}
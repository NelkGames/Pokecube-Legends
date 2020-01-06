package pokecube.legends.worldgen.genlayer;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import pokecube.legends.init.BiomeInit;

public class GenLayerBiomesUltra extends GenLayer
{
	private Biome[] allowedBiomes = {
			/*BiomeInit.BIOME_UB01,
			BiomeInit.BIOME_UB02,
			BiomeInit.BIOME_UB03,
			BiomeInit.BIOME_UB04,
			BiomeInit.BIOME_UB05,
			BiomeInit.BIOME_UB06,
			BiomeInit.BIOME_UB07,
			BiomeInit.BIOME_UB08,
			BiomeInit.BIOME_UB09,
			BiomeInit.BIOME_UB10*/
			BiomeInit.BIOME_UB1,
			BiomeInit.BIOME_UB2,
			BiomeInit.BIOME_UB3,
			BiomeInit.BIOME_UB4
			};
	
	public GenLayerBiomesUltra(long seed) 
	{
		super(seed);
	}
	
	@Override
	public int[] getInts(int x, int z, int width, int depth) 
	{
		int[] dest = IntCache.getIntCache(width * depth);
		for (int dz = 0; dz < depth; dz++) 
		{
			for (int dx = 0; dx < width; dx++) 
			{
				this.initChunkSeed(dx + x, dz + z);
				dest[(dx + dz * width)] = Biome.getIdForBiome(this.allowedBiomes[nextInt(this.allowedBiomes.length)]);
			}
		}
		return dest;
	}
}
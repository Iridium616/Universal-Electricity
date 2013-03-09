package universalelectricity.components.common.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import universalelectricity.components.common.BasicComponents;
import universalelectricity.prefab.UETab;

public class ItemCircuit extends Item
{
	public ItemCircuit(int id, int texture)
	{
		super(id);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		this.setCreativeTab(UETab.INSTANCE);
		this.setUnlocalizedName("circuit");
	}

	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		return this.getUnlocalizedName() + "." + itemstack.getItemDamage();
	}

	@Override
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		for (int i = 0; i < 3; i++)
		{
			par3List.add(new ItemStack(this, 1, i));
		}
	}
}

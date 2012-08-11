
package Tsukeyithan.Skill;

import net.minecraft.src.DamageSource;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Material;
import net.minecraft.src.Potion;

public class TKHSkill {

	public static final TKHSkill skillTypes[] = new TKHSkill[39];

			/** Neerian **/
	public static final TKHSkill isNeerian = (new TKHSkill(35));
	public static final TKHSkill speedWater = (new TKHSkill(0));
	public static final TKHSkill walkWater = (new TKHSkill(3));
	public static final TKHSkill sprintWater = (new TKHSkill(4));
	public static final TKHSkill exacavationWater = (new TKHSkill(5));
	public static final TKHSkill airWater = (new TKHSkill(6));
	public static final TKHSkill doubleExp = (new TKHSkill(7));
	public static final TKHSkill imunPoison = (new TKHSkill(8));
	public static final TKHSkill aquaticVelocity = (new TKHSkill(9));
	public static final TKHSkill poisoning = (new TKHSkill(10));
	public static final TKHSkill dropCrops = (new TKHSkill(11));
	public static final TKHSkill dropTree = (new TKHSkill(12));
	public static final TKHSkill dropSC = (new TKHSkill(13));
			/** Vuurkhen **/
	public static final TKHSkill isVuurkhen = (new TKHSkill(36));
	public static final TKHSkill walkLava = (new TKHSkill(2));
	public static final TKHSkill speedLava = (new TKHSkill(1));
	public static final TKHSkill doubleDamage = (new TKHSkill(14));
	public static final TKHSkill reductExplDmg = (new TKHSkill(14));
	public static final TKHSkill dropMeat = (new TKHSkill(15));
	public static final TKHSkill carbonization = (new TKHSkill(16));
	public static final TKHSkill sprintLava = (new TKHSkill(17));
			/** Araoseth **/
	public static final TKHSkill isAraoseth = (new TKHSkill(37));
	public static final TKHSkill incJump = (new TKHSkill(19));
	public static final TKHSkill incCC = (new TKHSkill(18));
	public static final TKHSkill noSoulSand = (new TKHSkill(20));
	public static final TKHSkill noFallDmg = (new TKHSkill(21));
	public static final TKHSkill knockBack = (new TKHSkill(22));
	public static final TKHSkill dropApple = (new TKHSkill(23));
	public static final TKHSkill dropMush = (new TKHSkill(24));
			/** Sismeroan **/
	public static final TKHSkill isSismeroan = (new TKHSkill(38));
	public static final TKHSkill climb = (new TKHSkill(25));
	public static final TKHSkill decFallDmg = (new TKHSkill(26));
	public static final TKHSkill nightvision = (new TKHSkill(27));
	public static final TKHSkill invisibility = (new TKHSkill(29));
	public static final TKHSkill stun = (new TKHSkill(30));
	public static final TKHSkill silkTouch = (new TKHSkill(31));
	public static final TKHSkill dropMelon = (new TKHSkill(32));
	public static final TKHSkill dropPumkin = (new TKHSkill(28));
	
		/** Sworty **/
	public static final TKHSkill TheSworty = (new TKHSkill(34));
		
			/** Negatif **/
	public static final TKHSkill isStun = (new TKHSkill(33));
	
	
	public final int skillID;

	public TKHSkill(int skillID) {
		this.skillID = skillID;
		this.skillTypes[skillID] = this;
	}

	public int getId() {
		return this.skillID;
	}

	public void SkillWalkWater(EntityLiving par1EntityLiving) {
		if (par1EntityLiving.isCollidedHorizontally) {
			par1EntityLiving.motionY = 0.075F;
		} else if (par1EntityLiving.motionY < 0)
			par1EntityLiving.motionY = 0F;
	}	
	
	public void SkillWalkLava(EntityLiving par1EntityLiving) {
		if (par1EntityLiving.isCollidedHorizontally) {
			par1EntityLiving.motionY = 0.075F;
		} else if (par1EntityLiving.motionY < 0)
			par1EntityLiving.motionY = 0F;
	}	
}

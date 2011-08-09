
package Tsukeyithan.Skill;

import net.minecraft.src.EntityLiving;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;

public class TKHSkillEffect {
	/** ID value of the potion this effect matches. */
    private int skillID;

    /** The duration of the potion effect */
    private int duration;

    /** The amplifier of the potion effect */
    private int amplifier;
    
    public TKHSkillEffect(int par1, int par2, int par3)
    {
        this.skillID = par1;
        this.duration = par2;
        this.amplifier = par3;
    }
    
    public TKHSkillEffect(TKHSkillEffect par1SkillEffect)
    {
        this.skillID = par1SkillEffect.skillID;
        this.duration = par1SkillEffect.duration;
        this.amplifier = par1SkillEffect.amplifier;
    }
    
    public boolean onUpdate(EntityLiving par1EntityLiving)
    {    	
        if (this.duration > 0)
        {
            DecrementDuration(); 
            return true;
        }
        else if(this.duration == -1)
            return true;

        return false;
    }
    
    public void combine(TKHSkillEffect par1SkillEffect)
    {
        if (skillID != par1SkillEffect.skillID)
        {
            System.err.println("This method should only be called for matching effects!");
        }

        if (par1SkillEffect.amplifier > amplifier)
        {
            amplifier = par1SkillEffect.amplifier;
            duration = par1SkillEffect.duration;
        }
        else if (par1SkillEffect.amplifier == amplifier && duration < par1SkillEffect.duration)
        {
            duration = par1SkillEffect.duration;
        }
    }
    
    private int DecrementDuration()
    {
        return --this.duration;
    }
    
    public int GetSkillID()
    {
    	return this.skillID;
    }
}

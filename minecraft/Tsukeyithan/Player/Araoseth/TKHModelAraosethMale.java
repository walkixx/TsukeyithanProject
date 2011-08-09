
package Tsukeyithan.Player.Araoseth;

import Tsukeyithan.Manager.TKHModelRenderer;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;

public class TKHModelAraosethMale extends ModelBase
{	
	/**
   * Records whether the model should be rendered holding an item in the left hand, and if that item is a block.
   */
	 public int heldItemLeft;

	 /**
	 * Records whether the model should be rendered holding an item in the right hand, and if that item is a block.
	 */
	 public int heldItemRight;
	 public boolean isSneak;
	 public EntityPlayer entityplayer;
   /** Records whether the model should be rendered aiming a bow. */
	 public boolean aimedBow ;
	 public float locBase;
	 
  //fields
    TKHModelRenderer MASQUE;
    TKHModelRenderer FACE;
    TKHModelRenderer CRANE_HAUT;
    TKHModelRenderer OREILLES;
    TKHModelRenderer CRANE_ARRIERE;
    TKHModelRenderer ARRIERE_MACHOIRE;
    TKHModelRenderer MACHOIRE_INFERIEURE;
    TKHModelRenderer COU1;
    TKHModelRenderer THORAX;
    TKHModelRenderer PECTORAUX;
    TKHModelRenderer ABDOMEN;
    TKHModelRenderer ABDOS;
    TKHModelRenderer BASSIN;
    TKHModelRenderer COU2;
    TKHModelRenderer BRAS_DROIT;
    TKHModelRenderer EPAULE_DROITE;
    TKHModelRenderer COUDE_DROIT;
    TKHModelRenderer POIGNET_DROIT;
    TKHModelRenderer BRAS_GAUCHE;
    TKHModelRenderer COUDE_GAUCHE;
    TKHModelRenderer POIGNET_GAUCHE;
    TKHModelRenderer EPAULE_GAUCHE;
    TKHModelRenderer FEMUR_DROIT;
    TKHModelRenderer GENOU_DROIT;
    TKHModelRenderer TIBIA_DROIT;
    TKHModelRenderer TALON_DROIT;
    TKHModelRenderer DESSUS_PIED_DROIT;
    TKHModelRenderer SEMELLE_DROITE;
    TKHModelRenderer FEMUR_GAUCHE;
    TKHModelRenderer DESSUS_PIED_GAUCHE;
    TKHModelRenderer TALON_GAUCHE;
    TKHModelRenderer SEMELLE_GAUCHE;
    TKHModelRenderer TIBIA_GAUCHE;
    TKHModelRenderer GENOU_GAUCHE;
  
  public TKHModelAraosethMale()
  {
	  textureWidth = 128;
	  textureHeight = 64;
    
    		/***** TETE *****/
      MASQUE = new TKHModelRenderer(this, 98, 38);
      MASQUE.addBox(-3.5F, 0F, 0F, 7, 8, 8);
      MASQUE.setRotationPoint(0F, -11.2F, -4.5F);
      MASQUE.setTextureSize(128, 64);
      MASQUE.mirror = true;
      setRotation(MASQUE, 0F, 0F, 0F);
      
      FACE = new TKHModelRenderer(this, 112, 0);
      FACE.addBox(-3F, -4F, -3F, 6, 4, 2);
      FACE.setRotationPoint(0F, -5F, -1F);
      FACE.setTextureSize(128, 64);
      FACE.mirror = true;
      setPosition(FACE, 0F, 0F, 0.1F);      
      setRotation(FACE, 0F, 0F, 0F);
      
      CRANE_HAUT = new TKHModelRenderer(this, 108, 6);
      CRANE_HAUT.addBox(-4F, -5F, 0F, 6, 5, 4);
      CRANE_HAUT.setRotationPoint(1F, -9F, -4F);
      CRANE_HAUT.setTextureSize(128, 64);
      CRANE_HAUT.mirror = true;
      setRotation(CRANE_HAUT, -1.152537F, 0F, 0F);
      
      OREILLES = new TKHModelRenderer(this, 94, 18);
      OREILLES.addBox(-3.5F, -3F, 0F, 7, 3, 1);
      OREILLES.setRotationPoint(0F, -7F, -2F);
      OREILLES.setTextureSize(128, 64);
      OREILLES.mirror = true;
      setRotation(OREILLES, -0.7807508F, 0F, 0F);
      
      CRANE_ARRIERE = new TKHModelRenderer(this, 110, 24);
      CRANE_ARRIERE.addBox(-4F, -3F, 0F, 5, 4, 4);
      CRANE_ARRIERE.setRotationPoint(1.5F, -10.3F, 1.3F);
      CRANE_ARRIERE.setTextureSize(128, 64);
      CRANE_ARRIERE.mirror = true;
      setRotation(CRANE_ARRIERE, -2.379431F, 0F, 0F);
      
      ARRIERE_MACHOIRE = new TKHModelRenderer(this, 110, 15);
      ARRIERE_MACHOIRE.addBox(-4F, -7F, 0F, 5, 5, 4);
      ARRIERE_MACHOIRE.setRotationPoint(1.5F, -4F, -5F);
      ARRIERE_MACHOIRE.setTextureSize(128, 64);
      ARRIERE_MACHOIRE.mirror = true;
      setRotation(ARRIERE_MACHOIRE, -0.5948578F, 0F, 0F);
      
      MACHOIRE_INFERIEURE = new TKHModelRenderer(this, 116, 32);
      MACHOIRE_INFERIEURE.addBox(-2F, -2F, -2F, 4, 2, 2);
      MACHOIRE_INFERIEURE.setRotationPoint(0F, -4F, -1.3F);
      MACHOIRE_INFERIEURE.setTextureSize(128, 64);
      MACHOIRE_INFERIEURE.mirror = true;
      setRotation(MACHOIRE_INFERIEURE, 0.4089647F, 0F, 0F);
      
      FACE.addChild(CRANE_HAUT);
      setCorrectRotation(FACE, CRANE_HAUT);
      
      FACE.addChild(OREILLES);
      setCorrectRotation(FACE, OREILLES);
      
      FACE.addChild(CRANE_ARRIERE);
      setCorrectRotation(FACE, CRANE_ARRIERE);
      
      FACE.addChild(ARRIERE_MACHOIRE);
      setCorrectRotation(FACE, ARRIERE_MACHOIRE);
      
      FACE.addChild(MACHOIRE_INFERIEURE);
      setCorrectRotation(FACE, MACHOIRE_INFERIEURE);
      
      
      		/***** CORP *****/
      THORAX = new TKHModelRenderer(this, 71, 36);
      THORAX.addBox(-4F, 0F, -2F, 8, 7, 4);
      THORAX.setRotationPoint(0F, -2F, 0F);
      THORAX.setTextureSize(128, 64);
      THORAX.mirror = true;
      setRotation(THORAX, 0F, 0F, 0F);
      
      PECTORAUX = new TKHModelRenderer(this, 49, 57);           
      PECTORAUX.addBox(-4F, 0F, -1F, 8, 6, 1);
      PECTORAUX.setRotationPoint(0F, -1.9F, -1F);
      PECTORAUX.setTextureSize(128, 64);
      PECTORAUX.mirror = true;
      setRotation(PECTORAUX, -0.111544F, 0F, 0F);
      
      ABDOMEN = new TKHModelRenderer(this, 68, 55);
      ABDOMEN.addBox(-3F, -6F, 0F, 6, 6, 3);
      ABDOMEN.setRotationPoint(0F, 10F, -1.5F);
      ABDOMEN.setTextureSize(128, 64);
      ABDOMEN.mirror = true;
      setRotation(ABDOMEN, -0.0371786F, 0F, 0F);
      
      ABDOS = new TKHModelRenderer(this, 86, 55);
      ABDOS.addBox(-2F, 0F, -2F, 4, 6, 3);
      ABDOS.setRotationPoint(0F, 5F, 0.5F);
      ABDOS.setTextureSize(128, 64);
      ABDOS.mirror = true;
      setRotation(ABDOS, -0.074351F, 0F, 0F);
      
      BASSIN = new TKHModelRenderer(this, 70, 47);
      BASSIN.addBox(-4F, 0F, -2.5F, 8, 3, 5);
      BASSIN.setRotationPoint(0F, 9F, 0F);
      BASSIN.setTextureSize(128, 64);
      BASSIN.mirror = true;
      setRotation(BASSIN, -0.0371755F, 0F, 0F);
      
      COU1 = new TKHModelRenderer(this, 54, 45);
      COU1.addBox(-2F, -4F, -2F, 3, 4, 2);
      COU1.setRotationPoint(0.5F, -1F, 1F);
      COU1.setTextureSize(128, 64);
      COU1.mirror = true;
      setRotation(COU1, 0.2230736F, 0F, 0F);
      
      COU2 = new TKHModelRenderer(this, 53, 51);
      COU2.addBox(-2F, -4F, -1F, 4, 4, 2);
      COU2.setRotationPoint(0F, -1F, 1F);
      COU2.setTextureSize(128, 64);
      COU2.mirror = true;
      setRotation(COU2, 0.3717881F, 0F, 0F);
      
      THORAX.addChild(PECTORAUX);
      setCorrectRotation(THORAX, PECTORAUX);
      
      THORAX.addChild(ABDOMEN);
      setCorrectRotation(THORAX, ABDOMEN);
      
      THORAX.addChild(ABDOS);
      setCorrectRotation(THORAX, ABDOS);
      
      THORAX.addChild(BASSIN);
      setCorrectRotation(THORAX, BASSIN);
      
      THORAX.addChild(COU1);
      setCorrectRotation(THORAX, COU1);
      
      THORAX.addChild(COU2);
      setCorrectRotation(THORAX, COU2);
      
      			
      			/***** BRAS DROIT *****/
      BRAS_DROIT = new TKHModelRenderer(this, 78, 0);
      BRAS_DROIT.addBox(-1F, -2F, -2F, 3, 12, 3);
      BRAS_DROIT.setRotationPoint(-6.5F, 2F, 0.5F);
      BRAS_DROIT.setTextureSize(128, 64);
      BRAS_DROIT.mirror = true;
      setRotation(BRAS_DROIT, 0F, 0F, 0F);
      
      EPAULE_DROITE = new TKHModelRenderer(this, 76, 15);
      EPAULE_DROITE.addBox(-3F, -2F, -2F, 4, 4, 4);
      EPAULE_DROITE.setRotationPoint(-5F, 0.6F, 0F);
      EPAULE_DROITE.setTextureSize(128, 64);
      EPAULE_DROITE.mirror = true;
      setRotation(EPAULE_DROITE, 0F, 0F, 0F);
      
      COUDE_DROIT = new TKHModelRenderer(this, 54, 0);
      COUDE_DROIT.addBox(-3F, -2F, -2F, 4, 2, 2);
      COUDE_DROIT.setRotationPoint(-5F, 6.5F, 2F);
      COUDE_DROIT.setTextureSize(128, 64);
      COUDE_DROIT.mirror = true;
      setRotation(COUDE_DROIT, 0F, 0F, 0F);
      
      POIGNET_DROIT = new TKHModelRenderer(this, 76, 23);
      POIGNET_DROIT.addBox(-3F, -2F, -2F, 4, 3, 4);
      POIGNET_DROIT.setRotationPoint(-5F, 10F, 0F);
      POIGNET_DROIT.setTextureSize(128, 64);
      POIGNET_DROIT.mirror = true;
      setRotation(POIGNET_DROIT, 0F, 0F, 0F);
      
      BRAS_DROIT.addChild(COUDE_DROIT);
      setCorrectRotation(BRAS_DROIT, COUDE_DROIT);
      
      BRAS_DROIT.addChild(POIGNET_DROIT);
      setCorrectRotation(BRAS_DROIT, POIGNET_DROIT);
      
      BRAS_DROIT.addChild(EPAULE_DROITE);
      setCorrectRotation(BRAS_DROIT, EPAULE_DROITE);
      
      
      			/***** BRAS GAUCHE *****/
      BRAS_GAUCHE = new TKHModelRenderer(this, 66, 0);
      BRAS_GAUCHE.addBox(-1F, -2F, -2F, 3, 12, 3);
      BRAS_GAUCHE.setRotationPoint(5.5F, 2F, 0.5F);
      BRAS_GAUCHE.setTextureSize(128, 64);
      BRAS_GAUCHE.mirror = true;
      setRotation(BRAS_GAUCHE, 0F, 0F, 0F);
      
      COUDE_GAUCHE = new TKHModelRenderer(this, 54, 4);
      COUDE_GAUCHE.addBox(-3F, -2F, -2F, 4, 2, 2);
      COUDE_GAUCHE.setRotationPoint(7F, 6.5F, 2F);
      COUDE_GAUCHE.setTextureSize(128, 64);
      COUDE_GAUCHE.mirror = true;
      setRotation(COUDE_GAUCHE, 0F, 0F, 0F);
      
      POIGNET_GAUCHE = new TKHModelRenderer(this, 60, 23);
      POIGNET_GAUCHE.addBox(-3F, -2F, -2F, 4, 3, 4);
      POIGNET_GAUCHE.setRotationPoint(7F, 10F, 0F);
      POIGNET_GAUCHE.setTextureSize(128, 64);
      POIGNET_GAUCHE.mirror = true;
      setRotation(POIGNET_GAUCHE, 0F, 0F, 0F);
      
      EPAULE_GAUCHE = new TKHModelRenderer(this, 60, 15);
      EPAULE_GAUCHE.addBox(-3F, -2F, -2F, 4, 4, 4);
      EPAULE_GAUCHE.setRotationPoint(7F, 0.6F, 0F);
      EPAULE_GAUCHE.setTextureSize(128, 64);
      EPAULE_GAUCHE.mirror = true;
      setRotation(EPAULE_GAUCHE, 0F, 0F, 0F);
      
      BRAS_GAUCHE.addChild(COUDE_GAUCHE);
      setCorrectRotation(BRAS_GAUCHE, COUDE_GAUCHE);
      
      BRAS_GAUCHE.addChild(POIGNET_GAUCHE);
      setCorrectRotation(BRAS_GAUCHE, POIGNET_GAUCHE);
      
      BRAS_GAUCHE.addChild(EPAULE_GAUCHE);
      setCorrectRotation(BRAS_GAUCHE, EPAULE_GAUCHE);
      
      
      
      			/***** JAMBE DROITE *****/
      FEMUR_DROIT = new TKHModelRenderer(this, 39, 0);
      FEMUR_DROIT.addBox(-2F, 0F, -2F, 3, 5, 4);
      FEMUR_DROIT.setRotationPoint(-2F, 11F, 0F);
      FEMUR_DROIT.setTextureSize(128, 64);
      FEMUR_DROIT.mirror = true;
      setRotation(FEMUR_DROIT, -0.074351F, 0F, 0F);
      
      GENOU_DROIT = new TKHModelRenderer(this, 39, 9);
      GENOU_DROIT.addBox(-2.5F, 0F, -3.5F, 4, 3, 4);
      GENOU_DROIT.setRotationPoint(-2F, 14.5F, 1F);
      GENOU_DROIT.setTextureSize(128, 64);
      GENOU_DROIT.mirror = true;
      setRotation(GENOU_DROIT, 0.111544F, 0F, 0F);
      
      TIBIA_DROIT = new TKHModelRenderer(this, 39, 16);
      TIBIA_DROIT.addBox(-2F, -1F, -2F, 3, 5, 3);
      TIBIA_DROIT.setRotationPoint(-2F, 18F, 0.7F);
      TIBIA_DROIT.setTextureSize(128, 64);
      TIBIA_DROIT.mirror = true;
      setRotation(TIBIA_DROIT, 0.185895F, 0F, 0F);
      
      TALON_DROIT = new TKHModelRenderer(this, 39, 30);
      TALON_DROIT.addBox(-2.5F, -2F, -2.5F, 4, 3, 2);
      TALON_DROIT.setRotationPoint(-2F, 23F, 3F);
      TALON_DROIT.setTextureSize(128, 64);
      TALON_DROIT.mirror = true;
      setRotation(TALON_DROIT, 0F, 0F, 0F);
      
      DESSUS_PIED_DROIT = new TKHModelRenderer(this, 39, 35);
      DESSUS_PIED_DROIT.addBox(-2.5F, 0F, -2.5F, 4, 2, 4);
      DESSUS_PIED_DROIT.setRotationPoint(-2F, 21F, 0F);
      DESSUS_PIED_DROIT.setTextureSize(128, 64);
      DESSUS_PIED_DROIT.mirror = true;
      setRotation(DESSUS_PIED_DROIT, 0.4461411F, 0F, 0F);
      
      SEMELLE_DROITE = new TKHModelRenderer(this, 39, 24);
      SEMELLE_DROITE.addBox(-2.5F, -2F, -2.5F, 4, 2, 4);
      SEMELLE_DROITE.setRotationPoint(-2F, 24F, 0F);
      SEMELLE_DROITE.setTextureSize(128, 64);
      SEMELLE_DROITE.mirror = true;
      setRotation(SEMELLE_DROITE, 0F, 0F, 0F);
      
      FEMUR_DROIT.addChild(TIBIA_DROIT);
      setCorrectRotation(FEMUR_DROIT, TIBIA_DROIT);
      
      FEMUR_DROIT.addChild(GENOU_DROIT);
      setCorrectRotation(FEMUR_DROIT, GENOU_DROIT);
      
      FEMUR_DROIT.addChild(SEMELLE_DROITE);
      setCorrectRotation(FEMUR_DROIT, SEMELLE_DROITE);
      
      FEMUR_DROIT.addChild(TALON_DROIT);
      setCorrectRotation(FEMUR_DROIT, TALON_DROIT);
      
      FEMUR_DROIT.addChild(DESSUS_PIED_DROIT);
      setCorrectRotation(FEMUR_DROIT, DESSUS_PIED_DROIT);
      		
      
      			/***** JAMBE GAUCHE *****/
      FEMUR_GAUCHE = new TKHModelRenderer(this, 25, 0);
      FEMUR_GAUCHE.addBox(-2F, 0F, -2F, 3, 5, 4);
      FEMUR_GAUCHE.setRotationPoint(3F, 11F, 0F);
      FEMUR_GAUCHE.setTextureSize(128, 64);
      FEMUR_GAUCHE.mirror = true;
      setRotation(FEMUR_GAUCHE, -0.074351F, 0F, 0F);
      
      DESSUS_PIED_GAUCHE = new TKHModelRenderer(this, 23, 35);
      DESSUS_PIED_GAUCHE.addBox(-2.5F, 0F, -2.5F, 4, 2, 4);
      DESSUS_PIED_GAUCHE.setRotationPoint(3F, 21F, 0F);
      DESSUS_PIED_GAUCHE.setTextureSize(128, 64);
      DESSUS_PIED_GAUCHE.mirror = true;
      setRotation(DESSUS_PIED_GAUCHE, 0.4461411F, 0F, 0F);
      
      TALON_GAUCHE = new TKHModelRenderer(this, 27, 30);
      TALON_GAUCHE.addBox(-2.5F, -2F, -2.5F, 4, 3, 2);
      TALON_GAUCHE.setRotationPoint(3F, 23F, 3F);
      TALON_GAUCHE.setTextureSize(128, 64);
      TALON_GAUCHE.mirror = true;
      setRotation(TALON_GAUCHE, 0F, 0F, 0F);
      
      SEMELLE_GAUCHE = new TKHModelRenderer(this, 23, 24);
      SEMELLE_GAUCHE.addBox(-2.5F, -2F, -2.5F, 4, 2, 4);
      SEMELLE_GAUCHE.setRotationPoint(3F, 24F, 0F);
      SEMELLE_GAUCHE.setTextureSize(128, 64);
      SEMELLE_GAUCHE.mirror = true;
      setRotation(SEMELLE_GAUCHE, 0F, 0F, 0F);
      
      TIBIA_GAUCHE = new TKHModelRenderer(this, 27, 16);
      TIBIA_GAUCHE.addBox(-2F, -1F, -2F, 3, 5, 3);
      TIBIA_GAUCHE.setRotationPoint(3F, 18F, 0.7F);
      TIBIA_GAUCHE.setTextureSize(128, 64);
      TIBIA_GAUCHE.mirror = true;
      setRotation(TIBIA_GAUCHE, 0.185895F, 0F, 0F);
      
      GENOU_GAUCHE = new TKHModelRenderer(this, 23, 9);
      GENOU_GAUCHE.addBox(-2.5F, 0F, -3.5F, 4, 3, 4);
      GENOU_GAUCHE.setRotationPoint(3F, 14.5F, 1F);
      GENOU_GAUCHE.setTextureSize(128, 64);
      GENOU_GAUCHE.mirror = true;
      setRotation(GENOU_GAUCHE, 0.111544F, 0F, 0F);
      
      FEMUR_GAUCHE.addChild(TIBIA_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, TIBIA_GAUCHE);
      
      FEMUR_GAUCHE.addChild(GENOU_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, GENOU_GAUCHE);
      
      FEMUR_GAUCHE.addChild(SEMELLE_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, SEMELLE_GAUCHE);
      
      FEMUR_GAUCHE.addChild(TALON_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, TALON_GAUCHE);
      
      FEMUR_GAUCHE.addChild(DESSUS_PIED_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, DESSUS_PIED_GAUCHE);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    
    	/** Tete **/
    //MASQUE.render(f5);
    FACE.render(f5);
    //CRANE_HAUT.render(f5);
    //OREILLES.render(f5);
    //CRANE_ARRIERE.render(f5);
    //ARRIERE_MACHOIRE.render(f5);
    //MACHOIRE_INFERIEURE.render(f5);
    
    	/** Corp **/
    //COU1.render(f5);
    //COU2.render(f5);
    THORAX.render(f5);
    //PECTORAUX.render(f5);
    //ABDOMEN.render(f5);
    //ABDOS.render(f5);
    //BASSIN.render(f5);
    
    	/** Bras Droit **/
    BRAS_DROIT.render(f5);
    //EPAULE_DROITE.render(f5);
    //COUDE_DROIT.render(f5);
    //POIGNET_DROIT.render(f5);
    
    	/** Bras Gauche **/
    BRAS_GAUCHE.render(f5);
    //COUDE_GAUCHE.render(f5);
    //POIGNET_GAUCHE.render(f5);
    //EPAULE_GAUCHE.render(f5);
    
    	/** Jambe Droite **/
    FEMUR_DROIT.render(f5);
    //DESSUS_PIED_DROIT.render(f5);
    //TALON_DROIT.render(f5);
    //SEMELLE_DROITE.render(f5);
    //TIBIA_DROIT.render(f5);
    //GENOU_DROIT.render(f5);
    	
    	/** Jambe Gauche **/
    FEMUR_GAUCHE.render(f5);
    //DESSUS_PIED_GAUCHE.render(f5);
    //TALON_GAUCHE.render(f5);
    //SEMELLE_GAUCHE.render(f5);
    //TIBIA_GAUCHE.render(f5);
    //GENOU_GAUCHE.render(f5);
  }
  
  private void setCorrectRotation(TKHModelRenderer parent, TKHModelRenderer child)
  {
	  child.setRotationPoint(child.rotationPointX-parent.rotationPointX, child.rotationPointY-parent.rotationPointY, child.rotationPointZ-parent.rotationPointZ);
	  setRotation(child, child.rotateAngleX-parent.rotateAngleX, child.rotateAngleY-parent.rotateAngleY, child.rotateAngleZ-parent.rotateAngleZ);
  }
  private void setRotation(TKHModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  private void setPosition(TKHModelRenderer model, float x, float y, float z)
  {
    model.locationX= x;
    model.locationY = y;
    model.locationZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
  {

	  FACE.rotateAngleY = par4 / (180F / (float)Math.PI);
	  FACE.rotateAngleX = par5 / (180F / (float)Math.PI);
	  BRAS_DROIT.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
	  BRAS_GAUCHE.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
	  BRAS_DROIT.rotateAngleZ = BRAS_GAUCHE.rotateAngleZ = 0.0F;
	  
	  FEMUR_DROIT.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	  FEMUR_GAUCHE.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;	  
	  FEMUR_DROIT.rotateAngleY = FEMUR_GAUCHE.rotateAngleY = 0;
	  
	  if (onGround > -9990F)
	  {
	        float f = onGround;
	        THORAX.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f) * (float)Math.PI * 2.0F) * 0.2F;
	        BRAS_DROIT.rotationPointZ = MathHelper.sin(THORAX.rotateAngleY+0.1F) * 5F;
	        BRAS_GAUCHE.rotationPointZ = -MathHelper.sin(THORAX.rotateAngleY-0.1F) * 5F;
	        BRAS_GAUCHE.rotationPointX = MathHelper.cos(THORAX.rotateAngleY) * 5.5F;
	        BRAS_DROIT.rotationPointX = -MathHelper.cos(THORAX.rotateAngleY) * 6.5F;
	        
	        BRAS_DROIT.rotateAngleY = THORAX.rotateAngleY;
	        BRAS_GAUCHE.rotateAngleY = THORAX.rotateAngleY;
	        BRAS_GAUCHE.rotateAngleX += THORAX.rotateAngleY;
	        f = 1.0F - onGround;
	        f *= f;
	        f *= f;
	        f = 1.0F - f;
	        float f2 = MathHelper.sin(f * (float)Math.PI);
	        float f4 = MathHelper.sin(onGround * (float)Math.PI) * -(FACE.rotateAngleX - 0.7F) * 0.75F;
	        BRAS_DROIT.rotateAngleX -= (double)f2 * 1.2D + (double)f4;
	        BRAS_DROIT.rotateAngleY += THORAX.rotateAngleY * 2.0F;
	        BRAS_DROIT.rotateAngleZ = MathHelper.sin(onGround * (float)Math.PI) * -0.4F;
	  }
	  
	  if (isRiding)
	  {
	        BRAS_DROIT.rotateAngleX += -((float)Math.PI / 5F);
	        BRAS_GAUCHE.rotateAngleX += -((float)Math.PI / 5F);
	        FEMUR_DROIT.rotateAngleX = -((float)Math.PI * 2F / 5F);
	        FEMUR_GAUCHE.rotateAngleX = -((float)Math.PI * 2F / 5F);
	        FEMUR_DROIT.rotateAngleY = ((float)Math.PI / 10F);
	        FEMUR_GAUCHE.rotateAngleY = -((float)Math.PI / 10F);
	  }
	  
	  if (heldItemLeft != 0)
	  {
	        BRAS_GAUCHE.rotateAngleX = BRAS_GAUCHE.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)heldItemLeft;
	  }

	  if (heldItemRight != 0)
	  {
	        BRAS_DROIT.rotateAngleX = BRAS_DROIT.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)heldItemRight;
	  }
	  
	  if (isSneak)
	  {     
	  }
	  else
	  {
	  }
	  
	  BRAS_DROIT.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	  BRAS_GAUCHE.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	  BRAS_DROIT.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
	  BRAS_GAUCHE.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
	  
	  if (aimedBow)
	  {
	        float f1 = 0.0F;
	        float f3 = 0.0F;
	        BRAS_DROIT.rotateAngleZ = 0.0F;
	        BRAS_GAUCHE.rotateAngleZ = 0.0F;
	        BRAS_DROIT.rotateAngleY = -(0.1F - f1 * 0.6F) + FACE.rotateAngleY;
	        BRAS_GAUCHE.rotateAngleY = (0.1F - f1 * 0.6F) + FACE.rotateAngleY + 0.4F;
	        BRAS_DROIT.rotateAngleX = -((float)Math.PI / 2F) + FACE.rotateAngleX;
	        BRAS_GAUCHE.rotateAngleX = -((float)Math.PI / 2F) + FACE.rotateAngleX;
	        BRAS_DROIT.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
	        BRAS_GAUCHE.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
	        BRAS_DROIT.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	        BRAS_GAUCHE.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	        BRAS_DROIT.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
	        BRAS_GAUCHE.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
	  }
  }
}

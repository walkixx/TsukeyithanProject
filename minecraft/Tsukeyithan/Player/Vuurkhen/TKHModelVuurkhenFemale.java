
package Tsukeyithan.Player.Vuurkhen;

import Tsukeyithan.Manager.TKHModelRenderer;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;

public class TKHModelVuurkhenFemale extends ModelBase
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
    TKHModelRenderer SOURCIL;
    TKHModelRenderer CRANE_HAUT;
    TKHModelRenderer CRANE_HAUT_ARRIERE;
    TKHModelRenderer CRANE_ARRIERE1;
    TKHModelRenderer ARRIERE_MACHOIRE;
    TKHModelRenderer MACHOIRE_INFERIEURE;
    TKHModelRenderer CRANE_ARRIERE2;
    TKHModelRenderer CRANE_ARRIERE_BAS;
    TKHModelRenderer FACE;
    TKHModelRenderer MACHOIRE_SUP;
    TKHModelRenderer COU_2;
    TKHModelRenderer THORAX;
    TKHModelRenderer PECTORAUX;
    TKHModelRenderer ABDOS_2;
    TKHModelRenderer ABDOS;
    TKHModelRenderer BASSIN;
    TKHModelRenderer COU;
    TKHModelRenderer ABDOMEN;
    TKHModelRenderer SEIN_GAUCHE;
    TKHModelRenderer SEIN_DROIT;
    TKHModelRenderer EPAULE_DROITE;
    TKHModelRenderer COUDE_DROIT;
    TKHModelRenderer POIGNET_DROIT;
    TKHModelRenderer BRAS_DROIT_BAS;
    TKHModelRenderer COUDE_GAUCHE;
    TKHModelRenderer POIGNET_GAUCHE;
    TKHModelRenderer EPAULE_GAUCHE;
    TKHModelRenderer BRAS_DROIT_HAUT;
    TKHModelRenderer BRAS_GAUCHE_BAS;
    TKHModelRenderer BRAS_GAUCHE_HAUT;
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
    TKHModelRenderer Tete;
  
 
    public TKHModelVuurkhenFemale()
    {
  	  textureWidth = 128;
  	  textureHeight = 64;
  	  
  	  	/** HEAD **/      
  	  	CRANE_ARRIERE_BAS = new TKHModelRenderer(this, 110, 52);
  	  	CRANE_ARRIERE_BAS.addBox(-3.5F, -5F, 0F, 7, 5, 2);
      	CRANE_ARRIERE_BAS.setRotationPoint(0F, -12F, -2F);
      	CRANE_ARRIERE_BAS.setTextureSize(128, 64);
      	CRANE_ARRIERE_BAS.mirror = true;
      	setRotation(CRANE_ARRIERE_BAS, -1.412787F, 0F, 0F);
      
        CRANE_HAUT = new TKHModelRenderer(this, 108, 6);
        CRANE_HAUT.addBox(-4F, -5F, 0F, 6, 5, 4);
        CRANE_HAUT.setRotationPoint(1F, -14F, -4F);
        CRANE_HAUT.setTextureSize(128, 64);
        CRANE_HAUT.mirror = true;
        setRotation(CRANE_HAUT, -0.8551081F, 0F, 0F);
        
        CRANE_HAUT_ARRIERE = new TKHModelRenderer(this, 110, 39);
        CRANE_HAUT_ARRIERE.addBox(-3.5F, -5F, 0F, 7, 5, 2);
        CRANE_HAUT_ARRIERE.setRotationPoint(0F, -15F, -2F);
        CRANE_HAUT_ARRIERE.setTextureSize(128, 64);
        CRANE_HAUT_ARRIERE.mirror = true;
        setRotation(CRANE_HAUT_ARRIERE, -1.167718F, 0F, 0F);
        
        CRANE_ARRIERE1 = new TKHModelRenderer(this, 110, 24);
        CRANE_ARRIERE1.addBox(-4F, -1F, -3F, 5, 3, 5);
        CRANE_ARRIERE1.setRotationPoint(1.5F, -14.3F, 1.3F);
        CRANE_ARRIERE1.setTextureSize(128, 64);
        CRANE_ARRIERE1.mirror = true;
        setRotation(CRANE_ARRIERE1, -2.342252F, 0F, 0F);
        
        SOURCIL = new TKHModelRenderer(this, 114, 36);
        SOURCIL.addBox(-3F, -0.5F, 0F, 6, 2, 1);
        SOURCIL.setRotationPoint(0F, -14F, -4F);
        SOURCIL.setTextureSize(128, 64);
        SOURCIL.mirror = true;
        setRotation(SOURCIL, -0.4461433F, 0F, 0F);
        
        ARRIERE_MACHOIRE = new TKHModelRenderer(this, 110, 15);
        ARRIERE_MACHOIRE.addBox(-4F, -7F, 0F, 5, 5, 4);
        ARRIERE_MACHOIRE.setRotationPoint(1.5F, -9F, -5F);
        ARRIERE_MACHOIRE.setTextureSize(128, 64);
        ARRIERE_MACHOIRE.mirror = true;
        setRotation(ARRIERE_MACHOIRE, -0.5948578F, 0F, 0F);
        
        MACHOIRE_INFERIEURE = new TKHModelRenderer(this, 116, 32);
        MACHOIRE_INFERIEURE.addBox(-2F, -2F, -2F, 4, 2, 2);
        MACHOIRE_INFERIEURE.setRotationPoint(0F, -9F, -1.3F);
        MACHOIRE_INFERIEURE.setTextureSize(128, 64);
        MACHOIRE_INFERIEURE.mirror = true;
        setRotation(MACHOIRE_INFERIEURE, 0.4089647F, 0F, 0F);
        
        CRANE_ARRIERE2 = new TKHModelRenderer(this, 110, 46);
        CRANE_ARRIERE2.addBox(-4F, -4F, -2F, 5, 2, 4);
        CRANE_ARRIERE2.setRotationPoint(1.5F, -15.3F, 1.3F);
        CRANE_ARRIERE2.setTextureSize(128, 64);
        CRANE_ARRIERE2.mirror = true;
        setRotation(CRANE_ARRIERE2, -2.714039F, 0F, 0F);
        
        FACE = new TKHModelRenderer(this, 112, 0);
        FACE.addBox(-3F, -4F, -4F, 6, 4, 2);
        FACE.setRotationPoint(0F, -10F, 0F);
        FACE.setTextureSize(128, 64);
        FACE.mirror = true;
        setRotation(FACE, 0F, 0F, 0F);
        
        MACHOIRE_SUP = new TKHModelRenderer(this, 114, 59);
        MACHOIRE_SUP.addBox(-3F, -2F, -2F, 5, 2, 2);
        MACHOIRE_SUP.setRotationPoint(0.5F, -10F, -2F);
        MACHOIRE_SUP.setTextureSize(128, 64);
        MACHOIRE_SUP.mirror = true;
        setRotation(MACHOIRE_SUP, 0.1858931F, 0F, 0F);
        
        FACE.addChild(MACHOIRE_SUP);
        setCorrectRotation(FACE, MACHOIRE_SUP);
        
        FACE.addChild(CRANE_ARRIERE2);
        setCorrectRotation(FACE, CRANE_ARRIERE2);
        
        FACE.addChild(MACHOIRE_INFERIEURE);
        setCorrectRotation(FACE, MACHOIRE_INFERIEURE);
        
        FACE.addChild(ARRIERE_MACHOIRE);
        setCorrectRotation(FACE, ARRIERE_MACHOIRE);
        
        FACE.addChild(SOURCIL);
        setCorrectRotation(FACE, SOURCIL);
        
        FACE.addChild(CRANE_ARRIERE1);
        setCorrectRotation(FACE, CRANE_ARRIERE1);
        
        FACE.addChild(CRANE_HAUT_ARRIERE);
        setCorrectRotation(FACE, CRANE_HAUT_ARRIERE);
        
        FACE.addChild(CRANE_HAUT);        
        setCorrectRotation(FACE, CRANE_HAUT);
        
        FACE.addChild(CRANE_ARRIERE_BAS);
        setCorrectRotation(FACE, CRANE_ARRIERE_BAS);
        
        
        	/** COUP **/
        COU_2 = new TKHModelRenderer(this, 38, 51);
        COU_2.addBox(-2F, -4F, -2F, 3, 4, 2);
        COU_2.setRotationPoint(0.5F, -6F, 1F);
        COU_2.setTextureSize(128, 64);
        COU_2.mirror = true;
        setRotation(COU_2, 0.2230736F, 0F, 0F);
        
        COU = new TKHModelRenderer(this, 37, 57);
        COU.addBox(-2F, -4F, -1F, 4, 5, 2);
        COU.setRotationPoint(0F, -7F, 1F);
        COU.setTextureSize(128, 64);
        COU.mirror = true;
        setRotation(COU, 0.3717881F, 0F, 0F);
        
        
        	/** CORPs **/
        THORAX = new TKHModelRenderer(this, 56, 35);
        THORAX.addBox(-4F, 0F, -2F, 8, 8, 5);
        THORAX.setRotationPoint(0F, -7F, 0F);
        THORAX.setTextureSize(128, 64);
        THORAX.mirror = true;
        setRotation(THORAX, -0.0455438F, 0F, 0F);
        
        PECTORAUX = new TKHModelRenderer(this, 49, 57);
        PECTORAUX.addBox(-4F, 0F, -1F, 8, 6, 1);
        PECTORAUX.setRotationPoint(0F, -6.9F, -1F);
        PECTORAUX.setTextureSize(128, 64);
        PECTORAUX.mirror = true;
        setRotation(PECTORAUX, -0.1487226F, 0F, 0F);
        
        ABDOS_2 = new TKHModelRenderer(this, 58, 48);
        ABDOS_2.addBox(-3F, -6F, -3F, 7, 3, 4);
        ABDOS_2.setRotationPoint(-0.5F, 6F, 1.5F);
        ABDOS_2.setTextureSize(128, 64);
        ABDOS_2.mirror = true;
        setRotation(ABDOS_2, 0.0371786F, 0F, 0F);
        
        ABDOS = new TKHModelRenderer(this, 93, 53);
        ABDOS.addBox(-2F, 0F, -2F, 4, 6, 3);
        ABDOS.setRotationPoint(0F, 1F, 0.5F);
        ABDOS.setTextureSize(128, 64);
        ABDOS.mirror = true;
        setRotation(ABDOS, -0.074351F, 0F, 0F);
        
        BASSIN = new TKHModelRenderer(this, 82, 35);
        BASSIN.addBox(-4F, 0F, -2.5F, 8, 4, 5);
        BASSIN.setRotationPoint(0F, 5F, 0.5F);
        BASSIN.setTextureSize(128, 64);
        BASSIN.mirror = true;
        setRotation(BASSIN, -0.1487113F, 0F, 0F);
        
        ABDOMEN = new TKHModelRenderer(this, 91, 44);
        ABDOMEN.addBox(-3F, -6F, -3F, 6, 6, 3);
        ABDOMEN.setRotationPoint(0F, 6F, 2F);
        ABDOMEN.setTextureSize(128, 64);
        ABDOMEN.mirror = true;
        setRotation(ABDOMEN, 0.0371786F, 0F, 0F);

        SEIN_GAUCHE = new TKHModelRenderer(this, 26, 57);
        SEIN_GAUCHE.addBox(0F, 0F, 0F, 3, 5, 2);
        SEIN_GAUCHE.setRotationPoint(0.1F, -5F, -2F);
        SEIN_GAUCHE.setTextureSize(128, 64);
        SEIN_GAUCHE.mirror = true;
        setRotation(SEIN_GAUCHE, -0.3346075F, 0F, -0.0743572F);
        
        SEIN_DROIT = new TKHModelRenderer(this, 16, 57);
        SEIN_DROIT.addBox(-3.1F, 0F, 0F, 3, 5, 2);
        SEIN_DROIT.setRotationPoint(0F, -5F, -2F);
        SEIN_DROIT.setTextureSize(128, 64);
        SEIN_DROIT.mirror = true;
        setRotation(SEIN_DROIT, -0.3346075F, 0F, 0.074351F);
        
        THORAX.addChild(PECTORAUX);
        setCorrectRotation(THORAX, PECTORAUX);
        
        THORAX.addChild(ABDOS_2);
        setCorrectRotation(THORAX, ABDOS_2);
        
        THORAX.addChild(ABDOS);
        setCorrectRotation(THORAX, ABDOS);
        
        THORAX.addChild(BASSIN);
        setCorrectRotation(THORAX, BASSIN);
        
        THORAX.addChild(ABDOMEN);
        setCorrectRotation(THORAX, ABDOMEN);
        
        THORAX.addChild(COU);
        setCorrectRotation(THORAX, COU);
        
        THORAX.addChild(COU_2);
        setCorrectRotation(THORAX, COU_2);
        
        THORAX.addChild(SEIN_GAUCHE);
        setCorrectRotation(THORAX, SEIN_GAUCHE);
        
        THORAX.addChild(SEIN_DROIT);
        setCorrectRotation(THORAX, SEIN_DROIT);
        
        
        /** BRAT_DROIT **/
        EPAULE_DROITE = new TKHModelRenderer(this, 76, 20);
        EPAULE_DROITE.addBox(-3F, -2F, -2F, 4, 4, 4);
        EPAULE_DROITE.setRotationPoint(-5F, -5.4F, 0F);
        EPAULE_DROITE.setTextureSize(128, 64);
        EPAULE_DROITE.mirror = true;
        setRotation(EPAULE_DROITE, 0F, 0F, 0F);
        
        COUDE_DROIT = new TKHModelRenderer(this, 54, 0);
        COUDE_DROIT.addBox(-3F, -2F, -2F, 4, 2, 2);
        COUDE_DROIT.setRotationPoint(-5F, 1.5F, 2F);
        COUDE_DROIT.setTextureSize(128, 64);
        COUDE_DROIT.mirror = true;
        setRotation(COUDE_DROIT, 0F, 0F, 0F);
        
        POIGNET_DROIT = new TKHModelRenderer(this, 76, 28);
        POIGNET_DROIT.addBox(-3F, -2F, -2F, 4, 3, 4);
        POIGNET_DROIT.setRotationPoint(-5F, 6.5F, 0F);
        POIGNET_DROIT.setTextureSize(128, 64);
        POIGNET_DROIT.mirror = true;
        setRotation(POIGNET_DROIT, 0F, 0F, 0F);
        
        BRAS_DROIT_BAS = new TKHModelRenderer(this, 66, 10);
        BRAS_DROIT_BAS.addBox(-1F, -2F, -2F, 3, 7, 3);
        BRAS_DROIT_BAS.setRotationPoint(-6.5F, 3F, 0.5F);
        BRAS_DROIT_BAS.setTextureSize(128, 64);
        BRAS_DROIT_BAS.mirror = true;
        setRotation(BRAS_DROIT_BAS, -0.0371786F, 0F, 0F);
        
        BRAS_DROIT_HAUT = new TKHModelRenderer(this, 66, 0);
        BRAS_DROIT_HAUT.addBox(-1F, -2F, -2F, 3, 7, 3);
        BRAS_DROIT_HAUT.setRotationPoint(-6.5F, -4F, 0.5F);
        BRAS_DROIT_HAUT.setTextureSize(128, 64);
        BRAS_DROIT_HAUT.mirror = true;
        setRotation(BRAS_DROIT_HAUT, 0F, 0F, 0F);
        
        BRAS_DROIT_HAUT.addChild(EPAULE_DROITE);
        setCorrectRotation(BRAS_DROIT_HAUT, EPAULE_DROITE);
        
        BRAS_DROIT_HAUT.addChild(COUDE_DROIT);
        setCorrectRotation(BRAS_DROIT_HAUT, COUDE_DROIT);
        
        BRAS_DROIT_HAUT.addChild(POIGNET_DROIT);
        setCorrectRotation(BRAS_DROIT_HAUT, POIGNET_DROIT);
        
        BRAS_DROIT_HAUT.addChild(BRAS_DROIT_BAS);
        setCorrectRotation(BRAS_DROIT_HAUT, BRAS_DROIT_BAS);
        
        	/** BRAS_GAUCHE **/        
        BRAS_GAUCHE_HAUT = new TKHModelRenderer(this, 78, 0);
        BRAS_GAUCHE_HAUT.addBox(-1F, -2F, -2F, 3, 7, 3);
        BRAS_GAUCHE_HAUT.setRotationPoint(5.5F, -4F, 0.5F);
        BRAS_GAUCHE_HAUT.setTextureSize(128, 64);
        BRAS_GAUCHE_HAUT.mirror = true;
        setRotation(BRAS_GAUCHE_HAUT, 0F, 0F, 0F);
        
        EPAULE_GAUCHE = new TKHModelRenderer(this, 60, 20);
        EPAULE_GAUCHE.addBox(-3F, -2F, -2F, 4, 4, 4);
        EPAULE_GAUCHE.setRotationPoint(7F, -5.4F, 0F);
        EPAULE_GAUCHE.setTextureSize(128, 64);
        EPAULE_GAUCHE.mirror = true;
        setRotation(EPAULE_GAUCHE, 0F, 0F, 0F);
        
        COUDE_GAUCHE = new TKHModelRenderer(this, 54, 4);
        COUDE_GAUCHE.addBox(-3F, -2F, -2F, 4, 2, 2);
        COUDE_GAUCHE.setRotationPoint(7F, 1.5F, 2F);
        COUDE_GAUCHE.setTextureSize(128, 64);
        COUDE_GAUCHE.mirror = true;
        setRotation(COUDE_GAUCHE, 0F, 0F, 0F);
        
        POIGNET_GAUCHE = new TKHModelRenderer(this, 60, 28);
        POIGNET_GAUCHE.addBox(-3F, -2F, -2F, 4, 3, 4);
        POIGNET_GAUCHE.setRotationPoint(7F, 6.5F, 0F);
        POIGNET_GAUCHE.setTextureSize(128, 64);
        POIGNET_GAUCHE.mirror = true;
        setRotation(POIGNET_GAUCHE, 0F, 0F, 0F);
        
        BRAS_GAUCHE_BAS = new TKHModelRenderer(this, 78, 10);
        BRAS_GAUCHE_BAS.addBox(-1F, -2F, -2F, 3, 7, 3);
        BRAS_GAUCHE_BAS.setRotationPoint(5.5F, 3F, 0.5F);
        BRAS_GAUCHE_BAS.setTextureSize(128, 64);
        BRAS_GAUCHE_BAS.mirror = true;
        setRotation(BRAS_GAUCHE_BAS, -0.0371786F, 0F, 0F);
        
        BRAS_GAUCHE_HAUT.addChild(EPAULE_GAUCHE);
        setCorrectRotation(BRAS_GAUCHE_HAUT, EPAULE_GAUCHE);
        
        BRAS_GAUCHE_HAUT.addChild(COUDE_GAUCHE);
        setCorrectRotation(BRAS_GAUCHE_HAUT, COUDE_GAUCHE);
        
        BRAS_GAUCHE_HAUT.addChild(POIGNET_GAUCHE);
        setCorrectRotation(BRAS_GAUCHE_HAUT, POIGNET_GAUCHE);
        
        BRAS_GAUCHE_HAUT.addChild(BRAS_GAUCHE_BAS);
        setCorrectRotation(BRAS_GAUCHE_HAUT, BRAS_GAUCHE_BAS);
        
        	/** JAMBE_DROIT **/      
        FEMUR_DROIT = new TKHModelRenderer(this, 39, 0);
        FEMUR_DROIT.addBox(-2F, 0F, -2F, 3, 8, 4);
        FEMUR_DROIT.setRotationPoint(-2F, 7.5F, 0F);
        FEMUR_DROIT.setTextureSize(128, 64);
        FEMUR_DROIT.mirror = true;
        setRotation(FEMUR_DROIT, -0.074351F, 0F, 0F);
        
        GENOU_DROIT = new TKHModelRenderer(this, 39, 12);
        GENOU_DROIT.addBox(-2.5F, -2F, -3.5F, 4, 3, 4);
        GENOU_DROIT.setRotationPoint(-2F, 14.5F, 1F);
        GENOU_DROIT.setTextureSize(128, 64);
        GENOU_DROIT.mirror = true;
        setRotation(GENOU_DROIT, 0.111544F, 0F, 0F);
        
        TIBIA_DROIT = new TKHModelRenderer(this, 39, 19);
        TIBIA_DROIT.addBox(-2F, -3F, -2F, 3, 7, 3);
        TIBIA_DROIT.setRotationPoint(-2F, 18F, 0.7F);
        TIBIA_DROIT.setTextureSize(128, 64);
        TIBIA_DROIT.mirror = true;
        setRotation(TIBIA_DROIT, 0.1487195F, 0F, 0F);
        
        TALON_DROIT = new TKHModelRenderer(this, 39, 36);
        TALON_DROIT.addBox(-2.5F, -2F, -2.5F, 4, 3, 2);
        TALON_DROIT.setRotationPoint(-2F, 23F, 3F);
        TALON_DROIT.setTextureSize(128, 64);
        TALON_DROIT.mirror = true;
        setRotation(TALON_DROIT, 0F, 0F, 0F);
        
        DESSUS_PIED_DROIT = new TKHModelRenderer(this, 39, 41);
        DESSUS_PIED_DROIT.addBox(-2.5F, 0F, -2.5F, 4, 2, 4);
        DESSUS_PIED_DROIT.setRotationPoint(-2F, 21F, 0F);
        DESSUS_PIED_DROIT.setTextureSize(128, 64);
        DESSUS_PIED_DROIT.mirror = true;
        setRotation(DESSUS_PIED_DROIT, 0.4461411F, 0F, 0F);
        
        SEMELLE_DROITE = new TKHModelRenderer(this, 37, 29);
        SEMELLE_DROITE.addBox(-2.5F, -2F, -2.5F, 4, 2, 5);
        SEMELLE_DROITE.setRotationPoint(-2F, 24F, -1F);
        SEMELLE_DROITE.setTextureSize(128, 64);
        SEMELLE_DROITE.mirror = true;
        setRotation(SEMELLE_DROITE, 0F, 0F, 0F);
        
        FEMUR_DROIT.addChild(GENOU_DROIT);
        setCorrectRotation(FEMUR_DROIT, GENOU_DROIT);
        
        FEMUR_DROIT.addChild(TIBIA_DROIT);
        setCorrectRotation(FEMUR_DROIT, TIBIA_DROIT);
        
        FEMUR_DROIT.addChild(TALON_DROIT);
        setCorrectRotation(FEMUR_DROIT, TALON_DROIT);
        
        FEMUR_DROIT.addChild(DESSUS_PIED_DROIT);
        setCorrectRotation(FEMUR_DROIT, DESSUS_PIED_DROIT);
        
        FEMUR_DROIT.addChild(SEMELLE_DROITE);
        setCorrectRotation(FEMUR_DROIT, SEMELLE_DROITE);
        
        	/** JAMBE_GAUCHE **/
        FEMUR_GAUCHE = new TKHModelRenderer(this, 25, 0);
        FEMUR_GAUCHE.addBox(-2F, 0F, -2F, 3, 8, 4);
        FEMUR_GAUCHE.setRotationPoint(3F, 7.5F, 0F);
        FEMUR_GAUCHE.setTextureSize(128, 64);
        FEMUR_GAUCHE.mirror = true;
        setRotation(FEMUR_GAUCHE, -0.074351F, 0F, 0F);
        
        DESSUS_PIED_GAUCHE = new TKHModelRenderer(this, 23, 41);
        DESSUS_PIED_GAUCHE.addBox(-2.5F, 0F, -2.5F, 4, 2, 4);
        DESSUS_PIED_GAUCHE.setRotationPoint(3F, 21F, 0F);
        DESSUS_PIED_GAUCHE.setTextureSize(128, 64);
        DESSUS_PIED_GAUCHE.mirror = true;
        setRotation(DESSUS_PIED_GAUCHE, 0.4461411F, 0F, 0F);
        
        TALON_GAUCHE = new TKHModelRenderer(this, 27, 36);
        TALON_GAUCHE.addBox(-2.5F, -2F, -2.5F, 4, 3, 2);
        TALON_GAUCHE.setRotationPoint(3F, 23F, 3F);
        TALON_GAUCHE.setTextureSize(128, 64);
        TALON_GAUCHE.mirror = true;
        setRotation(TALON_GAUCHE, 0F, 0F, 0F);
        
        SEMELLE_GAUCHE = new TKHModelRenderer(this, 19, 29);
        SEMELLE_GAUCHE.addBox(-2.5F, -2F, -2.5F, 4, 2, 5);
        SEMELLE_GAUCHE.setRotationPoint(3F, 24F, -1F);
        SEMELLE_GAUCHE.setTextureSize(128, 64);
        SEMELLE_GAUCHE.mirror = true;
        setRotation(SEMELLE_GAUCHE, 0F, 0F, 0F);
        
        TIBIA_GAUCHE = new TKHModelRenderer(this, 27, 19);
        TIBIA_GAUCHE.addBox(-2F, -3F, -2F, 3, 7, 3);
        TIBIA_GAUCHE.setRotationPoint(3F, 18F, 0.7F);
        TIBIA_GAUCHE.setTextureSize(128, 64);
        TIBIA_GAUCHE.mirror = true;
        setRotation(TIBIA_GAUCHE, 0.1487164F, 0F, 0F);
        
        GENOU_GAUCHE = new TKHModelRenderer(this, 23, 12);
        GENOU_GAUCHE.addBox(-2.5F, -2F, -3.5F, 4, 3, 4);
        GENOU_GAUCHE.setRotationPoint(3F, 14.5F, 1F);
        GENOU_GAUCHE.setTextureSize(128, 64);
        GENOU_GAUCHE.mirror = true;
        setRotation(GENOU_GAUCHE, 0.111544F, 0F, 0F);
        
        FEMUR_GAUCHE.addChild(GENOU_DROIT);
        setCorrectRotation(FEMUR_GAUCHE, GENOU_GAUCHE);
        
        FEMUR_GAUCHE.addChild(TIBIA_DROIT);
        setCorrectRotation(FEMUR_GAUCHE, TIBIA_GAUCHE);
        
        FEMUR_GAUCHE.addChild(TALON_DROIT);
        setCorrectRotation(FEMUR_GAUCHE, TALON_GAUCHE);
        
        FEMUR_GAUCHE.addChild(DESSUS_PIED_DROIT);
        setCorrectRotation(FEMUR_GAUCHE, DESSUS_PIED_GAUCHE);
        
        FEMUR_GAUCHE.addChild(SEMELLE_GAUCHE);
        setCorrectRotation(FEMUR_GAUCHE, SEMELLE_GAUCHE);
    }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    
    	/** TETE **/
    FACE.render(f5);
    //CRANE_ARRIERE_BAS.render(f5);
    //SOURCIL.render(f5);
    //CRANE_HAUT.render(f5);
    //CRANE_HAUT_ARRIERE.render(f5);
    //CRANE_ARRIERE1.render(f5);
    //ARRIERE_MACHOIRE.render(f5);
    //MACHOIRE_INFERIEURE.render(f5);
    //CRANE_ARRIERE2.render(f5);
    //MACHOIRE_SUP.render(f5);
    //COU_2.render(f5);
    //COU.render(f5);
    
    	/** CORP **/
    THORAX.render(f5);
    //PECTORAUX.render(f5);
    //ABDOS_2.render(f5);
    //ABDOS.render(f5);
    //BASSIN.render(f5);
    //ABDOMEN.render(f5);
    
    	/** BRAT DROIT **/
    BRAS_DROIT_HAUT.render(f5);
    //EPAULE_DROITE.render(f5);
    //COUDE_DROIT.render(f5);
    //POIGNET_DROIT.render(f5);
    //BRAS_DROIT_BAS.render(f5);
    
    	/** BRAT GAUCHE **/
    BRAS_GAUCHE_HAUT.render(f5);
    //BRAS_GAUCHE_BAS.render(f5);
    //COUDE_GAUCHE.render(f5);
    //POIGNET_GAUCHE.render(f5);
    //EPAULE_GAUCHE.render(f5);
    
    	/** JAMBE_DROITE **/
    FEMUR_DROIT.render(f5);
    //GENOU_DROIT.render(f5);
    //TIBIA_DROIT.render(f5);
    //TALON_DROIT.render(f5);
    //DESSUS_PIED_DROIT.render(f5);
    //SEMELLE_DROITE.render(f5);
    
    	/** JAMBE_GAUCHE **/
    FEMUR_GAUCHE.render(f5);
    //GENOU_GAUCHE.render(f5);
    //TIBIA_GAUCHE.render(f5);
    //TALON_GAUCHE.render(f5);
    //DESSUS_PIED_GAUCHE.render(f5);
    //SEMELLE_GAUCHE.render(f5);
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
  private void setLocation(TKHModelRenderer model, float x, float y, float z)
  {
    model.locationX = x;
    model.locationY = y;
    model.locationZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
  {
	  FACE.rotateAngleY = par4 / (180F / (float)Math.PI);
	  FACE.rotateAngleX = par5 / (180F / (float)Math.PI);
	  BRAS_DROIT_HAUT.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
	  BRAS_GAUCHE_HAUT.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
	  BRAS_DROIT_HAUT.rotateAngleZ = BRAS_GAUCHE_HAUT.rotateAngleZ = 0.0F;
	  
	  FEMUR_DROIT.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	  FEMUR_GAUCHE.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;	  
	  FEMUR_DROIT.rotateAngleY = FEMUR_GAUCHE.rotateAngleY = 0;
	  
	  if (onGround > -9990F)
	  {
	        float f = onGround;
	        THORAX.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f) * (float)Math.PI * 2.0F) * 0.2F;
	        BRAS_DROIT_HAUT.rotationPointZ = MathHelper.sin(THORAX.rotateAngleY+0.1F) * 5F;
	        BRAS_GAUCHE_HAUT.rotationPointZ = -MathHelper.sin(THORAX.rotateAngleY-0.1F) * 5F;
	        BRAS_GAUCHE_HAUT.rotationPointX = MathHelper.cos(THORAX.rotateAngleY) * 5.5F;
	        BRAS_DROIT_HAUT.rotationPointX = -MathHelper.cos(THORAX.rotateAngleY) * 6.5F;
	        
	        BRAS_DROIT_HAUT.rotateAngleY = THORAX.rotateAngleY;
	        BRAS_GAUCHE_HAUT.rotateAngleY = THORAX.rotateAngleY;
	        BRAS_GAUCHE_HAUT.rotateAngleX += THORAX.rotateAngleY;
	        f = 1.0F - onGround;
	        f *= f;
	        f *= f;
	        f = 1.0F - f;
	        float f2 = MathHelper.sin(f * (float)Math.PI);
	        float f4 = MathHelper.sin(onGround * (float)Math.PI) * -(FACE.rotateAngleX - 0.7F) * 0.75F;
	        BRAS_DROIT_HAUT.rotateAngleX -= (double)f2 * 1.2D + (double)f4;
	        BRAS_DROIT_HAUT.rotateAngleY += THORAX.rotateAngleY * 2.0F;
	        BRAS_DROIT_HAUT.rotateAngleZ = MathHelper.sin(onGround * (float)Math.PI) * -0.4F;
	  }
	  
	  if (isRiding)
	  {
	        BRAS_DROIT_HAUT.rotateAngleX += -((float)Math.PI / 5F);
	        BRAS_GAUCHE_HAUT.rotateAngleX += -((float)Math.PI / 5F);
	        FEMUR_DROIT.rotateAngleX = -((float)Math.PI * 2F / 5F);
	        FEMUR_GAUCHE.rotateAngleX = -((float)Math.PI * 2F / 5F);
	        FEMUR_DROIT.rotateAngleY = ((float)Math.PI / 10F);
	        FEMUR_GAUCHE.rotateAngleY = -((float)Math.PI / 10F);
	  }
	  
	  if (heldItemLeft != 0)
	  {
	        BRAS_GAUCHE_HAUT.rotateAngleX = BRAS_GAUCHE_HAUT.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)heldItemLeft;
	  }

	  if (heldItemRight != 0)
	  {
	        BRAS_DROIT_HAUT.rotateAngleX = BRAS_DROIT_HAUT.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)heldItemRight;
	  }
	  
	  if (isSneak)
	  {     
	  }
	  else
	  {
	  }
	  
	  BRAS_DROIT_HAUT.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	  BRAS_GAUCHE_HAUT.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	  BRAS_DROIT_HAUT.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
	  BRAS_GAUCHE_HAUT.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
	  
	  if (aimedBow)
	  {
	        float f1 = 0.0F;
	        float f3 = 0.0F;
	        BRAS_DROIT_HAUT.rotateAngleZ = 0.0F;
	        BRAS_GAUCHE_HAUT.rotateAngleZ = 0.0F;
	        BRAS_DROIT_HAUT.rotateAngleY = -(0.1F - f1 * 0.6F) + FACE.rotateAngleY;
	        BRAS_GAUCHE_HAUT.rotateAngleY = (0.1F - f1 * 0.6F) + FACE.rotateAngleY + 0.4F;
	        BRAS_DROIT_HAUT.rotateAngleX = -((float)Math.PI / 2F) + FACE.rotateAngleX;
	        BRAS_GAUCHE_HAUT.rotateAngleX = -((float)Math.PI / 2F) + FACE.rotateAngleX;
	        BRAS_DROIT_HAUT.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
	        BRAS_GAUCHE_HAUT.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
	        BRAS_DROIT_HAUT.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	        BRAS_GAUCHE_HAUT.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	        BRAS_DROIT_HAUT.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
	        BRAS_GAUCHE_HAUT.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
	  }
  }
  
}

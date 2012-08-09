
package Tsukeyithan.Player.Sismeroan;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import Tsukeyithan.Manager.TKHModelRenderer;

public class TKHModelSismeroanMale extends ModelBase
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
    TKHModelRenderer MACHOIRE_INFERIEURE;
    TKHModelRenderer CRANE_ARRIERE_BAS1;
    TKHModelRenderer BRANCHE_CENTRALE_TETE;
    TKHModelRenderer COIFFE_1;
    TKHModelRenderer COIFFE_2;
    TKHModelRenderer MACHOIRE_SUP;
    TKHModelRenderer ARRIERE_MACHOIRE;
    TKHModelRenderer OS_CRANE;
    TKHModelRenderer SOURCILS;
    TKHModelRenderer NEZ_BAS;
    TKHModelRenderer ARRETE_NEZ;
    TKHModelRenderer CRANE_ARRIERE_BAS2;
    TKHModelRenderer COU_2;
    TKHModelRenderer TRAPEZE;
    TKHModelRenderer PECTORAUX;
    TKHModelRenderer ABDOS_2;
    TKHModelRenderer ABDOS;
    TKHModelRenderer BASSIN;
    TKHModelRenderer COU;
    TKHModelRenderer ABDOMEN;
    TKHModelRenderer THORAX;
    TKHModelRenderer BRAS_DROIT_HAUT;
    TKHModelRenderer BRAS_GAUCHE_HAUT;
    TKHModelRenderer COUDE_DROIT;
    TKHModelRenderer POIGNET_DROIT;
    TKHModelRenderer COUDE_GAUCHE;
    TKHModelRenderer POIGNET_GAUCHE;
    TKHModelRenderer EPAULE_DROITE;
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
  
  public TKHModelSismeroanMale()
  {
    textureWidth = 128;
    textureHeight = 64;
      
    
    		
    		/** TETE **/
      CRANE_ARRIERE_BAS1 = new TKHModelRenderer(this, 120, 53);
      CRANE_ARRIERE_BAS1.addBox(1.5F, -5F, 0F, 2, 5, 2);
      CRANE_ARRIERE_BAS1.setRotationPoint(0F, -13F, -2F);
      CRANE_ARRIERE_BAS1.setTextureSize(128, 64);
      CRANE_ARRIERE_BAS1.mirror = true;
      setRotation(CRANE_ARRIERE_BAS1, -1.412792F, 0.1487195F, -0.111544F);

      
      CRANE_ARRIERE_BAS2 = new TKHModelRenderer(this, 120, 1);
      CRANE_ARRIERE_BAS2.addBox(-3.5F, -5F, 0F, 2, 5, 2);
      CRANE_ARRIERE_BAS2.setRotationPoint(0F, -13F, -1.5F);
      CRANE_ARRIERE_BAS2.setTextureSize(128, 64);
      CRANE_ARRIERE_BAS2.mirror = true;
      setRotation(CRANE_ARRIERE_BAS2, -1.412787F, -0.1487144F, 0.1115358F);
      
      OS_CRANE = new TKHModelRenderer(this, 110, 28);
      OS_CRANE.addBox(-2.5F, -2F, -2F, 5, 4, 4);
      OS_CRANE.setRotationPoint(-0F, -13F, -1.5F);
      OS_CRANE.setTextureSize(128, 64);
      OS_CRANE.mirror = true;
      setRotation(OS_CRANE, 0.1115358F, 0F, 0F);
      
      BRANCHE_CENTRALE_TETE = new TKHModelRenderer(this, 112, 49);
      BRANCHE_CENTRALE_TETE.addBox(-3F, -7F, -2F, 2, 9, 2);
      BRANCHE_CENTRALE_TETE.setRotationPoint(2F, -13.5F, -2F);
      BRANCHE_CENTRALE_TETE.setTextureSize(128, 64);
      BRANCHE_CENTRALE_TETE.mirror = true;
      setRotation(BRANCHE_CENTRALE_TETE, -0.9736252F, 0F, 0F);   
      
      MACHOIRE_INFERIEURE = new TKHModelRenderer(this, 116, 60);
      MACHOIRE_INFERIEURE.addBox(-2F, -2F, -2F, 4, 2, 2);
      MACHOIRE_INFERIEURE.setRotationPoint(0F, -10F, -0.8F);
      MACHOIRE_INFERIEURE.setTextureSize(128, 64);
      MACHOIRE_INFERIEURE.mirror = true;
      setRotation(MACHOIRE_INFERIEURE, 0.4089647F, 0F, 0F);
      
      MACHOIRE_SUP = new TKHModelRenderer(this, 114, 45);
      MACHOIRE_SUP.addBox(-3F, -2F, -2F, 5, 2, 2);
      MACHOIRE_SUP.setRotationPoint(0.5F, -11F, -1.5F);
      MACHOIRE_SUP.setTextureSize(128, 64);
      MACHOIRE_SUP.mirror = true;
      setRotation(MACHOIRE_SUP, 0.1858931F, 0F, 0F);
      
      ARRIERE_MACHOIRE = new TKHModelRenderer(this, 108, 36);
      ARRIERE_MACHOIRE.addBox(-4F, -7F, 0F, 6, 5, 4);
      ARRIERE_MACHOIRE.setRotationPoint(1F, -10F, -4.5F);
      ARRIERE_MACHOIRE.setTextureSize(128, 64);
      ARRIERE_MACHOIRE.mirror = true;
      setRotation(ARRIERE_MACHOIRE, -0.5948578F, 0F, 0F); 
      
      COIFFE_1 = new TKHModelRenderer(this, 0, 49);
      COIFFE_1.addBox(-4F, 0F, 0F, 8, 6, 9);
      COIFFE_1.setRotationPoint(0F, -15F, -4.5F);
      COIFFE_1.setTextureSize(128, 64);
      COIFFE_1.mirror = true;
      setRotation(COIFFE_1, 0.5205006F, 0F, 0F);
      
      COIFFE_2 = new TKHModelRenderer(this, 0, 30);
      COIFFE_2.addBox(-4F, 0F, 0F, 9, 8, 11);
      COIFFE_2.setRotationPoint(-0.5F, -17F, -3.5F);
      COIFFE_2.setTextureSize(128, 64);
      COIFFE_2.mirror = true;
      setRotation(COIFFE_2, 0.3346075F, 0F, 0F);
      
      SOURCILS = new TKHModelRenderer(this, 114, 18);
      SOURCILS.addBox(-3F, -6F, -2F, 5, 8, 2);
      SOURCILS.setRotationPoint(0.5F, -13.5F, -2.5F);
      SOURCILS.setTextureSize(128, 64);
      SOURCILS.mirror = true;
      setRotation(SOURCILS, -1.38259F, 0F, 0F);
      
      NEZ_BAS = new TKHModelRenderer(this, 116, 14);
      NEZ_BAS.addBox(-3F, 0F, -2F, 4, 2, 2);
      NEZ_BAS.setRotationPoint(1F, -12.5F, -2F);
      NEZ_BAS.setTextureSize(128, 64);
      NEZ_BAS.mirror = true;
      setRotation(NEZ_BAS, 0.1045545F, 0F, 0F);
      
      ARRETE_NEZ = new TKHModelRenderer(this, 120, 8);
      ARRETE_NEZ.addBox(-3F, -2F, -2F, 2, 4, 2);
      ARRETE_NEZ.setRotationPoint(2F, -12.5F, -2F);
      ARRETE_NEZ.setTextureSize(128, 64);
      ARRETE_NEZ.mirror = true;
      setRotation(ARRETE_NEZ, 0.1045545F, 0F, 0F);
      
      OS_CRANE.addChild(CRANE_ARRIERE_BAS1);
      setCorrectRotation(OS_CRANE, CRANE_ARRIERE_BAS1);
      
      OS_CRANE.addChild(CRANE_ARRIERE_BAS2);
      setCorrectRotation(OS_CRANE, CRANE_ARRIERE_BAS2);
      
      OS_CRANE.addChild(BRANCHE_CENTRALE_TETE);
      setCorrectRotation(OS_CRANE, BRANCHE_CENTRALE_TETE);
      
      OS_CRANE.addChild(MACHOIRE_INFERIEURE);
      setCorrectRotation(OS_CRANE, MACHOIRE_INFERIEURE);
      
      OS_CRANE.addChild(MACHOIRE_SUP);
      setCorrectRotation(OS_CRANE, MACHOIRE_SUP);
      
      OS_CRANE.addChild(ARRIERE_MACHOIRE);
      setCorrectRotation(OS_CRANE, ARRIERE_MACHOIRE);
      
      OS_CRANE.addChild(SOURCILS);
      setCorrectRotation(OS_CRANE, SOURCILS);
      
      OS_CRANE.addChild(NEZ_BAS);
      setCorrectRotation(OS_CRANE, NEZ_BAS);
      
      OS_CRANE.addChild(ARRETE_NEZ);
      setCorrectRotation(OS_CRANE, ARRETE_NEZ);
      
      
      		/** CORP **/
      COU = new TKHModelRenderer(this, 85, 5);
      COU.addBox(-2F, -4F, -1F, 4, 5, 2);
      COU.setRotationPoint(0F, -8F, 1F);
      COU.setTextureSize(128, 64);
      COU.mirror = true;
      setRotation(COU, 0.3717881F, 0F, 0F);
      
      COU_2 = new TKHModelRenderer(this, 101, 58);
      COU_2.addBox(-2F, -4F, -2F, 3, 4, 2);
      COU_2.setRotationPoint(0.5F, -7F, 1F);
      COU_2.setTextureSize(128, 64);
      COU_2.mirror = true;
      setRotation(COU_2, 0.2230736F, 0F, 0F);
      
      TRAPEZE = new TKHModelRenderer(this, 77, 58);
      TRAPEZE.addBox(-4F, 0F, -2F, 8, 2, 4);
      TRAPEZE.setRotationPoint(0F, -8.5F, 0.5F);
      TRAPEZE.setTextureSize(128, 64);
      TRAPEZE.mirror = true;
      setRotation(TRAPEZE, 0.1487695F, 0F, 0F);

      THORAX = new TKHModelRenderer(this, 73, 30);
      THORAX.addBox(-4F, 0F, -2F, 12, 7, 5);
      THORAX.setRotationPoint(-2F, -8F, 0F);
      THORAX.setTextureSize(128, 64);
      THORAX.mirror = true;
      setRotation(THORAX, -0.0455438F, 0F, 0F);
      
      PECTORAUX = new TKHModelRenderer(this, 97, 5);
      PECTORAUX.addBox(-4F, 0F, -1F, 10, 6, 1);
      PECTORAUX.setRotationPoint(-1F, -6.9F, -1F);
      PECTORAUX.setTextureSize(128, 64);
      PECTORAUX.mirror = true;
      setRotation(PECTORAUX, -0.1487226F, 0F, 0F);
      
      ABDOMEN = new TKHModelRenderer(this, 93, 12);
      ABDOMEN.addBox(-3F, -6F, -3F, 7, 6, 3);
      ABDOMEN.setRotationPoint(-0.5F, 6F, 2F);
      ABDOMEN.setTextureSize(128, 64);
      ABDOMEN.mirror = true;
      setRotation(ABDOMEN, -0.0371786F, 0F, 0F);
      
      ABDOS_2 = new TKHModelRenderer(this, 85, 51);
      ABDOS_2.addBox(-3F, -6F, -3F, 9, 3, 4);
      ABDOS_2.setRotationPoint(-1.5F, 4F, 1.5F);
      ABDOS_2.setTextureSize(128, 64);
      ABDOS_2.mirror = true;
      setRotation(ABDOS_2, 0.0371786F, 0F, 0F);
      
      ABDOS = new TKHModelRenderer(this, 93, 21);
      ABDOS.addBox(-2F, 0F, -2F, 5, 6, 3);
      ABDOS.setRotationPoint(-0.5F, 0F, 0.6F);
      ABDOS.setTextureSize(128, 64);
      ABDOS.mirror = true;
      setRotation(ABDOS, -0.074351F, 0F, 0F);
      
      BASSIN = new TKHModelRenderer(this, 79, 42);
      BASSIN.addBox(-4F, -1F, -2.5F, 9, 4, 5);
      BASSIN.setRotationPoint(-0.5F, 6F, 0.5F);
      BASSIN.setTextureSize(128, 64);
      BASSIN.mirror = true;
      setRotation(BASSIN, -0.1487113F, 0F, 0F);
      
      THORAX.addChild(COU);
      setCorrectRotation(THORAX, COU);
      
      THORAX.addChild(COU_2);
      setCorrectRotation(THORAX, COU_2);
      
      THORAX.addChild(TRAPEZE);
      setCorrectRotation(THORAX, TRAPEZE);
      
      THORAX.addChild(PECTORAUX);
      setCorrectRotation(THORAX, PECTORAUX);
      
      THORAX.addChild(ABDOMEN);
      setCorrectRotation(THORAX, ABDOMEN);
      
      THORAX.addChild(ABDOS_2);
      setCorrectRotation(THORAX, ABDOS_2);
      
      THORAX.addChild(ABDOS);
      setCorrectRotation(THORAX, ABDOS);
      
      THORAX.addChild(BASSIN);
      setCorrectRotation(THORAX, BASSIN);
      
      
      		/** BRAS DROIT **/
      EPAULE_DROITE = new TKHModelRenderer(this, 57, 44);
      EPAULE_DROITE.addBox(-3F, -2F, -2F, 5, 5, 5);
      EPAULE_DROITE.setRotationPoint(-7F, -5.4F, 0F);
      EPAULE_DROITE.setTextureSize(128, 64);
      EPAULE_DROITE.mirror = true;
      setRotation(EPAULE_DROITE, 0F, 0F, 0F);
      
      BRAS_DROIT_HAUT = new TKHModelRenderer(this, 72, 0);
      BRAS_DROIT_HAUT.addBox(-1F, -2F, -2F, 3, 14, 3);
      BRAS_DROIT_HAUT.setRotationPoint(-8.5F, -4F, 1F);
      BRAS_DROIT_HAUT.setTextureSize(128, 64);
      BRAS_DROIT_HAUT.mirror = true;
      setRotation(BRAS_DROIT_HAUT, 0F, 0F, 0F);
      
      COUDE_DROIT = new TKHModelRenderer(this, 72, 17);
      COUDE_DROIT.addBox(-3F, -2F, -2F, 4, 2, 2);
      COUDE_DROIT.setRotationPoint(-7F, 1.5F, 3F);
      COUDE_DROIT.setTextureSize(128, 64);
      COUDE_DROIT.mirror = true;
      setRotation(COUDE_DROIT, 0F, 0F, 0F);
      
      POIGNET_DROIT = new TKHModelRenderer(this, 76, 23);
      POIGNET_DROIT.addBox(-3F, -2F, -2F, 4, 3, 4);
      POIGNET_DROIT.setRotationPoint(-7F, 6.5F, 0.5F);
      POIGNET_DROIT.setTextureSize(128, 64);
      POIGNET_DROIT.mirror = true;
      setRotation(POIGNET_DROIT, 0F, 0F, 0F);
      
      EPAULE_DROITE.addChild(BRAS_DROIT_HAUT);
      setCorrectRotation(EPAULE_DROITE, BRAS_DROIT_HAUT);
      
      EPAULE_DROITE.addChild(COUDE_DROIT);
      setCorrectRotation(EPAULE_DROITE, COUDE_DROIT);
      
      EPAULE_DROITE.addChild(POIGNET_DROIT);
      setCorrectRotation(EPAULE_DROITE, POIGNET_DROIT);
      
      
      		/** BRAS GAUCHE **/      
      EPAULE_GAUCHE = new TKHModelRenderer(this, 57, 54);
      EPAULE_GAUCHE.addBox(-3F, -2F, -2F, 5, 5, 5);
      EPAULE_GAUCHE.setRotationPoint(8F, -5.4F, 0F);
      EPAULE_GAUCHE.setTextureSize(128, 64);
      EPAULE_GAUCHE.mirror = true;
      setRotation(EPAULE_GAUCHE, 0F, 0F, 0F);
      
      BRAS_GAUCHE_HAUT = new TKHModelRenderer(this, 60, 0);
      BRAS_GAUCHE_HAUT.addBox(-1F, -2F, -2F, 3, 14, 3);
      BRAS_GAUCHE_HAUT.setRotationPoint(7.5F, -4F, 0.5F);
      BRAS_GAUCHE_HAUT.setTextureSize(128, 64);
      BRAS_GAUCHE_HAUT.mirror = true;
      setRotation(BRAS_GAUCHE_HAUT, 0F, 0F, 0F);
      
      COUDE_GAUCHE = new TKHModelRenderer(this, 60, 17);
      COUDE_GAUCHE.addBox(-3F, -2F, -2F, 4, 2, 2);
      COUDE_GAUCHE.setRotationPoint(9F, 1.5F, 2F);
      COUDE_GAUCHE.setTextureSize(128, 64);
      COUDE_GAUCHE.mirror = true;
      setRotation(COUDE_GAUCHE, 0F, 0F, 0F);
      
      POIGNET_GAUCHE = new TKHModelRenderer(this, 60, 23);
      POIGNET_GAUCHE.addBox(-3F, -2F, -2F, 4, 3, 4);
      POIGNET_GAUCHE.setRotationPoint(9F, 6.5F, 0F);
      POIGNET_GAUCHE.setTextureSize(128, 64);
      POIGNET_GAUCHE.mirror = true;
      setRotation(POIGNET_GAUCHE, 0F, 0F, 0F);
      
      EPAULE_GAUCHE.addChild(BRAS_GAUCHE_HAUT);
      setCorrectRotation(EPAULE_GAUCHE, BRAS_GAUCHE_HAUT);
      
      EPAULE_GAUCHE.addChild(COUDE_GAUCHE);
      setCorrectRotation(EPAULE_GAUCHE, COUDE_GAUCHE);
      
      EPAULE_GAUCHE.addChild(POIGNET_GAUCHE);
      setCorrectRotation(EPAULE_GAUCHE, POIGNET_GAUCHE);
      
      
      		/** JAMBE DROITE **/ 
      FEMUR_DROIT = new TKHModelRenderer(this, 45, 0);
      FEMUR_DROIT.addBox(-2F, -4F, -2F, 3, 9, 4);
      FEMUR_DROIT.setRotationPoint(-3F, 10F, 0F);
      FEMUR_DROIT.setTextureSize(128, 64);
      FEMUR_DROIT.mirror = true;
      setRotation(FEMUR_DROIT, -0.074351F, 0F, 0F);
      
      GENOU_DROIT = new TKHModelRenderer(this, 43, 13);
      GENOU_DROIT.addBox(-2.5F, -2F, -3.5F, 4, 3, 4);
      GENOU_DROIT.setRotationPoint(-3F, 15F, 1F);
      GENOU_DROIT.setTextureSize(128, 64);
      GENOU_DROIT.mirror = true;
      setRotation(GENOU_DROIT, 0.0743103F, 0F, 0F);
      
      TIBIA_DROIT = new TKHModelRenderer(this, 47, 20);
      TIBIA_DROIT.addBox(-2F, -3F, -2F, 3, 7, 3);
      TIBIA_DROIT.setRotationPoint(-3F, 18F, 0.7F);
      TIBIA_DROIT.setTextureSize(128, 64);
      TIBIA_DROIT.mirror = true;
      setRotation(TIBIA_DROIT, 0.1487195F, 0F, 0F);
      
      TALON_DROIT = new TKHModelRenderer(this, 18, 0);
      TALON_DROIT.addBox(-2.5F, -2F, -2.5F, 4, 3, 2);
      TALON_DROIT.setRotationPoint(-3F, 23F, 3F);
      TALON_DROIT.setTextureSize(128, 64);
      TALON_DROIT.mirror = true;
      setRotation(TALON_DROIT, 0F, 0F, 0F);
      
      DESSUS_PIED_DROIT = new TKHModelRenderer(this, 9, 5);
      DESSUS_PIED_DROIT.addBox(-3.5F, 0F, -2.5F, 4, 2, 4);
      DESSUS_PIED_DROIT.setRotationPoint(-2F, 21F, 0F);
      DESSUS_PIED_DROIT.setTextureSize(128, 64);
      DESSUS_PIED_DROIT.mirror = true;
      setRotation(DESSUS_PIED_DROIT, 0.4461411F, 0F, 0F);
      
      SEMELLE_DROITE = new TKHModelRenderer(this, 55, 30);
      SEMELLE_DROITE.addBox(-2.5F, -2F, -2.5F, 4, 2, 5);
      SEMELLE_DROITE.setRotationPoint(-3F, 24F, -1F);
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
      
      		/** JAMBE GAUCHE **/ 
      FEMUR_GAUCHE = new TKHModelRenderer(this, 31, 0);
      FEMUR_GAUCHE.addBox(-2F, -3F, -2F, 3, 9, 4);
      FEMUR_GAUCHE.setRotationPoint(4F, 9F, 0F);
      FEMUR_GAUCHE.setTextureSize(128, 64);
      FEMUR_GAUCHE.mirror = true;
      setRotation(FEMUR_GAUCHE, -0.074351F, 0F, 0F);
      
      GENOU_GAUCHE = new TKHModelRenderer(this, 27, 13);
      GENOU_GAUCHE.addBox(-2.5F, -2F, -3.5F, 4, 3, 4);
      GENOU_GAUCHE.setRotationPoint(4F, 15F, 1F);
      GENOU_GAUCHE.setTextureSize(128, 64);
      GENOU_GAUCHE.mirror = true;
      setRotation(GENOU_GAUCHE, 0.0743161F, 0F, 0F);
      
      TIBIA_GAUCHE = new TKHModelRenderer(this, 35, 20);
      TIBIA_GAUCHE.addBox(-1F, -3F, -2F, 3, 7, 3);
      TIBIA_GAUCHE.setRotationPoint(3F, 18F, 0.7F);
      TIBIA_GAUCHE.setTextureSize(128, 64);
      TIBIA_GAUCHE.mirror = true;
      setRotation(TIBIA_GAUCHE, 0.1487164F, 0F, 0F);
      
      TALON_GAUCHE = new TKHModelRenderer(this, 6, 0);
      TALON_GAUCHE.addBox(-2.5F, -2F, -2.5F, 4, 3, 2);
      TALON_GAUCHE.setRotationPoint(4F, 23F, 3F);
      TALON_GAUCHE.setTextureSize(128, 64);
      TALON_GAUCHE.mirror = true;
      setRotation(TALON_GAUCHE, 0F, 0F, 0F);
      
      DESSUS_PIED_GAUCHE= new TKHModelRenderer(this, 55, 37);
      DESSUS_PIED_GAUCHE = new TKHModelRenderer(this, 9, 11);
      DESSUS_PIED_GAUCHE.addBox(-1.5F, 0F, -2.5F, 4, 2, 4);
      DESSUS_PIED_GAUCHE.setRotationPoint(3F, 21F, 0F);
      DESSUS_PIED_GAUCHE.setTextureSize(128, 64);
      DESSUS_PIED_GAUCHE.mirror = true;
      setRotation(DESSUS_PIED_GAUCHE, 0.4461411F, 0F, 0F);

      
      SEMELLE_GAUCHE= new TKHModelRenderer(this, 55, 37);
      SEMELLE_GAUCHE.addBox(-2.5F, -1F, -2.5F, 4, 2, 5);
      SEMELLE_GAUCHE.setRotationPoint(4F, 23F, -1F);
      SEMELLE_GAUCHE.setTextureSize(128, 64);
      SEMELLE_GAUCHE.mirror = true;
      setRotation(SEMELLE_GAUCHE, 0F, 0F, 0F);
      
      FEMUR_GAUCHE.addChild(GENOU_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, GENOU_GAUCHE);
      
      FEMUR_GAUCHE.addChild(TIBIA_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, TIBIA_GAUCHE);
      
      FEMUR_GAUCHE.addChild(TALON_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, TALON_GAUCHE);
      
      FEMUR_GAUCHE.addChild(DESSUS_PIED_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, DESSUS_PIED_GAUCHE);
      
      FEMUR_GAUCHE.addChild(SEMELLE_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, SEMELLE_GAUCHE);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    
    	/** TETE **/
    //CRANE_ARRIERE_BAS1.render(f5);
    //CRANE_ARRIERE_BAS2.render(f5);
    OS_CRANE.render(f5);
    //BRANCHE_CENTRALE_TETE.render(f5);
    //MACHOIRE_INFERIEURE.render(f5);
    //MACHOIRE_SUP.render(f5);
    //ARRIERE_MACHOIRE.render(f5);
    //COIFFE_1.render(f5);
    //COIFFE_2.render(f5);
    //SOURCILS.render(f5);
    //NEZ_BAS.render(f5);
    //ARRETE_NEZ.render(f5);
    
    	/** CORP **/
    //COU.render(f5);
    //COU_2.render(f5);
    //TRAPEZE.render(f5);
    THORAX.render(f5);
    //PECTORAUX.render(f5);
    //ABDOMEN.render(f5);
    //ABDOS_2.render(f5);
    //ABDOS.render(f5);
    //BASSIN.render(f5);
    
    	/** BRAS DROITE **/
    EPAULE_DROITE.render(f5);
    //COUDE_DROIT.render(f5);
    //EPAULE_DROITE.render(f5);
    //POIGNET_DROIT.render(f5);
    	/** BRAS GAUCHE **/
    EPAULE_GAUCHE.render(f5);
    //COUDE_GAUCHE.render(f5);
    //EPAULE_GAUCHE.render(f5);
    //POIGNET_GAUCHE.render(f5);
    
    	/** JAMBE DROITE **/    
    FEMUR_DROIT.render(f5);
    //GENOU_DROIT.render(f5);
    //TIBIA_DROIT.render(f5);
    //TALON_DROIT.render(f5);
    //DESSUS_PIED_DROIT.render(f5);
    //SEMELLE_DROITE.render(f5);
    	/** JAMBE GAUCHE **/
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
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
  {
	  OS_CRANE.rotateAngleY = par4 / (180F / (float)Math.PI);
	  OS_CRANE.rotateAngleX = par5 / (180F / (float)Math.PI);
	  EPAULE_DROITE.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
	  EPAULE_GAUCHE.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
	  EPAULE_DROITE.rotateAngleZ = EPAULE_GAUCHE.rotateAngleZ = 0.0F;
	  
	  FEMUR_DROIT.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	  FEMUR_GAUCHE.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;	  
	  FEMUR_DROIT.rotateAngleY = FEMUR_GAUCHE.rotateAngleY = 0;
	  //FIXME Bras
	  if (onGround > -9990F)
	  {
	        float f = onGround;
	        THORAX.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f) * (float)Math.PI * 2.0F) * 0.2F;
	        EPAULE_DROITE.rotationPointZ = MathHelper.sin(THORAX.rotateAngleY+0.1F) * 1.5F;
	        EPAULE_GAUCHE.rotationPointZ = -MathHelper.sin(THORAX.rotateAngleY-0.1F) * 1.5F;
	        EPAULE_GAUCHE.rotationPointX = MathHelper.cos(THORAX.rotateAngleY) * 7.8F;
	        EPAULE_DROITE.rotationPointX = -MathHelper.cos(THORAX.rotateAngleY) * 6.8F;
	        
	        EPAULE_DROITE.rotateAngleY = THORAX.rotateAngleY;
	        EPAULE_GAUCHE.rotateAngleY = THORAX.rotateAngleY;
	        EPAULE_GAUCHE.rotateAngleX += THORAX.rotateAngleY;
	        f = 1.0F - onGround;
	        f *= f;
	        f *= f;
	        f = 1.0F - f;
	        float f2 = MathHelper.sin(f * (float)Math.PI);
	        float f4 = MathHelper.sin(onGround * (float)Math.PI) * -(OS_CRANE.rotateAngleX - 0.7F) * 0.75F;
	        EPAULE_DROITE.rotateAngleX -= (double)f2 * 1.2D + (double)f4;
	        EPAULE_DROITE.rotateAngleY += THORAX.rotateAngleY * 2.0F;
	        EPAULE_DROITE.rotateAngleZ = MathHelper.sin(onGround * (float)Math.PI) * -0.4F;
	  }
	  
	  if (isRiding)
	  {
	        EPAULE_DROITE.rotateAngleX += -((float)Math.PI / 5F);
	        EPAULE_GAUCHE.rotateAngleX += -((float)Math.PI / 5F);
	        FEMUR_DROIT.rotateAngleX = -((float)Math.PI * 2F / 5F);
	        FEMUR_GAUCHE.rotateAngleX = -((float)Math.PI * 2F / 5F);
	        FEMUR_DROIT.rotateAngleY = ((float)Math.PI / 10F);
	        FEMUR_GAUCHE.rotateAngleY = -((float)Math.PI / 10F);
	  }
	  
	  if (heldItemLeft != 0)
	  {
	        EPAULE_GAUCHE.rotateAngleX = EPAULE_GAUCHE.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)heldItemLeft;
	  }

	  if (heldItemRight != 0)
	  {
	        EPAULE_DROITE.rotateAngleX = EPAULE_DROITE.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)heldItemRight;
	  }
	  
	  if (isSneak)
	  {     
	  }
	  else
	  {
	  }
	  
	  //EPAULE_DROITE.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	  //EPAULE_GAUCHE.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	  //EPAULE_DROITE.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
	  //EPAULE_GAUCHE.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
	  
	  if (aimedBow)
	  {
	        float f1 = 0.0F;
	        float f3 = 0.0F;
	        EPAULE_DROITE.rotateAngleZ = 0.0F;
	        EPAULE_GAUCHE.rotateAngleZ = 0.0F;
	        EPAULE_DROITE.rotateAngleY = -(0.1F - f1 * 0.6F) + OS_CRANE.rotateAngleY;
	        EPAULE_GAUCHE.rotateAngleY = (0.1F - f1 * 0.6F) + OS_CRANE.rotateAngleY + 0.4F;
	        EPAULE_DROITE.rotateAngleX = -((float)Math.PI / 2F) + OS_CRANE.rotateAngleX;
	        EPAULE_GAUCHE.rotateAngleX = -((float)Math.PI / 2F) + OS_CRANE.rotateAngleX;
	        EPAULE_DROITE.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
	        EPAULE_GAUCHE.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
	        EPAULE_DROITE.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	        EPAULE_GAUCHE.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
	        EPAULE_DROITE.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
	        EPAULE_GAUCHE.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
	  }
  }
}

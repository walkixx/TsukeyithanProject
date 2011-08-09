package Tsukeyithan.Player.Neerian;

import Tsukeyithan.Manager.TKHModelRenderer;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;

public class TKHModelNeerianMale extends ModelBase
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
	public TKHModelRenderer VISAGE;
	public TKHModelRenderer CRANE_AVANT;
	public TKHModelRenderer CRANE_MILIEU;
	public TKHModelRenderer CRANE_ARRIERE;
	public TKHModelRenderer MACHOIRE_HAUTE;
	public TKHModelRenderer MACHOIRE_BASSE;
	public TKHModelRenderer ARRETE_NEZ;
	public TKHModelRenderer SOURCIL_DROIT;
	public TKHModelRenderer SOURCIL_GAUCHE;
	public TKHModelRenderer COU;
	public TKHModelRenderer THORAX;
	public TKHModelRenderer PECTORAUX;
	public TKHModelRenderer ABDOMEN;
	public TKHModelRenderer ABDOS;
	public TKHModelRenderer BASSIN;
	public TKHModelRenderer EPINE_1;
	public TKHModelRenderer EPINE_2;
	public TKHModelRenderer EPINE_3;
	public TKHModelRenderer EPINE_4;
	public TKHModelRenderer BRAS_DROIT;
	public TKHModelRenderer EPAULE_DROITE;
	public TKHModelRenderer COUDE_DROIT;
	public TKHModelRenderer POIGNET_DROIT;
	public TKHModelRenderer BRAS_GAUCHE;
	public TKHModelRenderer COUDE_GAUCHE;
	public TKHModelRenderer POIGNET_GAUCHE;
	public TKHModelRenderer EPAULE_GAUCHE;
	public TKHModelRenderer FEMUR_DROIT;
	public TKHModelRenderer GENOU_DROIT;
	public TKHModelRenderer TIBIA_DROIT;
	public TKHModelRenderer TALON_DROIT;
	public TKHModelRenderer DESSUS_PIED_DROIT;
	public TKHModelRenderer SEMELLE_DROITE;
	public TKHModelRenderer FEMUR_GAUCHE;
	public TKHModelRenderer DESSUS_PIED_GAUCHE;
	public TKHModelRenderer TALON_GAUCHE;
	public TKHModelRenderer SEMELLE_GAUCHE;
	public TKHModelRenderer TIBIA_GAUCHE;
	public TKHModelRenderer GENOU_GAUCHE;
  
  public TKHModelNeerianMale()
  {
	  textureWidth = 128;
	  textureHeight = 64;
	  heldItemLeft = 0;
	  heldItemRight = 0;
	  isSneak = false;
	  aimedBow = false;   
      
	  /** Corp **/      
      THORAX = new TKHModelRenderer(this, 64, 31);
      THORAX.addBox(-4F, 0F, -2F, 8, 6, 4);
      THORAX.setRotationPoint(0F, 0F, 0F);
      THORAX.setTextureSize(128, 64);
      THORAX.mirror = true;
      setRotation(THORAX, 0F, 0F, 0F);
      
      COU = new TKHModelRenderer(this, 54, 57);
      COU.addBox(-2F, 0F, -2F, 4, 4, 3);
      COU.setRotationPoint(0F, -3F, 0F);
      COU.setTextureSize(128, 64);
      COU.mirror = true;
      setRotation(COU, 0.185895F, 0F, 0F);
      
      PECTORAUX = new TKHModelRenderer(this, 74, 49);
      PECTORAUX.addBox(-4F, 0F, -1F, 8, 5, 1);
      PECTORAUX.setRotationPoint(0F, 0.1F, -1F);
      PECTORAUX.setTextureSize(128, 64);
      PECTORAUX.mirror = true;
      setRotation(PECTORAUX, -0.111544F, 0F, 0F);
      
      ABDOMEN = new TKHModelRenderer(this, 68, 55);
      ABDOMEN.addBox(-3F, 0F, -2F, 6, 6, 3);
      ABDOMEN.setRotationPoint(0F, 6F, 0.5F);
      ABDOMEN.setTextureSize(128, 64);
      ABDOMEN.mirror = true;
      setRotation(ABDOMEN, 0F, 0F, 0F);
      
      ABDOS = new TKHModelRenderer(this, 86, 55);
      ABDOS.addBox(-2F, 0F, -2F, 4, 6, 3);
      ABDOS.setRotationPoint(0F, 5F, 0.5F);
      ABDOS.setTextureSize(128, 64);
      ABDOS.mirror = true;
      setRotation(ABDOS, -0.074351F, 0F, 0F);
      
      BASSIN = new TKHModelRenderer(this, 62, 41);
      BASSIN.addBox(-4F, 0F, -2.5F, 8, 3, 5);
      BASSIN.setRotationPoint(0F, 10F, 0F);
      BASSIN.setTextureSize(128, 64);
      BASSIN.mirror = true;
      setRotation(BASSIN, -0.0371755F, 0F, 0F);
      
      EPINE_1 = new TKHModelRenderer(this, 52, 18);
      EPINE_1.addBox(-1F, 0F, 0F, 2, 2, 1);
      EPINE_1.setRotationPoint(0F, 0F, 2F);
      EPINE_1.setTextureSize(128, 64);
      EPINE_1.mirror = true;
      setRotation(EPINE_1, -0.7807556F, 0F, 0F);
      
      EPINE_2 = new TKHModelRenderer(this, 56, 10);
      EPINE_2.addBox(-1F, 0F, -2F, 2, 2, 2);
      EPINE_2.setRotationPoint(0F, 3F, 3F);
      EPINE_2.setTextureSize(128, 64);
      EPINE_2.mirror = true;
      setRotation(EPINE_2, -1.041002F, 0F, 0F);
      
      EPINE_3 = new TKHModelRenderer(this, 53, 41);
      EPINE_3.addBox(-1F, 0F, -2F, 2, 2, 2);
      EPINE_3.setRotationPoint(0F, 5F, 2.7F);
      EPINE_3.setTextureSize(128, 64);
      EPINE_3.mirror = true;
      setRotation(EPINE_3, -1.301248F, 0F, 0F);
      
      EPINE_4 = new TKHModelRenderer(this, 44, 41);
      EPINE_4.addBox(-1F, 0F, -2F, 2, 2, 2);
      EPINE_4.setRotationPoint(0F, 7F, 2.3F);
      EPINE_4.setTextureSize(128, 64);
      EPINE_4.mirror = true;
      setRotation(EPINE_4, -1.449967F, 0F, 0F);
      
      THORAX.addChild(PECTORAUX);
      setLocation(PECTORAUX, 0F, 0F, 0F);
      
      THORAX.addChild(COU);
      setLocation(COU, 0F, 0F, 0F);
      
      THORAX.addChild(ABDOMEN);
      setLocation(ABDOMEN, 0F, 0F, 0F);
      
      THORAX.addChild(ABDOS);
      setLocation(ABDOS, 0F, 0F, 0F);
      
      THORAX.addChild(BASSIN);
      setLocation(BASSIN, 0F, 0F, 0F);
      
      THORAX.addChild(EPINE_1);
      setLocation(EPINE_1, 0F, 0F, 0F); 
      
      THORAX.addChild(EPINE_2);
      setLocation(EPINE_2, 0F, 0F, 0F);
      
      THORAX.addChild(EPINE_3);
      setLocation(EPINE_3, 0F, 0F, 0F);
     
      THORAX.addChild(EPINE_4);
      setLocation(EPINE_4, 0F, 0F, 0F);      
      
      
      		/** Tête **/

      
      VISAGE = new TKHModelRenderer(this, 91, 0);
      VISAGE.addBox(-4F, -8F, -4F, 8, 5, 8);
      VISAGE.setRotationPoint(0F, 1F, 0F);
      VISAGE.setTextureSize(128, 64);
      VISAGE.mirror = true;
      setRotation(VISAGE, 0F, 0F, 0F);
      
      CRANE_MILIEU = new TKHModelRenderer(this, 93, 13);
      CRANE_MILIEU.addBox(-4F, 0F, -1F, 6, 7, 9);
      CRANE_MILIEU.setRotationPoint(1F, -7.75F, -3F);
      CRANE_MILIEU.setTextureSize(128, 64);
      CRANE_MILIEU.mirror = true;
      setRotation(CRANE_MILIEU, 0.37179F, 0F, 0F);
      
      CRANE_AVANT = new TKHModelRenderer(this, 95, 29);
      CRANE_AVANT.addBox(-4F, 0F, 0F, 8, 6, 6);
      CRANE_AVANT.setRotationPoint(0F, -7F, -4F);
      CRANE_AVANT.setTextureSize(128, 64);
      CRANE_AVANT.mirror = true;
      setRotation(CRANE_AVANT, 0.37179F, 0F, 0F);
      
      CRANE_ARRIERE = new TKHModelRenderer(this, 103, 41);
      CRANE_ARRIERE.addBox(-2F, 0F, 0F, 4, 5, 6);
      CRANE_ARRIERE.setRotationPoint(0F, -9.6F, 3.8F);
      CRANE_ARRIERE.setTextureSize(128, 64);
      CRANE_ARRIERE.mirror = true;
      setRotation(CRANE_ARRIERE, -0.5204921F, 0F, 0F);
      
      MACHOIRE_HAUTE = new TKHModelRenderer(this, 101, 57);
      MACHOIRE_HAUTE.addBox(-3F, 1F, -2F, 6, 2, 5);
      MACHOIRE_HAUTE.setRotationPoint(0F, -4.5F, -2.3F);
      MACHOIRE_HAUTE.setTextureSize(128, 64);
      MACHOIRE_HAUTE.mirror = true;
      setRotation(MACHOIRE_HAUTE, -0.111544F, 0F, 0F);
      
      MACHOIRE_BASSE = new TKHModelRenderer(this, 109, 52);
      MACHOIRE_BASSE.addBox(-2F, 0F, -2F, 4, 2, 3);
      MACHOIRE_BASSE.setRotationPoint(0F, -2.1F, -2.2F);
      MACHOIRE_BASSE.setTextureSize(128, 64);
      MACHOIRE_BASSE.mirror = true;
      setRotation(MACHOIRE_BASSE, 0.1487195F, 0F, 0F);
      
      ARRETE_NEZ = new TKHModelRenderer(this, 89, 41);
      ARRETE_NEZ.addBox(-1F, 0F, -2F, 2, 2, 5);
      ARRETE_NEZ.setRotationPoint(0F, -4.5F, -2.2F);
      ARRETE_NEZ.setTextureSize(128, 64);
      ARRETE_NEZ.mirror = true;
      setRotation(ARRETE_NEZ, -0.1487195F, 0F, 0F);
      
      SOURCIL_DROIT = new TKHModelRenderer(this, 93, 48);
      SOURCIL_DROIT.addBox(-3F, 0F, -1F, 3, 1, 2);
      SOURCIL_DROIT.setRotationPoint(0F, -3.3F, -3.085F);
      SOURCIL_DROIT.setTextureSize(128, 64);
      SOURCIL_DROIT.mirror = true;
      setRotation(SOURCIL_DROIT, -0.260246F, 0F, 0.0174533F);
      
      SOURCIL_GAUCHE = new TKHModelRenderer(this, 93, 51);
      SOURCIL_GAUCHE.addBox(0F, 0F, -1F, 3, 1, 2);
      SOURCIL_GAUCHE.setRotationPoint(0.45F, -3.3F, -3.085F);
      SOURCIL_GAUCHE.setTextureSize(128, 64);
      SOURCIL_GAUCHE.mirror = true;
      setRotation(SOURCIL_GAUCHE, -0.260246F, 0F, -0.0174533F); 
      
      /* VISAGE.addChild(CRANE_MILIEU);
      setCorrectRotation(VISAGE, CRANE_MILIEU);
      
      VISAGE.addChild(CRANE_AVANT);
      setCorrectRotation(VISAGE, CRANE_AVANT);
      
      VISAGE.addChild(CRANE_ARRIERE);
      setCorrectRotation(VISAGE, CRANE_ARRIERE);
      
      VISAGE.addChild(ARRETE_NEZ);
      setCorrectRotation(VISAGE, ARRETE_NEZ);
      
      VISAGE.addChild(SOURCIL_GAUCHE);
      setCorrectRotation(VISAGE, SOURCIL_GAUCHE);
      
      VISAGE.addChild(SOURCIL_DROIT);
      setCorrectRotation(VISAGE, SOURCIL_DROIT);
      
      VISAGE.addChild(MACHOIRE_BASSE);
      setCorrectRotation(VISAGE, MACHOIRE_BASSE);
      
      VISAGE.addChild(MACHOIRE_HAUTE);
      setCorrectRotation(VISAGE, MACHOIRE_HAUTE);*/
      
      VISAGE.addChild(CRANE_MILIEU);
      
      VISAGE.addChild(CRANE_AVANT);
      setLocation(CRANE_AVANT, 0F, -0.06F, 0F); 
      
      VISAGE.addChild(CRANE_ARRIERE);
      setLocation(CRANE_ARRIERE, 0F, -0.05F, 0F);
      
      VISAGE.addChild(ARRETE_NEZ);
      setLocation(ARRETE_NEZ, 0F, -0.05F, 0F);
      
      VISAGE.addChild(SOURCIL_GAUCHE);
      setLocation(SOURCIL_GAUCHE, -0.0285F, -0.19F, 0F);
      
      VISAGE.addChild(SOURCIL_DROIT);
      setLocation(SOURCIL_DROIT, 0F, -0.19F, 0F);
      
      VISAGE.addChild(MACHOIRE_BASSE);
      setLocation(MACHOIRE_BASSE, 0F, -0.07F, 0F);
      
      VISAGE.addChild(MACHOIRE_HAUTE);
      setLocation(MACHOIRE_HAUTE, 0F, -0.07F, 0F);
      
      
      		/** Jambe Gauche **/
      
      TIBIA_GAUCHE = new TKHModelRenderer(this, 27, 16);   
      TIBIA_GAUCHE.addBox(-2F, -1F, -2F, 3, 4, 3);
      TIBIA_GAUCHE.setRotationPoint(3F, 19F, 0.7F);
      TIBIA_GAUCHE.setTextureSize(128, 64);
      TIBIA_GAUCHE.mirror = true;
      setRotation(TIBIA_GAUCHE, 0.185895F, 0F, 0F);
      
      DESSUS_PIED_GAUCHE = new TKHModelRenderer(this, 23, 34);
      DESSUS_PIED_GAUCHE.addBox(-2.5F, 0F, -2.5F, 4, 2, 4);
      DESSUS_PIED_GAUCHE.setRotationPoint(3F, 21F, 0F);
      DESSUS_PIED_GAUCHE.setTextureSize(128, 64);
      DESSUS_PIED_GAUCHE.mirror = true;
      setRotation(DESSUS_PIED_GAUCHE, 0.4461411F, 0F, 0F);
      
      TALON_GAUCHE = new TKHModelRenderer(this, 27, 29);
      TALON_GAUCHE.addBox(-2.5F, -2F, -2.5F, 4, 3, 2);
      TALON_GAUCHE.setRotationPoint(3F, 23F, 3F);
      TALON_GAUCHE.setTextureSize(128, 64);
      TALON_GAUCHE.mirror = true;
      setRotation(TALON_GAUCHE, 0F, 0F, 0F);
      
      SEMELLE_GAUCHE = new TKHModelRenderer(this, 23, 23);
      SEMELLE_GAUCHE.addBox(-2.5F, -2F, -2.5F, 4, 2, 4);
      SEMELLE_GAUCHE.setRotationPoint(3F, 24F, 0F);
      SEMELLE_GAUCHE.setTextureSize(128, 64);
      SEMELLE_GAUCHE.mirror = true;
      
      GENOU_GAUCHE = new TKHModelRenderer(this, 23, 9);
      GENOU_GAUCHE.addBox(-2.5F, 0F, -3.5F, 4, 3, 4);
      GENOU_GAUCHE.setRotationPoint(3F, 15.5F, 1F);
      GENOU_GAUCHE.setTextureSize(128, 64);
      GENOU_GAUCHE.mirror = true;
      setRotation(GENOU_GAUCHE, 0.111544F, 0F, 0F);
      
      FEMUR_GAUCHE = new TKHModelRenderer(this, 25, 0);
      FEMUR_GAUCHE.addBox(-2F, 0F, -2F, 3, 5, 4);
      FEMUR_GAUCHE.setRotationPoint(3F, 12F, 0F);
      FEMUR_GAUCHE.setTextureSize(128, 64);
      FEMUR_GAUCHE.mirror = true;
      setRotation(FEMUR_GAUCHE, -0.074351F, 0F, 0F);
      
      FEMUR_GAUCHE.addChild(GENOU_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, GENOU_GAUCHE);
      
      /*FEMUR_GAUCHE.addChild(GENOU_GAUCHE);
      setLocation(GENOU_GAUCHE, -0.19F, -0.75F, 0.016F);*/
      
      FEMUR_GAUCHE.addChild(TIBIA_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, TIBIA_GAUCHE);
      
      /*FEMUR_GAUCHE.addChild(TIBIA_GAUCHE);
      setLocation(TIBIA_GAUCHE, -0.19F, -0.75F, 0.016F);*/
      
      FEMUR_GAUCHE.addChild(TALON_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, TALON_GAUCHE);
      
      /*FEMUR_GAUCHE.addChild(DESSUS_PIED_GAUCHE);
      setLocation(DESSUS_PIED_GAUCHE, -0.19F, -0.75F, 0.016F);*/
      
      FEMUR_GAUCHE.addChild(DESSUS_PIED_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, DESSUS_PIED_GAUCHE);
      
      /*FEMUR_GAUCHE.addChild(SEMELLE_GAUCHE);
      setLocation(SEMELLE_GAUCHE, 0F, 0.75F, 0.016F);*/
      
      FEMUR_GAUCHE.addChild(SEMELLE_GAUCHE);
      setCorrectRotation(FEMUR_GAUCHE, SEMELLE_GAUCHE);
      
      /*FEMUR_GAUCHE.addChild(TALON_GAUCHE);
      setLocation(TALON_GAUCHE, 0F, 0.70F, 0.2F);*/
      
      
      
      		/** Jambe Droite **/
      
      FEMUR_DROIT = new TKHModelRenderer(this, 39, 0);
      FEMUR_DROIT.addBox(-2F, 0F, -2F, 3, 5, 4);
      FEMUR_DROIT.setRotationPoint(-2F, 12F, 0F);
      FEMUR_DROIT.setTextureSize(128, 64);
      FEMUR_DROIT.mirror = true;
      setRotation(FEMUR_DROIT, -0.074351F, 0F, 0F);
      
      GENOU_DROIT = new TKHModelRenderer(this, 39, 9);
      GENOU_DROIT.addBox(-2.5F, 0F, -3.5F, 4, 3, 4);
      GENOU_DROIT.setRotationPoint(-2F, 15.5F, 1F);
      GENOU_DROIT.setTextureSize(128, 64);
      GENOU_DROIT.mirror = true;
      setRotation(GENOU_DROIT, 0.111544F, 0F, 0F);
      
      TIBIA_DROIT = new TKHModelRenderer(this, 39, 16);
      TIBIA_DROIT.addBox(-2F, -1F, -2F, 3, 4, 3);
      TIBIA_DROIT.setRotationPoint(-2F, 19F, 0.7F);
      TIBIA_DROIT.setTextureSize(128, 64);
      TIBIA_DROIT.mirror = true;
      setRotation(TIBIA_DROIT, 0.185895F, 0F, 0F);
      
      TALON_DROIT = new TKHModelRenderer(this, 39, 29);
      TALON_DROIT.addBox(-2.5F, -2F, -2.5F, 4, 3, 2);
      TALON_DROIT.setRotationPoint(-2F, 23F, 3F);
      TALON_DROIT.setTextureSize(128, 64);
      TALON_DROIT.mirror = true;
      setRotation(TALON_DROIT, 0F, 0F, 0F);
      
      DESSUS_PIED_DROIT = new TKHModelRenderer(this, 39, 34);
      DESSUS_PIED_DROIT.addBox(-2.5F, 0F, -2.5F, 4, 2, 4);
      DESSUS_PIED_DROIT.setRotationPoint(-2F, 21F, 0F);
      DESSUS_PIED_DROIT.setTextureSize(128, 64);
      DESSUS_PIED_DROIT.mirror = true;
      setRotation(DESSUS_PIED_DROIT, 0.4461411F, 0F, 0F);
      
      SEMELLE_DROITE = new TKHModelRenderer(this, 39, 23);
      SEMELLE_DROITE.addBox(-2.5F, -2F, -2.5F, 4, 2, 4);
      SEMELLE_DROITE.setRotationPoint(-2F, 24F, 0F);
      SEMELLE_DROITE.setTextureSize(128, 64);
      SEMELLE_DROITE.mirror = true;
      setRotation(SEMELLE_DROITE, 0F, 0F, 0F);
      
      FEMUR_DROIT.addChild(GENOU_DROIT);
      setCorrectRotation(FEMUR_DROIT, GENOU_DROIT);
      
      /*FEMUR_DROIT.addChild(GENOU_DROIT);
      setLocation(GENOU_DROIT, 0.13F, -0.75F, 0.016F);*/
      
      FEMUR_DROIT.addChild(TIBIA_DROIT);
      setCorrectRotation(FEMUR_DROIT, TIBIA_DROIT);
      
      /*FEMUR_DROIT.addChild(TIBIA_DROIT);
      setLocation(TIBIA_DROIT, 0.13F, -0.75F, 0.016F);*/

      FEMUR_DROIT.addChild(TALON_DROIT);
      setCorrectRotation(FEMUR_DROIT, TALON_DROIT);
      
      /*FEMUR_DROIT.addChild(DESSUS_PIED_DROIT);
      setLocation(DESSUS_PIED_DROIT, 0.13F, -0.75F, 0.016F);*/

      FEMUR_DROIT.addChild(DESSUS_PIED_DROIT);
      setCorrectRotation(FEMUR_DROIT, DESSUS_PIED_DROIT);
      
      /*FEMUR_DROIT.addChild(SEMELLE_DROITE);
      setLocation(SEMELLE_DROITE, 0F, 0.75F, 0.016F);*/

      FEMUR_DROIT.addChild(SEMELLE_DROITE);
      setCorrectRotation(FEMUR_DROIT, SEMELLE_DROITE);
      
      /*FEMUR_DROIT.addChild(TALON_DROIT);
      setLocation(TALON_DROIT, 0F, 0.70F, 0.2F);*/
      
      
      		/** Bras Gauche **/
      
      BRAS_GAUCHE = new TKHModelRenderer(this, 66, 0);
      BRAS_GAUCHE.addBox(-0.5F, -2F, -2F, 3, 12, 3);
      BRAS_GAUCHE.setRotationPoint(5.5F, 2F, 0.5F);
      BRAS_GAUCHE.setTextureSize(128, 64);
      BRAS_GAUCHE.mirror = true;
      setRotation(BRAS_GAUCHE, 0F, 0F, 0F);
      
      COUDE_GAUCHE = new TKHModelRenderer(this, 54, 4);
      COUDE_GAUCHE.addBox(-2.5F, -2F, -2F, 4, 2, 2);
      COUDE_GAUCHE.setRotationPoint(7F, 7F, 2F);
      COUDE_GAUCHE.setTextureSize(128, 64);
      COUDE_GAUCHE.mirror = true;
      setRotation(COUDE_GAUCHE, 0F, 0F, 0F);
      
      POIGNET_GAUCHE = new TKHModelRenderer(this, 60, 23);
      POIGNET_GAUCHE.addBox(-2.5F, -2F, -2F, 4, 3, 4);
      POIGNET_GAUCHE.setRotationPoint(7F, 10F, 0F);
      POIGNET_GAUCHE.setTextureSize(128, 64);
      POIGNET_GAUCHE.mirror = true;
      setRotation(POIGNET_GAUCHE, 0F, 0F, 0F);
      
      EPAULE_GAUCHE = new TKHModelRenderer(this, 60, 15);
      EPAULE_GAUCHE.addBox(-2.5F, -2F, -2F, 4, 4, 4);
      EPAULE_GAUCHE.setRotationPoint(7F, 1.6F, 0F);
      EPAULE_GAUCHE.setTextureSize(128, 64);
      EPAULE_GAUCHE.mirror = true;
      setRotation(EPAULE_GAUCHE, 0F, 0F, 0F);
      
      BRAS_GAUCHE.addChild(EPAULE_GAUCHE);
      setCorrectRotation(BRAS_GAUCHE, EPAULE_GAUCHE);
      
      /*BRAS_GAUCHE.addChild(EPAULE_GAUCHE);
      setLocation(EPAULE_GAUCHE, 0.1F, -0.03F, -0.03F);*/
      
      BRAS_GAUCHE.addChild(COUDE_GAUCHE);
      setCorrectRotation(BRAS_GAUCHE, COUDE_GAUCHE);
      
      /*BRAS_GAUCHE.addChild(COUDE_GAUCHE);
      setLocation(COUDE_GAUCHE, 0.1F, 0.32F, 0.1F);*/
      
      BRAS_GAUCHE.addChild(POIGNET_GAUCHE);
      setCorrectRotation(BRAS_GAUCHE, POIGNET_GAUCHE);
      
      /*BRAS_GAUCHE.addChild(POIGNET_GAUCHE);
      setLocation(POIGNET_GAUCHE, 0.1F, 0.52F, -0.03F);*/
      
      		/** Bras Droit **/
      
      BRAS_DROIT = new TKHModelRenderer(this, 78, 0);
      BRAS_DROIT.addBox(-2.7F, -2F, -2F, 3, 12, 3);
      BRAS_DROIT.setRotationPoint(-6.5F, 2F, 0.5F);
      BRAS_DROIT.setTextureSize(128, 64);
      BRAS_DROIT.mirror = true;
      
      EPAULE_DROITE = new TKHModelRenderer(this, 76, 15);
      EPAULE_DROITE.addBox(-4.7F, -2F, -2F, 4, 4, 4);
      EPAULE_DROITE.setRotationPoint(-5F, 1.6F, 0F);
      EPAULE_DROITE.setTextureSize(128, 64);
      EPAULE_DROITE.mirror = true;
      setRotation(EPAULE_DROITE, 0F, 0F, 0F);
      
      COUDE_DROIT = new TKHModelRenderer(this, 54, 0);
      COUDE_DROIT.addBox(-4.7F, -2F, -2F, 4, 2, 2);
      COUDE_DROIT.setRotationPoint(-5F, 7F, 2F);
      COUDE_DROIT.setTextureSize(128, 64);
      COUDE_DROIT.mirror = true;
      setRotation(COUDE_DROIT, 0F, 0F, 0F);
      
      POIGNET_DROIT = new TKHModelRenderer(this, 76, 23);
      POIGNET_DROIT.addBox(-4.7F, -2F, -2F, 4, 3, 4);
      POIGNET_DROIT.setRotationPoint(-5F, 10F, 0F);
      POIGNET_DROIT.setTextureSize(128, 64);
      POIGNET_DROIT.mirror = true;
      setRotation(POIGNET_DROIT, 0F, 0F, 0F);
      
      BRAS_DROIT.addChild(EPAULE_DROITE);
      setCorrectRotation(BRAS_DROIT, EPAULE_DROITE);
      
      //BRAS_DROIT.addChild(EPAULE_DROITE);
      //setLocation(EPAULE_DROITE, 0.1F, -0.03F, -0.03F);
      
      BRAS_DROIT.addChild(COUDE_DROIT);
      setCorrectRotation(BRAS_DROIT, COUDE_DROIT);
      
      /*BRAS_DROIT.addChild(COUDE_DROIT);
      setLocation(COUDE_DROIT, 0.1F, 0.32F, 0.1F);*/
      
      BRAS_DROIT.addChild(POIGNET_DROIT);
      setCorrectRotation(BRAS_DROIT, POIGNET_DROIT);
      
      /*BRAS_DROIT.addChild(POIGNET_DROIT);
      setLocation(POIGNET_DROIT, 0.1F, 0.52F, -0.03F);*/
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    
    /** Corp **/
    //COU.render(f5);
    THORAX.render(f5);
    //PECTORAUX.render(f5);
    //ABDOMEN.render(f5);
    //ABDOS.render(f5);
    //BASSIN.render(f5);
    //EPINE_1.render(f5);
    //EPINE_2.render(f5);
    //EPINE_3.render(f5);
    //EPINE_4.render(f5);
    
    /** Tête **/
    VISAGE.render(f5);
    //CRANE_MILIEU.render(f5);
    //CRANE_AVANT.render(f5);
    //CRANE_ARRIERE.render(f5);
    //MACHOIRE_HAUTE.render(f5);
    //MACHOIRE_BASSE.render(f5);
    //ARRETE_NEZ.render(f5);
    //SOURCIL_DROIT.render(f5);
    //SOURCIL_GAUCHE.render(f5);
    
    /** Bras Droit **/
    BRAS_DROIT.render(f5);
    //EPAULE_DROITE.render(f5);
    //COUDE_DROIT.render(f5);
    //POIGNET_DROIT.render(f5);
    
    /** Bras Gauche **/
    BRAS_GAUCHE.render(f5);
    //EPAULE_GAUCHE.render(f5);
    //COUDE_GAUCHE.render(f5);
    //POIGNET_GAUCHE.render(f5);
    
    /** Jambe Droite **/
    FEMUR_DROIT.render(f5);
    //GENOU_DROIT.render(f5);
    //TIBIA_DROIT.render(f5);
    //TALON_DROIT.render(f5);
    //DESSUS_PIED_DROIT.render(f5);
    //SEMELLE_DROITE.render(f5);
    
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
  
  private void setLocation(TKHModelRenderer model, float x, float y, float z)
  {
    model.locationX = x;
    model.locationY = y;
    model.locationZ = z;
  }

  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
  {
    VISAGE.rotateAngleY = par4 / (180F / (float)Math.PI);
    VISAGE.rotateAngleX = par5 / (180F / (float)Math.PI);
    BRAS_DROIT.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
    BRAS_GAUCHE.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
    BRAS_DROIT.rotateAngleZ = 0.0F;
    BRAS_GAUCHE.rotateAngleZ = 0.0F;
    FEMUR_DROIT.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    FEMUR_GAUCHE.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    FEMUR_DROIT.rotateAngleY = 0.0F;
    FEMUR_GAUCHE.rotateAngleY = 0.0F;
    
    if (onGround > -9990F)
    {
        float f = onGround;
        THORAX.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f) * (float)Math.PI * 2.0F) * 0.2F;
        BRAS_DROIT.rotationPointZ = MathHelper.sin(THORAX.rotateAngleY) * 5F;
        BRAS_DROIT.rotationPointX = -MathHelper.cos(THORAX.rotateAngleY) * 5F;
        BRAS_GAUCHE.rotationPointZ = -MathHelper.sin(THORAX.rotateAngleY) * 5F;
        BRAS_GAUCHE.rotationPointX = MathHelper.cos(THORAX.rotateAngleY) * 5F;
        BRAS_DROIT.rotateAngleY += THORAX.rotateAngleY;
        BRAS_GAUCHE.rotateAngleY += THORAX.rotateAngleY;
        BRAS_GAUCHE.rotateAngleX += THORAX.rotateAngleY;
        f = 1.0F - onGround;
        f *= f;
        f *= f;
        f = 1.0F - f;
        float f2 = MathHelper.sin(f * (float)Math.PI);
        float f4 = MathHelper.sin(onGround * (float)Math.PI) * -(VISAGE.rotateAngleX - 0.7F) * 0.75F;
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

    BRAS_DROIT.rotateAngleY = 0.0F;
    BRAS_GAUCHE.rotateAngleY = 0.0F;


    if (isSneak)
    {
        THORAX.rotateAngleX = 0.5F;
        setLocation(THORAX, 0F, 0.1F, 0F);
        BRAS_DROIT.rotateAngleX += 0.4F;
        setLocation(BRAS_DROIT, 0F, 0.1F, 0F);
        BRAS_GAUCHE.rotateAngleX += 0.4F;
        setLocation(BRAS_GAUCHE, 0F, 0.1F, 0F);
        FEMUR_DROIT.rotationPointZ = 4F;
        FEMUR_GAUCHE.rotationPointZ = 4F;  
        FEMUR_DROIT.rotationPointY = 9F;
        setLocation(FEMUR_DROIT, 0F, 0.1F, 0.1F);
        FEMUR_GAUCHE.rotationPointY = 9F;
        setLocation(FEMUR_GAUCHE, 0F, 0.1F, 0.1F);
        setLocation(VISAGE, 0F, 0.1F, 0F);        
    }
    else
    {
        THORAX.rotateAngleX = 0.0F;
        setLocation(THORAX, 0F, 0F, 0F);
        FEMUR_DROIT.rotationPointZ = 0.0F;
        FEMUR_GAUCHE.rotationPointZ = 0.0F;
        FEMUR_DROIT.rotationPointY = 12F;
        setLocation(FEMUR_DROIT, 0F, 0F, 0F);
        FEMUR_GAUCHE.rotationPointY = 12F;
        setLocation(FEMUR_GAUCHE, 0F, 0F, 0F);
        setLocation(BRAS_DROIT, 0F, 0F, 0F);
        setLocation(BRAS_GAUCHE, 0F, 0F, 0F);
        setLocation(VISAGE, 0F, 0F, 0F);
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
        BRAS_DROIT.rotateAngleY = -(0.1F - f1 * 0.6F) + VISAGE.rotateAngleY;
        BRAS_GAUCHE.rotateAngleY = (0.1F - f1 * 0.6F) + VISAGE.rotateAngleY + 0.4F;
        BRAS_DROIT.rotateAngleX = -((float)Math.PI / 2F) + VISAGE.rotateAngleX;
        BRAS_GAUCHE.rotateAngleX = -((float)Math.PI / 2F) + VISAGE.rotateAngleX;
        BRAS_DROIT.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
        BRAS_GAUCHE.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
        BRAS_DROIT.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        BRAS_GAUCHE.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        BRAS_DROIT.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
        BRAS_GAUCHE.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
    }
  }
}
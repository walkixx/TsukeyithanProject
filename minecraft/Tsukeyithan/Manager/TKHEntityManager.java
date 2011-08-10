package Tsukeyithan.Manager;


public class TKHEntityManager{

    public String entitySexe;
    public int powerCD;
    public int maxPowerCD;
    public boolean stuned;
    public String entityType;
    
    public TKHEntityManager()
    {    	
    	stuned = false;
    	this.entityType = "";
    	this.entitySexe = "";
    	powerCD = maxPowerCD = 1;
    }
    
    public void onUpdate(){
    	if(powerCD < 600)
    		powerCD++;
    }
}

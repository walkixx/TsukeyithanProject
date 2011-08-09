package Tsukeyithan.Manager;


public class TKHEntityManager{

    public String entitySexe;
    public int powerCD;
    public boolean stuned;
    public String entityType;
    
    public TKHEntityManager()
    {    	
    	stuned = false;
    	this.entityType = "";
    	this.entitySexe = "";
    }
    
    public void onUpdate(){
    	if(powerCD > 0)
    		powerCD--;
    }
}

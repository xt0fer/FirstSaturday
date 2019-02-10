
/**
 * Write a description of class WriteIFs here.
 *
 * @author (shuchi)
 * @version (02-09-2019)
 */
public class WriteIFs
{
    //WriteIFs player1 = new WriteIFs();
     
     int x = 0;
     int  tt_t = 0;
     int tt_s = 1;
     String ss = "";
      int oo1 = 61;
      int oo2 = 49;
 
    public void playerDied(boolean player1) {
        // Write an IF statement that checks “player1.isAlive()” 
         
         if (!isAlive(player1)){
           
           
           displayGameOver(player1);
        }
            
           
           
        
        
        // and if that’s false, calls “displayGameOver(player1)”
     
    }
    
    public String thermoSTAT(int room) {
        // Write an IF statement that checks the 
        // “temperature(room)” and if that check is less than 70, 
        // calls “heatOn()” else calls “coolOn()”

if (tempurature(room)<70){
    heatOn();
}
else
{
    coolOn();
}
        
        return this.ss;
    }

    public void fireplaceControl(Object fireplace1) {
        // Write an IF statement that checks 
        if ((outsideTemp()<50) || (insideTemp()<62)){
        // “outsideTemp()” is less than 50 
        // AND 
        // “insideTemp()” is less than 62, 
        // calls “startAFire(fireplace1)”
startAFire(fireplace1);
    }
}

    public void checkFuel(double fuelLevel) {
        // Write an IF statement that checks “fuelLevel” 
        // and if that check is less than 0.08, calls “refuel()”
        if(fuelLevel<0.08){
            refuel();
        }

    }


    
    /**
     *  Pay no attention to the code below this point.
     * 
     * 
     * instance variables
      
   int x;
   int tt_t;
   int tt_s;
   int oo1, oo2;
   String ss;


  /**
   * Constructor for objects of class WriteIFs
   */
  public WriteIFs()
  {
      // iString ss;
      this.x = 0;
       this.tt_t = 0;
        this.tt_s = 1;
       //ss = "";
       this.oo1 = 61;
       this.oo2 = 49;
       
  }
  //WriteIFs ss = new WriteIFs();
    // associated routines
    public boolean isAlive(boolean p) {
        return !p;
    }
    private int tempurature(int t) {
        return t+2;
    }
    private void heatOn() {
        this.ss = "heating";
    }
    private void coolOn() {
        this.ss = "cooling";
    }
 
    private int insideTemp() {
        return oo1;
    }
    private int outsideTemp() {
        return oo2;
    }
    private void startAFire(Object o) {
        this.tt_s = 213;
    }
    private void refuel() {
        this.x = 99;
    }
    private void displayGameOver(boolean b) {
        this.ss = "Game Over!";
    }
}

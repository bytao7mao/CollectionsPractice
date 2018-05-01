/**
 * Created by taoLen on 4/29/2018.
 */
public abstract class Vertebrate implements Animal{
    String name;
    int legs;
    String skinType;
    boolean isAlive = false;


    public Vertebrate() {this.name = "default";this.legs = 2;}
    public Vertebrate(String name, int legs) {this.name = name;this.legs = legs;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getLegs() {return legs;}
    public void setLegs(int legs) {this.legs = legs;}

    @Override
    public String covering() {
        return skinType;
    }

    public void setCovering(String skin) {
        this.skinType = skin;
    }

    @Override
    public String breath() {
        return "H2O";
    }

    public void setAlive(boolean trueOrFalse){
        this.isAlive = trueOrFalse;
    }
    @Override
    public boolean born() {
        return isAlive;
    }

}

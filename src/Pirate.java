import java.util.Random;

/**
 * Created by taoLen on 5/1/2018.
 */
public class Pirate {
    String name;
    int health;
    int swordsmanship;
    int agility;
    boolean hasParrot;
    boolean hasPegLeg;
    int doubloons;

    static int numberOfPirates;

    public Pirate(String name, int swordsmanship, int agility,
                  boolean hasParrot, boolean hasPegLeg) {

        this.name = name;
        this.health =10;
        this.swordsmanship = swordsmanship;
        this.agility = agility;
        this.doubloons = 25;
        this.hasPegLeg = hasPegLeg;
        this.hasParrot = hasParrot;
        this.numberOfPirates++;

    }

    public String swashbuckle(Pirate p) {
        Random r = new Random();
        if (p.agility - (p.hasPegLeg?1:0) > r.nextInt(20)) {
            return p.name + " dodged yar attack!";
        } else {
            int damage = r.nextInt(this.swordsmanship + (p.hasParrot?1:0)) + 1;
            p.health -= damage;
            if (p.isNapping()) {
                p.health = 0;
                this.doubloons += p.doubloons;
                numberOfPirates--;
            }
            return this.name + " swabs the deck with " + p.name + " for " + damage + "!";
        }
    }

    public boolean isNapping() {
        return this.health <= 0;
    }

    public String toString() {
        String s = this.name + "(H: " + this.health + "; S:" + this.swordsmanship;
        s = s + "; A:" + this.agility + "; $" + this.doubloons + ")";
        if (this.hasParrot && this.hasPegLeg) {
            s = s + "\nThis pirate has a parrot and a pegleg.";
        } else if (this.hasParrot) {
            s = s + "\nThis pirate has a parrot.";
        } else if (this.hasPegLeg) {
            s = s + "\nThis pirate has a pegleg.";
        }
        return s;
    }

    public static void main(String[] args) {
        Pirate p1 = new Pirate("Blackbeard",10,4,true,true);
        Pirate p2 = new Pirate("Penelope",8,8,true,false);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2.swashbuckle(p1));
        System.out.println(p1.swashbuckle(p2));
        System.out.println(p1);
        System.out.println(p2);
    }
}

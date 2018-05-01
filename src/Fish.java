/**
 * Created by taoLen on 4/29/2018.
 */
public class Fish extends Vertebrate implements Animal{
    public Fish() {
        super();
    }

    public Fish(String name, int legs) {
        super(name, legs);
    }

    @Override
    public void setCovering(String skin) {
        super.setCovering(skin);
    }

    @Override
    public String breath() {
        return super.breath();
    }
}

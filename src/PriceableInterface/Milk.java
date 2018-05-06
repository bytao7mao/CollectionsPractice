package PriceableInterface;

/**
 * Created by taoLen on 5/6/2018.
 */
public class Milk implements Priceable {
    private int dozens;
    private boolean extraLarge;

    public Milk(int dozens, boolean extraLarge){
        this.dozens = dozens;
        this.extraLarge = extraLarge;
    }

    @Override
    public double getPrice() {
        if (extraLarge)
            return dozens * PRICE_PER_DOZEN_EXTRA_LARGE;
        else
            return dozens * PRICE_PER_DOZEN_LARGE;
    }
}

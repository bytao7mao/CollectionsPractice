package PriceableInterface;

/**
 * Created by taoLen on 5/5/2018.
 */
public interface Priceable {
    public static final double PRICE_PER_DOZEN_LARGE = 1.5;
    public static final double PRICE_PER_DOZEN_EXTRA_LARGE = 1.75;
    double MILK_PRICE_LARGE = 2.0;
    double MILK_PRICE_EXTRA_LARGE = 3.0;
    abstract double getPrice();
}

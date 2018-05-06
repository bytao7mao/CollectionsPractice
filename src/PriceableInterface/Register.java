package PriceableInterface;

/**
 * Created by taoLen on 5/5/2018.
 */
public class Register {
    public double getTotal(Priceable[] cart){
        double total = 0.0;
        for (int i = 0; i < cart.length; i++) {
            total+=cart[i].getPrice();  //based on the specific implementation of the class
        }
        return total;
    }
    public double getTotal(Priceable cart){
        double total = 0.0;
        total+=cart.getPrice();
        return total;
    }

    public static void main(String[] args) {
//        Priceable[] myCart = new Priceable[3];   //per array
//        myCart[0] = new Eggs(1, false);
//        myCart[1] = new Eggs(2, true);
//        myCart[2] = new Eggs(1, false);

        Priceable one = new Eggs(1, true);  //per item
        Priceable two = new Eggs(2, false);
        Priceable three = new Eggs(1, true);
        Priceable four = new Milk(1, true);
        Register register = new Register();
        System.out.println(register.getTotal(four));
    }
}

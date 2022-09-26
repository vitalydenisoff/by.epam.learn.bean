package by.epam.learn.action;
import by.epam.learn.bean.Coin;

public class CompareCoin {
    public void compareDiameter(Coin first, Coin second) {
        double delta = first.getDiameter() - second.getDiameter();
        if (delta > 0) {
            System.out.println("The first coin is more then the second for " + delta);
        } else if (delta == 0) {
            System.out.println("Coins have the same diameter");
         }
        else {
            System.out.println("The second coin is more then the first on " + -delta);
        }
    }
}


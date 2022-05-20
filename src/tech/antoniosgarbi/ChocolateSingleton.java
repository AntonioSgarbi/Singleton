package tech.antoniosgarbi;

public class ChocolateSingleton {
    private boolean empty;
    private boolean boiled;
    private static ChocolateSingleton uniqueInstance;

    private ChocolateSingleton() {
        empty = true;
        boiled = false;
    }

    public static ChocolateSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateSingleton();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
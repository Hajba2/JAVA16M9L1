package generics;

public class Wildcard {

    public void add(GenericAsGeneric<? extends Number> g) {
        
    }

    public static void main(String[] args) {
        GenericAsGeneric<Integer> gi = new GenericAsGeneric<>();
        GenericAsGeneric<Number> gn = new GenericAsGeneric<>();
        Wildcard wildcard = new Wildcard();
        wildcard.add(gi);
        wildcard.add(gn);
    }
}

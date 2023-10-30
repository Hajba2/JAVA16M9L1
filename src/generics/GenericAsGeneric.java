package generics;

public class GenericAsGeneric <T extends Number> {

    private T aPrev;
    private T bPrev;

    public Double add(T a, T b) {
        this.aPrev = a;
        this.bPrev = b;
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        GenericAsGeneric<Number> gn = new GenericAsGeneric<>();
        GenericAsGeneric<Integer> gi = new GenericAsGeneric<>();
        //GenericAsGeneric<Object> go = new GenericAsGeneric<>();

        //GenericAsGeneric<Number> example = gi;

        Double d = Double.valueOf(5d);
        Object dObject = d;
        Integer i = Integer.valueOf(6);
        Integer i2 = Integer.valueOf(7);

        System.out.println("gn.add(d, i) = " + gn.add(d, i));
        System.out.println("gi.add(i, i2) = " + gi.add(i, i2));
        //System.out.println("gi.add(d, i) = " + gi.add(dObject, i));

    }
}

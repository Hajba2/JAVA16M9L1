package generics;

public class ObjectAsGeneric {

    public Double add(Object a, Object b) {
        //if (a instanceof Number && b instanceof Number) {
            double d1 = ((Number) a).doubleValue();
            double d2 = ((Number) b).doubleValue();
            return d2 + d1;
        //}
        //return 0d;
    }


    public static void main(String[] args) {
        ObjectAsGeneric osg = new ObjectAsGeneric();
        System.out.println("osg.add(5d, 6d) = " + osg.add("5D", 6L));
    }
}

package com.generic.org;

import java.util.List;
import java.util.Vector;

public class ArithmeticOperations {
    public static <T extends Number> Number add(T t1, T t2) {
        return (t1.doubleValue() + t2.doubleValue());
    }

    public static <T extends Number> Number subtract(T t1, T t2) {
        return (t1.doubleValue() - t2.doubleValue());
    }

    public static <T extends Number> Number divide(T t1, T t2) {
        return (t1.doubleValue() / t2.doubleValue());
    }

    public static <T extends Number> Number add(List<? extends Number> list) {
        double d = 0;

        for (int i = 0; i < list.size(); i++)
            d += list.get(i).doubleValue();

        return new Double(d);
    }

    public static <T extends Number> Number subtract(List<? extends Number> list) {
        double d = 0;

        //for (int i = 0; i < list.size(); i++)
        d = list.get(0).doubleValue() - list.get(1).doubleValue();

        return new Double(d);
    }

    public static <T extends Number> Number divide(List<? extends Number> list) {
        double d = 0;

        // for (int i = 0; i < list.size(); i++)
        d = list.get(0).doubleValue() / list.get(1).doubleValue();

        return new Double(d);
    }


    public static void dumpList(List<?> list) {
        System.out.println("List dump with unbounded wildcard:");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static void main(String[] args) {
        {
// Adding 2 integers
            Integer i1 = new Integer(34), i2 = new Integer(40);
            System.out.println("Add with generic method: " +
                    ArithmeticOperations.add(i1, i2));
            Float f1 = new Float(12.56), f2 = new Float(3.677);
            System.out.println("Add with generic method: " +
                    ArithmeticOperations.add(f1, f2));
//subtract 2 integers
            Integer i3 = new Integer(34), i4 = new Integer(4);
            System.out.println("subtract with generic method: " +
                    ArithmeticOperations.subtract(i3, i4));
            Float f3 = new Float(12.56), f4 = new Float(3.6);
            System.out.println("subtract with generic method: " +
                    ArithmeticOperations.subtract(f3, f4));
//divide 2 integers
            Integer i5 = new Integer(40), i6 = new Integer(10);
            System.out.println("divide with generic method: " +
                    ArithmeticOperations.divide(i5, i6));
            Float f5 = new Float(12.56), f6 = new Float(3.67);
            System.out.println("divide with generic method: " +
                    ArithmeticOperations.divide(f5, f6));

// Adding 2 integers through a list
            Vector<Number> l = new Vector<Number>();
            l.add(new Integer(34));
            l.add(new Integer(43));
            System.out.println("add with upper bounded wildcard: " + ArithmeticOperations.add(l));

//subtract  2 integers through list

            System.out.println("subtract with upper bounded wildcard: " + ArithmeticOperations.subtract(l));

//divide 2 integers through list

            System.out.println("divide with upper bounded wildcard: " + ArithmeticOperations.divide(l));

// Dumping the list to the console.
            ArithmeticOperations.dumpList(l);
        }
    }

}

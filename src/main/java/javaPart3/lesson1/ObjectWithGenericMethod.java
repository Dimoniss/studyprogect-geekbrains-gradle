package javaPart3.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectWithGenericMethod {

    public static <T> boolean someMethod(T genericArgument) {
        if (genericArgument instanceof Number) {
            return true;
        }
        return false;
    }

    public static <T> T[] swapsTwoElementsOfAnArray(int indexFirstElement, int indexSecondElement, T... array) {
        if (indexFirstElement <= array.length && indexSecondElement <= array.length && indexFirstElement != indexSecondElement) {
            T temp = array[indexFirstElement];
            array[indexFirstElement] = array[indexSecondElement];
            array[indexSecondElement] = temp;
            return array;
        } else {
            System.out.println("incorrect element index");
            return null;
        }
    }

    public static <T> ArrayList<T> convertsArrayToArrayList(T... array) {
        ArrayList arrayList = new ArrayList<String>();
        arrayList.addAll(Arrays.asList(array));
        return arrayList;
    }
}

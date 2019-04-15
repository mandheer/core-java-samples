package in.pabreja.sample.sorting;

import java.util.Comparator;

public class PersonComparators<T extends Person> {

    public Comparator<T> getAgeComparator(){
        return new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return Integer.parseInt(o1.getAge()) - Integer.parseInt(o2.getAge());
            }
        };
    }

    public Comparator<T> getNameComparator(){
//        return new Comparator<T>() {
//            @Override
//            public int compare(T o1, T o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };

        final Comparator<T> tComparator = (o1, o2) -> {
            return o1.getAddress().compareTo(o2.getAddress());
        };
        return tComparator;
    }

    public Comparator<T> getAddressComparator(){
        return (o1,o2) -> {return o1.getAddress().compareTo(o2.getAddress());};
    }

    public Comparator<T> getAddressComparator1(){
        return Comparator.comparing(T::getAddress).thenComparing(T::getAge);
    }
}

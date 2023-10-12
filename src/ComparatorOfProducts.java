import java.util.Comparator;

public class ComparatorOfProducts  implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        if(o1.getName().compareTo(o2.getName()) < 0){
            return -1;
        } else if (o1.getName().compareTo(o2.getName()) > 0){
            return 1;
        } else {
            return 0;
        }
    }
    }


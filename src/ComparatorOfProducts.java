public class ComparatorOfProducts  implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getLength() > o2.getLength()) {
            return 1;
        } else if (o1.getLength() < o2.getLength()) {
            return -1;
        } else if (o1.getWidth() > o2.getWidth()) {
            return 1;
        } else if (o1.getWidth() < o2.getWidth()) {
            return -1;
        } else if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}

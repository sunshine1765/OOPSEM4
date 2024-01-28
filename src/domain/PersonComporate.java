package domain;

import java.util.Comparator;

public class PersonComporate<T extends Persone> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int res = o1.getName().compareTo(o2.getName());
        if(res == 0) {
            return 0;
        }
        else
        {
            return res;
        }
    }
}

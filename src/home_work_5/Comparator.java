package src.home_work_5;

import java.util.Comparator;

class TestComparator<T> implements Comparator<T> {

    public int compare(T a,T b) {
        if (a instanceof String && b instanceof String) {
            return a.toString().compareTo(b.toString());
        } else {
            if (a instanceof Integer && b instanceof Integer) {
                if ((Integer) b > (Integer) a)
                    return 1;
                else if ((Integer) a > (Integer) b)
                    return -1;
                else
                    return 0;
            } else {
                if (a instanceof Long && b instanceof Long) {
                    if ((Long) b > (Long) a)
                        return 1;
                    else if ((Long) a > (Long) b)
                        return -1;
                    else
                        return 0;
                } else {
                    if (a instanceof Short && b instanceof Short) {
                        if ((Short) b > (Short) a)
                            return 1;
                        else if ((Short) a > (Short) b)
                            return -1;
                        else
                            return 0;
                    } else {
                        if (a instanceof Byte && b instanceof Byte) {
                            if ((Byte) b > (Byte) a)
                                return 1;
                            else if ((Byte) a > (Byte) b)
                                return -1;
                            else
                                return 0;
                        } else {
                            if (a instanceof Float && b instanceof Float) {
                                if ((Float) b > (Float) a)
                                    return 1;
                                else if ((Float) a > (Float) b)
                                    return -1;
                                else
                                    return 0;
                            } else {
                                if (a instanceof Double && b instanceof Double) {
                                    if ((Double) b > (Double) a)
                                        return 1;
                                    else if ((Double) a > (Double) b)
                                        return -1;
                                    else
                                        return 0;
                                } else {
                                    if (a instanceof Boolean && b instanceof Boolean) {
                                        if (((Boolean) b && (Boolean) a) || (!(Boolean) a && (!(Boolean) b)))
                                            return 0;
                                        else if (!(Boolean) a && (Boolean) b)
                                            return 1;
                                        else if ((Boolean) a && !(Boolean) b)
                                            return -1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 2;
    }
}


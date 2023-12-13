package Task4;

public class Calculator {
    public static <T extends Number> T sum(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) (Double) (a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) (Float) (a.floatValue() + b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) (Long) (a.longValue() + b.longValue());
        } else {
            return (T) (Integer) (a.intValue() + b.intValue());
        }
    }
    public static <T extends Number> T multiply(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) (Double) (a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) (Float) (a.floatValue() * b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) (Long) (a.longValue() * b.longValue());
        } else {
            return (T) (Integer) (a.intValue() * b.intValue());
        }
    }
    public static <T extends Number> T divide(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) (Double) (a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) (Float) (a.floatValue() / b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) (Long) (a.longValue() / b.longValue());
        } else {
            return (T) (Integer) (a.intValue() / b.intValue());
        }
    }
    public static <T extends Number> T subtraction(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) (Double) (a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) (Float) (a.floatValue() - b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) (Long) (a.longValue() - b.longValue());
        } else {
            return (T) (Integer) (a.intValue() - b.intValue());
        }
    }

}

package Task2;

public class Class1<T,V,K>{
    private T type;
    private K key;
    private V value;
    public Class1(T type, K key, V value){
        this.type = type;
        this.key = key;
        this.value = value;
    }
    public T getType() {
        return type;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public void getClasses(){
        System.out.println("type: "+type.getClass()+"\nkey: "+key.getClass()+"\nvalue: "+value.getClass());
    }
}

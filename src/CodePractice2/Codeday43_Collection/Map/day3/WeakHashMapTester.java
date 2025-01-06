package CodePractice2.Codeday43_Collection.Map.day3;

import java.util.HashMap;
import java.util.WeakHashMap;

class Key{
    private String id;

    public Key(String id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Key{" +
                "id='" + id + '\'' +
                '}';
    }
}
public class WeakHashMapTester {
    public static void main(String[] args) {
        HashMap<Key, String> hm = new HashMap<>();

        hm.put(new Key("12sde"),"Deep");
        hm.put(new Key("145de"),"Deepa");
        hm.put(new Key("232sde"),"Deepshikha");
        hm.put(new Key(null),"Deepshikha");

        WeakHashMap<Key, String> wm = new WeakHashMap<>();
        Key k= new Key("12sde");

        wm.put(k,"Deep");
        Key k1= new Key("145de");
        wm.put(k1,"Deepa");
        wm.put(new Key("232sde"),"Deepshikha");
        wm.put(new Key(null),"Deepshikha");

        System.out.println(hm);
        System.out.println(wm);
        k=null;
        System.gc();
        System.out.println(hm);
        System.out.println(wm);
    }
}

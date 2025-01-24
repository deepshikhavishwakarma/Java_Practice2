package CodePractice2.WeakHAshMap;

import java.util.TreeMap;
import java.util.WeakHashMap;

public class Prog1 {
    public static void main(String[] args) {
        class demo{
            String name;
            Integer id;

            public demo(String name, Integer id) {
                this.name = name;
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public Integer getId() {
                return id;
            }
            public static void meth() {
                TreeMap<demo, Integer> tm = new TreeMap<>((x,y)->x.getName().compareTo(y.getName()));
                tm.put(new demo("Hello", 01), 1);
                tm.put(new demo("zello", 05), 2);
                tm.put(new demo("Bello", 015), 3);
                tm.put(new demo("Oello", 010), 4);
                WeakHashMap<demo, Integer> wm = new WeakHashMap<>(tm);
                wm.forEach((x, y) -> System.out.println(x.getName() + " " + x.getId() + " " + y));

            }
        }
        demo.meth();
    }
}

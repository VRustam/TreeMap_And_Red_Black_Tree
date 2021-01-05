package Section12;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_And_Red_Black_Tree_ders  {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Rustem",1);
        treeMap.put("123",2);
        treeMap.put("Emilia",3);
        treeMap.put("Emil",4);

        System.out.println(treeMap);


        TreeMap<Dordbucaqli,String> dordbucaqliStringTreeMap = new TreeMap<>(new Comparator<Dordbucaqli>() {
            @Override
            public int compare(Dordbucaqli o1, Dordbucaqli o2) {
                if (o1.kunc < o2.kunc){
                    return -1;
                }else if (o1.kunc > o2.kunc){
                    return 1;
                }else return 0;
            }
        });
        Dordbucaqli d1= new Dordbucaqli(4,"aq");
        Dordbucaqli d2= new Dordbucaqli(2,"mavi");
        Dordbucaqli d3= new Dordbucaqli(6,"yasil");
        dordbucaqliStringTreeMap.put(d1,"Aq Dordbucaqli");
        dordbucaqliStringTreeMap.put(d2,"Mavi dordbucaqli");
        dordbucaqliStringTreeMap.put(d3,"Yasil dordbucaqll");
        System.out.println(dordbucaqliStringTreeMap);
    }
}

class Dordbucaqli implements Comparable<Dordbucaqli>{
    int kunc;
    String reng;

    public Dordbucaqli(int kunc, String reng) {
        this.kunc = kunc;
        this.reng = reng;
    }

    @Override
    public String toString() {
        return "Dordbucaqli{" +
                "kunc=" + kunc +
                ", reng='" + reng + '\'' +
                '}';
    }


    @Override
    public int compareTo(Dordbucaqli o1) {
        if (this.kunc < o1.kunc){
            return -1;
        }else if (this.kunc > o1.kunc){
            return 1;
        }else return 0;
    }
}

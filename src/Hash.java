import java.util.*;

public class Hash {
    public static void main(String[] args) {
        String s="india is my country";
        HashMap<Character,Integer>hs=new HashMap<>();
        char arr[]=s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            int frq=1;

            if (arr[i]!=' ') {
                if(hs.containsKey(arr[i])){
                    int localFrq=hs.get(arr[i]);
                    localFrq++;
                    hs.put(arr[i],localFrq);
                }
                else
                hs.put(arr[i],frq);
            }

        }
        Set entrySet=hs.entrySet();
        Iterator it =entrySet.iterator();
        while (it.hasNext()){
            Map.Entry me=(Map.Entry)it.next();
            System.out.println("character "+ me.getKey()+" "+me.getValue()+" times");
        }

    }
}

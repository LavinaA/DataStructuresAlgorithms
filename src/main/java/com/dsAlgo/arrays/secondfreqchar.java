package iteration.arrays;

import java.util.*;

public class secondfreqchar {
    public static void main(String[] args) {
        String str = "MADAM";
        findsecondFreequentChar(str);
    }

    private static void findsecondFreequentChar(String str) {
        Map<Character,Integer> map= new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            //char c =str.charAt(i);
            if(map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        /*for(Map.Entry<Character,Integer> m : map.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }*/

        Map<Integer,List<Character>> map1 = new TreeMap<Integer,List<Character>>(Collections.reverseOrder());

        for(Map.Entry<Character,Integer> m : map.entrySet()){
            Character key = m.getKey();//character
            Integer value = m.getValue(); // integer

            if(map1.get(value)==null){
                ArrayList<Character> list = new ArrayList<>();
                list.add(key);
                map1.put(value,list);
            }
            else{
                List<Character> existinglist = map1.get(value);
                existinglist.add(key);
            }
        }
        System.out.println(map1);

        int count =0;
        for(Map.Entry<Integer,List<Character>> entry : map1.entrySet()){
            count++;
            if (count == 2) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
                break;
            }

        }




    }
}

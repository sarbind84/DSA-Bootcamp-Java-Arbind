package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 11-11-2022
 **/
public class Long_Pressed_Name {
    public static void main(String[] args) {
      /*
       My own nice trick ...lol lil fail but good try..
       Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < type.length(); i++) {
            map.put(Character.toString(type.charAt(i)), i);
        }
        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        for (Iterator<String> it = iterator; it.hasNext(); ) {
            stringBuilder.append(it.next());
        }
       if (name.equalsIgnoreCase(new String(stringBuilder))) System.out.println(true);*/
        String name = "alex";
        String typed = "aaleex";

        int nameLength = name.length();
        int typedLength = typed.length();


        boolean islongpressed = islongpressed(name, typed);
        System.out.println(islongpressed);


    }

    private static boolean islongpressed(String name, String typed) {
  /*
  int i = 0, nameLength = name.length(), typedLength = typed.length();
     //i me name iteration and ,,, j me typed iterations
        for (int j = 0; j < typedLength; ++j)
            if (i < nameLength && name.charAt(i) == typed.charAt(j))
                ++i;
                //j=0 matlab dono ke first character same nhi h
                //so return false
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1))
                return false;
                //i last tak phuch gya matlab sare match ho gye...
        return i == nameLength;
        */

        int i = 0, typedLength = typed.length(), nameLength = name.length();

        for (int j = 0; j < typedLength; ++j) {
            if (i<nameLength && name.charAt(i)==typed.charAt(j)){
                ++i;

            }else if (j==0 || typed.charAt(j)!=typed.charAt(j-1)){
                    return false;
                }
            }


       return i == nameLength;
    }
}

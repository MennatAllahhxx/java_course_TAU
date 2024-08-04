package chapter12;

import java.util.HashMap;
import java.util.Map;

public class Exercise {
    public static void main(String[] args) {
        Map<String, Integer> exam1 = new HashMap();

        exam1.put("ahmed", 95);
        exam1.put("mohamed", 76);
        exam1.put("sally", 89);
        exam1.put("ali", 54);
        exam1.put("layla", 36);

        System.out.println(exam1);

        Map<String, Integer> exam2 = new HashMap<>();

        exam2.put("ahmed", 98);
        exam2.put("mohamed", 67);
        exam2.put("sally", 89);
        exam2.put("ali", 82);
        exam2.put("layla", 54);

        exam2.forEach((student, degree) -> {
            if (exam1.get(student) < degree) {
                exam1.put(student, degree);
            }
        });

        System.out.println(exam1);
    }


}
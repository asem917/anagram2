package com.company.task1;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println(isAnagrams("aaaaas", "saaaaa"));


    }

    public static boolean isAnagrams(String s1, String s2) {
        Map<Character, Integer> m = new HashMap<>();

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);

            if (m.isEmpty())
                m.put(c1, 1);
            else {
                if (m.get(c1) != null) {
                    m.put(c1, m.get(c1) + 1);
                } else
                    m.put(c1, 1);
            }
        }
        for (int j = 0; j < s1.length(); j++) {
            char c2 = s2.charAt(j);
            if (m.get(c2) == null)
                return false;
            m.put(c2, (m.get(c2) - 1));
            if (m.get(c2) == 0) {
                m.remove(c2);
            }
        }
       return m.isEmpty();
    }}

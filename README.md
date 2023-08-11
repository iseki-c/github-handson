package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        System.out.println("麦わらの一味");
        Map<String, String> userMap = new HashMap<>();
        userMap.put("ルフィ", "船長");
        userMap.put("ゾロ", "剣士");
        userMap.put("ナミ", "航海士");
        userMap.put("ウソップ", "発明王");
        userMap.put("サンジ", "コック");
        userMap.put("チョッパー", "船医");

        System.out.println(userMap.get("ルフィ"));
        System.out.println(userMap.get("ゾロ"));
        System.out.println(userMap.get("ナミ"));
        System.out.println(userMap.get("ウソップ"));
        System.out.println(userMap.get("サンジ"));
        System.out.println(userMap.get("チョッパー"));

        for (Entry<String, String> entry : userMap.entrySet()) {
            userMap.put(entry.getKey(), entry.getValue());

            System.out.println("名前:" + entry.getKey() + "役職" + entry.getValue());
        }
        Map<String, String> userMap1 = null;

        try {
            System.out.println("名前を教えてください");
            System.out.println(userMap1.get("ビビ"));
        }catch(NullPointerException e) {
                System.out.println("役職はありません");
            }
        }
    }

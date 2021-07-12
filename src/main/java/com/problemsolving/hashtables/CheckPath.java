package com.problemsolving.hashtables;

import java.util.HashMap;
import java.util.Map;

class CheckPath {

  public static String tracePath(Map<String, String> map) {

    String result = "";

    HashMap< String,String > reverseMap = new HashMap < >();

    //To fill reverse map, iterate through the given map
    for (Map.Entry < String, String > entry : map.entrySet())		
      reverseMap.put(entry.getValue(), entry.getKey());

    //Find the starting point of itinerary
    String from = "";

    //Check if graph is disconnected
    int count = 0;

    for (Map.Entry <String, String> entry: map.entrySet()) {
      if (!reverseMap.containsKey(entry.getKey())) {
        count++;
        from = entry.getKey();
        //break;
      }
    }

    if(count > 1){
      return "null"; // Disconnected graph
    }

    //Trace complete path
    String to = map.get(from);

    while (to != null) {
      result += from + "->" + to + ", ";
      from = to;
      to = map.get(to);
    }
    //System.out.println(result);

    return result;
  }

  public static void main(String[] args) {
    HashMap<String,String> hMap = new HashMap<>();  

    hMap.put("NewYork","Chicago");
    hMap.put("Boston","Texas");
    hMap.put("Missouri","NewYork");
    hMap.put("Texas","Missouri");

    String actual_output = CheckPath.tracePath(hMap);

    System.out.println(actual_output);
  }
}
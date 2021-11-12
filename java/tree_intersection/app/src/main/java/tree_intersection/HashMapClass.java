package tree_intersection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class HashMapClass {


  public void treeIntersection(BinaryTree firstTree, BinaryTree secondTree) throws Exception{
    ArrayList<Integer> arrayNode = new ArrayList<>();
    if(firstTree.getRoot() == null || secondTree.getRoot() == null){
      throw new Exception(" null!");
    }
    firstTree.preOrder(firstTree.getRoot());
    secondTree.postOrder(secondTree.getRoot());
    for(Integer i: firstTree.hashMap.keySet()){
      if (secondTree.hashMap2.get(i) != null){
        arrayNode.add(i);
      }
    }
    System.out.println(arrayNode);
  }

  public List<List<String>> leftJoin(HashMap<String, String> left, HashMap<String, String> right) throws Exception{
    List<String> strings;
    List<List<String>> listOfLists = new ArrayList<>();

    if (left == null && right == null){
      throw new Exception("empty hashmpas");
    }
    for(String s: left.keySet()){
      if(right.get(s) != null) {
        strings = new ArrayList<>();
        strings.add(s);
        strings.add(left.get(s));
        strings.add(right.get(s));
        listOfLists.addAll(Collections.singleton(strings));

      }
    }
    System.out.println(listOfLists);
    return listOfLists;
  }
}

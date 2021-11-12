package tree_intersection;

import java.util.ArrayList;


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


}

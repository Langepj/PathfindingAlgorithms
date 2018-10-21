import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Node {

  private HashMap<Node, Integer> adjacentNodes = new HashMap<>();
  private String name;
  private List<Node> shortestPath = new LinkedList<>();
  private Integer distance = Integer.MAX_VALUE;

  Node(String name) {
    this.name = name;
  }

  void addDestination(Node destination, int distance) {
    adjacentNodes.put(destination, distance);
  }

  // getters and setters

  String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  List<Node> getShortestPath() {
    return shortestPath;
  }

  void setShortestPath(List<Node> shortestPath) {
    this.shortestPath = shortestPath;
  }

  Integer getDistance() {
    return distance;
  }

  void setDistance(Integer distance) {
    this.distance = distance;
  }

  HashMap<Node, Integer> getAdjacentNodes() {
    return adjacentNodes;
  }

  public void setAdjacentNodes(HashMap<Node, Integer> adjacentNodes) {
    this.adjacentNodes = adjacentNodes;
  }
}
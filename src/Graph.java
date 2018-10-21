import java.util.HashSet;

class Graph {

  private HashSet<Node> nodes = new HashSet<>();

  public static void main(String[] args) {
    final Node nodeA = new Node("A");
    final Node nodeB = new Node("B");
    final Node nodeC = new Node("C");
    final Node nodeD = new Node("D");
    final Node nodeE = new Node("E");
    final Node nodeF = new Node("F");
    final Node nodeG = new Node("G");
    final Node nodeH = new Node("H");
    final Node nodeI = new Node("I");

    nodeA.addDestination(nodeB, 4);
    nodeA.addDestination(nodeC, 2);
    nodeB.addDestination(nodeD, 5);
    nodeC.addDestination(nodeD, 1);

    nodeD.addDestination(nodeE, 4);
    nodeD.addDestination(nodeF, 6);

    nodeE.addDestination(nodeG, 1);
    nodeF.addDestination(nodeG, 5);

    nodeF.addDestination(nodeH, 3);
    nodeG.addDestination(nodeH, 6);

    nodeH.addDestination(nodeI, 4);

    Graph graph = new Graph();

    graph.addNode(nodeA);
    graph.addNode(nodeB);
    graph.addNode(nodeC);
    graph.addNode(nodeD);
    graph.addNode(nodeE);
    graph.addNode(nodeF);
    graph.addNode(nodeG);
    graph.addNode(nodeH);
    graph.addNode(nodeI);

    Dijkstra.calculateShortestPathFromSource(nodeA);
  }

  private void addNode(Node nodeA) {
    nodes.add(nodeA);
  }
}
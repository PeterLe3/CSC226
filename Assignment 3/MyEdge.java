class MyEdge implements Comparable<MyEdge>{

  private final int v; // NOTE: ensure v < w.
  private final int w;
  private long weight;

  public int minv() {
    return v;
  }

  public int maxv() {
    return w;
  }

  public long weight() {
    return weight;
  }

  public void changeWeight(long weight) {
    this.weight = weight;
  }

  MyEdge (int v, int w, long weight) {
    this.v = v < w ? v : w;
    this.w = v < w ? w : v;
    this.weight = weight;
  }

  public String toString() {
    return String.format("%d-%d %d", v, w, weight);
  }

  public int compareTo(MyEdge that) {
    // FOR YOU TO FILL IN
    return 0; // temp
  }
  
}
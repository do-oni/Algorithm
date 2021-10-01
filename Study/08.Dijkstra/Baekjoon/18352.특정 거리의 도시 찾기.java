import java.util.*;

class Main {
    private static int N, M, K, X;
    private static int[] distance;  //출발도시인 X와의 최단경로
    private static ArrayList<Edge>[] edgeList;  //도시 인접리스트

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        X = sc.nextInt();
        
        //생성 초기화
        distance = new int[N + 1];
        edgeList = new ArrayList[N + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        for(int i=1; i<=N; i++) {
            edgeList[i] = new ArrayList<>();
        }
        
        //경로 초기화
        for(int i=0; i<M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            //A번 도시에서 B번 도시로 이동하는 단방향 도로가 존재
            edgeList[start].add(new Edge(end, 1));
        }
        //출발 도시
        distance[X] = 0;
        dijkstra();
        int answer = 0;
        
        for(int i=1; i<distance.length; i++){
            int d = distance[i];
            
            if(d==K) {
                System.out.println(i);
                answer++;
            }
        }
        if (answer==0) System.out.println(-1);
    }

    private static void dijkstra() {
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.add(new Edge(X, 0));
        
        while(!queue.isEmpty()) {
            Edge edge = queue.poll();
            int vertex = edge.vertex;
            int cost = edge.cost;
            
            if(distance[vertex]<cost) {
                continue;
            }
            
            //해당 도시와 연결 되어 있는 도시들 탐색
            for(int i=0; i<edgeList[vertex].size(); i++) {  
                int v = edgeList[vertex].get(i).vertex;
                int c = edgeList[vertex].get(i).cost + cost;
                
                //최단 경로 저장
                if(distance[v]>c) { 
                    distance[v] = c;
                    queue.add(new Edge(v, c));
                }
            }
        }
    }

    private static class Edge implements Comparable<Edge> {
        int vertex;
        int cost;

        public Edge(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) { 
            return cost - o.cost;
        }
    }
}

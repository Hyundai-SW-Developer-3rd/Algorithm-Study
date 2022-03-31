import java.util.PriorityQueue;

public class scoville{

    /* ��� ������ ���ں� ������ k �̻����� ���� �� ���� ��쿡�� -1 return */
    /* PriorityQueue ���                                       */
    /* PriorityQueue�� ���� ������ �� �����̴�.                      */
    /* ������ ���� ���� ���� offer �Ͽ��� �� �ڱ� �ڽ��� �ڸ��� ã�ư���.    */
    /* �켱������ ���� ������ ���� �� �־�� �Ѵ�.                       */
    /* PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();                           ���� ���� �� */
    /* PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); ���� ���� �� */
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int count = 0;
        int failure = 1;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0 ; i < scoville.length ; i++){
            queue.add(scoville[i]);
        }
        
        for(int i = 0 ; i < scoville.length -1 ; i++){
            if(queue.peek() < k){
                int a = queue.poll();
                int b = queue.poll();
                int result = a + b * 2;
                queue.offer(result);
                count++;
            }else{
                break;
            }
        }
        if(queue.peek() < k){
            System.out.println(failure * -1);
        }else{
            System.out.println(count);
        }
    }
}
import java.util.HashSet;
import java.util.*;

public class gym_clothes{
    /* �ڷᱸ��: set                                          */
    /* �ֿ� �޼ҵ� : add(), remove(), contains()               */
    /* 1. �������� �ִ� �л��� Rset�� �����Ѵ�.                     */
    /* 2. ���� ���ϸ��� �л��� Rset�� ���ԵǾ� �ִٸ�                 */
    /* -> ���ϸ��� �л� = �������� ������ �ִ� �л�                   */
    /* -> Rset���� �ش� �л��� �����Ѵ�.                           */
    /* -> �ƴ϶�� Lset�� �����Ѵ�                                */
    /* 3. �������� �ִ� �л����� 1�� ���� Lset�� ���������             */
    /* -> Lset���� -1�� ���� �����Ѵ�.                            */
    /* -> 1�� ���� ���� Lset�� ��������� Lset���� 1 ���� ���� �����Ѵ�. */
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        int answer = 0;
        

        Set<Integer> Rset = new HashSet<>();
        Set<Integer> Lset = new HashSet<>();

        for(int i = 0; i < reserve.length ; i++){
            Rset.add(reserve[i]);
        }

        for(int i = 0; i < lost.length ; i++){
            if(Rset.contains(lost[i])){
                Rset.remove(lost[i]);
            }else{
                Lset.add(lost[i]);
            }
        }

        for (Integer i : Rset) {
            if(Lset.contains(i-1)){
                Lset.remove(i-1);
            }else if(Lset.contains(i+1)){
                Lset.remove(i+1);
            }
        }
        answer = n - Lset.size();
        System.out.println(answer);
    }
}
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class failure_rate {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = new int[N];
        double[] user = new double[N+1];

        for(int i : stages){
            if(i == N+1){
                continue;
            }
            user[i]++;
        }
        ArrayList<Double> fail = new ArrayList<Double>();

        //���������� ������ ���
        double num =stages.length;
        //���� ���������� �ö󰥶� �پ��� ����ڼ��� ����ϱ� ���� ���
        double tmp = 0;

        //�������� ���� �� �ٽ� stage�迭�� ���, fail ����Ʈ���� ����ش�.
        for(int i=1; i<user.length; i++){
            tmp = user[i];
            // ������ ����� ���� 0 �϶�, �������� 0
            if(num == 0){
                user[i]=0;
            }else{
                user[i] = user[i]/num;
                num = num - tmp;
            }
            fail.add(user[i]);
      }

     //  fail ����Ʈ�� ������������ �������ش�.
     Collections.sort(fail,Collections.reverseOrder());

     //���ĵ� fail����Ʈ ���� stage���� ���ؼ� ������ stage�� �ε�����ȣ(����������ȣ)�� ���������ν�
     //�������� ���� ������ answer�迭�� �־��ش�.
     for(int i=0; i<fail.size(); i++){
         for(int j=1; j<user.length; j++){
             if(fail.get(i) == user[j]){
                 answer[i] = j;
                 user[j] = -1;
                 break;
            }
        }
    }
    for (int a : answer) {
        System.out.println(a);
    }   
  }
}


import java.util.HashMap;

/* �˰��� : �ؽ� ���α׷��ӽ� level2, ���� */

/* �˰��� */
/* 1. 2���� �迭�� �ִ� ���� ������ key, ���� �̸��� value�� �ִ´�.                     */
/* 2. ������� value�� 2�̸� ���� ������ 2������� ���̴�.                              */
/* 3. ����� ���� 1�� ���� �Դ´�, 2�� ���� �Դ´�, ���� ���� �ʴ´� 3���� ����� ���� ���´�.  */
/* 4. value = [1,2] �� ��찡 ������ (1+1)X(2+1) - 1 �� ���ָ� �ȴ�.                */
/* 5. 1�� ���� ������ �� ������ �� ��� ���� �ʾ����� �̴�.                              */

public class hash03 {
    public static void main(String[] args) {
        HashMap<String, Integer> answerMap = new HashMap<>();
        String[][] clothes = {{"yellowhat", "headgear"},
        {"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
        int answer = 1;
    
        for(int i = 0 ; i < clothes.length ; i++){
            String cloth = clothes[i][1];
            if(answerMap.containsKey(cloth)){
                int count = (int)answerMap.get(cloth);
                answerMap.put(cloth, ++count);
            }else{
                answerMap.put(cloth, 1);
            }
        }
        for (int key : answerMap.values()) {
            answer = answer * (key+1);
        }
        answer = answer -1;
        System.out.println(answer);
    }
    
}

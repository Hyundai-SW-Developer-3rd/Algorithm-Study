import java.util.*;

public class report_result {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        String[] k_answer = new String[report.length]; 
        String[] v_answer = new String[report.length];
        int k = 2;
        int[] ret = new int[id_list.length];

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, ArrayList<Integer>> list = new HashMap<String, ArrayList<Integer>>();
        
        for(int i = 0 ; i < id_list.length ; i++){
            map.put(id_list[i], i);
        }
        //����� �̸��� ������ �ʱ�ȭ �Ѵ�. 
        //integer������ ����� �Ǻ��ϱ� ����.
        System.out.println(map);

        for(int i = 0 ; i < report.length ; i++){
            int idx = report[i].indexOf(" ");
            k_answer[i] = report[i].substring(0, idx);
            v_answer[i] = report[i].substring(idx+1);

            if(!list.containsKey(v_answer[i])){
                list.put(v_answer[i], new ArrayList<>());
            }
            //�Ű���ѻ���� ����Ʈ�� ������ ����Ʈ�� key = �Ű���ѻ��, value = ����Ʈ�������� �����Ѵ�.

            ArrayList<Integer> temp =  list.get(v_answer[i]);
            //list�� �Ű���ѻ���� value(int��)���� ����.

            if(!temp.contains(map.get(k_answer[i]))){
                temp.add(map.get(k_answer[i]));
            }
            //�Ű� ���ѻ���� temp�� ������ �Ű���ѻ���� value(int��) temp�� �����Ѵ�.
            System.out.println(list);
        }

        System.out.println(list);

        for(int i = 0 ; i < id_list.length ; i++){
            String id = id_list[i];
            if(list.containsKey(id) && list.get(id).size()>=k){
                for(int idx : list.get(id)){
                    ret[idx]++;
                }
            }  
        }
        //id��(key : �Ű���ѻ��)�� list�� �ְ�, value�� size�� k���� ũ�ų� ������
        //����ִ� �迭 idx�� �Ű���ѻ���� index�� ã�Ƽ� �迭���� 1�� �����ش�.

        for(int i = 0 ; i < ret.length ; i++){
            System.out.println(ret[i]);
        }
    }
}

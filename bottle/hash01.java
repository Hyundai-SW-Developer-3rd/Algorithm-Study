import java.util.HashMap;

public class hash01 {
    /* �ּ� �߰� !! */

    public static void main(String[] args) {
        
        String answer = " ";
        String[] participant = {"mislav","stanko","mislav","ana"};
        String[] completion = {"stanko","ana","mislav"};
        HashMap<String, Integer> answerMap = new HashMap<>();
    
        for(int i = 0 ; i < participant.length; i++){
            String name = participant[i];
            if(answerMap.containsKey(name)){
                int count = (int)answerMap.get(name);
                answerMap.put(name, ++count);
            }else{
                answerMap.put(name, 1);
            }
            //name���� ������ name, 1 ����
            //name���� ������ name ���� ���� hash ���� count�� ����
            // -> 1���� ���Ѽ� answerMap�� ����
        }

        for(int i = 0 ; i < completion.length ; i++){
            int count = (int) answerMap.get(completion[i]);
            //answerMap�� ������ hash ���� �޾ƿͼ� count�� ����
            String name = completion[i];
            if(count == 1){
                answerMap.remove(name);
            }else{
                answerMap.put(name, --count);
            }
            //count�� 1�̻��̸� : ���������� �ִٸ� -> 1�� ����
            //count�� 1�̸� : ���� ����
        }
        String temp = answerMap.keySet().toString();
        
        //keySet()�� key ���� ���  
        //values()�� value ���� ���
        answer = temp.substring(1, temp.length()-1);
        //[] ���ȣ ���� 
        //���ڿ��� �糡�� ������ �� �ַ� ��� substring(1, temp.length() - 1);
        System.out.println(answer);

    }
}

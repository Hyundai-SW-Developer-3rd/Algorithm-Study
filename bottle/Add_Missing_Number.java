/* �ؽ� ���α׷��ӽ� level1, ���� ���� ���ϱ�  */
/* 1. 0 ~ 9�� ������ temp�� �ʱ�ȭ �Ѵ�.    */
/* 2. �迭���� ������� temp���� ���ش�.      */
/* 3. return temp                      */

public class Add_Missing_Number {
    public static void main(String[] args) {
        int[] number = {5,8,4,0,6,7,9};
        int temp = 45;
        for(int i = 0 ; i < number.length ; i++){
            temp -= number[i];
        }
        System.out.println(temp);

    }
}

public class negative_positive_plus{

    /* ���α׷��ӽ� level1 ���� ���ϱ�*/
    /* if���� ���Ͽ� boolean �迭�� true, false ���� �Ǵ��Ѵ�.*/
    /* false �̸� -1�� ���Ͽ� ������ �ٲ��ش�.               */
    /* ���� temp[]�迭 ���������� �����Ѵ�.                  */
    /* foreach ���� ���Ͽ� temp ���� sum�� �ְ� �����ش�.    */
    public static void main(String[] args) {
        int[] absolutes ={4,7,12};
        boolean[] bool ={true,false,true};
        int[] temp = new int[absolutes.length];
        int sum = 0;
        for(int i = 0 ; i < absolutes.length ; i++){
            if(bool[i] == true){
                temp[i] = absolutes[i];
            }else temp[i] = (absolutes[i] * -1);
        }
        for (int i : temp) {
            sum += i;
        }
        System.out.println(sum);
    }
}
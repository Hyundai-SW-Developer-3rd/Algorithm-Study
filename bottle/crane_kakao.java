import java.util.Stack;

/* ���α׷��ӽ� level1 ũ���� �̱� ����                                    */
/* �ڷᱸ�� : stack                                                   */
/* 1. i = 0 ���Ͷ�� ���� �Ͽ��� �� board[0][i]��°�� �������� �������� �����Ѵ�. */
/* 2. moves �迭�� ���� �ǹ��ϰ� 0 ~ n ��° ���� ���� �����ؾ� �Ѵ�.            */
/* 3. foreach���� ���Ͽ� mov�� moves �迭�� �ְ� �� ���� ���� 0�� ������ ���� �� */
/*    ���� �����Ѵ�. 0�� �ƴϸ� �� ���� stack�� top�� ���ϰ� ���� ������ stack  */
/*    �� �ִ´�. ���� ���ٸ� pop �ϰ� 2���� ���� ������� ������ answer�� 2�� +  */
/* 4. ���� ������ ���� �Ǿ����� stack�� �ش� ���� �̵��� �����̱� ������          */
/*    �� ���� 0���� �ٲٰ� ���� ������ �����Ѵ�.                               */
public class crane_kakao {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for (Integer mov : moves) {
            for(int i = 0 ; i < board.length ; i++){
                if(board[i][mov-1] != 0 ){
                    if(stack.peek() == board[i][mov-1]){
                        stack.pop();
                        answer += 2;
                    }else stack.push(board[i][mov-1]);
                    board[i][mov-1] = 0;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
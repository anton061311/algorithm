/**
 * - flag 대신에 기준으로 삼은 변수의 상태(null)을 통해 판별하는 방법도 있다는 것을 알아두길
 */
package myself.l05stackQueue;

import java.util.*;

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}


public class Main0508 {

    public int solution(int N, int M, int[] arr){
        int answer = 0;
        Queue<Person> personQueue = new LinkedList<>();
        for (int i = 0; i < N; i++) personQueue.offer(new Person(i,arr[i]));

        while(!personQueue.isEmpty()){
            Person tmp = personQueue.poll();
            for(Person x : personQueue){
                if(x.priority > tmp.priority){
                    personQueue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                answer++;
                if(tmp.id == M) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main0508 T = new Main0508();
        Scanner kb = new Scanner(System.in);
        int N=kb.nextInt();
        int M=kb.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(N, M, arr));
    }
}

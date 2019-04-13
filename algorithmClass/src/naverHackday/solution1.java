package naverHackday;


public class solution1 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 = {1,1,6};
        int[] a3 = {1, 6, 2, 3};
        int[] a4 = {3,4,4,1,2,6};
        //System.out.println(solution(a1));
        //System.out.println(solution(a2));
        System.out.println(solution(a4));
    }
    static public int solution(int[] A){

        int[] temp = new int[7]; //주사위 배열

        for(int i=0; i<A.length; i++){
            temp[A[i]]++;  //인덱스에해당하는 주사위저장
        }
        int many = -1;  //많은 중복 수
        int mindex = 1;
        for(int i=1; i<temp.length; i++){
            if(temp[i]==0)
                continue;

            if( many<temp[i] && temp[7-i]<=0) {
                many = temp[i];
                mindex = i;
            }
        }
        System.out.println("mindex: "+mindex);
        //[1,1,1,0,0,1]
        //[2,0,0,0,0,1]
        int sum=0;
        for(int i=1; i<temp.length; i++){
            if(temp[i] == 0)
                continue;

            if(mindex == i)
                continue;

            if(mindex + i == 7){
                sum += temp[i]*2;
                System.out.println("+2: "+i);
            }else{
                sum += temp[i]*1;
                System.out.println("+1: "+i);
            }
        }

        return sum;

    }
}

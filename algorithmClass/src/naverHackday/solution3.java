package naverHackday;

public class solution3 {
    //5 -2 3 8 6
    public static void main(String[] args) {
        int[] a1 = {5,-2,3,8,6};
        int[] a3 = {5,-2,3,8,4,10,6,12};
        int[] a2 = {-5,-5,-5,-42,6,12};

        System.out.println(solution(a2));
    }

    static public int solution(int[] T){
        int barri = T[0]; //겨울 경계값
        int max = T[0]; //겨울 최댓값
        int count = 0; //겨울개수

        for(int i=0; i<T.length; i++){
            if(max<T[i]){
                barri = T[i]; //큰수나타난경우 겨울과 여름경계임
                for(int j=i+1; j<T.length; j++){ //경계뒤에 겨울체크
                    if(max > T[j]){
                        max = barri; //잇는경우 경계값이 겨울최대값이됨
                        count++;
                        break;
                    }
                }
            }else{
                count++;
            }
        }
        return count;
    }
}

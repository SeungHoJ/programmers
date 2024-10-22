import java.util.*;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] notice = new int[answer.length];
        Set<String> set = new LinkedHashSet<>(Arrays.asList(report));
        List<String> list = new ArrayList<>();
        for(String s : set){
            String[] str = s.split(" ");
            for(int j = 0; j < id_list.length; j++){
                if(str[1].equals(id_list[j])){
                    notice[j]++;
                    break;
                }
            }
        }
        for(int i = 0; i < notice.length; i++){
            if(notice[i] >= k){
                list.add(id_list[i]);
            }
        }
        for(String s : set){
            String[] str1 = s.split(" ");
            for(int j = 0; j < list.size(); j++){
                if(str1[1].equals(list.get(j))){
                    int idx = Arrays.asList(id_list).indexOf(str1[0]);
                    answer[idx]++;
                }
            }
        }
        
        return answer;
    }
}
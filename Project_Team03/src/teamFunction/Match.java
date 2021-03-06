package teamFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//경기 하는데에  필요한 함수 를 모아둔 클래스
public class Match {
   HashMap<String, Integer> match = new HashMap<>();
   FileDB f = new FileDB();
   static String[] array2 = { "광주", "서울", "성남", "전북", "전남", "인천", "제주", "포항" };
   TeamPlayer tp = new TeamPlayer();
   ArrayList<String> winArray = new ArrayList<>();
   public Match() {
      match.put("광주", tp.keyplayer_Select("광주"));
      match.put("서울", tp.keyplayer_Select("서울"));
      match.put("성남", tp.keyplayer_Select("성남"));
      match.put("전북", tp.keyplayer_Select("전북"));
      match.put("전남", tp.keyplayer_Select("전남"));
      match.put("인천", tp.keyplayer_Select("인천"));
      match.put("제주", tp.keyplayer_Select("제주"));
      match.put("포항", tp.keyplayer_Select("포항"));
      // 각 팀의 이름과 hp의 평균치를 hashmap에 저장
   }
   public String[] match_First() {
      // 랜덤 함수로 8개의 팀을 매치
      Collections.shuffle(Arrays.asList(array2));
      int index = 0;
      for (String value : array2) {
         array2[index] = value;
         index++;
      }
      
      return array2;
   }
   public ArrayList<String> quarter_Final(ArrayList<String> arrayList) {
      // hp가큰것->0,2,4,6이 짝수로 가도록 할 것
      // 작은것 ->1,3,5,7
      String temp = null;
      for (int i = 0; i < arrayList.size(); i += 2) {

         if (match.get(arrayList.get(i)) <= match.get(arrayList.get(i+1))) {
            temp = arrayList.get(i);
            arrayList.set(i,arrayList.get(i + 1));
            arrayList.set(i+1,temp);
            }
      }
      int index=0;
      ArrayList<String> winArray = new ArrayList<>();
      for (int i = 0; i <  arrayList.size(); i += 2) {
         winArray.add(arrayList.get(i));
      }
      return winArray;
      // array함수에 짝수번에 있는 것이 준결승에 올라간다
   }



}
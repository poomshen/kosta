package teamFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//��� �ϴµ���  �ʿ��� �Լ� �� ��Ƶ� Ŭ����
public class Match {
   HashMap<String, Integer> match = new HashMap<>();
   FileDB f = new FileDB();
   static String[] array2 = { "����", "����", "����", "����", "����", "��õ", "����", "����" };
   TeamPlayer tp = new TeamPlayer();
   ArrayList<String> winArray = new ArrayList<>();
   public Match() {
      match.put("����", tp.keyplayer_Select("����"));
      match.put("����", tp.keyplayer_Select("����"));
      match.put("����", tp.keyplayer_Select("����"));
      match.put("����", tp.keyplayer_Select("����"));
      match.put("����", tp.keyplayer_Select("����"));
      match.put("��õ", tp.keyplayer_Select("��õ"));
      match.put("����", tp.keyplayer_Select("����"));
      match.put("����", tp.keyplayer_Select("����"));
      // �� ���� �̸��� hp�� ���ġ�� hashmap�� ����
   }
   public String[] match_First() {
      // ���� �Լ��� 8���� ���� ��ġ
      Collections.shuffle(Arrays.asList(array2));
      int index = 0;
      for (String value : array2) {
         array2[index] = value;
         index++;
      }
      
      return array2;
   }
   public ArrayList<String> quarter_Final(ArrayList<String> arrayList) {
      // hp��ū��->0,2,4,6�� ¦���� ������ �� ��
      // ������ ->1,3,5,7
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
      // array�Լ��� ¦������ �ִ� ���� �ذ�¿� �ö󰣴�
   }



}
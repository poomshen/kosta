package teamFunction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import teamDTO.PlayerDTO;
import teamDTO.TeamDTO;

//파일 입출력 관련 클래스
public class FileDB {
	public static ArrayList<TeamDTO> teamAll = new ArrayList<TeamDTO>();
	static String[] array = { "광주", "서울", "성남", "전북", "전남", "인천", "제주", "포항" };
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	// 파일 뽑아되는것들
	// 선수 뽑아와야하고

	// 팀의 선수들 파일을 저장 함수
	static public void playerDBout() {
		for (int i = 0; i < array.length; i++) {
			String st = array[i] + ".txt";
			File file = new File(st);
			try {
				FileWriter writer = new FileWriter(file);
				ArrayList<PlayerDTO> list = new ArrayList<PlayerDTO>();
				list = teamAll.get(i).getPlaylist();
				String msg = (teamAll.get(i).isRegister()) ? "Y" : "N";
				String mg = "";
				for (PlayerDTO a : list) {
					mg = (a.isKeyPlayer()) ? "주전" : "후보";
					msg += "!" + a.getName() + "@" + a.getNober() + "#" + a.getPosition() + "$" + mg + "%";
				}
				writer.write(msg);
				writer.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// 팀의 선수들 파일을 읽어 오는 기능
	static public void playerDBin() {
		for (int i = 0; i < array.length; i++) {
			String st = array[i] + ".txt";// 파일이름을 String에 저장
			File file = new File(st);// 파일 저장
			try {
				FileReader reader = new FileReader(file);// 파일읽음
				int date = 0;
				String name = "";
				String nober = "";
				String position = "";
				String keyPlayer = "";
				String total = "";// 선수파일 읽고 쓰는 로직에 필요한 변수
				boolean key;
				boolean key2 = true;
				PlayerDTO player;
				ArrayList<PlayerDTO> playerDTOs = new ArrayList<>();
				while ((date = reader.read()) != -1) {
					if ('!' == date) {
						total = "";
					} else if ('@' == date) {
						name = total;
						total = "";
					} else if ('#' == date) {
						nober = total;
						total = "";
					} else if ('$' == date) {
						position = total;
						total = "";
					} else if ('%' == date) {
						keyPlayer = total;
						total = "";
						key = (keyPlayer.equals("후보")) ? false : true;
						player = new PlayerDTO();
						player.allPlayer(name, Integer.parseInt(nober), position, key);
						playerDTOs.add(player);
					} else if ('Y' == date) {
						total = "";
						key2 = true;
					} else if ('N' == date) {
						total = "";
						key2 = false;
					} else {
						total += (char) date;
					}
				}
				teamAll.add(new TeamDTO(array[i], "1234", key2, playerDTOs));
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	// 파일 입출력 관련 클래스

	// 8강전에 진출하는 팀의 목록을 파일에 저장
	public void match_Writer(String[] match) {
		
		 BufferedWriter bw=null;
		
		try {
			bw = new BufferedWriter(new FileWriter("First_result.txt"));
			for (int i = 0; i < match.length; i++) {
				bw.write(match[i] + ",");
			}
			bw.flush();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	public void match_Writer(ArrayList<String> match) {
		
		BufferedWriter bw=null;
		
		try {
			bw = new BufferedWriter(new FileWriter("First_result.txt"));
			for (int i = 0; i < match.size(); i++) {
				bw.write(match.get(i) + ",");
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	//진출하는 팀의 목록을 파일에서 읽어 들여올 것!
	
	public ArrayList<String> math_Reader(){
		BufferedReader br = null;
		ArrayList<String> match_array =new ArrayList<>();		
		try{
			br = new BufferedReader(new FileReader("First_result.txt"));
			String s ="";
			String[] s2;
			while((s= br.readLine())!=null){
				s2 = s.split(",");
				for(int i =0 ; i<s2.length ; i++){
					match_array.add(s2[i]);
				}
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return match_array;		
	}



}

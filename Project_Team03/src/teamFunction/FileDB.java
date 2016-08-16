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

//���� ����� ���� Ŭ����
public class FileDB {
	public static ArrayList<TeamDTO> teamAll = new ArrayList<TeamDTO>();
	static String[] array = { "����", "����", "����", "����", "����", "��õ", "����", "����" };
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	// ���� �̾ƵǴ°͵�
	// ���� �̾ƿ;��ϰ�

	// ���� ������ ������ ���� �Լ�
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
					mg = (a.isKeyPlayer()) ? "����" : "�ĺ�";
					msg += "!" + a.getName() + "@" + a.getNober() + "#" + a.getPosition() + "$" + mg + "%";
				}
				writer.write(msg);
				writer.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// ���� ������ ������ �о� ���� ���
	static public void playerDBin() {
		for (int i = 0; i < array.length; i++) {
			String st = array[i] + ".txt";// �����̸��� String�� ����
			File file = new File(st);// ���� ����
			try {
				FileReader reader = new FileReader(file);// ��������
				int date = 0;
				String name = "";
				String nober = "";
				String position = "";
				String keyPlayer = "";
				String total = "";// �������� �а� ���� ������ �ʿ��� ����
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
						key = (keyPlayer.equals("�ĺ�")) ? false : true;
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
	// ���� ����� ���� Ŭ����

	// 8������ �����ϴ� ���� ����� ���Ͽ� ����
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
	
	//�����ϴ� ���� ����� ���Ͽ��� �о� �鿩�� ��!
	
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

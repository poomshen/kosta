import java.net.InetAddress;

//Java API �����ϴ� ��Ʈ��ũ ���� Ŭ����
public class Ex01_InetAddress {
	public static void main(String[] args) {
		InetAddress inet  = null;
		String domain = "www.google.com";
		try {
			inet = InetAddress.getByName(domain);
//			System.out.println(inet.getHostAddress());
//			System.out.println(inet.getHostName());
			
			InetAddress [] inetAddr = InetAddress.getAllByName(domain);
			for(InetAddress addr: inetAddr ){
				System.out.println(addr.toString());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

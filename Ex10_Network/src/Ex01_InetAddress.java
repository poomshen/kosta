import java.net.InetAddress;

//Java API 제공하는 네트워크 관련 클래스
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

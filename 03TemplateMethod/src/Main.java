import com.kim.dp.AbstGameConnectHelper;
import com.kim.dp.DefaultGameConnectionHelper;

public class Main {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectionHelper();
		
		helper.requestConnection("아이디 암호 등 접속 정보");
	}

}

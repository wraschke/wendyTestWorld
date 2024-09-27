import java.util.HashMap;
import java.util.Map;

public class MapinForLoopClass {

	public static void main(String[] args) {
		Map<String, String> testMap = new HashMap<String, String>();
		String key = null;
		String value = null;
		
		for (int i = 0; i < 5; i++) {
			//key = "Key " + i;
			key = "same_key";
			value = "Value " + i;
			testMap.put(key, value);
		}
		
		System.out.println("map size = " + testMap.size());
	}

}
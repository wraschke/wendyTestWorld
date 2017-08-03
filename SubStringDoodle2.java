public class SubStringDoodle2 {

	public static void main(String[] args) {
		
		String url = "https://github.ibm.com/api/v3/repos/was-liberty/WS-CD-Open/pulls/650/files?access_token=32b36940db117bce1110710386424afdfec958fa";
		
		//System.out.println("URL = " + url);
		
		if (url.indexOf("?access_token=") > 0) {
			url = url.substring(0, url.indexOf("?access_token=") + 14) + "<redacted>";
		}
		
		//System.out.println("URL is now " + url);
		
		String baseApiUrl = "https://api.github.com/repos/wraschke/wendyTestWorld";
		
		//System.out.println("last index of \"https://api.github.com/repos/\" = " + baseApiUrl.indexOf("https://api.github.com/repos/"));
		String orgName = baseApiUrl.substring(baseApiUrl.indexOf("https://api.github.com/repos/") + 29, baseApiUrl.lastIndexOf("/"));
		System.out.println("orgName = " + orgName);
		
		String newBaseApiUrl = baseApiUrl.substring(0, baseApiUrl.lastIndexOf("repos/"));
		System.out.println("newBaseApiUrl = " + newBaseApiUrl);
	}
}
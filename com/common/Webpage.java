package common;

import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Webpage {
	
	//main URL of webpage
	public String URL = null;
	
	//source of the webpage
	HtmlPage source = null;
	
	public Webpage(String tempURL) {
		
		URL = tempURL;
		
	}

}

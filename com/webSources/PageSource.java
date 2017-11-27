package webSources;

import java.io.IOException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import common.Logging;

/**
 * This class is used to read the websites page source. It is a
 * singlton class and is thread safe
 */

public class PageSource {

	private static PageSource instance;

	private PageSource(){}
	
	//Method to create singleton class - double checked locking method
	public static synchronized PageSource getInstance(){
		
	        if(instance == null){
	        	instance = new PageSource();
	        }
	        
	        return instance;
	}
	
	
	public static String getPageSource(String URL) {
			
		WebClient webClient = new WebClient();
		HtmlPage mySite = null;
		
		try {
			mySite = webClient.getPage(URL);
		} catch (FailingHttpStatusCodeException e) {
			Logging.logger.debug(e.getMessage());
		} catch (IOException e) {
			Logging.logger.debug(e.getMessage());
		}
		
		String content = mySite.toString();
		webClient.close();
		
		return content.toString();
		
	}

}

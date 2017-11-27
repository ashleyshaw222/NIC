package common;

import tescoWebpages.MainTescoWebpage;
import webSources.PageSource;

public class TestEntryPoint {

	public static void main(String[] args) {
		
		
		Logging.logger.debug("something");
		
		MainTescoWebpage mtw = new MainTescoWebpage("https://www.tesco.com/groceries/");
		
		Logging.logger.debug(mtw.URL);
		
		//PageSource.getInstance();
		String str = PageSource.getPageSource(mtw.URL);
		
		Logging.logger.debug(str);
			

	}

}

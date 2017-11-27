package tescoWebpages;

import java.util.List;

import com.gargoylesoftware.htmlunit.html.HtmlOption;

import common.Webpage;

/**
 * This class is designed to contain the details of the main webpage
 * https://www.tesco.com/groceries/
 * All the subMenus will be obtained from this webpage
 */

public class MainTescoWebpage extends Webpage {
	
	//list of all the options on a submenu
	List<HtmlOption> options = null;
	
	public MainTescoWebpage(String tempURL) {
		
		super(tempURL);
		
	}
	
}

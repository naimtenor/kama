package sally;

import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Maker {
	
	public static final String ROOT_PATH = "/Users/devcraft40/Documents/xeed/workspace/cjz-test-kama-datamaker/";

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParserConfigurationException {
		List<String> makerList = Arrays.asList(new String[] {"sally.eomi.EomiDataMaker"});
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		for (String makerName : makerList) {
			@SuppressWarnings("unchecked")
			Class<DataMaker> dataMaker = (Class<DataMaker>) Class.forName(makerName);
			dataMaker.newInstance().make(builder);
		}
	}
}

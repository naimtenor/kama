package sally.eomi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;

import sally.DataMaker;
import sally.Maker;

public class EomiDataMaker implements DataMaker {

	@Override
	public void make(DocumentBuilder builder) {
		// TODO Auto-generated method stub
		System.out.println("make eomi data....................");
		Path eomiPath = Paths.get(Maker.ROOT_PATH + "data/eomi/");
		
		try {
			Stream<Path> path = Files.list(eomiPath);
			Iterator<Path> pIter = path.iterator();
			
			StringBuilder dataBuilder = new StringBuilder();
			while (pIter.hasNext()) {
				Path pPath = pIter.next();
				if (pPath.getFileName().toString().endsWith(".dtd")) {
					continue;
				}
				
				dataBuilder.append(pPath.getFileName().toString().replace(".xml", ""));
				dataBuilder.append("/");
//				Document document = builder.parse(pPath.toFile());
			}
			String data = dataBuilder.substring(0, dataBuilder.length() - 1).toString();
			
			Path dicPath = Paths.get(Maker.ROOT_PATH + "/dic/eomi.dic");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

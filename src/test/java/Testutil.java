
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Testutil {

	public static void writeToFile(String fileName,String content) throws IOException {
		// TODO Auto-generated method stub
		Path path=Paths.get(fileName);
		byte[] bytes=content.getBytes();
		Files.write(path,bytes);

	}

}

package file_in;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//この書き方だと実行する度に無駄列が増えてしまう

public class Write_gps {
	public static void export_gpstxt(String img_path, String img_name, float lat, float lng){
		try {
			FileWriter fw = new FileWriter(img_path+"\\gps.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.format("%s, %f, %f\n", img_name, lat, lng);
			pw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

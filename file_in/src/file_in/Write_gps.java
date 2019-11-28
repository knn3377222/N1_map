package file_in;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Write_gps {

	//書き込み先のファイルを作る
	
	public void make_gpstxt(String strage_path){
		try {
			PrintWriter pw = new PrintWriter(strage_path+"\\gps.txt");
			pw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	

	public void export_gpstxt(String img_path, String img_name, float lat, float lng){
		try {
			FileWriter fw = new FileWriter(img_path+"\\gps.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			//pw.format("%s, %s, %f, %f", img_path, img_name, lat, lng);
			pw.println(img_path+","+img_name+","+lat+","+lng);
			pw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

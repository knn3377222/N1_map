package file_in;

import java.io.File;

public class File_load {
	//+フォルダのある絶対Path(引数で読み取りたい)
	static String dir_path = "C:\\Users\\sludge-s\\Pictures\\2018-11-24";

	public static void main(String[] args){
		if( args.length > 0 ){
			dir_path = args[0];
		}

		String extension = ".jpg";   //検索したいファイルの拡張子
		file_search(dir_path, extension);
	}

	public static void file_search(String path, String extension){
		File dir = new File(path);
		File files[] = dir.listFiles();
		for(int i=0; i<files.length; i++){
			String file_name = files[i].getName();
			if(files[i].isDirectory()){  //ディレクトリなら再帰を行う
				//+今回は行わずに()
				//file_search(path+"/"+file_name, extension);
			}else{
				if(file_name.endsWith(extension)){  	//file_nameの最後尾(拡張子)が指定のものならば出力
					Exif.Exif_load(path,file_name);
				}
			}
		}
	}
}


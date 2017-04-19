package pack;

import java.io.*;

public class MyFileHandler {
<<<<<<< HEAD
	private int[][] pyramid, pyramidColors;
	
	public MyFileHandler() {
		
	}
	
	public int[][] getColors(){
		return pyramidColors;
	}
	
	public int[][] getPyramid(){
		return pyramid;
	}
	
	public int readFile(String path) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String size = reader.readLine();
		int sizeint = Integer.parseInt(size.trim());
		pyramid = new int[sizeint][sizeint];
		pyramidColors= new int[sizeint][sizeint];
		for (int i = 0; i < sizeint; i++) {
			for (int j = 0; j < sizeint; j++) {
				pyramid[i][j]= -1;
				pyramidColors[i][j]= -1;
			}
		}
=======
	public static int[][] readFile(String path) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(path));
		int[][] piramid;
		String size = reader.readLine();
		int sizeint = Integer.parseInt(size.trim());
		piramid = new int[sizeint][sizeint];
>>>>>>> a9d310b36366bc5e41e145107e31a029558161bd
		int linenumber=0;
		while(reader.ready()){
			String line = reader.readLine();
			String[] pieces = line.trim().split(" ");
			int length= pieces.length;
			for (int i = 0; i < pieces.length; i++) {
<<<<<<< HEAD
				if(pieces[i].equals("R")){
					pyramid[linenumber][i] = 0;
					pyramidColors[linenumber][i] = -2;
				}else if(pieces[i].equals("B")){
					pyramid[linenumber][i] = 0;
					pyramidColors[linenumber][i] = -3;
				}else if(pieces[i].equals("Y")){
					pyramid[linenumber][i] = 0;
					pyramidColors[linenumber][i] = -4;
				}else if(pieces[i].equals("*")){
					pyramid[linenumber][i] = 0;
					pyramidColors[linenumber][i] = -1;
				}else if(pieces[i] != null){
					pyramid[linenumber][i] = Integer.parseInt(pieces[i]);
					pyramidColors[linenumber][i] = Integer.parseInt(pieces[i]);
				}
				
=======
				piramid[linenumber][i] = Integer.parseInt(pieces[i]);
>>>>>>> a9d310b36366bc5e41e145107e31a029558161bd
			}
		linenumber++;
		}
		reader.close();
		return sizeint;
	}
	
	
	
}

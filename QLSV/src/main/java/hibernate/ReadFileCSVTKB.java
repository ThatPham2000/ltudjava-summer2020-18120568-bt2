package hibernate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadFileCSVTKB {
private static final String COMMA = ",";
	
	//Chi so cua thuoc tinh
	private static final int STUDENT_MAMON = 0;
	private static final int STUDENT_TENMON = 1;
	private static final int STUDENT_PHONGHOC = 2;
	
	public static void ReadCSV(String filename, List <TkbEntity> studentlist)
	{
		BufferedReader Filereader = null;
		try
		{
			
			String line = "";
			
			//Tao file reader
			Filereader = new BufferedReader(new FileReader(filename));
			
			//Doc file CSV header
			Filereader.readLine();
			
			//Doc du lieu bat dau tu dong thu hai
			while((line = Filereader.readLine()) != null)
			{
				String[] tokens = line.split(COMMA);
				if (tokens.length > 0)
				{
					TkbEntity student = new TkbEntity(tokens[STUDENT_MAMON], tokens[STUDENT_TENMON], tokens[STUDENT_PHONGHOC]);
					studentlist.add(student);
				}
			}
			
			//in danh sach hoc sinh moi
			for(TkbEntity student : studentlist)
			{
				System.out.println(student.toString());
			}
		}
		catch (Exception e)
		{
			System.out.println("ERROR in FilereaderCSV.");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				Filereader.close();
			}
			catch(IOException e)
			{
				System.out.println("ERROR while closing Filereader.");
				e.printStackTrace();
			}
		}
	}
}

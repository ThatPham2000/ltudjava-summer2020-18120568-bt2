package hibernate;

import java.util.*;
import java.io.*;

public class FileReaderCSV
{
	private static final String COMMA = ",";
	
	//Chi so cua thuoc tinh
	private static final int STUDENT_MSSV = 0;
	private static final int STUDENT_HOTEN = 1;
	private static final int STUDENT_GIOITINH = 2;
	private static final int STUDENT_CMND = 3;
	
	public static void ReadCSV(String filename, List <SinhVienEntity> studentlist)
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
					SinhVienEntity student = new SinhVienEntity(tokens[STUDENT_MSSV], tokens[STUDENT_HOTEN], tokens[STUDENT_GIOITINH], tokens[STUDENT_CMND]);
					studentlist.add(student);
				}
			}
			
			//in danh sach hoc sinh moi
			for(SinhVienEntity student : studentlist)
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

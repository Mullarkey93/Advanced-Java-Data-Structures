package mapsql.sql.command;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import mapsql.sql.core.SQLCommand;
import mapsql.sql.core.SQLException;
import mapsql.sql.core.SQLManager;
import mapsql.sql.core.SQLOperation;
import mapsql.shell.parser.MapSQL;
import mapsql.shell.parser.ParseException;
import mapsql.util.List;
import mapsql.shell.parser.SimpleNode;
import java.io.ByteArrayInputStream;

public class Sources implements SQLCommand {
	private String filename;
	
	public Sources(String filename) {
		this.filename = filename;
	}

	/**
	 * Could not complete due to time constraints
	 */
	public String execute(SQLManager manager) throws SQLException {
		
		Scanner scanner = null;
		
		try{
			scanner = new Scanner(new File(filename));
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		while (scanner.hasNextLine())
		{
			String contents = scanner.nextLine();
			
			try{
				SimpleNode node = new MapSQL(new ByteArrayInputStream(contents.getBytes())).Start();
				@SuppressWarnings("unchecked")
				List<SQLOperation> list = (List<SQLOperation>) node.jjtGetValue();
				
				for (SQLOperation operation : list) {
					manager.execute(operation);
				}
			} catch (ParseException e) {
				System.out.println(e);
			}
		}
		return filename + " Finished parsing";
		
		}

		public static void main(String[] args) throws SQLException {
			Sources source = new Sources("test.sql");
			source.execute(null);
		}

}
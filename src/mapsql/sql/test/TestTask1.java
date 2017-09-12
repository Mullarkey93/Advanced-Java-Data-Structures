package mapsql.sql.test;

import mapsql.sql.condition.Equals;
import mapsql.sql.condition.GreaterThan;
import mapsql.sql.condition.GreaterThanOrEqual;
import mapsql.sql.condition.LessThan;
import mapsql.sql.condition.LessThanOrEqual;
import mapsql.sql.condition.Like;
import mapsql.sql.condition.NotEqual;
import mapsql.sql.condition.OrCondition;
import mapsql.sql.core.Condition;
import mapsql.sql.core.Field;
import mapsql.sql.core.SQLException;
import mapsql.sql.core.SQLManager;
import mapsql.sql.core.SQLResult;
import mapsql.sql.core.SQLStatement;
import mapsql.sql.field.CHARACTER;
import mapsql.sql.field.INTEGER;
import mapsql.sql.statement.CreateTable;
import mapsql.sql.statement.Delete;
import mapsql.sql.statement.DropTable;
import mapsql.sql.statement.Insert;
import mapsql.sql.statement.Select;
import mapsql.sql.statement.Update;

public class TestTask1 {
	static SQLManager manager = new SQLManager();
	
	public static void main(String[] args) {
		createTableStatement();

		showTables();
		insertData();
		selectTable();
		testOperators();
	}

	private static void executeStatement(SQLStatement statement) {
		try {
			SQLResult result = manager.execute(statement);
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void createTableStatement() {
		executeStatement(
				new CreateTable(
						"contact", 
						new Field[] {
								new INTEGER("id", true, false, true), 
								new CHARACTER("name", 30, false, true), 
								new CHARACTER("email", 30, false, false)
						}
				)
		);
	}
	
	public static void showTables() {
		executeStatement(new Select("mapsql.tables", new String[] { "*" }));
	}
	
	public static void selectTable() {
		executeStatement(new Select("contact", new String[] { "*" }));
	}
	
	public static void insertData() {
		executeStatement(
				new Insert(
						"contact", 
						new String[] {"name", "email"}, 
						new String[] {"Rem", "rem.collier@ucd.ie"}
				)
		);
		executeStatement(
				new Insert(
						"contact", 
						new String[] {"name", "email"}, 
						new String[] {"don", "don.collier@ucd.ie"}
				)
		);
	}
	
	/**
	 * Question 1 Tests
	 */
	public static void testOperators() {
		System.out.println("======================TESTS=======================");
		executeStatement(new Select("contact", new String[] { "id", "name" }, new GreaterThan("id", "1")));
		executeStatement(new Select("contact", new String[] { "id", "name" }, new GreaterThanOrEqual("id", "1")));
		executeStatement(new Select("contact", new String[] { "id", "name" }, new LessThan("id", "2")));
		executeStatement(new Select("contact", new String[] { "id", "name" }, new LessThanOrEqual("id", "2")));
	}
}


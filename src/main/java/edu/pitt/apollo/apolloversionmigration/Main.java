package edu.pitt.apollo.apolloversionmigration;


import edu.pitt.apollo.javaclassmigrator.Migrator;
import edu.pitt.apollo.javaclassmigrator.util.MigrationUtility;
import edu.pitt.apollo.types.v4_0.Duration;

/**
 * Created by mas400 on 11/21/16.
 */
public class Main {

	private static final String NEW_VERSION = "4_0";
	private static final String OLD_VERSION = "3_1_0";
	private static final String NEW_LINE = "\n";
	public static StringBuffer sb = new StringBuffer();
	
	public static void main(String args[]) throws Exception {
        MigrationUtility.classHasSubclasses(Duration.class);

		Class newClass = edu.pitt.apollo.types.v4_0.DischargePathAndProbability.class;
		Class oldClass = edu.pitt.apollo.types.v3_1_0.DischargePathAndProbability.class;

        String packageName = "edu.pitt.apollo.apolloversionmigration.output";
		String outputDirectory = "./src/main/java/edu/pitt/apollo/apolloversionmigration/output";
		String testOutputDirectory = "";

		Migrator migrator = new Migrator(outputDirectory, testOutputDirectory, packageName);
		migrator.createMigrationFilesForClass("edu.pitt.apollo.types.v4_0.DischargePathAndProbability", "edu.pitt.apollo.types.v3_1_0.DischargePathAndProbability");
	}
}

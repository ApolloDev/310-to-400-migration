package edu.pitt.apollo.apolloversionmigration;


import edu.pitt.apollo.javaclassmigrator.Migrator;
import edu.pitt.apollo.javaclassmigrator.util.MigrationUtility;
import edu.pitt.apollo.types.v4_0_1.Duration;

/**
 * Created by mas400 on 11/21/16.
 */
public class Main {

	public static void main(String args[]) throws Exception {
        MigrationUtility.classHasSubclasses(Duration.class);

//		Class newClass = edu.pitt.apollo.library_service_types.v4_0_1.LibraryCollection.class;
//		Class oldClass = edu.pitt.apollo.library_service_types.v3_1_0.LibraryCollection.class;

		Class newClass = edu.pitt.apollo.types.v4_0_1.Epidemic.class;
		Class oldClass = edu.pitt.apollo.types.v3_1_0.Epidemic.class;

//		Class newClass = edu.pitt.apollo.types.v4_0_1.CaseSeries.class;
//		Class oldClass = edu.pitt.apollo.types.v3_1_0.CaseSeries.class;

        String packageName = "edu.pitt.apollo.apolloversionmigration.output";
		String outputDirectory = "./src/main/java/edu/pitt/apollo/apolloversionmigration/output";
		String testOutputDirectory = "";

		Migrator migrator = new Migrator(outputDirectory, testOutputDirectory, packageName);
		migrator.createMigrationFilesForClass(newClass, oldClass);
	}
}

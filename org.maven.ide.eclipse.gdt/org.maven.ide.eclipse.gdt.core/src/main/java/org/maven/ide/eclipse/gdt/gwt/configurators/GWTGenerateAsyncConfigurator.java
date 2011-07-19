package org.maven.ide.eclipse.gdt.gwt.configurators;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.m2e.core.lifecyclemapping.model.IPluginExecutionMetadata;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.configurator.AbstractBuildParticipant;
import org.eclipse.m2e.jdt.AbstractJavaProjectConfigurator;
import org.maven.ide.eclipse.gdt.gwt.build.GWTGenerateAsyncParticipant;

/**
 * Google Web Toolkit Project configurator.
 * 
 * @author Olivier NOUGUIER olivier.nouguier@gmail.com
 */
public class GWTGenerateAsyncConfigurator extends
		AbstractJavaProjectConfigurator {

	@Override
	public AbstractBuildParticipant getBuildParticipant(
			IMavenProjectFacade projectFacade, MojoExecution execution,
			IPluginExecutionMetadata executionMetadata) {

		return new GWTGenerateAsyncParticipant(projectFacade, execution,
				executionMetadata);

	}

	@Override
	protected String getOutputFolderParameterName() {
		return GWTConfiguratorConstants.GENERATE_DIRECTORY;
	}

}
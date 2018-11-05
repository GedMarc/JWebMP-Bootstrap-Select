import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.bootstrapselect.BootstrapSelectPageConfigurator;
import com.jwebmp.plugins.bootstrapselect.implementations.BootstrapSelectExclusionsModule;

module com.jwebmp.plugins.bootstrapselect {
	exports com.jwebmp.plugins.bootstrapselect;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with BootstrapSelectPageConfigurator;

	provides IGuiceScanModuleExclusions with BootstrapSelectExclusionsModule;
	provides IGuiceScanJarExclusions with BootstrapSelectExclusionsModule;

	opens com.jwebmp.plugins.bootstrapselect to com.fasterxml.jackson.databind, com.jwebmp.core;
}

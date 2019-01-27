module com.jwebmp.plugins.bootstrapselect {
	exports com.jwebmp.plugins.bootstrapselect;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bootstrapselect.BootstrapSelectPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bootstrapselect.implementations.BootstrapSelectExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bootstrapselect.implementations.BootstrapSelectExclusionsModule;

	opens com.jwebmp.plugins.bootstrapselect to com.fasterxml.jackson.databind, com.jwebmp.core;
}

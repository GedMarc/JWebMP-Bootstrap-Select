import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.bootstrapselect.BootstrapSelectPageConfigurator;

module com.jwebmp.plugins.bootstrapselect {
	exports com.jwebmp.plugins.bootstrapselect;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;
	requires java.validation;

	provides IPageConfigurator with BootstrapSelectPageConfigurator;

	opens com.jwebmp.plugins.bootstrapselect to com.fasterxml.jackson.databind, com.jwebmp.core;
}

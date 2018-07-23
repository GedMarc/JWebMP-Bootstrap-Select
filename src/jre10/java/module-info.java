import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.bootstrapselect.BootstrapSelectPageConfigurator;

module com.jwebmp.plugins.bootstrapselect {
	exports com.jwebmp.plugins.bootstrapselect;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	provides IPageConfigurator with BootstrapSelectPageConfigurator;

}

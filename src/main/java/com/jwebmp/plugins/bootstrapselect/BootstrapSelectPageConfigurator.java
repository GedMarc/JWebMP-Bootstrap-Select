package com.jwebmp.plugins.bootstrapselect;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Configures the Bootstrap Page Configurator
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Bootstrap Select",
		pluginDescription = "Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select elements.",
		pluginUniqueName = "jwebswing-bootstrap-select",
		pluginVersion = "2.1.3",
		pluginCategories = "select, dropdown, bootstrap, ui,web ui, framework",
		pluginSubtitle = "Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select elements.",
		pluginSourceUrl = "https://github.com/silviomoreto/bootstrap-select",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Bootstrap-Select/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Bootstrap-Select",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://silviomoreto.github.io/bootstrap-select/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BootstrapSelect.jar/download")
public class BootstrapSelectPageConfigurator
		implements IPageConfigurator
{
	/*
	 * Constructs a new BootstrapSelectPageConfigurator
	 */
	public BootstrapSelectPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(BootstrapSelectReferencePool.BootstrapSelect.getJavaScriptReference());
			page.getBody()
			    .addCssReference(BootstrapSelectReferencePool.BootstrapSelect.getCssReference());
		}
		return page;
	}
}

package com.jwebmp.plugins.bootstrapselect;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * Configures the Bootstrap Page Configurator
 *
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Bootstrap Select",
		pluginDescription = "Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select elements.",
		pluginUniqueName = "jwebswing-bootstrap-select",
		pluginVersion = "2.1.3",
		pluginCategories = "select, dropdown, bootstrap, ui,web ui, framework",
		pluginSubtitle = "Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select elements.",
		pluginSourceUrl = "https://github.com/silviomoreto/bootstrap-select",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Bootstrap-Select/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Bootstrap-Select",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://silviomoreto.github.io/bootstrap-select/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BootstrapSelect.jar/download")
public class BootstrapSelectPageConfigurator
		implements IPageConfigurator<BootstrapSelectPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new BootstrapSelectPageConfigurator
	 */
	public BootstrapSelectPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return BootstrapSelectPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		BootstrapSelectPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(BootstrapSelectReferencePool.BootstrapSelect.getJavaScriptReference());
			page.getBody()
			    .addCssReference(BootstrapSelectReferencePool.BootstrapSelect.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return BootstrapSelectPageConfigurator.enabled;
	}
}

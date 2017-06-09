package za.co.mmagon.jwebswing.plugins.bootstrapselect;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * Configures the Bootstrap Page Configurator
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Bootstrap Select",
        pluginDescription = "Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select elements.",
        pluginUniqueName = "jwebswing-toastr",
        pluginVersion = "2.1.3",
        pluginCategories = "select, dropdown, bootstrap, ui,web ui, framework",
        pluginSubtitle = "Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select elements.",
        pluginSourceUrl = "https://github.com/silviomoreto/bootstrap-select",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Bootstrap-Select/wiki",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Bootstrap-Select",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginOriginalHomepage = "https://silviomoreto.github.io/bootstrap-select/",
        pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BootstrapSelect.jar/download"
)
class BootstrapSelectPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

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
            JQueryPageConfigurator.setRequired(page.getBody(), true);
            BootstrapPageConfigurator.setBootstrapRequired(page.getBody(), true);
            page.getBody().addJavaScriptReference(BootstrapSelectReferencePool.BootstrapSelect.getJavaScriptReference());
            page.getBody().addCssReference(BootstrapSelectReferencePool.BootstrapSelect.getCssReference());
        }
        return page;
    }
}
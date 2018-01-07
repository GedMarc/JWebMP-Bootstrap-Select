package za.co.mmagon.jwebswing.plugins.bootstrapselect;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Creates toast messages
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class BootstrapSelectFeature extends Feature<BootstrapSelectOptions, BootstrapSelectFeature>
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new BootstrapSelectFeature
	 */
	public BootstrapSelectFeature(ComponentHierarchyBase component)
	{
		super("BootstrapSelectFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "selectpicker(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}

	/**
	 * Returns the options
	 *
	 * @return
	 */
	@Override
	public BootstrapSelectOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			setOptions(new BootstrapSelectOptions());
		}
		return super.getOptions();
	}

}

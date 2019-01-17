package com.jwebmp.plugins.bootstrapselect;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Creates toast messages
 *
 * @author GedMarc
 * @since 09 Jun 2017
 */
public class BootstrapSelectFeature
		extends Feature<GlobalFeatures, BootstrapSelectOptions, BootstrapSelectFeature>
{


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

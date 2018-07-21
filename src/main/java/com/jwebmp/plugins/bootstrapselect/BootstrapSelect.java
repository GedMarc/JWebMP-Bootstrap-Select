package com.jwebmp.plugins.bootstrapselect;

import com.jwebmp.core.base.html.Select;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select elements.
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Bootstrap Select",
		description = "Turn checkboxes    and radio buttons    into toggle switches  ",
		url = "https://github.com/GedMarc/JWebSwing-Bootstrap-Select")
public class BootstrapSelect
		extends Select<BootstrapSelect>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The feature for this select
	 */
	private BootstrapSelectFeature feature;

	/*
	 * Constructs a new BootstrapSelect
	 */
	public BootstrapSelect()
	{
		addFeature(getFeature());
	}

	/**
	 * Returns the feature for this component
	 *
	 * @return
	 */
	public BootstrapSelectFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BootstrapSelectFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the feature for this bootstrap drop down
	 *
	 * @param feature
	 */
	public void setFeature(BootstrapSelectFeature feature)
	{
		this.feature = feature;
	}

	@Override
	public BootstrapSelectOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}

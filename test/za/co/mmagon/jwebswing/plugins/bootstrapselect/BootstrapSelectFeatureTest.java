/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.bootstrapselect;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;

/**
 * @author Marc Magon
 */
public class BootstrapSelectFeatureTest extends BaseTestClass
{

	public BootstrapSelectFeatureTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BootstrapSelectFeature bsf = new BootstrapSelectFeature(getInstance().getBody());
		bsf.getOptions().setIconBase("fa fa-bell-o");
		System.out.println(bsf.renderJavascript());
	}

}

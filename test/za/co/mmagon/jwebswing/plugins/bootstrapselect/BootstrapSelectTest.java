/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.bootstrapselect;

import org.junit.jupiter.api.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.base.html.Option;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSForm;

/**
 * @author Marc Magon
 */
public class BootstrapSelectTest extends BaseTestClass
{

	public BootstrapSelectTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BootstrapSelect bs = new BootstrapSelect();
		bs.getOptions().setActionsBox(true);
		System.out.println(bs.toString(true));
	}

	@Test
	public void testSomeMethod2()
	{
		BootstrapSelect bs = new BootstrapSelect();
		bs.add(new Option("Option 1"));
		bs.getOptions().setActionsBox(true);
		System.out.println(bs.toString(true));
	}

	@Test
	public void testJavaScript()
	{
		BootstrapSelect bs = new BootstrapSelect();
		bs.add(new Option("Option 1"));
		bs.getOptions().setActionsBox(true);
		System.out.println(bs.renderJavascript());
	}

	@Test
	public void testHtml()
	{
		Page p = getInstance();
		BSForm form = new BSForm();
		BootstrapSelect bs = new BootstrapSelect();
		p.getOptions().setDynamicRender(false);
		p.getBody().add(form);
		form.add(bs);
		System.out.println(p.toString(true));
	}
}

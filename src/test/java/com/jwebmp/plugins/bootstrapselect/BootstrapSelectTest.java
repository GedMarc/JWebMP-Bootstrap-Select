/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwebmp.plugins.bootstrapselect;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.html.Option;
import com.jwebmp.plugins.bootstrap.forms.BSForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class BootstrapSelectTest

{

	public BootstrapSelectTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BootstrapSelect bs = new BootstrapSelect();
		bs.setID("id");
		bs.getOptions()
		  .setActionsBox(true);
		System.out.println(bs.toString(true));
		Assertions.assertEquals("<select id=\"id\"></select>", bs.toString(0));
	}

	@Test
	public void testSomeMethod2()
	{
		BootstrapSelect bs = new BootstrapSelect();
		bs.setID("id");
		bs.add(new Option<>("Option 1").setID("id"));
		bs.getOptions()
		  .setActionsBox(true);
		System.out.println(bs.toString(true));
		Assertions.assertEquals("<select id=\"id\">\n" + "\t<option label=\"Option 1\" value=\"Option 1\" id=\"id\">Option 1</option>\n" + "</select>", bs.toString(0));
	}

	@Test
	public void testJavaScript()
	{
		BootstrapSelect bs = new BootstrapSelect();
		bs.setID("id");
		bs.add(new Option<>("Option 1").setID("option"));
		bs.getOptions()
		  .setActionsBox(true);
		System.out.println(bs.renderJavascript());
		Assertions.assertEquals("$(\"#id\").selectpicker({\n" + "  \"actionsBox\" : true\n" + "});\n", bs.renderJavascript()
		                                                                                                 .toString());
	}

	@Test
	public void testHtml()
	{
		Page p = new Page();
		BSForm form = new BSForm();
		BootstrapSelect bs = new BootstrapSelect();
		bs.setID("id");
		p.getOptions()
		 .setDynamicRender(false);
		p.getBody()
		 .add(form);
		form.add(bs);
		System.out.println(p.toString(true));
		Assertions.assertTrue(p.toString(0)
		                       .contains("<script src=\"bower_components/bootstrap-select/dist/js/bootstrap-select.js\" type=\"text/javascript\"></script>"));
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.bootstrapselect;

import org.junit.Test;
import za.co.mmagon.jwebswing.base.html.Option;

/**
 *
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
}

package za.co.mmagon.jwebswing.plugins.bootstrapselect;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class BootstrapSelectOptionsTest
{
	
	public BootstrapSelectOptionsTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		BootstrapSelectOptions bso = new BootstrapSelectOptions();
		bso.setActionsBox(true);
		System.out.println(bso);
		Assertions.assertEquals("{\n" +
				                        "  \"actionsBox\" : true\n" +
				                        "}", bso.toString());
	}
	
}

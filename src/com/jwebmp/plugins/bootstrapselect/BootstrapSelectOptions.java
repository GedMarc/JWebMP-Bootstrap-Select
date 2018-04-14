/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.bootstrapselect;

import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

/**
 * All the options available for Bootstrap Select
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class BootstrapSelectOptions extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;

	/**
	 * When set to true, adds two buttons to the top of the dropdown menu (Select All Deselect All).*
	 */
	private Boolean actionsBox;
	/**
	 * When set to a string, appends the select to a specific element or selector, e.g., container: body | .main-body*
	 */
	private String container;
	/**
	 * Sets the format for the text displayed when selectedTextFormat is count or count greater than #. {0} is the selected amount. {1} is total available for selection.When set to a function, the first
	 * parameter is the number of selected options, and the second is the total number of options. The function must return a string.*
	 */
	private String countSelectedText;
	/**
	 * The text on the button that deselects all options when actionsBox is enabled.*
	 */
	private String deselectAllText;
	/**
	 * Align the menu to the right instead of the left. If set to auto, the menu will automatically align right if there isnt room for the menus full width when aligned to the left.*
	 */
	private Boolean dropdownAlignRight;
	/**
	 * checks to see which has more room, above or below. If the dropup has enough room to fully open normally, but there is more room above, the dropup still opens normally. Otherwise, it becomes a
	 * dropup. If dropupAuto is set to false, dropups must be called manually.*
	 */
	private Boolean dropupAuto;
	/**
	 * adds a header to the top of the menu; includes a close button by default*
	 */
	private String header;
	/**
	 * removes disabled options and optgroups from the menu data-hide-disabled: true*
	 */
	private Boolean hideDisabled;
	/**
	 * Set the base to use a different icon font instead of Glyphicons. If changing iconBase, you might also want to change tickIcon, in case the new icon font uses a different naming scheme.*
	 */
	private String iconBase;
	/**
	 * When set to true, adds a search box to the top of the selectpicker dropdown.*
	 */
	private Boolean liveSearch;
	/**
	 * Setting liveSearchNormalize to true allows for accent-insensitive searching.*
	 */
	private Boolean liveSearchNormalize;
	/**
	 * When set to a string, a placeholder attribute equal to the string will be added to the liveSearch input.*
	 */
	private String liveSearchPlaceholder;
	/**
	 * When set to contains, searching will reveal options that contain the searched text. For example, searching for pl with return both Apple, Plum, and Plantain. When set to startsWith, searching
	 * for pl will return only Plum and Plantain.*
	 */
	private String liveSearchStyle;
	/**
	 * When set to an integer and in a multi-select, the number of selected options cannot exceed the given value.This option can also exist as a data-attribute for an optgroup, in which case it
	 * only applies to that optgroup.*
	 */
	private Integer maxOptions;
	/**
	 * The text that is displayed when maxOptions is enabled and the maximum number of options for the given scenario have been selected. If a function is used, it must return an array. array[0] is
	 * the text used when maxOptions is applied to the entire select element. array[1] is the text used when maxOptions is used on an optgroup. If a string is used, the same text is used for both the
	 * element and the optgroup.*
	 */
	private String maxOptionsText;
	/**
	 * When set to true, enables the devices native menu for select menus.*
	 */
	private Boolean mobile;
	/**
	 * Set the character displayed in the button that separates selected options.*
	 */
	private String multipleSeparator;
	/**
	 * The text that is displayed when a multiple select has no selected options.*
	 */
	private String noneSelectedText;
	/**
	 * The text on the button that selects all options when actionsBox is enabled.*
	 */
	private String selectAllText;
	/**
	 * Specifies how the selection is displayed with a multiple select. Values displays a list of the selected options (separated by multipleSeparator. static simply displays the select elements
	 * title. count displays the total number of selected options. count greather than x behaves like values until the number of selected options is greater than x; after that, it behaves like count.*
	 */
	private String selectedTextFormat;
	/**
	 * When set to true, treats the tab character like the enter or space characters within the selectpicker dropdown.*
	 */
	private Boolean selectOnTab;
	/**
	 * When set to true, display custom HTML associated with selected option(s) in the button. When set to false, the option value will be displayed instead.*
	 */
	private Boolean showContent;
	/**
	 * When set to true, display icon(s) associated with selected option(s) in the button.*
	 */
	private Boolean showIcon;
	/**
	 * When set to true, display subtext associated with a selected option in the button.*
	 */
	private Boolean showSubtext;
	/**
	 * Show checkmark on selected option (for items without multiple attribute).*
	 */
	private Boolean showTick;
	/**
	 * When set to auto, the menu always opens up to show as many items as the window will allow without being cut off. When set to an integer, the menu will show the given number of items, even if
	 * the dropdown is cut off. When set to false, the menu will always show all items.*
	 */
	private Integer size;
	/**
	 * When set to a string, add the value to the buttons style.*
	 */
	private String style;
	/**
	 * Set which icon to use to display as the tick next to selected options.*
	 */
	private String tickIcon;
	/**
	 * The default title for the selectpicker.*
	 */
	private String title;
	/**
	 * When set to auto, the width of the selectpicker is automatically adjusted to accommodate the widest option. When set to a css-width, the width of the selectpicker is forced inline to the given
	 * value. When set to false, all width information is removed.*
	 */
	private Integer width;
	/**
	 * This is useful in cases where the window has areas that the dropdown menu should not cover - for instance a fixed header. When set to an integer, the same padding will be added to all sides.
	 * Alternatively, an array of integers can be used in the format [top, right, bottom, left].*
	 */
	private Integer windowPadding;

	/**
	 * Construct a new instance of the JS Bootstrap Select Options
	 */
	public BootstrapSelectOptions()
	{
		//Nothing Needed
	}

	/**
	 * When set to true, adds two buttons to the top of the dropdown menu (Select All  Deselect All).
	 *
	 * @return
	 */
	public Boolean getActionsBox()
	{
		return actionsBox;
	}

	/**
	 * When set to true, adds two buttons to the top of the dropdown menu (Select All  Deselect All).
	 *
	 * @param actionsBox
	 *
	 * @return
	 */
	public BootstrapSelectOptions setActionsBox(Boolean actionsBox)
	{
		this.actionsBox = actionsBox;
		return this;
	}

	/**
	 * When set to a string, appends the select to a specific element or selector, e.g., container: body | .main-body
	 *
	 * @return
	 */
	public String getContainer()
	{
		return container;
	}

	/**
	 * When set to a string, appends the select to a specific element or selector, e.g., container: body | .main-body
	 *
	 * @param container
	 *
	 * @return
	 */
	public BootstrapSelectOptions setContainer(String container)
	{
		this.container = container;
		return this;
	}

	/**
	 * "Sets the format for the text displayed when selectedTextFormat is count or count greater than #. {0} is the selected amount. {1} is total available for selection. When set to a function, the first
	 * parameter is the number of selected options, and the second is the total number of options. The function must return a string."
	 *
	 * @return
	 */
	public String getCountSelectedText()
	{
		return countSelectedText;
	}

	/**
	 * "Sets the format for the text displayed when selectedTextFormat is count or count greater than #. {0} is the selected amount. {1} is total available for selection. When set to a function, the first
	 * parameter is the number of selected options, and the second is the total number of options. The function must return a string."
	 *
	 * @param countSelectedText
	 *
	 * @return
	 */
	public BootstrapSelectOptions setCountSelectedText(String countSelectedText)
	{
		this.countSelectedText = countSelectedText;
		return this;
	}

	/**
	 * The text on the button that deselects all options when actionsBox is enabled.
	 *
	 * @return
	 */
	public String getDeselectAllText()
	{
		return deselectAllText;
	}

	/**
	 * The text on the button that deselects all options when actionsBox is enabled.
	 *
	 * @param deselectAllText
	 *
	 * @return
	 */
	public BootstrapSelectOptions setDeselectAllText(String deselectAllText)
	{
		this.deselectAllText = deselectAllText;
		return this;
	}

	/**
	 * Align the menu to the right instead of the left. If set to auto, the menu will automatically align right if there isnt room for the menus full width when aligned to the left.
	 *
	 * @return
	 */
	public Boolean getDropdownAlignRight()
	{
		return dropdownAlignRight;
	}

	/**
	 * Align the menu to the right instead of the left. If set to auto, the menu will automatically align right if there isnt room for the menus full width when aligned to the left.
	 *
	 * @param dropdownAlignRight
	 *
	 * @return
	 */
	public BootstrapSelectOptions setDropdownAlignRight(Boolean dropdownAlignRight)
	{
		this.dropdownAlignRight = dropdownAlignRight;
		return this;
	}

	/**
	 * checks to see which has more room, above or below. If the dropup has enough room to fully open normally, but there is more room above, the dropup still opens normally. Otherwise, it becomes a
	 * dropup. If dropupAuto is set to false, dropups must be called manually.
	 *
	 * @return
	 */
	public Boolean getDropupAuto()
	{
		return dropupAuto;
	}

	/**
	 * checks to see which has more room, above or below. If the dropup has enough room to fully open normally, but there is more room above, the dropup still opens normally. Otherwise, it becomes a
	 * dropup. If dropupAuto is set to false, dropups must be called manually.
	 *
	 * @param dropupAuto
	 *
	 * @return
	 */
	public BootstrapSelectOptions setDropupAuto(Boolean dropupAuto)
	{
		this.dropupAuto = dropupAuto;
		return this;
	}

	/**
	 * adds a header to the top of the menu; includes a close button by default
	 *
	 * @return
	 */
	public String getHeader()
	{
		return header;
	}

	/**
	 * adds a header to the top of the menu; includes a close button by default
	 *
	 * @param header
	 *
	 * @return
	 */
	public BootstrapSelectOptions setHeader(String header)
	{
		this.header = header;
		return this;
	}

	/**
	 * removes disabled options and optgroups from the menu data-hide-disabled: true
	 *
	 * @return
	 */
	public Boolean getHideDisabled()
	{
		return hideDisabled;
	}

	/**
	 * removes disabled options and optgroups from the menu data-hide-disabled: true
	 *
	 * @param hideDisabled
	 *
	 * @return
	 */
	public BootstrapSelectOptions setHideDisabled(Boolean hideDisabled)
	{
		this.hideDisabled = hideDisabled;
		return this;
	}

	/**
	 * Set the base to use a different icon font instead of Glyphicons. If changing iconBase, you might also want to change tickIcon, in case the new icon font uses a different naming scheme.
	 *
	 * @return
	 */
	public String getIconBase()
	{
		return iconBase;
	}

	/**
	 * Set the base to use a different icon font instead of Glyphicons. If changing iconBase, you might also want to change tickIcon, in case the new icon font uses a different naming scheme.
	 *
	 * @param iconBase
	 *
	 * @return
	 */
	public BootstrapSelectOptions setIconBase(String iconBase)
	{
		this.iconBase = iconBase;
		return this;
	}

	/**
	 * When set to true, adds a search box to the top of the selectpicker dropdown.
	 *
	 * @return
	 */
	public Boolean getLiveSearch()
	{
		return liveSearch;
	}

	/**
	 * When set to true, adds a search box to the top of the selectpicker dropdown.
	 *
	 * @param liveSearch
	 *
	 * @return
	 */
	public BootstrapSelectOptions setLiveSearch(Boolean liveSearch)
	{
		this.liveSearch = liveSearch;
		return this;
	}

	/**
	 * Setting liveSearchNormalize to true allows for accent-insensitive searching.
	 *
	 * @return
	 */
	public Boolean getLiveSearchNormalize()
	{
		return liveSearchNormalize;
	}

	/**
	 * Setting liveSearchNormalize to true allows for accent-insensitive searching.
	 *
	 * @param liveSearchNormalize
	 *
	 * @return
	 */
	public BootstrapSelectOptions setLiveSearchNormalize(Boolean liveSearchNormalize)
	{
		this.liveSearchNormalize = liveSearchNormalize;
		return this;
	}

	/**
	 * When set to a string, a placeholder attribute equal to the string will be added to the liveSearch input.
	 *
	 * @return
	 */
	public String getLiveSearchPlaceholder()
	{
		return liveSearchPlaceholder;
	}

	/**
	 * When set to a string, a placeholder attribute equal to the string will be added to the liveSearch input.
	 *
	 * @param liveSearchPlaceholder
	 *
	 * @return
	 */
	public BootstrapSelectOptions setLiveSearchPlaceholder(String liveSearchPlaceholder)
	{
		this.liveSearchPlaceholder = liveSearchPlaceholder;
		return this;
	}

	/**
	 * When set to contains, searching will reveal options that contain the searched text. For example, searching for pl with return both Apple, Plum, and Plantain. When set to startsWith, searching
	 * for pl will return only Plum and Plantain.
	 *
	 * @return
	 */
	public String getLiveSearchStyle()
	{
		return liveSearchStyle;
	}

	/**
	 * When set to contains, searching will reveal options that contain the searched text. For example, searching for pl with return both Apple, Plum, and Plantain. When set to startsWith, searching
	 * for pl will return only Plum and Plantain.
	 *
	 * @param liveSearchStyle
	 *
	 * @return
	 */
	public BootstrapSelectOptions setLiveSearchStyle(String liveSearchStyle)
	{
		this.liveSearchStyle = liveSearchStyle;
		return this;
	}

	/**
	 * When set to an integer and in a multi-select, the number of selected options cannot exceed the given value.This option can also exist as a data-attribute for an optgroup, in which case it only
	 * applies to that optgroup.
	 *
	 * @return
	 */
	public Integer getMaxOptions()
	{
		return maxOptions;
	}

	/**
	 * When set to an integer and in a multi-select, the number of selected options cannot exceed the given value.This option can also exist as a data-attribute for an optgroup, in which case it only
	 * applies to that optgroup.
	 *
	 * @param maxOptions
	 *
	 * @return
	 */
	public BootstrapSelectOptions setMaxOptions(Integer maxOptions)
	{
		this.maxOptions = maxOptions;
		return this;
	}

	/**
	 * The text that is displayed when maxOptions is enabled and the maximum number of options for the given scenario have been selected. If a function is used, it must return an array. array[0] is
	 * the text used when maxOptions is applied to the entire select element. array[1] is the text used when maxOptions is used on an optgroup. If a string is used, the same text is used for both the
	 * element and the optgroup.
	 *
	 * @return
	 */
	public String getMaxOptionsText()
	{
		return maxOptionsText;
	}

	/**
	 * The text that is displayed when maxOptions is enabled and the maximum number of options for the given scenario have been selected. If a function is used, it must return an array. array[0] is
	 * the text used when maxOptions is applied to the entire select element. array[1] is the text used when maxOptions is used on an optgroup. If a string is used, the same text is used for both the
	 * element and the optgroup.
	 *
	 * @param maxOptionsText
	 *
	 * @return
	 */
	public BootstrapSelectOptions setMaxOptionsText(String maxOptionsText)
	{
		this.maxOptionsText = maxOptionsText;
		return this;
	}

	/**
	 * When set to true, enables the devices native menu for select menus.
	 *
	 * @return
	 */
	public Boolean getMobile()
	{
		return mobile;
	}

	/**
	 * When set to true, enables the devices native menu for select menus.
	 *
	 * @param mobile
	 *
	 * @return
	 */
	public BootstrapSelectOptions setMobile(Boolean mobile)
	{
		this.mobile = mobile;
		return this;
	}

	/**
	 * Set the character displayed in the button that separates selected options.
	 *
	 * @return
	 */
	public String getMultipleSeparator()
	{
		return multipleSeparator;
	}

	/**
	 * Set the character displayed in the button that separates selected options.
	 *
	 * @param multipleSeparator
	 *
	 * @return
	 */
	public BootstrapSelectOptions setMultipleSeparator(String multipleSeparator)
	{
		this.multipleSeparator = multipleSeparator;
		return this;
	}

	/**
	 * The text that is displayed when a multiple select has no selected options.
	 *
	 * @return
	 */
	public String getNoneSelectedText()
	{
		return noneSelectedText;
	}

	/**
	 * The text that is displayed when a multiple select has no selected options.
	 *
	 * @param noneSelectedText
	 *
	 * @return
	 */
	public BootstrapSelectOptions setNoneSelectedText(String noneSelectedText)
	{
		this.noneSelectedText = noneSelectedText;
		return this;
	}

	/**
	 * The text on the button that selects all options when actionsBox is enabled.
	 *
	 * @return
	 */
	public String getSelectAllText()
	{
		return selectAllText;
	}

	/**
	 * The text on the button that selects all options when actionsBox is enabled.
	 *
	 * @param selectAllText
	 *
	 * @return
	 */
	public BootstrapSelectOptions setSelectAllText(String selectAllText)
	{
		this.selectAllText = selectAllText;
		return this;
	}

	/**
	 * Specifies how the selection is displayed with a multiple select. Values displays a list of the selected options (separated by multipleSeparator. static simply displays the select elements
	 * title. count displays the total number of selected options. count greater than x behaves like values until the number of selected options is greater than x; after that, it behaves like count.
	 *
	 * @return
	 */
	public String getSelectedTextFormat()
	{
		return selectedTextFormat;
	}

	/**
	 * Specifies how the selection is displayed with a multiple select. Values displays a list of the selected options (separated by multipleSeparator. static simply displays the select elements
	 * title. count displays the total number of selected options. count greater than x behaves like values until the number of selected options is greater than x; after that, it behaves like count.
	 *
	 * @param selectedTextFormat
	 *
	 * @return
	 */
	public BootstrapSelectOptions setSelectedTextFormat(String selectedTextFormat)
	{
		this.selectedTextFormat = selectedTextFormat;
		return this;
	}

	/**
	 * When set to true, treats the tab character like the enter or space characters within the selectpicker dropdown.
	 *
	 * @return
	 */
	public Boolean getSelectOnTab()
	{
		return selectOnTab;
	}

	/**
	 * When set to true, treats the tab character like the enter or space characters within the selectpicker dropdown.
	 *
	 * @param selectOnTab
	 *
	 * @return
	 */
	public BootstrapSelectOptions setSelectOnTab(Boolean selectOnTab)
	{
		this.selectOnTab = selectOnTab;
		return this;
	}

	/**
	 * When set to true, display custom HTML associated with selected option(s) in the button. When set to false, the option value will be displayed instead.
	 *
	 * @return
	 */
	public Boolean getShowContent()
	{
		return showContent;
	}

	/**
	 * When set to true, display custom HTML associated with selected option(s) in the button. When set to false, the option value will be displayed instead.
	 *
	 * @param showContent
	 *
	 * @return
	 */
	public BootstrapSelectOptions setShowContent(Boolean showContent)
	{
		this.showContent = showContent;
		return this;
	}

	/**
	 * When set to true, display icon(s) associated with selected option(s) in the button.
	 *
	 * @return
	 */
	public Boolean getShowIcon()
	{
		return showIcon;
	}

	/**
	 * When set to true, display icon(s) associated with selected option(s) in the button.
	 *
	 * @param showIcon
	 *
	 * @return
	 */
	public BootstrapSelectOptions setShowIcon(Boolean showIcon)
	{
		this.showIcon = showIcon;
		return this;
	}

	/**
	 * When set to true, display subtext associated with a selected option in the button.
	 *
	 * @return
	 */
	public Boolean getShowSubtext()
	{
		return showSubtext;
	}

	/**
	 * When set to true, display subtext associated with a selected option in the button.
	 *
	 * @param showSubtext
	 *
	 * @return
	 */
	public BootstrapSelectOptions setShowSubtext(Boolean showSubtext)
	{
		this.showSubtext = showSubtext;
		return this;
	}

	/**
	 * Show checkmark on selected option (for items without multiple attribute).
	 *
	 * @return
	 */
	public Boolean getShowTick()
	{
		return showTick;
	}

	/**
	 * Show checkmark on selected option (for items without multiple attribute).
	 *
	 * @param showTick
	 *
	 * @return
	 */
	public BootstrapSelectOptions setShowTick(Boolean showTick)
	{
		this.showTick = showTick;
		return this;
	}

	/**
	 * When set to auto, the menu always opens up to show as many items as the window will allow without being cut off. When set to an integer, the menu will show the given number of items, even if
	 * the dropdown is cut off. When set to false, the menu will always show all items.
	 *
	 * @return
	 */
	public Integer getSize()
	{
		return size;
	}

	/**
	 * When set to auto, the menu always opens up to show as many items as the window will allow without being cut off. When set to an integer, the menu will show the given number of items, even if
	 * the dropdown is cut off. When set to false, the menu will always show all items.
	 *
	 * @param size
	 *
	 * @return
	 */
	public BootstrapSelectOptions setSize(Integer size)
	{
		this.size = size;
		return this;
	}

	/**
	 * When set to a string, add the value to the buttons style.
	 *
	 * @return
	 */
	public String getStyle()
	{
		return style;
	}

	/**
	 * When set to a string, add the value to the buttons style.
	 *
	 * @param style
	 *
	 * @return
	 */
	public BootstrapSelectOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}

	/**
	 * Set which icon to use to display as the tick next to selected options.
	 *
	 * @return
	 */
	public String getTickIcon()
	{
		return tickIcon;
	}

	/**
	 * Set which icon to use to display as the tick next to selected options.
	 *
	 * @param tickIcon
	 *
	 * @return
	 */
	public BootstrapSelectOptions setTickIcon(String tickIcon)
	{
		this.tickIcon = tickIcon;
		return this;
	}

	/**
	 * The default title for the selectpicker.
	 *
	 * @return
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * The default title for the selectpicker.
	 *
	 * @param title
	 *
	 * @return
	 */
	public BootstrapSelectOptions setTitle(String title)
	{
		this.title = title;
		return this;
	}

	/**
	 * When set to auto, the width of the selectpicker is automatically adjusted to accommodate the widest option. When set to a css-width, the width of the selectpicker is forced inline to the given
	 * value. When set to false, all width information is removed.
	 *
	 * @return
	 */
	public Integer getWidth()
	{
		return width;
	}

	/**
	 * When set to auto, the width of the selectpicker is automatically adjusted to accommodate the widest option. When set to a css-width, the width of the selectpicker is forced inline to the given
	 * value. When set to false, all width information is removed.
	 *
	 * @param width
	 *
	 * @return
	 */
	public BootstrapSelectOptions setWidth(Integer width)
	{
		this.width = width;
		return this;
	}

	/**
	 * This is useful in cases where the window has areas that the dropdown menu should not cover - for instance a fixed header. When set to an integer, the same padding will be added to all sides.
	 * Alternatively, an array of integers can be used in the format [top, right, bottom, left].
	 *
	 * @return
	 */
	public Integer getWindowPadding()
	{
		return windowPadding;
	}

	/**
	 * This is useful in cases where the window has areas that the dropdown menu should not cover - for instance a fixed header. When set to an integer, the same padding will be added to all sides.
	 * Alternatively, an array of integers can be used in the format [top, right, bottom, left].
	 *
	 * @param windowPadding
	 *
	 * @return
	 */
	public BootstrapSelectOptions setWindowPadding(Integer windowPadding)
	{
		this.windowPadding = windowPadding;
		return this;
	}

}

/**
 * *************************************************************************
 * Copyright (C) 2014 GGA Software Services LLC
 * <p>
 * This file may be distributed and/or modified under the terms of the
 * GNU General Public License version 3 as published by the Free Software
 * Foundation.
 * <p>
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 * *************************************************************************
 */
package com.ggasoftware.uitest.control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * RadioButton control implementation
 *
 * @author Alexeenko Yan
 */
public class RadioButton<ParentPanel> extends Element<ParentPanel> {
    public RadioButton() {
    }

    public RadioButton(By valueLocator) {
        super(valueLocator);
    }
    //constructor

    /**
     * Initializes element with given locator. Locates own properties of the element by class name, takes given locator and tries
     * to initialize.
     *
     * @param name        - RadioButton name
     * @param locator     - start it with locator type "id=", "css=", "xpath=" and etc. Locator without type is assigned to xpath
     * @param parentPanel - Parent instance
     */
    public RadioButton(String name, String locator, ParentPanel parentPanel) {
        super(name, locator, parentPanel);
    }

    /**
     * Is this RadioButton is checked.
     *
     * @return True if the element is currently checked, false otherwise.
     */
    public boolean isChecked() {
        return doJActionResult("RadioButton Checked",
                () -> getWebElement().isSelected());
    }

    /**
     * Check if this RadioButton is not checked eat, do nothing otherwise.
     *
     * @return Parent instance
     */
    public ParentPanel check() {
        doJAction("Check RadioButton", () -> {
            WebElement webEl = getWebElement();
            if (!webEl.isSelected()) {
                webEl.click();
            }
        });
        return super.parent;
    }

}

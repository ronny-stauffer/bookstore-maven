package org.books.presentation.navigation;

import org.books.presentation.navigation.Navigation;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Christoph Horber
 */
public class NavigationTest {

    private static final String ADMIN_DIRECTORY = "admin";
    private static final String LOGIN_DIRECTORY = "login";

    /**
     * Test of fromCatalogBeanSearchBooks method, of class Navigation.
     */
    @Test
    public void testXHTMLPages() {
        for (Navigation.PAGES page : Navigation.PAGES.values()) {
            String pageName = page.page();
            
            File pageFile = new File("src/main/webapp/" + pageName + ".xhtml");
            File adminPageFile = new File("src/main/webapp/" + ADMIN_DIRECTORY + "/" + pageName + ".xhtml");
            File loginPageFile = new File("src/main/webapp/" + LOGIN_DIRECTORY + "/" + pageName + ".xhtml");
            Assert.assertTrue(String.format("File '%s' must exist!", pageName), pageFile.exists() || adminPageFile.exists() || loginPageFile.exists());
        }
    }
}

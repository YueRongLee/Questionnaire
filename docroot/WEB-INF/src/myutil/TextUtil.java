package myutil;

import javax.faces.context.FacesContext;
import javax.portlet.PortletRequest;
import com.liferay.faces.util.portal.WebKeys;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.theme.ThemeDisplay;

/**
 * 處理文字相關的function.
 * @author Jason
 */
public class TextUtil {
  /**
   * get message from language property.
   * @param propKey the key of property
   * @return msg
   */
  public static String getText(String propKey) {
    /* Get Liferay ThemeDisplay that provides general configuration methods for the portal. */
    FacesContext context = FacesContext.getCurrentInstance();
    PortletRequest portletRequest = (PortletRequest) context.getExternalContext().getRequest();
    ThemeDisplay themeDisplay = (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY);

    /* Get msg according to user locale. */
    String msg = LanguageUtil.get(themeDisplay.getLocale(), propKey);

    return msg;
  }
}

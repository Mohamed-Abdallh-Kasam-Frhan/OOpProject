/**
 *   >> Al-Reecha .~
 *   << BY : Asem Najee >>
 */
package oopproject.view.manager;

import java.util.LinkedHashMap;
import oopproject.view.parent.CanParentDo;

/**
 *
 * @author PC
 */
public interface CanManageParent extends CanParentDo{
    void addParent(LinkedHashMap<String, String> parentData);
    void updateParent(LinkedHashMap<String, String> parentData, int id);
    void deleteParent(int id);
}
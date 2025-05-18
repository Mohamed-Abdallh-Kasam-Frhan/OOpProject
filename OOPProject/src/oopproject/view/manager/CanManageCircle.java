/**
 *   >> Al-Reecha .~
 *   << BY : Asem Najee >>
 */
package oopproject.view.manager;

import java.util.LinkedHashMap;

/**
 *
 * @author PC
 */
public interface CanManageCircle {
    void addCircle(LinkedHashMap<String, String> circleData);
    void updateCircle(LinkedHashMap<String, String> circleData, int id);
    void deleteCircle(int id);
}
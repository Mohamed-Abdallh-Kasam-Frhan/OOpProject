/**
 *   >> Al-Reecha .~
 *   << BY : Asem Najee >>
 */
package oopproject.view;

import java.util.LinkedHashMap;
import oopproject.model.Model;

/**
 *
 * @author PC
 */
public interface CanActorDo {
    /**
     * login with password and id
     * @param id of the actor
     * @param password secret password of the actor
     */
    void Login(int id, String password);
    
    /**
     * get the actor info
     * @param model model to select from its table .
     * @param id is the id of current actor
     */
    void getMe(Model model, int id);
    
    /**
     * update the actor information
     * @param data is the new data of the model
     * @param id is the id of the current actor
     * @param actorModel type of the actor
     */
    void updateProfile(LinkedHashMap<String, String> data, int id);
    
}

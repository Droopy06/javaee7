package org.kearis.formation.javaee7.chapitre2.ex12;

import javax.ejb.AccessTimeout;
import javax.ejb.Lock;
import javax.ejb.LockType;

/**
 * Created by poutsjr on 27/09/2015.
 */
public interface CacheEJBRemote12 {
    @AccessTimeout(0)
    void addToCache(Long id, Object object);

    void removeFromCache(Long id);

    @Lock(LockType.READ)
    Object getFromCache(Long id);

    Integer getNumberOfItems();
}

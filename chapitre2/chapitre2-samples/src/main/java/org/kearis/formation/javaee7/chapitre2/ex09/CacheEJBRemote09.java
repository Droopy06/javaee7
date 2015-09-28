package org.kearis.formation.javaee7.chapitre2.ex09;

/**
 * Created by poutsjr on 27/09/2015.
 */
public interface CacheEJBRemote09 {
    void addToCache(Long id, Object object);

    void removeFromCache(Long id);

    Object getFromCache(Long id);

    Integer getNumberOfItems();

    void clearCache();
}

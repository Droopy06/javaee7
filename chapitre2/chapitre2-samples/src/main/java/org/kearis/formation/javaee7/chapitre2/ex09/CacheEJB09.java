package org.kearis.formation.javaee7.chapitre2.ex09;

import javax.ejb.Remote;
import javax.ejb.Singleton;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CacheEJB09 implements CacheEJBRemote09 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private Map<Long, Object> cache = new HashMap<>();

  // ======================================
  // =           Public Methods           =
  // ======================================

  @Override
  public void addToCache(Long id, Object object) {
    if (!cache.containsKey(id))
      cache.put(id, object);
  }

  @Override
  public void removeFromCache(Long id) {
    if (cache.containsKey(id))
      cache.remove(id);
  }

  @Override
  public Object getFromCache(Long id) {
    if (cache.containsKey(id))
      return cache.get(id);
    else
      return null;
  }

  @Override
  public Integer getNumberOfItems() {
    if (cache == null || cache.isEmpty())
      return 0;
    return cache.size();
  }

  @Override
  public void clearCache() {
    cache.clear();
  }
}
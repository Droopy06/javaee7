package org.kearis.formation.javaee7.chapitre2.ex12;

import javax.ejb.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Singleton
@Remote
public class CacheEJB12 implements CacheEJBRemote12 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private Map<Long, Object> cache = new HashMap<>();

  // ======================================
  // =           Public Methods           =
  // ======================================

  @Override
  @AccessTimeout(0)
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
  @Lock(LockType.READ)
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
}
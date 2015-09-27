package org.kearis.formation.javaee7.chapitre2.ex08;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Cache08 implements Serializable {

  // ======================================
  // =             Attributes             =
  // ======================================

  private static Cache08 instance = new Cache08();
  private Map<Long, Object> cache = new HashMap<>();

  // ======================================
  // =            Constructors            =
  // ======================================

  private Cache08() {
  }

  // ======================================
  // =           Public Methods           =
  // ======================================

  public static synchronized Cache08 getInstance() {
    return instance;
  }

  public void addToCache(Long id, Object object) {
    if (!cache.containsKey(id))
      cache.put(id, object);
  }

  public void removeFromCache(Long id) {
    if (cache.containsKey(id))
      cache.remove(id);
  }

  public Object getFromCache(Long id) {
    if (cache.containsKey(id))
      return cache.get(id);
    else
      return null;
  }

  public Integer getNumberOfItems() {
    if (cache == null || cache.isEmpty())
      return 0;
    return cache.size();
  }
}

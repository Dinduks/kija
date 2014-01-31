package com.github.kija.interpreter;

import java.util.*;

/**
 * This Map has two internal maps: an initial one, passed as an argument, that
 * is only read, and the other that is read and written.
 * This means that all new adds are done on the latter, the former is not
 * modified.
 *
 * @param <K>
 * @param <V>
 */
public class BlockVarMap<K, V> implements Map<K, V> {
  private Map<K, V> initialMap;
  private HashMap<K, V> localMap;

  public BlockVarMap(Map<K, V> initialMap) {
    this.initialMap = initialMap;
    this.localMap   = new HashMap<>();
  }

  @Override
  public int size() {
    return initialMap.size() + localMap.size();
  }

  @Override
  public boolean isEmpty() {
    return (size() == 0);
  }

  @Override
  public boolean containsKey(Object key) {
    return initialMap.containsKey(key) || localMap.containsKey(key);
  }

  @Override
  public boolean containsValue(Object value) {
    return initialMap.containsValue(value) || localMap.containsValue(value);
  }

  @Override
  public V get(Object key) {
    V value;
    if ((value = initialMap.get(key)) != null) return value;
    if ((value = localMap.get(key)) != null)   return value;
    return null;
  }

  @Override
  public V put(K key, V value) {
    return localMap.put(key, value);
  }

  @Override
  public V remove(Object key) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void putAll(Map<? extends K, ? extends V> m) {
    localMap.putAll(m);
  }

  @Override
  public void clear() {
    throw new UnsupportedOperationException();
  }

  @Override
  public Set<K> keySet() {
    Set<K> keys = new HashSet<>();
    keys.addAll(initialMap.keySet());
    keys.addAll(localMap.keySet());
    return keys;
  }

  @Override
  public Collection<V> values() {
    Collection<V> values = new ArrayList<>();
    values.addAll(initialMap.values());
    values.addAll(localMap.values());
    return values;
  }

  @Override
  public Set<Entry<K, V>> entrySet() {
    Set<Entry<K, V>> entries = new HashSet<>();
    entries.addAll(initialMap.entrySet());
    entries.addAll(localMap.entrySet());
    return entries;
  }
}

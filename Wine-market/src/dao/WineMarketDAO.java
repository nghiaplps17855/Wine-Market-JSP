package dao;

import java.util.List;

public abstract class WineMarketDAO<E,K> {
	abstract public void insert(E enity);
    abstract public void update(E enity);
    abstract public void delete(K key);
    abstract public List<E> selectAll();
    abstract public E selectById(K key);
    abstract protected List<E> selectBySql(String sql, Object...args);
}

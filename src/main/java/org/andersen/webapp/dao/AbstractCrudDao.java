package org.andersen.webapp.dao;

import org.andersen.webapp.model.Entity;

public abstract class AbstractCrudDao<T extends Entity<K>, K> implements CrudDao<T, K> {

}

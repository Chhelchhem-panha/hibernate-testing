package com.panhacode.hibernateintegretion.util;

import java.util.List;

public interface DaoService<T> {
    int addData(T object);

    int deleteData(T object);

    int updateData(T object);

    List<T> fetchAll();
}

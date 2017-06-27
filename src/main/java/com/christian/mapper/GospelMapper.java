package com.christian.mapper;

import java.util.List;

/**
 * author：Administrator on 2017/6/28 05:48
 * email：lanhuaguizha@gmail.com
 */
public interface GospelMapper {
    List<Gospel> getAll();

    Gospel getOne(Long id);

    void insert(Gospel gospel);

    void update(Gospel gospel);

    void delete(Long id);
}

package com.hl.wiki.service;

import com.hl.wiki.domain.Test;
import com.hl.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return  testMapper.list();
    }
}

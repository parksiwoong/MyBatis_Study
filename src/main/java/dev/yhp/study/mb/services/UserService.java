package dev.yhp.study.mb.services;

import dev.yhp.study.mb.mappers.UserDao;
import dev.yhp.study.mb.mappers.ValueMapper;
import dev.yhp.study.mb.model.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public List<UserVo> list();
}
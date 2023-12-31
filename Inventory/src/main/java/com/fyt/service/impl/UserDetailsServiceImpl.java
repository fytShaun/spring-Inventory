//package com.fyt.service.impl;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.fyt.dao.userDao;
//import com.fyt.domain.user;
//import com.fyt.service.impl.utils.UserDetailsImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    private userDao userDao;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        QueryWrapper<user> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("username",username);
//        user user = userDao.selectOne(queryWrapper);
//        if(user==null){
//            throw  new RuntimeException("用户不存在");
//        }
//        return new UserDetailsImpl(user);
//    }
//}
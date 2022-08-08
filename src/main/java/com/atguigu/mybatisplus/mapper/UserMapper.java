package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author liwq
 * @create 2022-08-06 15:28
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据id查询用户信息为map集合
     * @param id
     * @return
     */
    Map<String,Object> selectMapById(Long id);

    int insertSelective(User user);

    int deleteByName(@Param("name") String name);

    int updateNameAndEmailById(@Param("name") String name, @Param("email") String email, @Param("id") Long id);
}

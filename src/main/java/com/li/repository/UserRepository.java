package com.li.repository;

import com.li.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:Li
 * @Description:
 * @Date:Create in 22:37 2020/2/19
 * @Modified By:
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 根据用户名分页查询用户列表
     * @param name
     * @param pageable
     * @return
     */
    Page<User> findByNameLike(String name, Pageable pageable);

    User findByUsername(String username);
}

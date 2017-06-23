package com.fanyank.service;

import java.sql.SQLException;

/**
 * Created by yanfeng-mac on 2017/6/23.
 */
public class ForumService {
    public void removeForum(int forumId) {
        System.out.println("正在移除forum" + forumId);
        throw new RuntimeException("移除时发生异常");
    }

    public void updateForum(int forumId) throws SQLException {
        System.out.println("正在更新forum" + forumId);
        throw new SQLException("数据更新时发生异常");
    }
}

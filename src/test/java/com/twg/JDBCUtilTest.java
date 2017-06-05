package com.twg;

import junit.framework.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by twg on 2017/6/5.
 */
public class JDBCUtilTest {
    @Test
    public void getConnection() throws Exception {
        Connection connection = JDBCUtil.getConnection();
        Assert.assertNotNull(connection);
    }

}
package com.dynasty.common.exception.user;

import com.dynasty.common.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author dynasty
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}

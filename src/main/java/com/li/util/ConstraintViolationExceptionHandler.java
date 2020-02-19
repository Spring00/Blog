package com.li.util;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Li
 * @Description:
 * @Date:Create in 23:10 2020/2/19
 * @Modified By:
 */
public class ConstraintViolationExceptionHandler {

    /**
     * 获取批量异常信息
     * @param e
     * @return
     */
    public static String getMessage(ConstraintViolationException e) {
        List<String> msgList = new ArrayList<>();
        for (ConstraintViolation<?> constraintViolation : e.getConstraintViolations()) {
            msgList.add(constraintViolation.getMessage());
        }
        String messages = StringUtils.join(msgList.toArray(), ";");
        return messages;
    }

}

